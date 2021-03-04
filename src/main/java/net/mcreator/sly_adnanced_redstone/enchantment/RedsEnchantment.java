
package net.mcreator.sly_adnanced_redstone.enchantment;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.DamageSource;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneModElements;

@SlyAdnancedRedstoneModElements.ModElement.Tag
public class RedsEnchantment extends SlyAdnancedRedstoneModElements.ModElement {
	@ObjectHolder("sly_adnanced_redstone:reds")
	public static final Enchantment enchantment = null;
	public RedsEnchantment(SlyAdnancedRedstoneModElements instance) {
		super(instance, 165);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("reds"));
	}
	public static class CustomEnchantment extends Enchantment {
		public CustomEnchantment(EquipmentSlotType... slots) {
			super(Enchantment.Rarity.VERY_RARE, EnchantmentType.ALL, slots);
		}

		@Override
		public int getMinLevel() {
			return 1;
		}

		@Override
		public int getMaxLevel() {
			return 6;
		}

		@Override
		public int calcModifierDamage(int level, DamageSource source) {
			return level * 4;
		}

		@Override
		protected boolean canApplyTogether(Enchantment ench) {
			if (ench == RedsEnchantment.enchantment)
				return true;
			return false;
		}

		@Override
		public boolean isTreasureEnchantment() {
			return false;
		}

		@Override
		public boolean isCurse() {
			return false;
		}

		@Override
		public boolean isAllowedOnBooks() {
			return true;
		}
	}
}
