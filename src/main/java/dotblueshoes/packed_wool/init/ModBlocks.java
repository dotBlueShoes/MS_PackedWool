package dotblueshoes.packed_wool.init;

import dotblueshoes.packed_wool.blocks.PackedWoolBlock;
import dotblueshoes.packed_wool.blocks.slabs.PackedWoolSlabBlock;
import dotblueshoes.packed_wool.blocks.stairs.PackedWoolStairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class ModBlocks {

	// List of all Packed Wool blocks I am adding
	//  If I would add non packedWool block then
	//  I would create a special class for it.
	public static PackedWoolBlock[] PACKED_WOOL_BLOCKS = {
		new PackedWoolBlock("packed_wool_white", Material.CLOTH),
		new PackedWoolBlock("packed_wool_orange", Material.CLOTH),
		new PackedWoolBlock("packed_wool_magenta", Material.CLOTH),
		new PackedWoolBlock("packed_wool_light_blue", Material.CLOTH),
		new PackedWoolBlock("packed_wool_yellow", Material.CLOTH),
		new PackedWoolBlock("packed_wool_lime", Material.CLOTH),
		new PackedWoolBlock("packed_wool_pink", Material.CLOTH),
		new PackedWoolBlock("packed_wool_gray", Material.CLOTH),
		new PackedWoolBlock("packed_wool_light_gray", Material.CLOTH),
		new PackedWoolBlock("packed_wool_cyan", Material.CLOTH),
		new PackedWoolBlock("packed_wool_purple", Material.CLOTH),
		new PackedWoolBlock("packed_wool_blue", Material.CLOTH),
		new PackedWoolBlock("packed_wool_brown", Material.CLOTH),
		new PackedWoolBlock("packed_wool_green", Material.CLOTH),
		new PackedWoolBlock("packed_wool_red", Material.CLOTH),
		new PackedWoolBlock("packed_wool_black", Material.CLOTH),
	};

	public static PackedWoolSlabBlock.Half[] PACKED_WOOL_SLAB_BLOCKS = {
		new PackedWoolSlabBlock.Half("packed_wool_slab_white", Material.CLOTH),
		new PackedWoolSlabBlock.Half("packed_wool_slab_orange", Material.CLOTH),
		new PackedWoolSlabBlock.Half("packed_wool_slab_magenta", Material.CLOTH),
		new PackedWoolSlabBlock.Half("packed_wool_slab_light_blue", Material.CLOTH),
		new PackedWoolSlabBlock.Half("packed_wool_slab_yellow", Material.CLOTH),
		new PackedWoolSlabBlock.Half("packed_wool_slab_lime", Material.CLOTH),
		new PackedWoolSlabBlock.Half("packed_wool_slab_pink", Material.CLOTH),
		new PackedWoolSlabBlock.Half("packed_wool_slab_gray", Material.CLOTH),
		new PackedWoolSlabBlock.Half("packed_wool_slab_light_gray", Material.CLOTH),
		new PackedWoolSlabBlock.Half("packed_wool_slab_cyan", Material.CLOTH),
		new PackedWoolSlabBlock.Half("packed_wool_slab_purple", Material.CLOTH),
		new PackedWoolSlabBlock.Half("packed_wool_slab_blue", Material.CLOTH),
		new PackedWoolSlabBlock.Half("packed_wool_slab_brown", Material.CLOTH),
		new PackedWoolSlabBlock.Half("packed_wool_slab_green", Material.CLOTH),
		new PackedWoolSlabBlock.Half("packed_wool_slab_red", Material.CLOTH),
		new PackedWoolSlabBlock.Half("packed_wool_slab_black", Material.CLOTH),
	};

	public static PackedWoolSlabBlock.Double[] PACKED_WOOL_DOUBLE_SLAB_BLOCKS = {
		new PackedWoolSlabBlock.Double("packed_wool_double_slab_white",         Material.CLOTH, PACKED_WOOL_SLAB_BLOCKS[0]),
		new PackedWoolSlabBlock.Double("packed_wool_double_slab_orange",        Material.CLOTH, PACKED_WOOL_SLAB_BLOCKS[1]),
		new PackedWoolSlabBlock.Double("packed_wool_double_slab_magenta",       Material.CLOTH, PACKED_WOOL_SLAB_BLOCKS[2]),
		new PackedWoolSlabBlock.Double("packed_wool_double_slab_light_blue",    Material.CLOTH, PACKED_WOOL_SLAB_BLOCKS[3]),
		new PackedWoolSlabBlock.Double("packed_wool_double_slab_yellow",        Material.CLOTH, PACKED_WOOL_SLAB_BLOCKS[4]),
		new PackedWoolSlabBlock.Double("packed_wool_double_slab_lime",          Material.CLOTH, PACKED_WOOL_SLAB_BLOCKS[5]),
		new PackedWoolSlabBlock.Double("packed_wool_double_slab_pink",          Material.CLOTH, PACKED_WOOL_SLAB_BLOCKS[6]),
		new PackedWoolSlabBlock.Double("packed_wool_double_slab_gray",          Material.CLOTH, PACKED_WOOL_SLAB_BLOCKS[7]),
		new PackedWoolSlabBlock.Double("packed_wool_double_slab_light_gray",    Material.CLOTH, PACKED_WOOL_SLAB_BLOCKS[8]),
		new PackedWoolSlabBlock.Double("packed_wool_double_slab_cyan",          Material.CLOTH, PACKED_WOOL_SLAB_BLOCKS[9]),
		new PackedWoolSlabBlock.Double("packed_wool_double_slab_purple",        Material.CLOTH, PACKED_WOOL_SLAB_BLOCKS[10]),
		new PackedWoolSlabBlock.Double("packed_wool_double_slab_blue",          Material.CLOTH, PACKED_WOOL_SLAB_BLOCKS[11]),
		new PackedWoolSlabBlock.Double("packed_wool_double_slab_brown",         Material.CLOTH, PACKED_WOOL_SLAB_BLOCKS[12]),
		new PackedWoolSlabBlock.Double("packed_wool_double_slab_green",         Material.CLOTH, PACKED_WOOL_SLAB_BLOCKS[13]),
		new PackedWoolSlabBlock.Double("packed_wool_double_slab_red",           Material.CLOTH, PACKED_WOOL_SLAB_BLOCKS[14]),
		new PackedWoolSlabBlock.Double("packed_wool_double_slab_black",         Material.CLOTH, PACKED_WOOL_SLAB_BLOCKS[15]),
	};

	public static PackedWoolStairsBlock[] PACKED_WOOL_STAIRS_BLOCKS = {
		new PackedWoolStairsBlock("packed_wool_stairs_white", 		PACKED_WOOL_BLOCKS[0].getDefaultState()),
		new PackedWoolStairsBlock("packed_wool_stairs_orange", 		PACKED_WOOL_BLOCKS[1].getDefaultState()),
		new PackedWoolStairsBlock("packed_wool_stairs_magenta", 		PACKED_WOOL_BLOCKS[2].getDefaultState()),
		new PackedWoolStairsBlock("packed_wool_stairs_light_blue", 	PACKED_WOOL_BLOCKS[3].getDefaultState()),
		new PackedWoolStairsBlock("packed_wool_stairs_yellow", 		PACKED_WOOL_BLOCKS[4].getDefaultState()),
		new PackedWoolStairsBlock("packed_wool_stairs_lime", 			PACKED_WOOL_BLOCKS[5].getDefaultState()),
		new PackedWoolStairsBlock("packed_wool_stairs_pink", 			PACKED_WOOL_BLOCKS[6].getDefaultState()),
		new PackedWoolStairsBlock("packed_wool_stairs_gray", 			PACKED_WOOL_BLOCKS[7].getDefaultState()),
		new PackedWoolStairsBlock("packed_wool_stairs_light_gray", 	PACKED_WOOL_BLOCKS[8].getDefaultState()),
		new PackedWoolStairsBlock("packed_wool_stairs_cyan", 			PACKED_WOOL_BLOCKS[9].getDefaultState()),
		new PackedWoolStairsBlock("packed_wool_stairs_purple", 		PACKED_WOOL_BLOCKS[10].getDefaultState()),
		new PackedWoolStairsBlock("packed_wool_stairs_blue", 			PACKED_WOOL_BLOCKS[11].getDefaultState()),
		new PackedWoolStairsBlock("packed_wool_stairs_brown", 		PACKED_WOOL_BLOCKS[12].getDefaultState()),
		new PackedWoolStairsBlock("packed_wool_stairs_green", 		PACKED_WOOL_BLOCKS[13].getDefaultState()),
		new PackedWoolStairsBlock("packed_wool_stairs_red", 			PACKED_WOOL_BLOCKS[14].getDefaultState()),
		new PackedWoolStairsBlock("packed_wool_stairs_black", 		PACKED_WOOL_BLOCKS[15].getDefaultState()),
	};

}
