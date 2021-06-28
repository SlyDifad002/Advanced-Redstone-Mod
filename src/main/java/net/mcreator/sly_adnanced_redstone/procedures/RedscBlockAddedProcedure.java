package net.mcreator.sly_adnanced_redstone.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;

import net.mcreator.sly_adnanced_redstone.block.RedscBlock;
import net.mcreator.sly_adnanced_redstone.block.LitredBlock;
import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneModElements;
import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneMod;

import java.util.Map;

@SlyAdnancedRedstoneModElements.ModElement.Tag
public class RedscBlockAddedProcedure extends SlyAdnancedRedstoneModElements.ModElement {
	public RedscBlockAddedProcedure(SlyAdnancedRedstoneModElements instance) {
		super(instance, 13);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SlyAdnancedRedstoneMod.LOGGER.warn("Failed to load dependency x for procedure RedscBlockAdded!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SlyAdnancedRedstoneMod.LOGGER.warn("Failed to load dependency y for procedure RedscBlockAdded!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SlyAdnancedRedstoneMod.LOGGER.warn("Failed to load dependency z for procedure RedscBlockAdded!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SlyAdnancedRedstoneMod.LOGGER.warn("Failed to load dependency world for procedure RedscBlockAdded!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == LitredBlock.block.getDefaultState().getBlock())) {
			world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) z), RedscBlock.block.getDefaultState(), 3);
		}
		if (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == LitredBlock.block.getDefaultState().getBlock())) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) z), RedscBlock.block.getDefaultState(), 3);
		}
		if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == LitredBlock.block.getDefaultState().getBlock())) {
			world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), RedscBlock.block.getDefaultState(), 3);
		}
		if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == LitredBlock.block.getDefaultState().getBlock())) {
			world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), RedscBlock.block.getDefaultState(), 3);
		}
		if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == LitredBlock.block.getDefaultState().getBlock())) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)), RedscBlock.block.getDefaultState(), 3);
		}
		if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == LitredBlock.block.getDefaultState().getBlock())) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)), RedscBlock.block.getDefaultState(), 3);
		}
	}
}
