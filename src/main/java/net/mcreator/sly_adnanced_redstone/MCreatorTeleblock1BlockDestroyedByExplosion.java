package net.mcreator.sly_adnanced_redstone;

import net.minecraft.world.World;

@Elementssly_adnanced_redstone.ModElement.Tag
public class MCreatorTeleblock1BlockDestroyedByExplosion extends Elementssly_adnanced_redstone.ModElement {
	public MCreatorTeleblock1BlockDestroyedByExplosion(Elementssly_adnanced_redstone instance) {
		super(instance, 74);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorTeleblock1BlockDestroyedByExplosion!");
			return;
		}
		World world = (World) dependencies.get("world");
		sly_adnanced_redstoneVariables.MapVariables.get(world).Location111 = (double) 0;
		sly_adnanced_redstoneVariables.MapVariables.get(world).syncData(world);
		sly_adnanced_redstoneVariables.MapVariables.get(world).Location112 = (double) 0;
		sly_adnanced_redstoneVariables.MapVariables.get(world).syncData(world);
		sly_adnanced_redstoneVariables.MapVariables.get(world).Location113 = (double) 0;
		sly_adnanced_redstoneVariables.MapVariables.get(world).syncData(world);
	}
}
