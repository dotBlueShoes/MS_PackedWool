package dotblueshoes.packed_wool.init;

import net.minecraft.item.Item;
import dotblueshoes.packed_wool.items.*;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;

public class ModItems {

	// Shears Overriding.
	public static Item[] ITEMS_WITH_MODELS = {};

	public static void overrideShears() {
		ITEMS_WITH_MODELS = new Item[] {
			new Shears("shears", Shears.VANILLA_SHEARS_REGISTRY_NAME, 10.0f)
		};
	}

	public static ItemBlock[] PACKED_WOOL_ITEM_BLOCKS = {
		(ItemBlock) new ItemBlock(ModBlocks.PACKED_WOOL_BLOCKS[0]).setRegistryName(ModBlocks.PACKED_WOOL_BLOCKS[0].name),
		(ItemBlock) new ItemBlock(ModBlocks.PACKED_WOOL_BLOCKS[1]).setRegistryName(ModBlocks.PACKED_WOOL_BLOCKS[1].name),
		(ItemBlock) new ItemBlock(ModBlocks.PACKED_WOOL_BLOCKS[2]).setRegistryName(ModBlocks.PACKED_WOOL_BLOCKS[2].name),
		(ItemBlock) new ItemBlock(ModBlocks.PACKED_WOOL_BLOCKS[3]).setRegistryName(ModBlocks.PACKED_WOOL_BLOCKS[3].name),
		(ItemBlock) new ItemBlock(ModBlocks.PACKED_WOOL_BLOCKS[4]).setRegistryName(ModBlocks.PACKED_WOOL_BLOCKS[4].name),
		(ItemBlock) new ItemBlock(ModBlocks.PACKED_WOOL_BLOCKS[5]).setRegistryName(ModBlocks.PACKED_WOOL_BLOCKS[5].name),
		(ItemBlock) new ItemBlock(ModBlocks.PACKED_WOOL_BLOCKS[6]).setRegistryName(ModBlocks.PACKED_WOOL_BLOCKS[6].name),
		(ItemBlock) new ItemBlock(ModBlocks.PACKED_WOOL_BLOCKS[7]).setRegistryName(ModBlocks.PACKED_WOOL_BLOCKS[7].name),
		(ItemBlock) new ItemBlock(ModBlocks.PACKED_WOOL_BLOCKS[8]).setRegistryName(ModBlocks.PACKED_WOOL_BLOCKS[8].name),
		(ItemBlock) new ItemBlock(ModBlocks.PACKED_WOOL_BLOCKS[9]).setRegistryName(ModBlocks.PACKED_WOOL_BLOCKS[9].name),
		(ItemBlock) new ItemBlock(ModBlocks.PACKED_WOOL_BLOCKS[10]).setRegistryName(ModBlocks.PACKED_WOOL_BLOCKS[10].name),
		(ItemBlock) new ItemBlock(ModBlocks.PACKED_WOOL_BLOCKS[11]).setRegistryName(ModBlocks.PACKED_WOOL_BLOCKS[11].name),
		(ItemBlock) new ItemBlock(ModBlocks.PACKED_WOOL_BLOCKS[12]).setRegistryName(ModBlocks.PACKED_WOOL_BLOCKS[12].name),
		(ItemBlock) new ItemBlock(ModBlocks.PACKED_WOOL_BLOCKS[13]).setRegistryName(ModBlocks.PACKED_WOOL_BLOCKS[13].name),
		(ItemBlock) new ItemBlock(ModBlocks.PACKED_WOOL_BLOCKS[14]).setRegistryName(ModBlocks.PACKED_WOOL_BLOCKS[14].name),
		(ItemBlock) new ItemBlock(ModBlocks.PACKED_WOOL_BLOCKS[15]).setRegistryName(ModBlocks.PACKED_WOOL_BLOCKS[15].name),
		(ItemBlock) new ItemSlab(ModBlocks.PACKED_WOOL_SLAB_BLOCKS[0], ModBlocks.PACKED_WOOL_SLAB_BLOCKS[0], ModBlocks.PACKED_WOOL_DOUBLE_SLAB_BLOCKS[0])
			.setRegistryName(ModBlocks.PACKED_WOOL_SLAB_BLOCKS[0].getRegistryName()),
		(ItemBlock) new ItemSlab(ModBlocks.PACKED_WOOL_SLAB_BLOCKS[1], ModBlocks.PACKED_WOOL_SLAB_BLOCKS[1], ModBlocks.PACKED_WOOL_DOUBLE_SLAB_BLOCKS[1])
			.setRegistryName(ModBlocks.PACKED_WOOL_SLAB_BLOCKS[1].getRegistryName()),
		(ItemBlock) new ItemSlab(ModBlocks.PACKED_WOOL_SLAB_BLOCKS[2], ModBlocks.PACKED_WOOL_SLAB_BLOCKS[2], ModBlocks.PACKED_WOOL_DOUBLE_SLAB_BLOCKS[2])
			.setRegistryName(ModBlocks.PACKED_WOOL_SLAB_BLOCKS[2].getRegistryName()),
		(ItemBlock) new ItemSlab(ModBlocks.PACKED_WOOL_SLAB_BLOCKS[3], ModBlocks.PACKED_WOOL_SLAB_BLOCKS[3], ModBlocks.PACKED_WOOL_DOUBLE_SLAB_BLOCKS[3])
			.setRegistryName(ModBlocks.PACKED_WOOL_SLAB_BLOCKS[3].getRegistryName()),
		(ItemBlock) new ItemSlab(ModBlocks.PACKED_WOOL_SLAB_BLOCKS[4], ModBlocks.PACKED_WOOL_SLAB_BLOCKS[4], ModBlocks.PACKED_WOOL_DOUBLE_SLAB_BLOCKS[4])
			.setRegistryName(ModBlocks.PACKED_WOOL_SLAB_BLOCKS[4].getRegistryName()),
		(ItemBlock) new ItemSlab(ModBlocks.PACKED_WOOL_SLAB_BLOCKS[5], ModBlocks.PACKED_WOOL_SLAB_BLOCKS[5], ModBlocks.PACKED_WOOL_DOUBLE_SLAB_BLOCKS[5])
			.setRegistryName(ModBlocks.PACKED_WOOL_SLAB_BLOCKS[5].getRegistryName()),
		(ItemBlock) new ItemSlab(ModBlocks.PACKED_WOOL_SLAB_BLOCKS[6], ModBlocks.PACKED_WOOL_SLAB_BLOCKS[6], ModBlocks.PACKED_WOOL_DOUBLE_SLAB_BLOCKS[6])
			.setRegistryName(ModBlocks.PACKED_WOOL_SLAB_BLOCKS[6].getRegistryName()),
		(ItemBlock) new ItemSlab(ModBlocks.PACKED_WOOL_SLAB_BLOCKS[7], ModBlocks.PACKED_WOOL_SLAB_BLOCKS[7], ModBlocks.PACKED_WOOL_DOUBLE_SLAB_BLOCKS[7])
			.setRegistryName(ModBlocks.PACKED_WOOL_SLAB_BLOCKS[7].getRegistryName()),
		(ItemBlock) new ItemSlab(ModBlocks.PACKED_WOOL_SLAB_BLOCKS[8], ModBlocks.PACKED_WOOL_SLAB_BLOCKS[8], ModBlocks.PACKED_WOOL_DOUBLE_SLAB_BLOCKS[8])
			.setRegistryName(ModBlocks.PACKED_WOOL_SLAB_BLOCKS[8].getRegistryName()),
		(ItemBlock) new ItemSlab(ModBlocks.PACKED_WOOL_SLAB_BLOCKS[9], ModBlocks.PACKED_WOOL_SLAB_BLOCKS[9], ModBlocks.PACKED_WOOL_DOUBLE_SLAB_BLOCKS[9])
			.setRegistryName(ModBlocks.PACKED_WOOL_SLAB_BLOCKS[9].getRegistryName()),
		(ItemBlock) new ItemSlab(ModBlocks.PACKED_WOOL_SLAB_BLOCKS[10], ModBlocks.PACKED_WOOL_SLAB_BLOCKS[10], ModBlocks.PACKED_WOOL_DOUBLE_SLAB_BLOCKS[10])
			.setRegistryName(ModBlocks.PACKED_WOOL_SLAB_BLOCKS[10].getRegistryName()),
		(ItemBlock) new ItemSlab(ModBlocks.PACKED_WOOL_SLAB_BLOCKS[11], ModBlocks.PACKED_WOOL_SLAB_BLOCKS[11], ModBlocks.PACKED_WOOL_DOUBLE_SLAB_BLOCKS[11])
			.setRegistryName(ModBlocks.PACKED_WOOL_SLAB_BLOCKS[11].getRegistryName()),
		(ItemBlock) new ItemSlab(ModBlocks.PACKED_WOOL_SLAB_BLOCKS[12], ModBlocks.PACKED_WOOL_SLAB_BLOCKS[12], ModBlocks.PACKED_WOOL_DOUBLE_SLAB_BLOCKS[12])
			.setRegistryName(ModBlocks.PACKED_WOOL_SLAB_BLOCKS[12].getRegistryName()),
		(ItemBlock) new ItemSlab(ModBlocks.PACKED_WOOL_SLAB_BLOCKS[13], ModBlocks.PACKED_WOOL_SLAB_BLOCKS[13], ModBlocks.PACKED_WOOL_DOUBLE_SLAB_BLOCKS[13])
			.setRegistryName(ModBlocks.PACKED_WOOL_SLAB_BLOCKS[13].getRegistryName()),
		(ItemBlock) new ItemSlab(ModBlocks.PACKED_WOOL_SLAB_BLOCKS[14], ModBlocks.PACKED_WOOL_SLAB_BLOCKS[14], ModBlocks.PACKED_WOOL_DOUBLE_SLAB_BLOCKS[14])
			.setRegistryName(ModBlocks.PACKED_WOOL_SLAB_BLOCKS[14].getRegistryName()),
		(ItemBlock) new ItemSlab(ModBlocks.PACKED_WOOL_SLAB_BLOCKS[15], ModBlocks.PACKED_WOOL_SLAB_BLOCKS[15], ModBlocks.PACKED_WOOL_DOUBLE_SLAB_BLOCKS[15])
			.setRegistryName(ModBlocks.PACKED_WOOL_SLAB_BLOCKS[15].getRegistryName()),
		(ItemBlock) new ItemBlock(ModBlocks.packedWoolStairsBlockBlack).setRegistryName(ModBlocks.packedWoolStairsBlockBlack.name)
	};

}