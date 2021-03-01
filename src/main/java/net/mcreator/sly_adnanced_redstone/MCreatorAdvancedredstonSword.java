package net.mcreator.sly_adnanced_redstone;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@Elementssly_adnanced_redstone.ModElement.Tag
public class MCreatorAdvancedredstonSword extends Elementssly_adnanced_redstone.ModElement {
	@ObjectHolder("sly_adnanced_redstone:advancedredstonsword")
	public static final Item block = null;

	public MCreatorAdvancedredstonSword(Elementssly_adnanced_redstone instance) {
		super(instance, 103);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
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
		}, 3, -3F, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("advancedredstonsword"));
	}
}
