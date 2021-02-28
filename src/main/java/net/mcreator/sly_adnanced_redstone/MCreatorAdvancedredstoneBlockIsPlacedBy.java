package net.mcreator.sly_adnanced_redstone;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.Score;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Block;

@Elementssly_adnanced_redstone.ModElement.Tag
public class MCreatorAdvancedredstoneBlockIsPlacedBy extends Elementssly_adnanced_redstone.ModElement {
	public MCreatorAdvancedredstoneBlockIsPlacedBy(Elementssly_adnanced_redstone instance) {
		super(instance, 7);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("block") == null) {
			System.err.println("Failed to load dependency block for procedure MCreatorAdvancedredstoneBlockIsPlacedBy!");
			return;
		}
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorAdvancedredstoneBlockIsPlacedBy!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorAdvancedredstoneBlockIsPlacedBy!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorAdvancedredstoneBlockIsPlacedBy!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorAdvancedredstoneBlockIsPlacedBy!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorAdvancedredstoneBlockIsPlacedBy!");
			return;
		}
		Block block = (Block) dependencies.get("block");
		Entity entity = (Entity) dependencies.get("entity");
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
		if (entity instanceof PlayerEntity) {
			Scoreboard _sc = ((PlayerEntity) entity).getWorldScoreboard();
			ScoreObjective _so = _sc.getObjective("wireless");
			if (_so == null) {
				_so = _sc.addObjective("wireless", ScoreCriteria.DUMMY, new StringTextComponent("wireless"), ScoreCriteria.RenderType.INTEGER);
			}
			Score _scr = _sc.getOrCreateScore(((PlayerEntity) entity).getScoreboardName(), _so);
			_scr.setScorePoints((int) 0);
		}
	}
}
