package dotblueshoes.packed_wool.util.handlers;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.event.RegistryEvent;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import dotblueshoes.packed_wool.util.IHasModel;
import dotblueshoes.packed_wool.init.ModBlocks;
//import dotblueshoes.packed_wool.init.ModItems;
import dotblueshoes.packed_wool.blocks.PackedWoolBlock;

@EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        // Registering Items (key code to make items appear in game).
        for (int i = 0; i < ModBlocks.BLOCKS_COUNT; i++)
            event.getRegistry().register(ModBlocks.PACKED_WOOL_BLOCKS[i].getItemBlock());
        //for (int i = 0; i < ModItems.ITEMS_COUNT; i++)
        //    event.getRegistry().register(ModItems.ITEMS[i]);

        // Getting blocks into OreDictionary.
        // I honestly don't know if i should also have color and wool tags separately.
        OreDictionary.registerOre("packed_wool_white", ModBlocks.PACKED_WOOL_BLOCKS[0]);
        OreDictionary.registerOre("packed_wool_orange", ModBlocks.PACKED_WOOL_BLOCKS[1]);
        OreDictionary.registerOre("packed_wool_magenta", ModBlocks.PACKED_WOOL_BLOCKS[2]);
        OreDictionary.registerOre("packed_wool_light_blue", ModBlocks.PACKED_WOOL_BLOCKS[3]);
        OreDictionary.registerOre("packed_wool_yellow", ModBlocks.PACKED_WOOL_BLOCKS[4]);
        OreDictionary.registerOre("packed_wool_lime", ModBlocks.PACKED_WOOL_BLOCKS[5]);
        OreDictionary.registerOre("packed_wool_pink", ModBlocks.PACKED_WOOL_BLOCKS[6]);
        OreDictionary.registerOre("packed_wool_gray", ModBlocks.PACKED_WOOL_BLOCKS[7]);
        OreDictionary.registerOre("packed_wool_light_gray", ModBlocks.PACKED_WOOL_BLOCKS[8]);
        OreDictionary.registerOre("packed_wool_cyan", ModBlocks.PACKED_WOOL_BLOCKS[9]);
        OreDictionary.registerOre("packed_wool_purple", ModBlocks.PACKED_WOOL_BLOCKS[10]);
        OreDictionary.registerOre("packed_wool_blue", ModBlocks.PACKED_WOOL_BLOCKS[11]);
        OreDictionary.registerOre("packed_wool_brown", ModBlocks.PACKED_WOOL_BLOCKS[12]);
        OreDictionary.registerOre("packed_wool_green", ModBlocks.PACKED_WOOL_BLOCKS[13]);
        OreDictionary.registerOre("packed_wool_red", ModBlocks.PACKED_WOOL_BLOCKS[14]);
        OreDictionary.registerOre("packed_wool_black", ModBlocks.PACKED_WOOL_BLOCKS[15]);
    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        for (int i = 0; i < ModBlocks.BLOCKS_COUNT; i++)
            event.getRegistry().register(ModBlocks.PACKED_WOOL_BLOCKS[i]);
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        // for (int i = 0; i < ModItems.ITEMS_COUNT; i++)
        //     if (ModItems.ITEMS[i] instanceof IHasModel)
        //         ((IHasModel)ModItems.ITEMS[i]).registerModels();

        // I know in advance they have IHasModel.
        for (int i = 0; i < ModBlocks.BLOCKS_COUNT; i++)
            ((IHasModel)ModBlocks.PACKED_WOOL_BLOCKS[i]).registerModels();
    }
}