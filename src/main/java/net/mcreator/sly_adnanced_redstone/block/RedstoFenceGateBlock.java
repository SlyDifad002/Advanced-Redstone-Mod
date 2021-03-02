
package net.mcreator.sly_adnanced_redstone.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.sly_adnanced_redstone.itemgroup.RWEItemGroup;
import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneModElements;

import java.util.List;
import java.util.Collections;

@SlyAdnancedRedstoneModElements.ModElement.Tag
public class RedstoFenceGateBlock extends SlyAdnancedRedstoneModElements.ModElement {
	@ObjectHolder("sly_adnanced_redstone:redsto_fence_gate")
	public static final Block block = null;
	public RedstoFenceGateBlock(SlyAdnancedRedstoneModElements instance) {
		super(instance, 132);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(RWEItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends FenceGateBlock {
		public CustomBlock() {
			super(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(20f, 30f).lightValue(0));
			setRegistryName("redsto_fence_gate");
		}

		@Override
		public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
			return 50;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
