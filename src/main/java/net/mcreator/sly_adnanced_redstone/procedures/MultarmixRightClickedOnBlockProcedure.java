package net.mcreator.sly_adnanced_redstone.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.sly_adnanced_redstone.item.MultarmixItem;
import net.mcreator.sly_adnanced_redstone.block.RoadconcreteBlock;
import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneModElements;
import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneMod;

import java.util.Map;

@SlyAdnancedRedstoneModElements.ModElement.Tag
public class MultarmixRightClickedOnBlockProcedure extends SlyAdnancedRedstoneModElements.ModElement {
	public MultarmixRightClickedOnBlockProcedure(SlyAdnancedRedstoneModElements instance) {
		super(instance, 84);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SlyAdnancedRedstoneMod.LOGGER.warn("Failed to load dependency entity for procedure MultarmixRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SlyAdnancedRedstoneMod.LOGGER.warn("Failed to load dependency x for procedure MultarmixRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SlyAdnancedRedstoneMod.LOGGER.warn("Failed to load dependency y for procedure MultarmixRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SlyAdnancedRedstoneMod.LOGGER.warn("Failed to load dependency z for procedure MultarmixRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SlyAdnancedRedstoneMod.LOGGER.warn("Failed to load dependency world for procedure MultarmixRightClickedOnBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), RoadconcreteBlock.block.getDefaultState(), 3);
		if (entity instanceof PlayerEntity) {
			ItemStack _stktoremove = new ItemStack(MultarmixItem.block, (int) (1));
			((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
					((PlayerEntity) entity).container.func_234641_j_());
		}
	}
}
