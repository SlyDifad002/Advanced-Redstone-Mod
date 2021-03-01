package net.mcreator.sly_adnanced_redstone;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

@Elementssly_adnanced_redstone.ModElement.Tag
public class MCreatorMultarmixRightClickedOnBlock extends Elementssly_adnanced_redstone.ModElement {
	public MCreatorMultarmixRightClickedOnBlock(Elementssly_adnanced_redstone instance) {
		super(instance, 84);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorMultarmixRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorMultarmixRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorMultarmixRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorMultarmixRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorMultarmixRightClickedOnBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), MCreatorRoadconcrete.block.getDefaultState(), 3);
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).inventory.clearMatchingItems(p -> new ItemStack(MCreatorMultarmix.block, (int) (1)).getItem() == p.getItem(),
					(int) 1);
	}
}
