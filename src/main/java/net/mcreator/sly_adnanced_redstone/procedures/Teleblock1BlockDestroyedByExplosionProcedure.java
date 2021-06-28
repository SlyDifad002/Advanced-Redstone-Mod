package net.mcreator.sly_adnanced_redstone.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneModVariables;
import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneModElements;
import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneMod;

import java.util.Map;

@SlyAdnancedRedstoneModElements.ModElement.Tag
public class Teleblock1BlockDestroyedByExplosionProcedure extends SlyAdnancedRedstoneModElements.ModElement {
	public Teleblock1BlockDestroyedByExplosionProcedure(SlyAdnancedRedstoneModElements instance) {
		super(instance, 74);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SlyAdnancedRedstoneMod.LOGGER.warn("Failed to load dependency world for procedure Teleblock1BlockDestroyedByExplosion!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location111 = (double) 0;
		SlyAdnancedRedstoneModVariables.MapVariables.get(world).syncData(world);
		SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location112 = (double) 0;
		SlyAdnancedRedstoneModVariables.MapVariables.get(world).syncData(world);
		SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location113 = (double) 0;
		SlyAdnancedRedstoneModVariables.MapVariables.get(world).syncData(world);
		SlyAdnancedRedstoneModVariables.MapVariables.get(world).Dim1 = (double) 0;
		SlyAdnancedRedstoneModVariables.MapVariables.get(world).syncData(world);
	}
}
