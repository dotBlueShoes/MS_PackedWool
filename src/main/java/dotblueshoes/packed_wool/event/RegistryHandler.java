package dotblueshoes.packed_wool.event;

import dotblueshoes.packed_wool.PackedWool;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import dotblueshoes.packed_wool.init.*;

@EventBusSubscriber
public class RegistryHandler {

	// Registering Items this makes them appear in game.
	//  I have also implemented the OreDictionary registration here.
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {

		for (Item item : ModItems.ITEMS_WITH_MODELS)
			event.getRegistry().register(item);

		for (ItemBlock itemBlock : ModItems.PACKED_WOOL_ITEM_BLOCKS)
			event.getRegistry().register(itemBlock);

		//for (int i = 0; i < ModItems.ITEMS_WITH_MODELS.length; i++)
		//	event.getRegistry().register(ModItems.ITEMS_WITH_MODELS[i]);
		//for (int i = 0; i < ModItems.PACKED_WOOL_BLOCKS.length; i++)
		//	event.getRegistry().register();

		//event.getRegistry().register(new ItemSlab(ModItems.packedWoolSlabBlockHalf, ModItems.packedWoolSlabBlockHalf, ModItems.packedWoolSlabBlockDouble).setRegistryName(ModItems.packedWoolSlabBlockHalf.getRegistryName()));

		//for (int i = 0; i < ModItems.PACKED_WOOL_HALF_SLAB_BLOCKS.length; i++)
		//	event.getRegistry().register(ModItems.PACKED_WOOL_HALF_SLAB_BLOCKS[i].getItemBlock());

		//for (int i = 0; i < ModItems.PACKED_WOOL_ITEM_BLOCKS.length; i++)
		//	event.getRegistry().register(ModItems.PACKED_WOOL_ITEM_BLOCKS[i].setRegistryName("packed_wool_black_slab").setUnlocalizedName("packed_wool_black_slab"));

		//for (int i = 0; i < ModItems.PACKED_WOOL_HALF_SLAB_BLOCKS.length; i++)
		//	event.getRegistry().register( new ItemSlab(
		//		ModItems.PACKED_WOOL_BLOCKS[15],
		//		ModItems.PACKED_WOOL_HALF_SLAB_BLOCKS[i],
		//		ModItems.PACKED_WOOL_DOUBLE_SLAB_BLOCKS[i])
		//		.setRegistryName("packed_wool_slab_black")
		//	);

		//for (int i = 0; i < ModItems.PACKED_WOOL_HALF_SLAB_BLOCKS.length; i++)
		//	event.getRegistry().register((Block)ModItems.PACKED_WOOL_HALF_SLAB_BLOCKS[i]);

		DictionaryHandler.RegisterDictionaryKeys();

//		OreDictionary.registerOre("packed_wool_white", 		ModBlocks.PACKED_WOOL_BLOCKS[0]);
//		OreDictionary.registerOre("packed_wool_orange", 	    ModBlocks.PACKED_WOOL_BLOCKS[1]);
//		OreDictionary.registerOre("packed_wool_magenta", 	    ModBlocks.PACKED_WOOL_BLOCKS[2]);
//		OreDictionary.registerOre("packed_wool_light_blue",   ModBlocks.PACKED_WOOL_BLOCKS[3]);
//		OreDictionary.registerOre("packed_wool_yellow", 	    ModBlocks.PACKED_WOOL_BLOCKS[4]);
//		OreDictionary.registerOre("packed_wool_lime", 		ModBlocks.PACKED_WOOL_BLOCKS[5]);
//		OreDictionary.registerOre("packed_wool_pink", 		ModBlocks.PACKED_WOOL_BLOCKS[6]);
//		OreDictionary.registerOre("packed_wool_gray", 		ModBlocks.PACKED_WOOL_BLOCKS[7]);
//		OreDictionary.registerOre("packed_wool_light_gray",   ModBlocks.PACKED_WOOL_BLOCKS[8]);
//		OreDictionary.registerOre("packed_wool_cyan", 		ModBlocks.PACKED_WOOL_BLOCKS[9]);
//		OreDictionary.registerOre("packed_wool_purple", 	    ModBlocks.PACKED_WOOL_BLOCKS[10]);
//		OreDictionary.registerOre("packed_wool_blue", 		ModBlocks.PACKED_WOOL_BLOCKS[11]);
//		OreDictionary.registerOre("packed_wool_brown", 		ModBlocks.PACKED_WOOL_BLOCKS[12]);
//		OreDictionary.registerOre("packed_wool_green", 		ModBlocks.PACKED_WOOL_BLOCKS[13]);
//		OreDictionary.registerOre("packed_wool_red", 		    ModBlocks.PACKED_WOOL_BLOCKS[14]);
//		OreDictionary.registerOre("packed_wool_black", 		ModBlocks.PACKED_WOOL_BLOCKS[15]);
	}

	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		for (Block block : ModBlocks.PACKED_WOOL_BLOCKS)
			event.getRegistry().register(block);
		for (Block block : ModBlocks.PACKED_WOOL_SLAB_BLOCKS)
			event.getRegistry().register(block);
		for (Block block : ModBlocks.PACKED_WOOL_DOUBLE_SLAB_BLOCKS)
			event.getRegistry().register(block);
		for (Block block : ModBlocks.PACKED_WOOL_STAIRS_BLOCKS)
			event.getRegistry().register(block);

