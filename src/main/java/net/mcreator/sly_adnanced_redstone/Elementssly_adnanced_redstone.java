/*
 *    MCreator note:
 *
 *    This file is autogenerated to connect all MCreator mod elements together.
 *
 */
package net.mcreator.sly_adnanced_redstone;

import net.minecraftforge.forgespi.language.ModFileScanData;
import net.minecraftforge.fml.network.PacketDistributor;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.storage.WorldSavedData;
import net.minecraft.world.biome.Biome;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.Tag;
import net.minecraft.network.PacketBuffer;
import net.minecraft.item.Item;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.block.Block;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;
import java.util.Set;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

public class Elementssly_adnanced_redstone {
	protected final List<ModElement> elements = new ArrayList<>();
	protected final List<Supplier<Block>> blocks = new ArrayList<>();
	protected final List<Supplier<Item>> items = new ArrayList<>();
	protected final List<Supplier<Biome>> biomes = new ArrayList<>();
	protected final List<Supplier<EntityType<?>>> entities = new ArrayList<>();

	public Elementssly_adnanced_redstone() {
		try {
			ModFileScanData modFileInfo = ModList.get().getModFileById("sly_adnanced_redstone").getFile().getScanResult();
			Set<ModFileScanData.AnnotationData> annotations = modFileInfo.getAnnotations();
			for (ModFileScanData.AnnotationData annotationData : annotations) {
				if (annotationData.getAnnotationType().getClassName().equals(ModElement.Tag.class.getName())) {
					Class<?> clazz = Class.forName(annotationData.getClassType().getClassName());
					if (clazz.getSuperclass() == Elementssly_adnanced_redstone.ModElement.class)
						elements.add((Elementssly_adnanced_redstone.ModElement) clazz.getConstructor(this.getClass()).newInstance(this));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Collections.sort(elements);
		elements.forEach(Elementssly_adnanced_redstone.ModElement::initElements);
		this.addNetworkMessage(sly_adnanced_redstoneVariables.WorldSavedDataSyncMessage.class,
				sly_adnanced_redstoneVariables.WorldSavedDataSyncMessage::buffer, sly_adnanced_redstoneVariables.WorldSavedDataSyncMessage::new,
				sly_adnanced_redstoneVariables.WorldSavedDataSyncMessage::handler);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public void registerSounds(RegistryEvent.Register<net.minecraft.util.SoundEvent> event) {
		ResourceLocation sound0 = new ResourceLocation("sly_adnanced_redstone", "slytube");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound0).setRegistryName(sound0));
		ResourceLocation sound1 = new ResourceLocation("sly_adnanced_redstone", "fragile");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound1).setRegistryName(sound1));
		ResourceLocation sound2 = new ResourceLocation("sly_adnanced_redstone", "portalspawn");
		event.getRegistry().register(new net.minecraft.util.SoundEvent(sound2).setRegistryName(sound2));
	}

	@SubscribeEvent
	public void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		if (!event.getPlayer().world.isRemote) {
			WorldSavedData mapdata = sly_adnanced_redstoneVariables.MapVariables.get(event.getPlayer().world);
			WorldSavedData worlddata = sly_adnanced_redstoneVariables.WorldVariables.get(event.getPlayer().world);
			if (mapdata != null)
				sly_adnanced_redstone.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) event.getPlayer()),
						new sly_adnanced_redstoneVariables.WorldSavedDataSyncMessage(0, mapdata));
			if (worlddata != null)
				sly_adnanced_redstone.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) event.getPlayer()),
						new sly_adnanced_redstoneVariables.WorldSavedDataSyncMessage(1, worlddata));
		}
	}

	@SubscribeEvent
	public void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
		if (!event.getPlayer().world.isRemote) {
			WorldSavedData worlddata = sly_adnanced_redstoneVariables.WorldVariables.get(event.getPlayer().world);
			if (worlddata != null)
				sly_adnanced_redstone.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) event.getPlayer()),
						new sly_adnanced_redstoneVariables.WorldSavedDataSyncMessage(1, worlddata));
		}
	}
	private int messageID = 0;

	public <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, PacketBuffer> encoder, Function<PacketBuffer, T> decoder,
			BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		sly_adnanced_redstone.PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}

	public List<ModElement> getElements() {
		return elements;
	}

	public List<Supplier<Block>> getBlocks() {
		return blocks;
	}

	public List<Supplier<Item>> getItems() {
		return items;
	}

	public List<Supplier<Biome>> getBiomes() {
		return biomes;
	}

	public List<Supplier<EntityType<?>>> getEntities() {
		return entities;
	}

	public static class ModElement implements Comparable<ModElement> {
		@Retention(RetentionPolicy.RUNTIME)
		public @interface Tag {
		}
		protected final Elementssly_adnanced_redstone elements;
		protected final int sortid;

		public ModElement(Elementssly_adnanced_redstone elements, int sortid) {
			this.elements = elements;
			this.sortid = sortid;
		}

		public void initElements() {
		}

		public void init(FMLCommonSetupEvent event) {
		}

		public void serverLoad(FMLServerStartingEvent event) {
		}

		@Override
		public int compareTo(ModElement other) {
			return this.sortid - other.sortid;
		}
	}
}