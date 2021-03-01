package net.mcreator.sly_adnanced_redstone;

import net.minecraft.world.World;

@Elementssly_adnanced_redstone.ModElement.Tag
public class MCreatorTeleblock11BlockDestroyedByExplosion extends Elementssly_adnanced_redstone.ModElement {
	public MCreatorTeleblock11BlockDestroyedByExplosion(Elementssly_adnanced_redstone instance) {
		super(instance, 73);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorTeleblock11BlockDestroyedByExplosion!");
			return;
		}
		World world = (World) dependencies.get("world");
		sly_adnanced_redstoneVariables.MapVariables.get(world).Location121 = (double) 0;
		sly_adnanced_redstoneVariables.MapVariables.get(world).syncData(world);
		sly_adnanced_redstoneVariables.MapVariables.get(world).Location122 = (double) 0;
		sly_adnanced_redstoneVariables.MapVariables.get(world).syncData(world);
		sly_adnanced_redstoneVariables.MapVariables.get(world).Location123 = (double) 0;
		sly_adnanced_redstoneVariables.MapVariables.get(world).syncData(world);
		sly_adnanced_redstoneVariables.MapVariables.get(world).Dim11 = (double) 0;
		sly_adnanced_redstoneVariables.MapVariables.get(world).syncData(world);
	}
}
