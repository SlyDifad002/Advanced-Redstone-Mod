package net.mcreator.sly_adnanced_redstone;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

@Elementssly_adnanced_redstone.ModElement.Tag
public class MCreatorAdvancedredstonHoe extends Elementssly_adnanced_redstone.ModElement {
	@ObjectHolder("sly_adnanced_redstone:advancedredstonhoe")
	public static final Item block = null;

	public MCreatorAdvancedredstonHoe(Elementssly_adnanced_redstone instance) {
		super(instance, 105);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 6280;
			}

			public float getEfficiency() {
				return 24f;
			}

			public float getAttackDamage() {
				return 18f;
			}

			public int getHarvestLevel() {
				return 20;
			}

			public int getEnchantability() {
				return 140;
			}

			public Ingredient getRepairMaterial() {
				return null;
			}
		}, 24f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("advancedredstonhoe"));
	}
}
