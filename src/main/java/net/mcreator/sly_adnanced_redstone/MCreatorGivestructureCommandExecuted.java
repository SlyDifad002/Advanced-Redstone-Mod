package net.mcreator.sly_adnanced_redstone;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

@Elementssly_adnanced_redstone.ModElement.Tag
public class MCreatorGivestructureCommandExecuted extends Elementssly_adnanced_redstone.ModElement {
	public MCreatorGivestructureCommandExecuted(Elementssly_adnanced_redstone instance) {
		super(instance, 60);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorGivestructureCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity)
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), new ItemStack(Blocks.STRUCTURE_BLOCK, (int) (1)));
	}
}
