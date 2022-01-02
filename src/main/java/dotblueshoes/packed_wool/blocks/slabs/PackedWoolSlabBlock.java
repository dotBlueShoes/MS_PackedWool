package dotblueshoes.packed_wool.blocks.slabs;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.IShearable;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Helped a lot...
// https://suppergerrie2.com/minecraft-1-12-modding-with-forge-13-custom-slab/

public abstract class PackedWoolSlabBlock extends BlockSlab implements IShearable {

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

	@Nonnull
	public Item getItemDropped(@Nonnull IBlockState state, @Nonnull Random rand, int fortune) {
		return Item.getItemFromBlock(this);
	}

	@Override
	@Nonnull
	public final IBlockState getStateFromMeta(final int meta) {
		IBlockState blockState = this.blockState.getBaseState().withProperty(VARIANT, Variant.DEFAULT);

		if(!this.isDouble()) {
			blockState = blockState.withProperty(HALF, ((meta&8)!=0)?EnumBlockHalf.TOP:EnumBlockHalf.BOTTOM);
		}

		return blockState;
	}

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

	public static class Double extends PackedWoolSlabBlock {
		public Double(String name, Material materialIn) {
			super(name, materialIn);
			setSoundType(SoundType.CLOTH);
			setResistance(1.0f);
			setHardness(1.0f);
		}

		@Override
		public boolean isDouble() {
			return true;
		}
	}

	public static class Half extends PackedWoolSlabBlock {
		public Half(String name, Material materialIn) {
			super(name, materialIn);
			setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
			setSoundType(SoundType.CLOTH);
			setResistance(1.0f);
			setHardness(1.0f);
		}

