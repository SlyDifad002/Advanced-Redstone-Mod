package net.mcreator.sly_adnanced_redstone.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneModVariables;
import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneModElements;
import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneMod;

import java.util.Map;

@SlyAdnancedRedstoneModElements.ModElement.Tag
public class ItemdupeBlockDestroyedByExplosionProcedure extends SlyAdnancedRedstoneModElements.ModElement {
	public ItemdupeBlockDestroyedByExplosionProcedure(SlyAdnancedRedstoneModElements instance) {
		super(instance, 154);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SlyAdnancedRedstoneMod.LOGGER.warn("Failed to load dependency world for procedure ItemdupeBlockDestroyedByExplosion!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location111 = (double) 0;
		SlyAdnancedRedstoneModVariables.MapVariables.get(world).syncData(world);
	}
}
