package net.mcreator.sly_adnanced_redstone.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneModVariables;
import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneModElements;

import java.util.Map;
import java.util.Collections;

@SlyAdnancedRedstoneModElements.ModElement.Tag
public class Teleblock2OnBlockRightClickedProcedure extends SlyAdnancedRedstoneModElements.ModElement {
	public Teleblock2OnBlockRightClickedProcedure(SlyAdnancedRedstoneModElements instance) {
		super(instance, 76);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure Teleblock2OnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure Teleblock2OnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		if ((!(((SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location221) == 0)
				&& (((SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location222) == 0)
						&& ((SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location223) == 0))))) {
			{
				Entity _ent = entity;
				_ent.setPositionAndUpdate((SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location221),
						(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location222),
						(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location223));
				if (_ent instanceof ServerPlayerEntity) {
					((ServerPlayerEntity) _ent).connection.setPlayerLocation((SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location221),
							(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location222),
							(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location223), _ent.rotationYaw, _ent.rotationPitch,
							Collections.emptySet());
				}
			}
			if (!world.getWorld().isRemote) {
				world.playSound(null,
						new BlockPos((int) (SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location221),
								(int) (SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location222),
								(int) (SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location223)),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else {
				world.getWorld().playSound((SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location221),
						(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location222),
						(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location223),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
			}
		} else {
			if (entity instanceof PlayerEntity && !entity.world.isRemote) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("ERROR"), (false));
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("ERROR"), (true));
			}
		}
	}
}