		@Override
		public boolean isDouble() {
			return false;
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

	@Override
	public boolean isShearable(@Nonnull ItemStack item, IBlockAccess world, BlockPos pos) {
		return true;
	}

	@Nonnull
	@Override
	public List<ItemStack> onSheared(@Nonnull ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
		List<ItemStack> ret = new ArrayList<>();
		ret.add(new ItemStack(Item.getItemFromBlock(this)));

		setHardness(0.5f);
		return ret;
	}

	@Override // 300 Being 100%.
	public int getFlammability(@Nonnull IBlockAccess world, @Nonnull BlockPos pos, @Nonnull EnumFacing face) {
		return 90;
	}

	@Override // That should be somewhat faster than wool.
	public int getFireSpreadSpeed(@Nonnull IBlockAccess world, @Nonnull BlockPos pos, @Nonnull EnumFacing face) {
		return 100;
	}

}

/*
public class PackedWoolSlabBlock extends BlockSlab implements IShearable {

	public static final PropertyEnum<PackedWoolSlabBlock.EnumType> VARIANT = PropertyEnum.create("variant", PackedWoolSlabBlock.EnumType.class);
	//public static final PropertyBool SEAMLESS = PropertyBool.create("seamless");
	public String name;
	//public Block block;

	public PackedWoolSlabBlock(String blockName, Material material) {
		super(material);
		name = blockName;

		IBlockState blockState = this.blockState.getBaseState();
		//if (this.isDouble())
		//	blockState = blockState.withProperty(SEAMLESS, false);
		//else
		//	blockState = blockState.withProperty(HALF, BlockSlab.EnumBlockHalf.BOTTOM);
		if (!this.isDouble())
		{
			blockState = blockState.withProperty(HALF, BlockSlab.EnumBlockHalf.BOTTOM);
		}

		this.setDefaultState(blockState.withProperty(VARIANT, PackedWoolSlabBlock.EnumType.OAK));
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

		//name = blockName;
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setSoundType(SoundType.CLOTH);
		setResistance(1.0f);
		setHardness(1.0f);

		setUnlocalizedName(blockName);
		setRegistryName(blockName);
	}

	public boolean isDouble()
	{
		return false;
	}

	@Nonnull
	@Override
	protected BlockStateContainer createBlockState() {
		return this.isDouble() ? new BlockStateContainer(this, new IProperty[] {VARIANT}) : new BlockStateContainer(this, new IProperty[] {HALF, VARIANT});
	}

	//@Nonnull
	//@Override
	//public IBlockState getStateFromMeta(int meta)
	//{
	//	IBlockState blockState = this.getDefaultState().withProperty(VARIANT, PackedWoolSlabBlock.EnumType.byMetadata(meta & 7));
	//
	//	if (!this.isDouble())
	//	{
	//		blockState = blockState.withProperty(HALF, (meta & 8) == 0 ? BlockSlab.EnumBlockHalf.BOTTOM : BlockSlab.EnumBlockHalf.TOP);
	//	}
	//
	//	return blockState;
	//}

	public int getMetaFromState(IBlockState state) {
		int i = 0;
		i = i | ((PackedWoolSlabBlock.EnumType)state.getValue(VARIANT)).getMetadata();
		if (!this.isDouble() && state.getValue(HALF) == BlockSlab.EnumBlockHalf.TOP)
			i |= 8;

		return i;
	}

	// Other

	//@Nonnull
	//public MapColor getMapColor(IBlockState state, @Nonnull IBlockAccess worldIn, @Nonnull BlockPos pos)
	//{
	//	return ((PackedWoolSlabBlock.EnumType)state.getValue(VARIANT)).getMapColor();
	//}

	//@Nonnull
	//public Item getItemDropped(@Nonnull IBlockState state, @Nonnull Random rand, int fortune) {
	//	return Item.getItemFromBlock(Blocks.WOODEN_SLAB);
	//}

	//@Override
	//public ItemStack getItem(@Nonnull World worldIn, @Nonnull BlockPos pos, IBlockState state)
	//{
	//	return new ItemStack(Blocks.WOODEN_SLAB, 1, ((PackedWoolSlabBlock.EnumType)state.getValue(VARIANT)).getMetadata());
	//}

	@Nonnull
	@Override
	public String getUnlocalizedName(int meta) {
		return super.getUnlocalizedName();
	}

	@Nonnull
	public Comparable<?> getTypeForItem(ItemStack stack) {
		return PackedWoolSlabBlock.EnumType.byMetadata(stack.getMetadata() & 7);
	}

	public void getSubBlocks(@Nonnull CreativeTabs itemIn, @Nonnull NonNullList<ItemStack> items) {
		for (PackedWoolSlabBlock.EnumType packedWool$enumType : PackedWoolSlabBlock.EnumType.values())
			items.add(new ItemStack(this, 1, packedWool$enumType.getMetadata()));
	}

//	@Nonnull
//	public ItemBlock getItemBlock() {
//		ItemSlab temp =  new ItemSlab(this, this, this);
//		temp.setRegistryName(name);
//		temp.setUnlocalizedName(name);
//		return temp;
//		//ItemBlock temp = new ItemBlock(this);
//		//temp.setRegistryName(name);
//		//return temp;
//	}

	public void registerModel() {
		PackedWool.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

	//@Nonnull
	//@Override
	//public String getUnlocalizedName(int meta) {
	//	//return PackedWool.MODID + "." + name;
	//	return PackedWool.MODID + "." + PackedWoolSlabBlock.EnumType.byMetadata(meta).getUnlocalizedName();
	//}

	@Nonnull
	@Override
	public IProperty<?> getVariantProperty() { return VARIANT; }

	//@Nonnull
	//@Override
	//public Comparable<?> getTypeForItem(ItemStack stack) {
	//	return BlockStoneSlabNew.EnumType.byMetadata(stack.getMetadata() & 7);
	//}

	@Override
	public boolean isShearable(@Nonnull ItemStack item, IBlockAccess world, BlockPos pos) {
		return true;
	}

	@Nonnull
	@Override
	public List<ItemStack> onSheared(@Nonnull ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
		List<ItemStack> ret = new ArrayList<>();
		ret.add(new ItemStack(Item.getItemFromBlock(this)));

		setHardness(0.5f);
		return ret;
	}

	@Override // 300 Being 100%.
	public int getFlammability(@Nonnull IBlockAccess world, @Nonnull BlockPos pos, @Nonnull EnumFacing face) {
		return 90;
	}

	@Override // That should be somewhat faster than wool.
	public int getFireSpreadSpeed(@Nonnull IBlockAccess world, @Nonnull BlockPos pos, @Nonnull EnumFacing face) {
		return 100;
	}

	public static enum EnumType implements IStringSerializable
	{
		OAK(0, "oak", MapColor.WOOD);
		//public static final PropertyEnum<PackedWoolSlabBlock.EnumType> VARIANT = PropertyEnum.<PackedWoolSlabBlock.EnumType>create("variant", PackedWoolSlabBlock.EnumType.class);
		//RED_SANDSTONE(0, "packed_wool_black", BlockSand.EnumType.RED_SAND.getMapColor());
		//SPRUCE(1, "spruce", MapColor.OBSIDIAN),
		//BIRCH(2, "birch", MapColor.SAND),
		//JUNGLE(3, "jungle", MapColor.DIRT),
		//ACACIA(4, "acacia", MapColor.ADOBE),
		//DARK_OAK(5, "dark_oak", "big_oak", MapColor.BROWN);

		private static final PackedWoolSlabBlock.EnumType[] META_LOOKUP = new PackedWoolSlabBlock.EnumType[values().length];
		private final int meta;
		private final String name;
		private final String unlocalizedName;
		private final MapColor mapColor;

		private EnumType(int metaIn, String nameIn, MapColor mapColorIn) {
			this(metaIn, nameIn, nameIn, mapColorIn);
		}

		private EnumType(int metaIn, String nameIn, String unlocalizedNameIn, MapColor mapColorIn) {
			this.meta = metaIn;
			this.name = nameIn;
			this.unlocalizedName = unlocalizedNameIn;
			this.mapColor = mapColorIn;
		}

		public int getMetadata()
		{
			return this.meta;
		}

		public MapColor getMapColor()
		{
			return this.mapColor;
		}

		public String toString()
		{
			return this.name;
		}

		public static PackedWoolSlabBlock.EnumType byMetadata(int meta) {
			if (meta < 0 || meta >= META_LOOKUP.length)
				meta = 0;
			return META_LOOKUP[meta];
		}

		@Nonnull
		public String getName() {
			return this.name;
		}

		public String getUnlocalizedName() {
			return this.unlocalizedName;
		}

		static {
			for (PackedWoolSlabBlock.EnumType packedWool$enumType : values())
				META_LOOKUP[packedWool$enumType.getMetadata()] = packedWool$enumType;
		}
	}
}
*/