package dotblueshoes.packed_wool.blocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.SoundType;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import net.minecraftforge.common.IShearable;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;

public class PackedWoolBlock extends Block implements IShearable {

	public String name;

	public PackedWoolBlock(String blockName, Material material) {
		super(material); // calls parent class constructor. no idea. c# is better.

		name = blockName; // Because I only use list this might come in handy.

		setCreativeTab(CreativeTabs.BUILDING_BLOCKS); // Sets in which tab block is stored.
		setSoundType(SoundType.CLOTH); // Setting the sound type when walked on.
		setResistance(1.0f); // Boom resistance if I remember well.
		setHardness(1.0f);  // Pickaxe if I remember well.

		setUnlocalizedName(blockName);
		setRegistryName(blockName);
	}

	//public ItemBlock getItemBlock() {
	//	ItemBlock temp = new ItemBlock(this);
	//	temp.setRegistryName(name);
	//	return temp;
	//}

	// packed_wool:packed_wool_slab_white#normal
	//public void registerModel() {
	//	PackedWool.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	//}

	// this is deprecated. the returned float value is 0 no matter what.
	//@Override
	//public float getPlayerRelativeBlockHardness(IBlockState state, EntityPlayer player, World worldIn, BlockPos pos){
	//    // check if the item in player's main hand is shears and return a lower value.
	//    return 10000.0f;
	//}

	// Not the thing. I set this thing in constructor.
	//@Override
	//public String getHarvestTool(IBlockState state){
	//    return "pickaxe";
	//}

	@Override
	public boolean isShearable(@Nonnull ItemStack item, IBlockAccess world, BlockPos pos) {
		return true;
	}

	@Override
	@Nonnull
	public List<ItemStack> onSheared(@Nonnull ItemStack item, IBlockAccess world, BlockPos position, int fortune) {
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

	// Enum
//    public IBlockState getStateFromMeta(int meta)
//    {
//        return this.getDefaultState().withProperty(VARIANT, BlockPlanks.EnumType.byMetadata(meta));
//    }
//
//    public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos)
//    {
//        return ((BlockPlanks.EnumType)state.getValue(VARIANT)).getMapColor();
//    }
//
//    public int getMetaFromState(IBlockState state)
//    {
//        return ((BlockPlanks.EnumType)state.getValue(VARIANT)).getMetadata();
//    }
//
//    protected BlockStateContainer createBlockState()
//    {
//        return new BlockStateContainer(this, new IProperty[] {VARIANT});
//    }
}