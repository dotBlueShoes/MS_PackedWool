package dotblueshoes.packed_wool.blocks.stairs;

import dotblueshoes.packed_wool.blocks.utility.IPackedWoolBlock;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;

public class PackedWoolStairsBlock extends BlockStairs implements IPackedWoolBlock {
	public String name;

	public PackedWoolStairsBlock(String blockName, IBlockState modelState) {
		super(modelState);

		this.name = blockName;
		this.useNeighborBrightness = true;

		this.setUnlocalizedName(blockName);
		this.setRegistryName(blockName);

		this.setCreativeTab(CREATIVE_TAB);
		this.setResistance(RESISTANCE);
		this.setSoundType(SOUND_TYPE);
		this.setHardness(HARDNESS);
	}

	public ItemBlock getItemBlock() {
		ItemBlock temp = new ItemBlock(this);
		temp.setRegistryName(this.getRegistryName());
		return temp;
	}

	@Nonnull
	@Override
	public List<ItemStack> onSheared(@Nonnull ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
		List<ItemStack> temp = new ArrayList<>();
		temp.add(new ItemStack(Item.getItemFromBlock(this)));

		setHardness(SHEAR_HARDNESS);
		return temp;
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
