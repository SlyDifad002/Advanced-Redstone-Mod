package net.mcreator.sly_adnanced_redstone;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

@Elementssly_adnanced_redstone.ModElement.Tag
public class MCreatorRedstonedPlayerCollidesWithThisEntity extends Elementssly_adnanced_redstone.ModElement {
	public MCreatorRedstonedPlayerCollidesWithThisEntity(Elementssly_adnanced_redstone instance) {
		super(instance, 111);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorRedstonedPlayerCollidesWithThisEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 1);
	}
}
