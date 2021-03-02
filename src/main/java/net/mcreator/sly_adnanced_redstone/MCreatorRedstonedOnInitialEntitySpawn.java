package net.mcreator.sly_adnanced_redstone;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerEntity;

@Elementssly_adnanced_redstone.ModElement.Tag
public class MCreatorRedstonedOnInitialEntitySpawn extends Elementssly_adnanced_redstone.ModElement {
	public MCreatorRedstonedOnInitialEntitySpawn(Elementssly_adnanced_redstone instance) {
		super(instance, 112);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorRedstonedOnInitialEntitySpawn!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorRedstonedOnInitialEntitySpawn!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorRedstonedOnInitialEntitySpawn!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorRedstonedOnInitialEntitySpawn!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.playSound((PlayerEntity) null, x, y, z,
				(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item_frame.remove_item")),
				SoundCategory.NEUTRAL, (float) 1, (float) 1);
	}
}
