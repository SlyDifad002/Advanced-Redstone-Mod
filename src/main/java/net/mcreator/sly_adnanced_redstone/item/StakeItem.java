
package net.mcreator.sly_adnanced_redstone.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.sly_adnanced_redstone.procedures.StakeFoodEatenProcedure;
import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneModElements;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

@SlyAdnancedRedstoneModElements.ModElement.Tag
public class StakeItem extends SlyAdnancedRedstoneModElements.ModElement {
	@ObjectHolder("sly_adnanced_redstone:stake")
	public static final Item block = null;
	public StakeItem(SlyAdnancedRedstoneModElements instance) {
		super(instance, 175);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(10).saturation(0.6f).setAlwaysEdible().meat().build()));
			setRegistryName("stake");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 30;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Cooked"));
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemstack, world, entity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				StakeFoodEatenProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
