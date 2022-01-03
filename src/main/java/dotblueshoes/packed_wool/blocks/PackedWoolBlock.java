package dotblueshoes.packed_wool.blocks;

import dotblueshoes.packed_wool.blocks.utility.IPackedWoolBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.util.EnumFacing;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;

public class PackedWoolBlock extends Block implements IPackedWoolBlock {

	public String name;

	public PackedWoolBlock(String blockName, Material material) {
		super(material);
		name = blockName; 	// Because I only use list this might come in handy.

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

	@Override
	@Nonnull
	public List<ItemStack> onSheared(@Nonnull ItemStack item, IBlockAccess world, BlockPos position, int fortune) {
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