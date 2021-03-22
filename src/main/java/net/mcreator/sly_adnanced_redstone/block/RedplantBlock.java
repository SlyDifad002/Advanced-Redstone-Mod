
package net.mcreator.sly_adnanced_redstone.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.PlantType;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.feature.DoublePlantFeature;
import net.minecraft.world.gen.feature.DoublePlantConfig;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.IWorld;
import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.item.TallBlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.DoublePlantBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.sly_adnanced_redstone.world.dimension.RedsaDimension;
import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneModElements;

import java.util.Random;
import java.util.List;
import java.util.Collections;

@SlyAdnancedRedstoneModElements.ModElement.Tag
public class RedplantBlock extends SlyAdnancedRedstoneModElements.ModElement {
	@ObjectHolder("sly_adnanced_redstone:redplant")
	public static final Block block = null;
	public RedplantBlock(SlyAdnancedRedstoneModElements instance) {
		super(instance, 178);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustomFlower());
		elements.items
				.add(() -> new TallBlockItem(block, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(block.getRegistryName()));
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		DoublePlantFeature feature = new DoublePlantFeature(DoublePlantConfig::deserialize) {
			@Override
			public boolean place(IWorld world, ChunkGenerator generator, Random random, BlockPos pos, DoublePlantConfig config) {
				DimensionType dimensionType = world.getDimension().getType();
				boolean dimensionCriteria = false;
				if (dimensionType == RedsaDimension.type)
					dimensionCriteria = true;
				if (!dimensionCriteria)
					return false;
				return super.place(world, generator, random, pos, config);
			}
		};
		for (Biome biome : ForgeRegistries.BIOMES.getValues()) {
			biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(feature,
					new DoublePlantConfig(block.getDefaultState()), Placement.COUNT_HEIGHTMAP_32, new FrequencyConfig(5)));
		}
	}
	public static class BlockCustomFlower extends DoublePlantBlock {
		public BlockCustomFlower() {
			super(Block.Properties.create(Material.PLANTS, MaterialColor.RED).doesNotBlockMovement().sound(SoundType.PLANT)
					.hardnessAndResistance(0f, 0f).lightValue(0));
			setRegistryName("redplant");
		}

		@Override
		public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
			return 100;
		}

		@Override
		public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
			return 60;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			if (state.get(BlockStateProperties.DOUBLE_BLOCK_HALF) != DoubleBlockHalf.LOWER)
				return Collections.emptyList();
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

		@Override
		public PlantType getPlantType(IBlockReader world, BlockPos pos) {
			return PlantType.Plains;
		}
	}
}
