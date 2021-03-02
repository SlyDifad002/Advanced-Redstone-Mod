
package net.mcreator.sly_adnanced_redstone.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import net.mcreator.sly_adnanced_redstone.itemgroup.RWEItemGroup;
import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneModElements;

@SlyAdnancedRedstoneModElements.ModElement.Tag
public class TheDubstepItem extends SlyAdnancedRedstoneModElements.ModElement {
	@ObjectHolder("sly_adnanced_redstone:the_dubstep")
	public static final Item block = null;
	public TheDubstepItem(SlyAdnancedRedstoneModElements instance) {
		super(instance, 142);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, SlyAdnancedRedstoneModElements.sounds.get(new ResourceLocation("sly_adnanced_redstone:thedubstep")),
					new Item.Properties().group(RWEItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("the_dubstep");
		}
	}
}
