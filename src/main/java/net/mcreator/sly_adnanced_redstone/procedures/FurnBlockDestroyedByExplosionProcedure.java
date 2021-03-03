package net.mcreator.sly_adnanced_redstone.procedures;

import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneModVariables;
import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneModElements;

import java.util.Map;

@SlyAdnancedRedstoneModElements.ModElement.Tag
public class FurnBlockDestroyedByExplosionProcedure extends SlyAdnancedRedstoneModElements.ModElement {
	public FurnBlockDestroyedByExplosionProcedure(SlyAdnancedRedstoneModElements instance) {
		super(instance, 151);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		SlyAdnancedRedstoneModVariables.Energy1 = (double) 0;
	}
}
