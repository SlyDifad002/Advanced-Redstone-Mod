package net.mcreator.sly_adnanced_redstone;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@Elementssly_adnanced_redstone.ModElement.Tag
public class MCreatorRestick extends Elementssly_adnanced_redstone.ModElement {
	@ObjectHolder("sly_adnanced_redstone:restick")
	public static final Item block = null;

	public MCreatorRestick(Elementssly_adnanced_redstone instance) {
		super(instance, 91);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MCreatorRWE.tab).maxStackSize(64));
			setRegistryName("restick");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
