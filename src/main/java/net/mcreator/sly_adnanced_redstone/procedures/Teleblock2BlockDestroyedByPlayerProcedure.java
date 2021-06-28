package net.mcreator.sly_adnanced_redstone.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneModVariables;
import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneModElements;
import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneMod;

import java.util.Map;

@SlyAdnancedRedstoneModElements.ModElement.Tag
public class Teleblock2BlockDestroyedByPlayerProcedure extends SlyAdnancedRedstoneModElements.ModElement {
	public Teleblock2BlockDestroyedByPlayerProcedure(SlyAdnancedRedstoneModElements instance) {
		super(instance, 77);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SlyAdnancedRedstoneMod.LOGGER.warn("Failed to load dependency world for procedure Teleblock2BlockDestroyedByPlayer!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location211 = (double) 0;
		SlyAdnancedRedstoneModVariables.MapVariables.get(world).syncData(world);
		SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location212 = (double) 0;
		SlyAdnancedRedstoneModVariables.MapVariables.get(world).syncData(world);
		SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location213 = (double) 0;
		SlyAdnancedRedstoneModVariables.MapVariables.get(world).syncData(world);
	}
}
