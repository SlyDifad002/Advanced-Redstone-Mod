package net.mcreator.sly_adnanced_redstone;

import net.minecraftforge.fml.network.PacketDistributor;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.storage.WorldSavedData;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.IWorld;
import net.minecraft.network.PacketBuffer;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.player.ServerPlayerEntity;

import java.util.function.Supplier;

public class SlyAdnancedRedstoneModVariables {
	public SlyAdnancedRedstoneModVariables(SlyAdnancedRedstoneModElements elements) {
		elements.addNetworkMessage(WorldSavedDataSyncMessage.class, WorldSavedDataSyncMessage::buffer, WorldSavedDataSyncMessage::new,
				WorldSavedDataSyncMessage::handler);
	}
	public static double Energy2 = 0;
	public static double Energy1 = 0;
	@SubscribeEvent
	public void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		if (!event.getPlayer().world.isRemote) {
			WorldSavedData mapdata = MapVariables.get(event.getPlayer().world);
			WorldSavedData worlddata = WorldVariables.get(event.getPlayer().world);
			if (mapdata != null)
				SlyAdnancedRedstoneMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) event.getPlayer()),
						new WorldSavedDataSyncMessage(0, mapdata));
			if (worlddata != null)
				SlyAdnancedRedstoneMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) event.getPlayer()),
						new WorldSavedDataSyncMessage(1, worlddata));
		}
	}

	@SubscribeEvent
	public void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
		if (!event.getPlayer().world.isRemote) {
			WorldSavedData worlddata = WorldVariables.get(event.getPlayer().world);
			if (worlddata != null)
				SlyAdnancedRedstoneMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) event.getPlayer()),
						new WorldSavedDataSyncMessage(1, worlddata));
		}
	}
	public static class WorldVariables extends WorldSavedData {
		public static final String DATA_NAME = "sly_adnanced_redstone_worldvars";
		public WorldVariables() {
			super(DATA_NAME);
		}

		public WorldVariables(String s) {
			super(s);
		}

		@Override
		public void read(CompoundNBT nbt) {
		}

		@Override
		public CompoundNBT write(CompoundNBT nbt) {
			return nbt;
		}

		public void syncData(IWorld world) {
			this.markDirty();
			if (!world.getWorld().isRemote)
				SlyAdnancedRedstoneMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(world.getWorld().dimension::getType),
						new WorldSavedDataSyncMessage(1, this));
		}
		static WorldVariables clientSide = new WorldVariables();
		public static WorldVariables get(IWorld world) {
			if (world.getWorld() instanceof ServerWorld) {
				return ((ServerWorld) world.getWorld()).getSavedData().getOrCreate(WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends WorldSavedData {
		public static final String DATA_NAME = "sly_adnanced_redstone_mapvars";
		public double Location111 = 0;
		public double Location112 = 0;
		public double Location113 = 0;
		public double Location121 = 0;
		public double Location122 = 0;
		public double Location123 = 0;
		public double Location211 = 0;
		public double Location212 = 0;
		public double Location213 = 0;
		public double Location221 = 0;
		public double Location222 = 0;
		public double Location223 = 0;
		public double Dim1 = 0;
		public double Dim11 = 0;
		public double Dim2 = 0;
		public double Dim21 = 0;
		public MapVariables() {
			super(DATA_NAME);
		}

		public MapVariables(String s) {
			super(s);
		}

		@Override
		public void read(CompoundNBT nbt) {
			Location111 = nbt.getDouble("Location111");
			Location112 = nbt.getDouble("Location112");
			Location113 = nbt.getDouble("Location113");
			Location121 = nbt.getDouble("Location121");
			Location122 = nbt.getDouble("Location122");
			Location123 = nbt.getDouble("Location123");
			Location211 = nbt.getDouble("Location211");
			Location212 = nbt.getDouble("Location212");
			Location213 = nbt.getDouble("Location213");
			Location221 = nbt.getDouble("Location221");
			Location222 = nbt.getDouble("Location222");
			Location223 = nbt.getDouble("Location223");
			Dim1 = nbt.getDouble("Dim1");
			Dim11 = nbt.getDouble("Dim11");
			Dim2 = nbt.getDouble("Dim2");
			Dim21 = nbt.getDouble("Dim21");
		}

		@Override
		public CompoundNBT write(CompoundNBT nbt) {
			nbt.putDouble("Location111", Location111);
			nbt.putDouble("Location112", Location112);
			nbt.putDouble("Location113", Location113);
			nbt.putDouble("Location121", Location121);
			nbt.putDouble("Location122", Location122);
			nbt.putDouble("Location123", Location123);
			nbt.putDouble("Location211", Location211);
			nbt.putDouble("Location212", Location212);
			nbt.putDouble("Location213", Location213);
			nbt.putDouble("Location221", Location221);
			nbt.putDouble("Location222", Location222);
			nbt.putDouble("Location223", Location223);
			nbt.putDouble("Dim1", Dim1);
			nbt.putDouble("Dim11", Dim11);
			nbt.putDouble("Dim2", Dim2);
			nbt.putDouble("Dim21", Dim21);
			return nbt;
		}

		public void syncData(IWorld world) {
			this.markDirty();
			if (!world.getWorld().isRemote)
				SlyAdnancedRedstoneMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new WorldSavedDataSyncMessage(0, this));
		}
		static MapVariables clientSide = new MapVariables();
		public static MapVariables get(IWorld world) {
			if (world.getWorld() instanceof ServerWorld) {
				return world.getWorld().getServer().getWorld(DimensionType.OVERWORLD).getSavedData().getOrCreate(MapVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class WorldSavedDataSyncMessage {
		public int type;
		public WorldSavedData data;
		public WorldSavedDataSyncMessage(PacketBuffer buffer) {
			this.type = buffer.readInt();
			this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
			this.data.read(buffer.readCompoundTag());
		}

		public WorldSavedDataSyncMessage(int type, WorldSavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(WorldSavedDataSyncMessage message, PacketBuffer buffer) {
			buffer.writeInt(message.type);
			buffer.writeCompoundTag(message.data.write(new CompoundNBT()));
		}

		public static void handler(WorldSavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
