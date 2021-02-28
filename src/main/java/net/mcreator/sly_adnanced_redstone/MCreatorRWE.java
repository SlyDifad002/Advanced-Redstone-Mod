package net.mcreator.sly_adnanced_redstone;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@Elementssly_adnanced_redstone.ModElement.Tag
public class MCreatorRWE extends Elementssly_adnanced_redstone.ModElement {
	public MCreatorRWE(Elementssly_adnanced_redstone instance) {
		super(instance, 35);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabrwe") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(MCreatorAdvancedredstone.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
