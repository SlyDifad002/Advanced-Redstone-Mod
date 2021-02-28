package net.mcreator.sly_adnanced_redstone;

import net.minecraft.world.World;
import net.minecraft.particles.ParticleTypes;

@Elementssly_adnanced_redstone.ModElement.Tag
public class MCreatorSadaPortalTriggerUsed extends Elementssly_adnanced_redstone.ModElement {
	public MCreatorSadaPortalTriggerUsed(Elementssly_adnanced_redstone instance) {
		super(instance, 39);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorSadaPortalTriggerUsed!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorSadaPortalTriggerUsed!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorSadaPortalTriggerUsed!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorSadaPortalTriggerUsed!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		for (int _ct = 0; _ct < 5; _ct++) {
			world.addOptionalParticle(ParticleTypes.PORTAL, x, y, z, 3, 3, 3);
		}
	}
}
