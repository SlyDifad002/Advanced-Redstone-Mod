package net.mcreator.sly_adnanced_redstone;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

@Elementssly_adnanced_redstone.ModElement.Tag
public class MCreatorWhiteroadpaintRightClickedOnBlock extends Elementssly_adnanced_redstone.ModElement {
	public MCreatorWhiteroadpaintRightClickedOnBlock(Elementssly_adnanced_redstone instance) {
		super(instance, 95);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorWhiteroadpaintRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorWhiteroadpaintRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorWhiteroadpaintRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorWhiteroadpaintRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorWhiteroadpaintRightClickedOnBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == MCreatorRoadconcrete.block.getDefaultState().getBlock())) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), MCreatorRoadline.block.getDefaultState(), 3);
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).inventory.clearMatchingItems(
						p -> new ItemStack(MCreatorWhiteroadpaint.block, (int) (1)).getItem() == p.getItem(), (int) 1);
		} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == MCreatorRoadline.block.getDefaultState().getBlock())) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), MCreatorRoadcorner.block.getDefaultState(), 3);
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).inventory.clearMatchingItems(
						p -> new ItemStack(MCreatorWhiteroadpaint.block, (int) (1)).getItem() == p.getItem(), (int) 1);
		} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == MCreatorRoadcorner.block.getDefaultState()
				.getBlock())) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), MCreatorRoadthreeway.block.getDefaultState(), 3);
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).inventory.clearMatchingItems(
						p -> new ItemStack(MCreatorWhiteroadpaint.block, (int) (1)).getItem() == p.getItem(), (int) 1);
		} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == MCreatorRoadthreeway.block.getDefaultState()
				.getBlock())) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), MCreatorRoadfourway.block.getDefaultState(), 3);
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).inventory.clearMatchingItems(
						p -> new ItemStack(MCreatorWhiteroadpaint.block, (int) (1)).getItem() == p.getItem(), (int) 1);
		} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == MCreatorRoadfourway.block.getDefaultState()
				.getBlock())) {
			if (entity instanceof PlayerEntity && !world.isRemote) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Replace the Concrete First"), (true));
			}
		} else {
			if (entity instanceof PlayerEntity && !world.isRemote) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Place ON Road Concrete"), (true));
			}
		}
	}
}
