package net.mcreator.sly_adnanced_redstone;

import net.minecraftforge.fml.network.PacketDistributor;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.LogicalSide;

import net.minecraft.world.storage.WorldSavedData;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.World;
import net.minecraft.network.PacketBuffer;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.client.Minecraft;

import java.util.function.Supplier;

public class sly_adnanced_redstoneVariables {
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

		public void syncData(World world) {
			this.markDirty();
			if (world.isRemote) {
				sly_adnanced_redstone.PACKET_HANDLER.sendToServer(new WorldSavedDataSyncMessage(1, this));
			} else {
				sly_adnanced_redstone.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(world.dimension::getType), new WorldSavedDataSyncMessage(
						1, this));
			}
		}
		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(World world) {
			if (world instanceof ServerWorld) {
				return ((ServerWorld) world).getSavedData().getOrCreate(WorldVariables::new, DATA_NAME);
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
		}

		@Override
		public CompoundNBT write(CompoundNBT nbt) {
			nbt.putDouble("Location111", Location111);
			nbt.putDouble("Location112", Location112);
			nbt.putDouble("Location113", Location113);
			nbt.putDouble("Location121", Location121);
			nbt.putDouble("Location122", Location122);
			nbt.putDouble("Location123", Location123);
			return nbt;
		}

		public void syncData(World world) {
			this.markDirty();
			if (world.isRemote) {
				sly_adnanced_redstone.PACKET_HANDLER.sendToServer(new WorldSavedDataSyncMessage(0, this));
			} else {
				sly_adnanced_redstone.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new WorldSavedDataSyncMessage(0, this));
			}
		}
		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(World world) {
			if (world instanceof ServerWorld) {
				return world.getServer().getWorld(DimensionType.OVERWORLD).getSavedData().getOrCreate(MapVariables::new, DATA_NAME);
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
			if (this.type == 0)
				this.data = new MapVariables();
			else
				this.data = new WorldVariables();
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
				if (context.getDirection().getReceptionSide().isServer())
					syncData(message, context.getDirection().getReceptionSide(), context.getSender().world);
				else
					syncData(message, context.getDirection().getReceptionSide(), Minecraft.getInstance().player.world);
			});
			context.setPacketHandled(true);
		}

		private static void syncData(WorldSavedDataSyncMessage message, LogicalSide side, World world) {
			if (side.isServer()) {
				message.data.markDirty();
				if (message.type == 0) {
					sly_adnanced_redstone.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), message);
					world.getServer().getWorld(DimensionType.OVERWORLD).getSavedData().set(message.data);
				} else {
					sly_adnanced_redstone.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(world.dimension::getType), message);
					((ServerWorld) world).getSavedData().set(message.data);
				}
			} else {
				if (message.type == 0) {
					MapVariables.clientSide = (MapVariables) message.data;
				} else {
					WorldVariables.clientSide = (WorldVariables) message.data;
				}
			}
		}
	}
}
