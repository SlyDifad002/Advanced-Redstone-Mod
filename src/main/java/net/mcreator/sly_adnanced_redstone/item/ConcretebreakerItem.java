
package net.mcreator.sly_adnanced_redstone.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.sly_adnanced_redstone.itemgroup.RWEItemGroup;
import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneModElements;

@SlyAdnancedRedstoneModElements.ModElement.Tag
public class ConcretebreakerItem extends SlyAdnancedRedstoneModElements.ModElement {
	@ObjectHolder("sly_adnanced_redstone:concretebreaker")
	public static final Item block = null;
	public ConcretebreakerItem(SlyAdnancedRedstoneModElements instance) {
		super(instance, 90);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 100000;
			}

			public float getEfficiency() {
				return 100f;
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
				return Ingredient.EMPTY;
			}
		}, 1, 26f, new Item.Properties().group(RWEItemGroup.tab)) {
		}.setRegistryName("concretebreaker"));
	}
}
