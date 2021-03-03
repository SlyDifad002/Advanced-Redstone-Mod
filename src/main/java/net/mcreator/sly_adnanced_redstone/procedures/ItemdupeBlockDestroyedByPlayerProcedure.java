package net.mcreator.sly_adnanced_redstone.procedures;

import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneModVariables;
import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneModElements;

import java.util.Map;

@SlyAdnancedRedstoneModElements.ModElement.Tag
public class ItemdupeBlockDestroyedByPlayerProcedure extends SlyAdnancedRedstoneModElements.ModElement {
	public ItemdupeBlockDestroyedByPlayerProcedure(SlyAdnancedRedstoneModElements instance) {
		super(instance, 153);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		SlyAdnancedRedstoneModVariables.Energy2 = (double) 0;
	}
}
