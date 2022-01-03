package dotblueshoes.packed_wool.blocks.slabs;

import dotblueshoes.packed_wool.blocks.utility.IPackedWoolBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Helped a lot...
// https://suppergerrie2.com/minecraft-1-12-modding-with-forge-13-custom-slab/

public abstract class PackedWoolSlabBlock extends BlockSlab implements IPackedWoolBlock {


	public static class Double extends PackedWoolSlabBlock {
		Block droppedItem;
		public Double(String name, Material materialIn, Block newDroppedItem) {
			super(name, materialIn);
			droppedItem = newDroppedItem;
		}

		@Override
		public boolean isDouble() {
			return true;
		}

		@Nonnull
		@Override
		public Item getItemDropped(@Nonnull IBlockState state, @Nonnull Random rand, int fortune) {
			return Item.getItemFromBlock(droppedItem);
		}

		@Override
		public int quantityDropped(@Nonnull Random rand) {
			return 2;
		}

		@Nonnull
		@Override
		public List<ItemStack> onSheared(@Nonnull ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
			List<ItemStack> temp = new ArrayList<>();
			temp.add(new ItemStack(droppedItem, 2));

			setHardness(SHEAR_HARDNESS);
			return temp;
		}
	}

	public static class Half extends PackedWoolSlabBlock {
		public Half(String name, Material materialIn) {
			super(name, materialIn);
			this.setCreativeTab(CREATIVE_TAB);
		}

		@Override
		public boolean isDouble() {
			return false;
		}

		@Nonnull
		@Override
		public Item getItemDropped(@Nonnull IBlockState state, @Nonnull Random rand, int fortune) {
			return Item.getItemFromBlock(this);
		}

		@Nonnull
		@Override
		public List<ItemStack> onSheared(@Nonnull ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
			List<ItemStack> ret = new ArrayList<>();
			ret.add(new ItemStack(Item.getItemFromBlock(this)));

			setHardness(SHEAR_HARDNESS);
			return ret;
		}
	}
	public enum Variant implements IStringSerializable {
		DEFAULT;

		@Override
		@Nonnull
		public String getName() {
			return "default";
		}
	}

	public static final PropertyEnum<Variant> VARIANT = PropertyEnum.create("variant", Variant.class);

	public PackedWoolSlabBlock(String name, Material materialIn) {
		super(materialIn);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);

		IBlockState blockState = this.blockState.getBaseState().withProperty(VARIANT, Variant.DEFAULT);

		if(!this.isDouble()) {
			blockState.withProperty(HALF, BlockSlab.EnumBlockHalf.BOTTOM);
		}

		this.setDefaultState(blockState);
		this.useNeighborBrightness = !this.isDouble();
		this.setResistance(RESISTANCE);
		this.setSoundType(SOUND_TYPE);
		this.setHardness(HARDNESS);
	}

	public static ItemBlock getItemBlock(Half slabBlock, Double doubleBlock) {
		ItemBlock temp = new ItemSlab(slabBlock, slabBlock, doubleBlock);
		temp.setRegistryName(slabBlock.getRegistryName());
		return temp;
	}

	@Override
	@Nonnull
	public String getUnlocalizedName(int meta) {
		return super.getUnlocalizedName();
	}

	@Override
	@Nonnull
	public IProperty<?> getVariantProperty() {
		return VARIANT;
	}

	@Override
	@Nonnull
	public Comparable<?> getTypeForItem(@Nonnull ItemStack stack) {
		return Variant.DEFAULT;
	}

//	@Override
//	@Nonnull
//	public final IBlockState getStateFromMeta(final int meta) {
//		IBlockState blockState = this.blockState.getBaseState().withProperty(VARIANT, Variant.DEFAULT);
//
//		if(!this.isDouble()) {
//			blockState = blockState.withProperty(HALF, ((meta&8)!=0)?EnumBlockHalf.TOP:EnumBlockHalf.BOTTOM);
//		}
//
//		return blockState;
//	}

	@Override
	public final int getMetaFromState(@Nonnull final IBlockState state) {
		int meta = 0;

		if (!this.isDouble()&& state.getValue(HALF)==EnumBlockHalf.TOP)
			meta |= 8;

		return meta;
	}

	@Override
	@Nonnull
	protected BlockStateContainer createBlockState() {
		if(!this.isDouble()){
			return new BlockStateContainer(this, VARIANT, HALF);
		}
		return new BlockStateContainer(this, VARIANT);
	}

	@Override
	public int getFlammability(@Nonnull IBlockAccess world, @Nonnull BlockPos pos, @Nonnull EnumFacing face) {
		return FLAMMABILITY;
	}

	@Override
	public int getFireSpreadSpeed(@Nonnull IBlockAccess world, @Nonnull BlockPos pos, @Nonnull EnumFacing face) {
		return FIRE_SPREAD_SPEED;
	}

}