		//event.getRegistry().register(ModBlocks.packedWoolSlabBlockDouble);
		//event.getRegistry().register(ModBlocks.packedWoolSlabBlockHalf);

		//for (int i = 0; i < ModBlocks.PACKED_WOOL_BLOCKS.length; i++)
		//	event.getRegistry().register(ModBlocks.PACKED_WOOL_BLOCKS[i]);



		//for (int i = 0; i < ModItems.PACKED_WOOL_HALF_SLAB_BLOCKS.length; i++)
		//	event.getRegistry().register(ModItems.PACKED_WOOL_HALF_SLAB_BLOCKS[i]);
		//for (int i = 0; i < ModItems.PACKED_WOOL_DOUBLE_SLAB_BLOCKS.length; i++)
		//	event.getRegistry().register(ModItems.PACKED_WOOL_DOUBLE_SLAB_BLOCKS[i]);
	}

	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		for (Block block : ModBlocks.PACKED_WOOL_BLOCKS)
			PackedWool.proxy.registerItemRenderer(Item.getItemFromBlock(block), 0, "inventory");
		for (Block block : ModBlocks.PACKED_WOOL_SLAB_BLOCKS)
			PackedWool.proxy.registerItemRenderer(Item.getItemFromBlock(block), 0, "inventory");
		for (Block block : ModBlocks.PACKED_WOOL_STAIRS_BLOCKS)
			PackedWool.proxy.registerItemRenderer(Item.getItemFromBlock(block), 0, "inventory");

		//for (int i = 0; i < ModBlocks.PACKED_WOOL_BLOCKS.length; i++)
		//	ModBlocks.PACKED_WOOL_BLOCKS[i].registerModel();
		//PackedWool.proxy.registerItemRenderer(Item.getItemFromBlock(ModBlocks.packedWoolSlabBlockHalf), 0, "inventory");

		// for (int i = 0; i < ModItems.ITEMS_COUNT; i++)
		//     if (ModItems.ITEMS[i] instanceof IHasModel)
		//         ((IHasModel)ModItems.ITEMS[i]).registerModels();
		// I don't need to register model that already is being registered.
		//for (int i = 0; i < ModItems.ITEMS_WITH_MODELS.length; i++)
		//    ((Shears)ModItems.ITEMS_WITH_MODELS[i]).registerModel();
	}

}