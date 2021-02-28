package net.mcreator.sly_adnanced_redstone;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.IInventory;
import net.minecraft.entity.Entity;

import java.util.HashMap;

@Elementssly_adnanced_redstone.ModElement.Tag
public class MCreatorOnbuttonclick extends Elementssly_adnanced_redstone.ModElement {
	public MCreatorOnbuttonclick(Elementssly_adnanced_redstone instance) {
		super(instance, 49);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorOnbuttonclick!");
			return;
		}
		if (dependencies.get("guiinventory") == null) {
			System.err.println("Failed to load dependency guiinventory for procedure MCreatorOnbuttonclick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		HashMap guiinventory = (HashMap) dependencies.get("guiinventory");
		if ((((new Object() {
			public ItemStack getItemStack(int sltid) {
				IInventory inv = (IInventory) guiinventory.get("blocklink");
				if (inv != null)
					return inv.getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (1))).getItem() == new ItemStack(MCreatorAdc.block, (int) (1)).getItem()) && (((new Object() {
			public ItemStack getItemStack(int sltid) {
				IInventory inv = (IInventory) guiinventory.get("blocklink");
				if (inv != null)
					return inv.getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (2))).getItem() == new ItemStack(MCreatorAdc.block, (int) (1)).getItem()) && (((new Object() {
			public ItemStack getItemStack(int sltid) {
				IInventory inv = (IInventory) guiinventory.get("blocklink");
				if (inv != null)
					return inv.getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (3))).getItem() == new ItemStack(MCreatorAdc.block, (int) (1)).getItem()) && (((new Object() {
			public ItemStack getItemStack(int sltid) {
				IInventory inv = (IInventory) guiinventory.get("blocklink");
				if (inv != null)
					return inv.getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (4))).getItem() == new ItemStack(MCreatorAdc.block, (int) (1)).getItem()) && (((new Object() {
			public ItemStack getItemStack(int sltid) {
				IInventory inv = (IInventory) guiinventory.get("blocklink");
				if (inv != null)
					return inv.getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (5))).getItem() == new ItemStack(MCreatorAdvancedredstone.block, (int) (1)).getItem()) && (((new Object() {
			public ItemStack getItemStack(int sltid) {
				IInventory inv = (IInventory) guiinventory.get("blocklink");
				if (inv != null)
					return inv.getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (6))).getItem() == new ItemStack(MCreatorAdc.block, (int) (1)).getItem()) && (((new Object() {
			public ItemStack getItemStack(int sltid) {
				IInventory inv = (IInventory) guiinventory.get("blocklink");
				if (inv != null)
					return inv.getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (7))).getItem() == new ItemStack(MCreatorAdc.block, (int) (1)).getItem()) && (((new Object() {
			public ItemStack getItemStack(int sltid) {
				IInventory inv = (IInventory) guiinventory.get("blocklink");
				if (inv != null)
					return inv.getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (8))).getItem() == new ItemStack(MCreatorAdc.block, (int) (1)).getItem()) && ((new Object() {
			public ItemStack getItemStack(int sltid) {
				IInventory inv = (IInventory) guiinventory.get("blocklink");
				if (inv != null)
					return inv.getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (9))).getItem() == new ItemStack(MCreatorAdc.block, (int) (1)).getItem())))))))))) {
			{
				IInventory inv = (IInventory) guiinventory.get("blocklink");
				if (inv != null)
					inv.decrStackSize((int) (1), (int) (1));
			}
			{
				IInventory inv = (IInventory) guiinventory.get("blocklink");
				if (inv != null)
					inv.decrStackSize((int) (2), (int) (1));
			}
			{
				IInventory inv = (IInventory) guiinventory.get("blocklink");
				if (inv != null)
					inv.decrStackSize((int) (3), (int) (1));
			}
			{
				IInventory inv = (IInventory) guiinventory.get("blocklink");
				if (inv != null)
					inv.decrStackSize((int) (4), (int) (1));
			}
			{
				IInventory inv = (IInventory) guiinventory.get("blocklink");
				if (inv != null)
					inv.decrStackSize((int) (5), (int) (1));
			}
			{
				IInventory inv = (IInventory) guiinventory.get("blocklink");
				if (inv != null)
					inv.decrStackSize((int) (6), (int) (1));
			}
			{
				IInventory inv = (IInventory) guiinventory.get("blocklink");
				if (inv != null)
					inv.decrStackSize((int) (7), (int) (1));
			}
			{
				IInventory inv = (IInventory) guiinventory.get("blocklink");
				if (inv != null)
					inv.decrStackSize((int) (8), (int) (1));
			}
			{
				IInventory inv = (IInventory) guiinventory.get("blocklink");
				if (inv != null)
					inv.decrStackSize((int) (9), (int) (1));
			}
			if (!entity.world.isRemote && entity.world.getServer() != null) {
				entity.world.getServer().getCommandManager()
						.handleCommand(entity.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "dev block");
			}
		}
		if ((((new Object() {
			public ItemStack getItemStack(int sltid) {
				IInventory inv = (IInventory) guiinventory.get("blocklink");
				if (inv != null)
					return inv.getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (1))).getItem() == new ItemStack(Items.REDSTONE, (int) (1)).getItem()) && (((new Object() {
			public ItemStack getItemStack(int sltid) {
				IInventory inv = (IInventory) guiinventory.get("blocklink");
				if (inv != null)
					return inv.getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (2))).getItem() == new ItemStack(MCreatorAdc.block, (int) (1)).getItem()) && (((new Object() {
			public ItemStack getItemStack(int sltid) {
				IInventory inv = (IInventory) guiinventory.get("blocklink");
				if (inv != null)
					return inv.getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (3))).getItem() == new ItemStack(Items.REDSTONE, (int) (1)).getItem()) && (((new Object() {
			public ItemStack getItemStack(int sltid) {
				IInventory inv = (IInventory) guiinventory.get("blocklink");
				if (inv != null)
					return inv.getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (4))).getItem() == new ItemStack(MCreatorAdc.block, (int) (1)).getItem()) && (((new Object() {
			public ItemStack getItemStack(int sltid) {
				IInventory inv = (IInventory) guiinventory.get("blocklink");
				if (inv != null)
					return inv.getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (5))).getItem() == new ItemStack(MCreatorAdc.block, (int) (1)).getItem()) && (((new Object() {
			public ItemStack getItemStack(int sltid) {
				IInventory inv = (IInventory) guiinventory.get("blocklink");
				if (inv != null)
					return inv.getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (6))).getItem() == new ItemStack(MCreatorAdc.block, (int) (1)).getItem()) && (((new Object() {
			public ItemStack getItemStack(int sltid) {
				IInventory inv = (IInventory) guiinventory.get("blocklink");
				if (inv != null)
					return inv.getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (7))).getItem() == new ItemStack(Items.REDSTONE, (int) (1)).getItem()) && (((new Object() {
			public ItemStack getItemStack(int sltid) {
				IInventory inv = (IInventory) guiinventory.get("blocklink");
				if (inv != null)
					return inv.getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (8))).getItem() == new ItemStack(MCreatorAdc.block, (int) (1)).getItem()) && ((new Object() {
			public ItemStack getItemStack(int sltid) {
				IInventory inv = (IInventory) guiinventory.get("blocklink");
				if (inv != null)
					return inv.getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (9))).getItem() == new ItemStack(Items.REDSTONE, (int) (1)).getItem())))))))))) {
			{
				IInventory inv = (IInventory) guiinventory.get("blocklink");
				if (inv != null)
					inv.decrStackSize((int) (1), (int) (1));
			}
			{
				IInventory inv = (IInventory) guiinventory.get("blocklink");
				if (inv != null)
					inv.decrStackSize((int) (2), (int) (1));
			}
			{
				IInventory inv = (IInventory) guiinventory.get("blocklink");
				if (inv != null)
					inv.decrStackSize((int) (3), (int) (1));
			}
			{
				IInventory inv = (IInventory) guiinventory.get("blocklink");
				if (inv != null)
					inv.decrStackSize((int) (4), (int) (1));
			}
			{
				IInventory inv = (IInventory) guiinventory.get("blocklink");
				if (inv != null)
					inv.decrStackSize((int) (5), (int) (1));
			}
			{
				IInventory inv = (IInventory) guiinventory.get("blocklink");
				if (inv != null)
					inv.decrStackSize((int) (6), (int) (1));
			}
			{
				IInventory inv = (IInventory) guiinventory.get("blocklink");
				if (inv != null)
					inv.decrStackSize((int) (7), (int) (1));
			}
			{
				IInventory inv = (IInventory) guiinventory.get("blocklink");
				if (inv != null)
					inv.decrStackSize((int) (8), (int) (1));
			}
			{
				IInventory inv = (IInventory) guiinventory.get("blocklink");
				if (inv != null)
					inv.decrStackSize((int) (9), (int) (1));
			}
			if (!entity.world.isRemote && entity.world.getServer() != null) {
				entity.world.getServer().getCommandManager()
						.handleCommand(entity.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "to red mod");
			}
		}
	}
}
