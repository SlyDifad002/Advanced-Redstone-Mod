package net.mcreator.sly_adnanced_redstone;

import net.minecraft.world.World;

@Elementssly_adnanced_redstone.ModElement.Tag
public class MCreatorTeleblock21BlockDestroyedByExplosion extends Elementssly_adnanced_redstone.ModElement {
	public MCreatorTeleblock21BlockDestroyedByExplosion(Elementssly_adnanced_redstone instance) {
		super(instance, 82);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorTeleblock21BlockDestroyedByExplosion!");
			return;
		}
		World world = (World) dependencies.get("world");
		sly_adnanced_redstoneVariables.MapVariables.get(world).Location221 = (double) 0;
		sly_adnanced_redstoneVariables.MapVariables.get(world).syncData(world);
		sly_adnanced_redstoneVariables.MapVariables.get(world).Location222 = (double) 0;
		sly_adnanced_redstoneVariables.MapVariables.get(world).syncData(world);
		sly_adnanced_redstoneVariables.MapVariables.get(world).Location223 = (double) 0;
		sly_adnanced_redstoneVariables.MapVariables.get(world).syncData(world);
	}
}
