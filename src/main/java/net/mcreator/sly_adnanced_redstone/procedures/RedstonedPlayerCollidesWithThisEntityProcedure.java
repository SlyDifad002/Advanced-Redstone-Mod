package net.mcreator.sly_adnanced_redstone.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneModElements;
import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneMod;

import java.util.Map;

@SlyAdnancedRedstoneModElements.ModElement.Tag
public class RedstonedPlayerCollidesWithThisEntityProcedure extends SlyAdnancedRedstoneModElements.ModElement {
	public RedstonedPlayerCollidesWithThisEntityProcedure(SlyAdnancedRedstoneModElements instance) {
		super(instance, 111);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SlyAdnancedRedstoneMod.LOGGER.warn("Failed to load dependency entity for procedure RedstonedPlayerCollidesWithThisEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 1);
	}
}
