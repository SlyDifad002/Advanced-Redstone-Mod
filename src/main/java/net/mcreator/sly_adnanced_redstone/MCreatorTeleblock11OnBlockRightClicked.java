package net.mcreator.sly_adnanced_redstone;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.EffectInstance;
import net.minecraft.network.play.server.SPlayerAbilitiesPacket;
import net.minecraft.network.play.server.SPlaySoundEventPacket;
import net.minecraft.network.play.server.SPlayEntityEffectPacket;
import net.minecraft.network.play.server.SChangeGameStatePacket;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

@Elementssly_adnanced_redstone.ModElement.Tag
public class MCreatorTeleblock11OnBlockRightClicked extends Elementssly_adnanced_redstone.ModElement {
	public MCreatorTeleblock11OnBlockRightClicked(Elementssly_adnanced_redstone instance) {
		super(instance, 71);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorTeleblock11OnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorTeleblock11OnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		if ((!(((sly_adnanced_redstoneVariables.MapVariables.get(world).Location111) == 0) && (((sly_adnanced_redstoneVariables.MapVariables
				.get(world).Location112) == 0) && ((sly_adnanced_redstoneVariables.MapVariables.get(world).Location113) == 0))))) {
			if (((sly_adnanced_redstoneVariables.MapVariables.get(world).Dim1) == 1)) {
				if (((0) == (world.getDimension().getType().getId()))) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).setPositionAndUpdate((sly_adnanced_redstoneVariables.MapVariables.get(world).Location111),
								(sly_adnanced_redstoneVariables.MapVariables.get(world).Location112),
								(sly_adnanced_redstoneVariables.MapVariables.get(world).Location113));
					world.playSound((PlayerEntity) null, (sly_adnanced_redstoneVariables.MapVariables.get(world).Location121),
							(sly_adnanced_redstoneVariables.MapVariables.get(world).Location122),
							(sly_adnanced_redstoneVariables.MapVariables.get(world).Location113),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					if (!entity.world.isRemote && entity instanceof ServerPlayerEntity) {
						DimensionType destinationType = DimensionType.OVERWORLD;
						ObfuscationReflectionHelper.setPrivateValue(ServerPlayerEntity.class, (ServerPlayerEntity) entity, true, "field_184851_cj");
						ServerWorld nextWorld = entity.getServer().getWorld(destinationType);
						((ServerPlayerEntity) entity).connection.sendPacket(new SChangeGameStatePacket(4, 0));
						((ServerPlayerEntity) entity).teleport(nextWorld, nextWorld.getSpawnPoint().getX(), nextWorld.getSpawnPoint().getY() + 1,
								nextWorld.getSpawnPoint().getZ(), entity.rotationYaw, entity.rotationPitch);
						((ServerPlayerEntity) entity).connection.sendPacket(new SPlayerAbilitiesPacket(((ServerPlayerEntity) entity).abilities));
						for (EffectInstance effectinstance : ((ServerPlayerEntity) entity).getActivePotionEffects()) {
							((ServerPlayerEntity) entity).connection.sendPacket(new SPlayEntityEffectPacket(entity.getEntityId(), effectinstance));
						}
						((ServerPlayerEntity) entity).connection.sendPacket(new SPlaySoundEventPacket(1032, BlockPos.ZERO, 0, false));
					}
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).setPositionAndUpdate((sly_adnanced_redstoneVariables.MapVariables.get(world).Location111),
								(sly_adnanced_redstoneVariables.MapVariables.get(world).Location112),
								(sly_adnanced_redstoneVariables.MapVariables.get(world).Location113));
					world.playSound((PlayerEntity) null, (sly_adnanced_redstoneVariables.MapVariables.get(world).Location111),
							(sly_adnanced_redstoneVariables.MapVariables.get(world).Location112),
							(sly_adnanced_redstoneVariables.MapVariables.get(world).Location113),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
				}
			} else if (((sly_adnanced_redstoneVariables.MapVariables.get(world).Dim1) == 2)) {
				if (((-1) == (world.getDimension().getType().getId()))) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).setPositionAndUpdate((sly_adnanced_redstoneVariables.MapVariables.get(world).Location111),
								(sly_adnanced_redstoneVariables.MapVariables.get(world).Location112),
								(sly_adnanced_redstoneVariables.MapVariables.get(world).Location113));
					world.playSound((PlayerEntity) null, (sly_adnanced_redstoneVariables.MapVariables.get(world).Location111),
							(sly_adnanced_redstoneVariables.MapVariables.get(world).Location112),
							(sly_adnanced_redstoneVariables.MapVariables.get(world).Location113),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					if (!entity.world.isRemote && entity instanceof ServerPlayerEntity) {
						DimensionType destinationType = DimensionType.THE_NETHER;
						ObfuscationReflectionHelper.setPrivateValue(ServerPlayerEntity.class, (ServerPlayerEntity) entity, true, "field_184851_cj");
						ServerWorld nextWorld = entity.getServer().getWorld(destinationType);
						((ServerPlayerEntity) entity).connection.sendPacket(new SChangeGameStatePacket(4, 0));
						((ServerPlayerEntity) entity).teleport(nextWorld, nextWorld.getSpawnPoint().getX(), nextWorld.getSpawnPoint().getY() + 1,
								nextWorld.getSpawnPoint().getZ(), entity.rotationYaw, entity.rotationPitch);
						((ServerPlayerEntity) entity).connection.sendPacket(new SPlayerAbilitiesPacket(((ServerPlayerEntity) entity).abilities));
						for (EffectInstance effectinstance : ((ServerPlayerEntity) entity).getActivePotionEffects()) {
							((ServerPlayerEntity) entity).connection.sendPacket(new SPlayEntityEffectPacket(entity.getEntityId(), effectinstance));
						}
						((ServerPlayerEntity) entity).connection.sendPacket(new SPlaySoundEventPacket(1032, BlockPos.ZERO, 0, false));
					}
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).setPositionAndUpdate((sly_adnanced_redstoneVariables.MapVariables.get(world).Location111),
								(sly_adnanced_redstoneVariables.MapVariables.get(world).Location112),
								(sly_adnanced_redstoneVariables.MapVariables.get(world).Location113));
					world.playSound((PlayerEntity) null, (sly_adnanced_redstoneVariables.MapVariables.get(world).Location111),
							(sly_adnanced_redstoneVariables.MapVariables.get(world).Location112),
							(sly_adnanced_redstoneVariables.MapVariables.get(world).Location113),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
				}
			} else if (((sly_adnanced_redstoneVariables.MapVariables.get(world).Dim1) == 3)) {
				if (((1) == (world.getDimension().getType().getId()))) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).setPositionAndUpdate((sly_adnanced_redstoneVariables.MapVariables.get(world).Location111),
								(sly_adnanced_redstoneVariables.MapVariables.get(world).Location112),
								(sly_adnanced_redstoneVariables.MapVariables.get(world).Location113));
					world.playSound((PlayerEntity) null, (sly_adnanced_redstoneVariables.MapVariables.get(world).Location111),
							(sly_adnanced_redstoneVariables.MapVariables.get(world).Location112),
							(sly_adnanced_redstoneVariables.MapVariables.get(world).Location123),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					if (!entity.world.isRemote && entity instanceof ServerPlayerEntity) {
						DimensionType destinationType = DimensionType.THE_END;
						ObfuscationReflectionHelper.setPrivateValue(ServerPlayerEntity.class, (ServerPlayerEntity) entity, true, "field_184851_cj");
						ServerWorld nextWorld = entity.getServer().getWorld(destinationType);
						((ServerPlayerEntity) entity).connection.sendPacket(new SChangeGameStatePacket(4, 0));
						((ServerPlayerEntity) entity).teleport(nextWorld, nextWorld.getSpawnPoint().getX(), nextWorld.getSpawnPoint().getY() + 1,
								nextWorld.getSpawnPoint().getZ(), entity.rotationYaw, entity.rotationPitch);
						((ServerPlayerEntity) entity).connection.sendPacket(new SPlayerAbilitiesPacket(((ServerPlayerEntity) entity).abilities));
						for (EffectInstance effectinstance : ((ServerPlayerEntity) entity).getActivePotionEffects()) {
							((ServerPlayerEntity) entity).connection.sendPacket(new SPlayEntityEffectPacket(entity.getEntityId(), effectinstance));
						}
						((ServerPlayerEntity) entity).connection.sendPacket(new SPlaySoundEventPacket(1032, BlockPos.ZERO, 0, false));
					}
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).setPositionAndUpdate((sly_adnanced_redstoneVariables.MapVariables.get(world).Location121),
								(sly_adnanced_redstoneVariables.MapVariables.get(world).Location122),
								(sly_adnanced_redstoneVariables.MapVariables.get(world).Location113));
					world.playSound((PlayerEntity) null, (sly_adnanced_redstoneVariables.MapVariables.get(world).Location111),
							(sly_adnanced_redstoneVariables.MapVariables.get(world).Location112),
							(sly_adnanced_redstoneVariables.MapVariables.get(world).Location113),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
				}
			} else if (((sly_adnanced_redstoneVariables.MapVariables.get(world).Dim1) == 4)) {
				if (((MCreatorRedsa.type.getId()) == (world.getDimension().getType().getId()))) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).setPositionAndUpdate((sly_adnanced_redstoneVariables.MapVariables.get(world).Location111),
								(sly_adnanced_redstoneVariables.MapVariables.get(world).Location112),
								(sly_adnanced_redstoneVariables.MapVariables.get(world).Location113));
					world.playSound((PlayerEntity) null, (sly_adnanced_redstoneVariables.MapVariables.get(world).Location111),
							(sly_adnanced_redstoneVariables.MapVariables.get(world).Location112),
							(sly_adnanced_redstoneVariables.MapVariables.get(world).Location113),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					if (!entity.world.isRemote && entity instanceof ServerPlayerEntity) {
						DimensionType destinationType = MCreatorRedsa.type;
						ObfuscationReflectionHelper.setPrivateValue(ServerPlayerEntity.class, (ServerPlayerEntity) entity, true, "field_184851_cj");
						ServerWorld nextWorld = entity.getServer().getWorld(destinationType);
						((ServerPlayerEntity) entity).connection.sendPacket(new SChangeGameStatePacket(4, 0));
						((ServerPlayerEntity) entity).teleport(nextWorld, nextWorld.getSpawnPoint().getX(), nextWorld.getSpawnPoint().getY() + 1,
								nextWorld.getSpawnPoint().getZ(), entity.rotationYaw, entity.rotationPitch);
						((ServerPlayerEntity) entity).connection.sendPacket(new SPlayerAbilitiesPacket(((ServerPlayerEntity) entity).abilities));
						for (EffectInstance effectinstance : ((ServerPlayerEntity) entity).getActivePotionEffects()) {
							((ServerPlayerEntity) entity).connection.sendPacket(new SPlayEntityEffectPacket(entity.getEntityId(), effectinstance));
						}
						((ServerPlayerEntity) entity).connection.sendPacket(new SPlaySoundEventPacket(1032, BlockPos.ZERO, 0, false));
					}
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).setPositionAndUpdate((sly_adnanced_redstoneVariables.MapVariables.get(world).Location111),
								(sly_adnanced_redstoneVariables.MapVariables.get(world).Location112),
								(sly_adnanced_redstoneVariables.MapVariables.get(world).Location113));
					world.playSound((PlayerEntity) null, (sly_adnanced_redstoneVariables.MapVariables.get(world).Location111),
							(sly_adnanced_redstoneVariables.MapVariables.get(world).Location112),
							(sly_adnanced_redstoneVariables.MapVariables.get(world).Location113),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
				}
			}
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
