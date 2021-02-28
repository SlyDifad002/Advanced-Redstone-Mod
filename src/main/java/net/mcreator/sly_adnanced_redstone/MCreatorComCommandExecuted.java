package net.mcreator.sly_adnanced_redstone;

import net.minecraft.world.World;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.IInventory;

import java.util.HashMap;

@Elementssly_adnanced_redstone.ModElement.Tag
public class MCreatorComCommandExecuted extends Elementssly_adnanced_redstone.ModElement {
	public MCreatorComCommandExecuted(Elementssly_adnanced_redstone instance) {
		super(instance, 57);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("guiinventory") == null) {
			System.err.println("Failed to load dependency guiinventory for procedure MCreatorComCommandExecuted!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorComCommandExecuted!");
			return;
		}
		HashMap guiinventory = (HashMap) dependencies.get("guiinventory");
		World world = (World) dependencies.get("world");
		{
			IInventory inv = (IInventory) guiinventory.get("inherited");
			if (inv != null)
				inv.setInventorySlotContents((int) (1), (world.getRecipeManager().getRecipe(IRecipeType.SMELTING, new Inventory((new Object() {
					public ItemStack getItemStack(int sltid) {
						IInventory inv = (IInventory) guiinventory.get("inherited");
						if (inv != null)
							return inv.getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack((int) (0)))), world).get().getRecipeOutput()));
		}
		{
			IInventory inv = (IInventory) guiinventory.get("inherited");
			if (inv != null)
				inv.decrStackSize((int) (0), (int) (1));
		}
	}
}
