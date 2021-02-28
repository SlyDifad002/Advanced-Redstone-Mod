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
public class MCreatorLitredBlockAdded extends Elementssly_adnanced_redstone.ModElement {
	public MCreatorLitredBlockAdded(Elementssly_adnanced_redstone instance) {
		super(instance, 12);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("block") == null) {
			System.err.println("Failed to load dependency block for procedure MCreatorLitredBlockAdded!");
			return;
		}
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorLitredBlockAdded!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorLitredBlockAdded!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorLitredBlockAdded!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorLitredBlockAdded!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorLitredBlockAdded!");
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
		if (((new Object() {
			public int getScore(String score) {
				if (entity instanceof PlayerEntity) {
					Scoreboard _sc = ((PlayerEntity) entity).getWorldScoreboard();
					ScoreObjective _so = _sc.getObjective(score);
					if (_so != null) {
						Score _scr = _sc.getOrCreateScore(((PlayerEntity) entity).getScoreboardName(), _so);
						return _scr.getScorePoints();
					}
				}
				return 0;
			}
		}.getScore("custom_score")) == 0)) {
			if (entity instanceof PlayerEntity) {
				Scoreboard _sc = ((PlayerEntity) entity).getWorldScoreboard();
				ScoreObjective _so = _sc.getObjective("custom_score");
				if (_so == null) {
					_so = _sc.addObjective("custom_score", ScoreCriteria.DUMMY, new StringTextComponent("custom_score"),
							ScoreCriteria.RenderType.INTEGER);
				}
				Score _scr = _sc.getOrCreateScore(((PlayerEntity) entity).getScoreboardName(), _so);
				_scr.setScorePoints((int) 1);
			}
		}
	}
}
