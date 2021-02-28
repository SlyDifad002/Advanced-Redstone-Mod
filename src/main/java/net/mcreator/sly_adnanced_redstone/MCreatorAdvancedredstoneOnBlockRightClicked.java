package net.mcreator.sly_adnanced_redstone;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.Score;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

@Elementssly_adnanced_redstone.ModElement.Tag
public class MCreatorAdvancedredstoneOnBlockRightClicked extends Elementssly_adnanced_redstone.ModElement {
	public MCreatorAdvancedredstoneOnBlockRightClicked(Elementssly_adnanced_redstone instance) {
		super(instance, 21);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorAdvancedredstoneOnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
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
		}.getScore("wireless")) == 0)) {
			if (entity instanceof PlayerEntity) {
				Scoreboard _sc = ((PlayerEntity) entity).getWorldScoreboard();
				ScoreObjective _so = _sc.getObjective("wireless");
				if (_so == null) {
					_so = _sc.addObjective("wireless", ScoreCriteria.DUMMY, new StringTextComponent("wireless"), ScoreCriteria.RenderType.INTEGER);
				}
				Score _scr = _sc.getOrCreateScore(((PlayerEntity) entity).getScoreboardName(), _so);
				_scr.setScorePoints((int) 1);
			}
		} else {
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
}
