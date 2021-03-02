package net.mcreator.sly_adnanced_redstone.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneModVariables;
import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneModElements;

import java.util.Map;

@SlyAdnancedRedstoneModElements.ModElement.Tag
public class Teleblock1BlockDestroyedByPlayerProcedure extends SlyAdnancedRedstoneModElements.ModElement {
	public Teleblock1BlockDestroyedByPlayerProcedure(SlyAdnancedRedstoneModElements instance) {
		super(instance, 68);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure Teleblock1BlockDestroyedByPlayer!");
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
