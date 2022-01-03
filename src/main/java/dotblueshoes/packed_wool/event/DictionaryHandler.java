package dotblueshoes.packed_wool.event;

import dotblueshoes.packed_wool.init.ModBlocks;
import net.minecraftforge.oredict.OreDictionary;

public class DictionaryHandler {
	static void RegisterDictionaryKeys() {
		for (int i = 0; i < ModBlocks.PACKED_WOOL_BLOCKS.length; i++) {

			// Getting blocks into OreDictionary.
			//  I honestly don't know if I should also have color and wool tags separately.
			//  final String packed_wool = "packed_wool"
			//  final String[] color = "white"
			@SuppressWarnings("ConstantConditions")
			String name = ModBlocks.PACKED_WOOL_BLOCKS[i].name;

			OreDictionary.registerOre(name, ModBlocks.PACKED_WOOL_BLOCKS[i]);
			OreDictionary.registerOre(name, ModBlocks.PACKED_WOOL_SLAB_BLOCKS[i]);
			//OreDictionary.registerOre(name, ModBlocks.PACKED_WOOL_DOUBLE_SLAB_BLOCKS[i]);
			OreDictionary.registerOre(name, ModBlocks.PACKED_WOOL_STAIRS_BLOCKS[i]);
		}
	}
}
