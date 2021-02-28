package net.mcreator.sly_adnanced_redstone;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.IInventory;

import java.util.HashMap;

@Elementssly_adnanced_redstone.ModElement.Tag
public class MCreatorOnpresde extends Elementssly_adnanced_redstone.ModElement {
	public MCreatorOnpresde(Elementssly_adnanced_redstone instance) {
		super(instance, 55);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("guiinventory") == null) {
			System.err.println("Failed to load dependency guiinventory for procedure MCreatorOnpresde!");
			return;
		}
		HashMap guiinventory = (HashMap) dependencies.get("guiinventory");
		if (((new Object() {
			public ItemStack getItemStack(int sltid) {
				IInventory inv = (IInventory) guiinventory.get("redter");
				if (inv != null)
					return inv.getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (0))).getOrCreateTag().getBoolean("reders"))) {
			{
				IInventory inv = (IInventory) guiinventory.get("redter");
				if (inv != null)
					inv.decrStackSize((int) (0), (int) (1));
			}
			{
				IInventory inv = (IInventory) guiinventory.get("redter");
				if (inv != null)
					inv.setInventorySlotContents((int) (1), new ItemStack(MCreatorAdvancedredstone.block, (int) (1)));
			}
		}
	}
}
