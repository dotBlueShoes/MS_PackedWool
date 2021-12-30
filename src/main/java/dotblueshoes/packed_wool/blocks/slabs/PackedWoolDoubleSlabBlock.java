package dotblueshoes.packed_wool.blocks.slabs;

import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

import javax.annotation.Nonnull;

public class PackedWoolDoubleSlabBlock extends PackedWoolSlabBlock {

	public PackedWoolDoubleSlabBlock(String blockName, Material material) {
		super(blockName, material);
	}

	@Override
	public boolean isDouble()
	{
		return true;
	}

}
