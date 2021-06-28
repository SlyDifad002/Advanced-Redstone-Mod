package net.mcreator.sly_adnanced_redstone.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.RegistryKey;
import net.minecraft.potion.EffectInstance;
import net.minecraft.network.play.server.SPlayerAbilitiesPacket;
import net.minecraft.network.play.server.SPlaySoundEventPacket;
import net.minecraft.network.play.server.SPlayEntityEffectPacket;
import net.minecraft.network.play.server.SChangeGameStatePacket;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneModVariables;
import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneModElements;
import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneMod;

import java.util.Map;
import java.util.Collections;

@SlyAdnancedRedstoneModElements.ModElement.Tag
public class Teleblock1OnBlockRightClickedProcedure extends SlyAdnancedRedstoneModElements.ModElement {
	public Teleblock1OnBlockRightClickedProcedure(SlyAdnancedRedstoneModElements instance) {
		super(instance, 69);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SlyAdnancedRedstoneMod.LOGGER.warn("Failed to load dependency entity for procedure Teleblock1OnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SlyAdnancedRedstoneMod.LOGGER.warn("Failed to load dependency world for procedure Teleblock1OnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		if ((!(((SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location121) == 0)
				&& (((SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location122) == 0)
						&& ((SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location123) == 0))))) {
			if (((SlyAdnancedRedstoneModVariables.MapVariables.get(world).Dim11) == 1)) {
				if (((World.OVERWORLD) == (world instanceof World ? (((World) world).getDimensionKey()) : World.OVERWORLD))) {
					{
						Entity _ent = entity;
						_ent.setPositionAndUpdate((SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location121),
								(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location122),
								(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location123));
						if (_ent instanceof ServerPlayerEntity) {
							((ServerPlayerEntity) _ent).connection.setPlayerLocation(
									(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location121),
									(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location122),
									(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location123), _ent.rotationYaw, _ent.rotationPitch,
									Collections.emptySet());
						}
					}
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null,
								new BlockPos((int) (SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location121),
										(int) (SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location122),
										(int) (SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location123)),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("entity.enderman.teleport")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound((SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location121),
								(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location122),
								(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location123),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("entity.enderman.teleport")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
				} else {
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent instanceof ServerPlayerEntity) {
							RegistryKey<World> destinationType = World.OVERWORLD;
							ServerWorld nextWorld = _ent.getServer().getWorld(destinationType);
							if (nextWorld != null) {
								((ServerPlayerEntity) _ent).connection
										.sendPacket(new SChangeGameStatePacket(SChangeGameStatePacket.field_241768_e_, 0));
								((ServerPlayerEntity) _ent).teleport(nextWorld, nextWorld.getSpawnPoint().getX(),
										nextWorld.getSpawnPoint().getY() + 1, nextWorld.getSpawnPoint().getZ(), _ent.rotationYaw, _ent.rotationPitch);
								((ServerPlayerEntity) _ent).connection.sendPacket(new SPlayerAbilitiesPacket(((ServerPlayerEntity) _ent).abilities));
								for (EffectInstance effectinstance : ((ServerPlayerEntity) _ent).getActivePotionEffects()) {
									((ServerPlayerEntity) _ent).connection
											.sendPacket(new SPlayEntityEffectPacket(_ent.getEntityId(), effectinstance));
								}
								((ServerPlayerEntity) _ent).connection.sendPacket(new SPlaySoundEventPacket(1032, BlockPos.ZERO, 0, false));
							}
						}
					}
					{
						Entity _ent = entity;
						_ent.setPositionAndUpdate((SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location121),
								(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location122),
								(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location123));
						if (_ent instanceof ServerPlayerEntity) {
							((ServerPlayerEntity) _ent).connection.setPlayerLocation(
									(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location121),
									(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location122),
									(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location123), _ent.rotationYaw, _ent.rotationPitch,
									Collections.emptySet());
						}
					}
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null,
								new BlockPos((int) (SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location121),
										(int) (SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location122),
										(int) (SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location123)),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("entity.enderman.teleport")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound((SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location121),
								(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location122),
								(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location123),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("entity.enderman.teleport")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
				}
			} else if (((SlyAdnancedRedstoneModVariables.MapVariables.get(world).Dim11) == 2)) {
				if (((World.THE_NETHER) == (world instanceof World ? (((World) world).getDimensionKey()) : World.OVERWORLD))) {
					{
						Entity _ent = entity;
						_ent.setPositionAndUpdate((SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location121),
								(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location122),
								(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location123));
						if (_ent instanceof ServerPlayerEntity) {
							((ServerPlayerEntity) _ent).connection.setPlayerLocation(
									(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location121),
									(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location122),
									(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location123), _ent.rotationYaw, _ent.rotationPitch,
									Collections.emptySet());
						}
					}
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null,
								new BlockPos((int) (SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location121),
										(int) (SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location122),
										(int) (SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location123)),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("entity.enderman.teleport")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound((SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location121),
								(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location122),
								(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location123),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("entity.enderman.teleport")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
				} else {
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent instanceof ServerPlayerEntity) {
							RegistryKey<World> destinationType = World.THE_NETHER;
							ServerWorld nextWorld = _ent.getServer().getWorld(destinationType);
							if (nextWorld != null) {
								((ServerPlayerEntity) _ent).connection
										.sendPacket(new SChangeGameStatePacket(SChangeGameStatePacket.field_241768_e_, 0));
								((ServerPlayerEntity) _ent).teleport(nextWorld, nextWorld.getSpawnPoint().getX(),
										nextWorld.getSpawnPoint().getY() + 1, nextWorld.getSpawnPoint().getZ(), _ent.rotationYaw, _ent.rotationPitch);
								((ServerPlayerEntity) _ent).connection.sendPacket(new SPlayerAbilitiesPacket(((ServerPlayerEntity) _ent).abilities));
								for (EffectInstance effectinstance : ((ServerPlayerEntity) _ent).getActivePotionEffects()) {
									((ServerPlayerEntity) _ent).connection
											.sendPacket(new SPlayEntityEffectPacket(_ent.getEntityId(), effectinstance));
								}
								((ServerPlayerEntity) _ent).connection.sendPacket(new SPlaySoundEventPacket(1032, BlockPos.ZERO, 0, false));
							}
						}
					}
					{
						Entity _ent = entity;
						_ent.setPositionAndUpdate((SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location121),
								(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location122),
								(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location123));
						if (_ent instanceof ServerPlayerEntity) {
							((ServerPlayerEntity) _ent).connection.setPlayerLocation(
									(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location121),
									(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location122),
									(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location123), _ent.rotationYaw, _ent.rotationPitch,
									Collections.emptySet());
						}
					}
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null,
								new BlockPos((int) (SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location121),
										(int) (SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location122),
										(int) (SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location123)),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("entity.enderman.teleport")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound((SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location121),
								(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location122),
								(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location123),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("entity.enderman.teleport")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
				}
			} else if (((SlyAdnancedRedstoneModVariables.MapVariables.get(world).Dim11) == 3)) {
				if (((World.THE_END) == (world instanceof World ? (((World) world).getDimensionKey()) : World.OVERWORLD))) {
					{
						Entity _ent = entity;
						_ent.setPositionAndUpdate((SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location121),
								(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location122),
								(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location123));
						if (_ent instanceof ServerPlayerEntity) {
							((ServerPlayerEntity) _ent).connection.setPlayerLocation(
									(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location121),
									(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location122),
									(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location123), _ent.rotationYaw, _ent.rotationPitch,
									Collections.emptySet());
						}
					}
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null,
								new BlockPos((int) (SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location121),
										(int) (SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location122),
										(int) (SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location123)),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("entity.enderman.teleport")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound((SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location121),
								(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location122),
								(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location123),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("entity.enderman.teleport")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
				} else {
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent instanceof ServerPlayerEntity) {
							RegistryKey<World> destinationType = World.THE_END;
							ServerWorld nextWorld = _ent.getServer().getWorld(destinationType);
							if (nextWorld != null) {
								((ServerPlayerEntity) _ent).connection
										.sendPacket(new SChangeGameStatePacket(SChangeGameStatePacket.field_241768_e_, 0));
								((ServerPlayerEntity) _ent).teleport(nextWorld, nextWorld.getSpawnPoint().getX(),
										nextWorld.getSpawnPoint().getY() + 1, nextWorld.getSpawnPoint().getZ(), _ent.rotationYaw, _ent.rotationPitch);
								((ServerPlayerEntity) _ent).connection.sendPacket(new SPlayerAbilitiesPacket(((ServerPlayerEntity) _ent).abilities));
								for (EffectInstance effectinstance : ((ServerPlayerEntity) _ent).getActivePotionEffects()) {
									((ServerPlayerEntity) _ent).connection
											.sendPacket(new SPlayEntityEffectPacket(_ent.getEntityId(), effectinstance));
								}
								((ServerPlayerEntity) _ent).connection.sendPacket(new SPlaySoundEventPacket(1032, BlockPos.ZERO, 0, false));
							}
						}
					}
					{
						Entity _ent = entity;
						_ent.setPositionAndUpdate((SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location121),
								(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location122),
								(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location123));
						if (_ent instanceof ServerPlayerEntity) {
							((ServerPlayerEntity) _ent).connection.setPlayerLocation(
									(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location121),
									(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location122),
									(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location123), _ent.rotationYaw, _ent.rotationPitch,
									Collections.emptySet());
						}
					}
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null,
								new BlockPos((int) (SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location121),
										(int) (SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location122),
										(int) (SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location123)),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("entity.enderman.teleport")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound((SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location121),
								(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location122),
								(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location123),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("entity.enderman.teleport")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
				}
			} else if (((SlyAdnancedRedstoneModVariables.MapVariables.get(world).Dim11) == 4)) {
				if (((RegistryKey.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("sly_adnanced_redstone:redsa"))) == (world instanceof World
						? (((World) world).getDimensionKey())
						: World.OVERWORLD))) {
					{
						Entity _ent = entity;
						_ent.setPositionAndUpdate((SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location121),
								(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location122),
								(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location123));
						if (_ent instanceof ServerPlayerEntity) {
							((ServerPlayerEntity) _ent).connection.setPlayerLocation(
									(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location121),
									(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location122),
									(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location123), _ent.rotationYaw, _ent.rotationPitch,
									Collections.emptySet());
						}
					}
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null,
								new BlockPos((int) (SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location121),
										(int) (SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location122),
										(int) (SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location123)),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("entity.enderman.teleport")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound((SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location121),
								(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location122),
								(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location123),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("entity.enderman.teleport")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
				} else {
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent instanceof ServerPlayerEntity) {
							RegistryKey<World> destinationType = RegistryKey.getOrCreateKey(Registry.WORLD_KEY,
									new ResourceLocation("sly_adnanced_redstone:redsa"));
							ServerWorld nextWorld = _ent.getServer().getWorld(destinationType);
							if (nextWorld != null) {
								((ServerPlayerEntity) _ent).connection
										.sendPacket(new SChangeGameStatePacket(SChangeGameStatePacket.field_241768_e_, 0));
								((ServerPlayerEntity) _ent).teleport(nextWorld, nextWorld.getSpawnPoint().getX(),
										nextWorld.getSpawnPoint().getY() + 1, nextWorld.getSpawnPoint().getZ(), _ent.rotationYaw, _ent.rotationPitch);
								((ServerPlayerEntity) _ent).connection.sendPacket(new SPlayerAbilitiesPacket(((ServerPlayerEntity) _ent).abilities));
								for (EffectInstance effectinstance : ((ServerPlayerEntity) _ent).getActivePotionEffects()) {
									((ServerPlayerEntity) _ent).connection
											.sendPacket(new SPlayEntityEffectPacket(_ent.getEntityId(), effectinstance));
								}
								((ServerPlayerEntity) _ent).connection.sendPacket(new SPlaySoundEventPacket(1032, BlockPos.ZERO, 0, false));
							}
						}
					}
					{
						Entity _ent = entity;
						_ent.setPositionAndUpdate((SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location121),
								(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location122),
								(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location123));
						if (_ent instanceof ServerPlayerEntity) {
							((ServerPlayerEntity) _ent).connection.setPlayerLocation(
									(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location121),
									(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location122),
									(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location123), _ent.rotationYaw, _ent.rotationPitch,
									Collections.emptySet());
						}
					}
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null,
								new BlockPos((int) (SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location121),
										(int) (SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location122),
										(int) (SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location123)),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("entity.enderman.teleport")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound((SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location121),
								(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location122),
								(SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location123),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("entity.enderman.teleport")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
				}
			}
		} else {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("ERROR"), (false));
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("ERROR"), (true));
			}
		}
	}
}
