package net.mcreator.sly_adnanced_redstone;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Block;

@Elementssly_adnanced_redstone.ModElement.Tag
public class MCreatorRedlitBlockAdded extends Elementssly_adnanced_redstone.ModElement {
	public MCreatorRedlitBlockAdded(Elementssly_adnanced_redstone instance) {
		super(instance, 19);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("block") == null) {
			System.err.println("Failed to load dependency block for procedure MCreatorRedlitBlockAdded!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorRedlitBlockAdded!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorRedlitBlockAdded!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorRedlitBlockAdded!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorRedlitBlockAdded!");
			return;
		}
		Block block = (Block) dependencies.get("block");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		try {
			java.lang.reflect.Field redstonestate = block.getClass().getDeclaredField("red");
			redstonestate.setAccessible(true);
			redstonestate.set(block, (true));
			world.notifyNeighborsOfStateChange(new BlockPos(x, y, z), block);
		} catch (Exception e) {
		}
	}
}
