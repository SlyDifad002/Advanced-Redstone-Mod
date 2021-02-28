package net.mcreator.sly_adnanced_redstone;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

@Elementssly_adnanced_redstone.ModElement.Tag
public class MCreatorFuel extends Elementssly_adnanced_redstone.ModElement {
	public MCreatorFuel(Elementssly_adnanced_redstone instance) {
		super(instance, 40);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(MCreatorAdc.block, (int) (1)).getItem())
			event.setBurnTime(24000);
	}
}
