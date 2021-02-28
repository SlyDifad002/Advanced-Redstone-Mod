package net.mcreator.sly_adnanced_redstone;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

@Elementssly_adnanced_redstone.ModElement.Tag
public class MCreatorTeleblock21OnBlockRightClicked extends Elementssly_adnanced_redstone.ModElement {
	public MCreatorTeleblock21OnBlockRightClicked(Elementssly_adnanced_redstone instance) {
		super(instance, 80);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorTeleblock21OnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorTeleblock21OnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		if ((!(((sly_adnanced_redstoneVariables.MapVariables.get(world).Location211) == 0) && (((sly_adnanced_redstoneVariables.MapVariables
				.get(world).Location212) == 0) && ((sly_adnanced_redstoneVariables.MapVariables.get(world).Location213) == 0))))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).setPositionAndUpdate((sly_adnanced_redstoneVariables.MapVariables.get(world).Location211),
						(sly_adnanced_redstoneVariables.MapVariables.get(world).Location212),
						(sly_adnanced_redstoneVariables.MapVariables.get(world).Location213));
			world.playSound((PlayerEntity) null, (sly_adnanced_redstoneVariables.MapVariables.get(world).Location211),
					(sly_adnanced_redstoneVariables.MapVariables.get(world).Location212),
					(sly_adnanced_redstoneVariables.MapVariables.get(world).Location213),
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1);
		} else {
			if (entity instanceof PlayerEntity && !world.isRemote) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("ERROR"), (false));
			}
			if (entity instanceof PlayerEntity && !world.isRemote) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("ERROR"), (true));
			}
		}
	}
}
