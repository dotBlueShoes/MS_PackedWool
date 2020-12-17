package com.dotblueshoes.packed_wool.util.handlers;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.event.RegistryEvent;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import com.dotblueshoes.packed_wool.util.IHasModel;
import com.dotblueshoes.packed_wool.init.ModBlocks;
import com.dotblueshoes.packed_wool.init.ModItems;

@EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        for (Item item : ModItems.ITEMS) {
            if (item instanceof IHasModel) {
                ((IHasModel)item).registerModels();
            }
        }

        for (Block block : ModBlocks.BLOCKS) {
            if (block instanceof IHasModel) {
                ((IHasModel)block).registerModels();
            }
        }
    }

    public static void registerForgeOredict() {
        // Tag "woolColor" apparently they do exist so why not.
        OreDictionary.registerOre("woolLightBlue", ModBlocks.PACKED_WOOL_LIGHT_BLUE);
        OreDictionary.registerOre("woolLightGray", ModBlocks.PACKED_WOOL_LIGHT_GRAY);
        OreDictionary.registerOre("woolMagenta", ModBlocks.PACKED_WOOL_MAGENTA);
        OreDictionary.registerOre("woolOrange", ModBlocks.PACKED_WOOL_ORANGE);
        OreDictionary.registerOre("woolPurple", ModBlocks.PACKED_WOOL_PURPLE);
        OreDictionary.registerOre("woolYellow", ModBlocks.PACKED_WOOL_YELLOW);
        OreDictionary.registerOre("woolBrown", ModBlocks.PACKED_WOOL_BROWN);
        OreDictionary.registerOre("woolGreen", ModBlocks.PACKED_WOOL_GREEN);
        OreDictionary.registerOre("woolBlack", ModBlocks.PACKED_WOOL_BLACK);
        OreDictionary.registerOre("woolWhite", ModBlocks.PACKED_WOOL_WHITE);
        OreDictionary.registerOre("woolBlue", ModBlocks.PACKED_WOOL_BLUE);
        OreDictionary.registerOre("woolCyan", ModBlocks.PACKED_WOOL_CYAN);
        OreDictionary.registerOre("woolGray", ModBlocks.PACKED_WOOL_GRAY);
        OreDictionary.registerOre("woolLime", ModBlocks.PACKED_WOOL_LIME);
        OreDictionary.registerOre("woolPink", ModBlocks.PACKED_WOOL_PINK);
        OreDictionary.registerOre("woolRed", ModBlocks.PACKED_WOOL_RED);

        // Tag "wool"
        for (Block block : ModBlocks.BLOCKS) {
            OreDictionary.registerOre("wool", block);
        }
    }
}