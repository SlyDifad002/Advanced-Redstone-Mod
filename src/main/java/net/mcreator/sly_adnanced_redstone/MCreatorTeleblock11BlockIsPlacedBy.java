package net.mcreator.sly_adnanced_redstone;

import net.minecraft.world.World;

@Elementssly_adnanced_redstone.ModElement.Tag
public class MCreatorTeleblock11BlockIsPlacedBy extends Elementssly_adnanced_redstone.ModElement {
	public MCreatorTeleblock11BlockIsPlacedBy(Elementssly_adnanced_redstone instance) {
		super(instance, 70);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorTeleblock11BlockIsPlacedBy!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorTeleblock11BlockIsPlacedBy!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorTeleblock11BlockIsPlacedBy!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorTeleblock11BlockIsPlacedBy!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		sly_adnanced_redstoneVariables.MapVariables.get(world).Location121 = (double) x;
		sly_adnanced_redstoneVariables.MapVariables.get(world).syncData(world);
		sly_adnanced_redstoneVariables.MapVariables.get(world).Location122 = (double) (y + 1);
		sly_adnanced_redstoneVariables.MapVariables.get(world).syncData(world);
		sly_adnanced_redstoneVariables.MapVariables.get(world).Location123 = (double) z;
		sly_adnanced_redstoneVariables.MapVariables.get(world).syncData(world);
	}
}
