
package net.mcreator.sly_adnanced_redstone.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.mcreator.sly_adnanced_redstone.item.AdcItem;
import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneModElements;

@SlyAdnancedRedstoneModElements.ModElement.Tag
public class FuelFuel extends SlyAdnancedRedstoneModElements.ModElement {
	public FuelFuel(SlyAdnancedRedstoneModElements instance) {
		super(instance, 40);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(AdcItem.block, (int) (1)).getItem())
			event.setBurnTime(24000);
	}
}
