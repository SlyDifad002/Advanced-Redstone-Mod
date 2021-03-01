package net.mcreator.sly_adnanced_redstone;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@Elementssly_adnanced_redstone.ModElement.Tag
public class MCreatorConcretebreaker extends Elementssly_adnanced_redstone.ModElement {
	@ObjectHolder("sly_adnanced_redstone:concretebreaker")
	public static final Item block = null;

	public MCreatorConcretebreaker(Elementssly_adnanced_redstone instance) {
		super(instance, 90);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 100000;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return -2f;
			}

			public int getHarvestLevel() {
				return 100;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return null;
			}
		}, 1, -3F, new Item.Properties().group(MCreatorRWE.tab)) {
		}.setRegistryName("concretebreaker"));
	}
}
