package net.mcreator.sly_adnanced_redstone.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.RegistryKey;

import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneModVariables;
import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneModElements;
import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneMod;

import java.util.Map;

@SlyAdnancedRedstoneModElements.ModElement.Tag
public class Teleblock11BlockIsPlacedByProcedure extends SlyAdnancedRedstoneModElements.ModElement {
	public Teleblock11BlockIsPlacedByProcedure(SlyAdnancedRedstoneModElements instance) {
		super(instance, 70);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SlyAdnancedRedstoneMod.LOGGER.warn("Failed to load dependency x for procedure Teleblock11BlockIsPlacedBy!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SlyAdnancedRedstoneMod.LOGGER.warn("Failed to load dependency y for procedure Teleblock11BlockIsPlacedBy!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SlyAdnancedRedstoneMod.LOGGER.warn("Failed to load dependency z for procedure Teleblock11BlockIsPlacedBy!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SlyAdnancedRedstoneMod.LOGGER.warn("Failed to load dependency world for procedure Teleblock11BlockIsPlacedBy!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((World.OVERWORLD) == (world instanceof World ? (((World) world).getDimensionKey()) : World.OVERWORLD))) {
			SlyAdnancedRedstoneModVariables.MapVariables.get(world).Dim11 = (double) 1;
			SlyAdnancedRedstoneModVariables.MapVariables.get(world).syncData(world);
			SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location121 = (double) x;
			SlyAdnancedRedstoneModVariables.MapVariables.get(world).syncData(world);
			SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location122 = (double) (y + 1);
			SlyAdnancedRedstoneModVariables.MapVariables.get(world).syncData(world);
			SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location123 = (double) z;
			SlyAdnancedRedstoneModVariables.MapVariables.get(world).syncData(world);
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.hit")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.hit")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
			}
		} else if (((World.THE_NETHER) == (world instanceof World ? (((World) world).getDimensionKey()) : World.OVERWORLD))) {
			SlyAdnancedRedstoneModVariables.MapVariables.get(world).Dim11 = (double) 2;
			SlyAdnancedRedstoneModVariables.MapVariables.get(world).syncData(world);
			SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location121 = (double) x;
			SlyAdnancedRedstoneModVariables.MapVariables.get(world).syncData(world);
			SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location122 = (double) (y + 1);
			SlyAdnancedRedstoneModVariables.MapVariables.get(world).syncData(world);
			SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location123 = (double) z;
			SlyAdnancedRedstoneModVariables.MapVariables.get(world).syncData(world);
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.hit")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.hit")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
			}
		} else if (((World.THE_END) == (world instanceof World ? (((World) world).getDimensionKey()) : World.OVERWORLD))) {
			SlyAdnancedRedstoneModVariables.MapVariables.get(world).Dim11 = (double) 3;
			SlyAdnancedRedstoneModVariables.MapVariables.get(world).syncData(world);
			SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location121 = (double) x;
			SlyAdnancedRedstoneModVariables.MapVariables.get(world).syncData(world);
			SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location122 = (double) (y + 1);
			SlyAdnancedRedstoneModVariables.MapVariables.get(world).syncData(world);
			SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location123 = (double) z;
			SlyAdnancedRedstoneModVariables.MapVariables.get(world).syncData(world);
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.hit")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.hit")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
			}
		} else if (((RegistryKey.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("sly_adnanced_redstone:redsa"))) == (world instanceof World
				? (((World) world).getDimensionKey())
				: World.OVERWORLD))) {
			SlyAdnancedRedstoneModVariables.MapVariables.get(world).Dim11 = (double) 4;
			SlyAdnancedRedstoneModVariables.MapVariables.get(world).syncData(world);
			SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location121 = (double) x;
			SlyAdnancedRedstoneModVariables.MapVariables.get(world).syncData(world);
			SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location122 = (double) (y + 1);
			SlyAdnancedRedstoneModVariables.MapVariables.get(world).syncData(world);
			SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location123 = (double) z;
			SlyAdnancedRedstoneModVariables.MapVariables.get(world).syncData(world);
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.hit")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.hit")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
			}
		}
	}
}
