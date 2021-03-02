package net.mcreator.sly_adnanced_redstone;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;

@Elementssly_adnanced_redstone.ModElement.Tag
public class MCreatorRedstonedEntityDies extends Elementssly_adnanced_redstone.ModElement {
	public MCreatorRedstonedEntityDies(Elementssly_adnanced_redstone instance) {
		super(instance, 113);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorRedstonedEntityDies!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorRedstonedEntityDies!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorRedstonedEntityDies!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorRedstonedEntityDies!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		for (int index0 = 0; index0 < (int) ((Math.random() * 6)); index0++) {
			if (!world.isRemote) {
				ItemEntity entityToSpawn = new ItemEntity(world, x, y, z, new ItemStack(MCreatorAdc.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.addEntity(entityToSpawn);
			}
		}
	}
}
