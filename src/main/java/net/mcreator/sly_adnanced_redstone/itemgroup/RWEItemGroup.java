
package net.mcreator.sly_adnanced_redstone.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.sly_adnanced_redstone.block.AdvancedredstoneBlock;
import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneModElements;

@SlyAdnancedRedstoneModElements.ModElement.Tag
public class RWEItemGroup extends SlyAdnancedRedstoneModElements.ModElement {
	public RWEItemGroup(SlyAdnancedRedstoneModElements instance) {
		super(instance, 35);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabrwe") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(AdvancedredstoneBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
