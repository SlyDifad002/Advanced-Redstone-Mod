package net.mcreator.sly_adnanced_redstone;

import net.minecraft.world.World;

@Elementssly_adnanced_redstone.ModElement.Tag
public class MCreatorTeleblock1BlockDestroyedByPlayer extends Elementssly_adnanced_redstone.ModElement {
	public MCreatorTeleblock1BlockDestroyedByPlayer(Elementssly_adnanced_redstone instance) {
		super(instance, 68);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorTeleblock1BlockDestroyedByPlayer!");
			return;
		}
		World world = (World) dependencies.get("world");
		sly_adnanced_redstoneVariables.MapVariables.get(world).Location111 = (double) 0;
		sly_adnanced_redstoneVariables.MapVariables.get(world).syncData(world);
		sly_adnanced_redstoneVariables.MapVariables.get(world).Location112 = (double) 0;
		sly_adnanced_redstoneVariables.MapVariables.get(world).syncData(world);
		sly_adnanced_redstoneVariables.MapVariables.get(world).Location113 = (double) 0;
		sly_adnanced_redstoneVariables.MapVariables.get(world).syncData(world);
		sly_adnanced_redstoneVariables.MapVariables.get(world).Dim1 = (double) 0;
		sly_adnanced_redstoneVariables.MapVariables.get(world).syncData(world);
	}
}
