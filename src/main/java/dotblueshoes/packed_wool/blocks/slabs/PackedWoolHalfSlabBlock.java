package dotblueshoes.packed_wool.blocks.slabs;

import dotblueshoes.packed_wool.PackedWool;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import javax.annotation.Nonnull;

public class PackedWoolHalfSlabBlock extends PackedWoolSlabBlock{

	public PackedWoolHalfSlabBlock(String blockName, Material material) {
		super(blockName, material);
	}



	@Override
	public void registerModel() {
		PackedWool.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

	//@Override
	//public boolean isDouble() {
	//	return false;
	//}

}
