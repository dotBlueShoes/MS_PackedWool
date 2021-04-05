package dotblueshoes.packed_wool.event;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.event.RegistryEvent;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistry;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;

import dotblueshoes.packed_wool.blocks.*;
import dotblueshoes.packed_wool.items.*;
import dotblueshoes.packed_wool.init.*;

import com.google.common.collect.Lists;
import java.util.ArrayList;

@EventBusSubscriber
public class RegistryHandler {

	// Registering Items this makes them appear in game.
	//  I have also implemented the OreDictionary registration here.
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {

		for (int i = 0; i < ModItems.ITEMS_WITH_MODELS.length; i++)
            event.getRegistry().register(ModItems.ITEMS_WITH_MODELS[i]);
        
        for (int i = 0; i < ModItems.PACKED_WOOL_BLOCKS.length; i++)
            event.getRegistry().register(ModItems.PACKED_WOOL_BLOCKS[i].getItemBlock());

        // Getting blocks into OreDictionary.
        //  I honestly don't know if i should also have color and wool tags separately.
        OreDictionary.registerOre("packed_wool_white", ModItems.PACKED_WOOL_BLOCKS[0]);
        OreDictionary.registerOre("packed_wool_orange", ModItems.PACKED_WOOL_BLOCKS[1]);
        OreDictionary.registerOre("packed_wool_magenta", ModItems.PACKED_WOOL_BLOCKS[2]);
        OreDictionary.registerOre("packed_wool_light_blue", ModItems.PACKED_WOOL_BLOCKS[3]);
        OreDictionary.registerOre("packed_wool_yellow", ModItems.PACKED_WOOL_BLOCKS[4]);
        OreDictionary.registerOre("packed_wool_lime", ModItems.PACKED_WOOL_BLOCKS[5]);
        OreDictionary.registerOre("packed_wool_pink", ModItems.PACKED_WOOL_BLOCKS[6]);
        OreDictionary.registerOre("packed_wool_gray", ModItems.PACKED_WOOL_BLOCKS[7]);
        OreDictionary.registerOre("packed_wool_light_gray", ModItems.PACKED_WOOL_BLOCKS[8]);
        OreDictionary.registerOre("packed_wool_cyan", ModItems.PACKED_WOOL_BLOCKS[9]);
        OreDictionary.registerOre("packed_wool_purple", ModItems.PACKED_WOOL_BLOCKS[10]);
        OreDictionary.registerOre("packed_wool_blue", ModItems.PACKED_WOOL_BLOCKS[11]);
        OreDictionary.registerOre("packed_wool_brown", ModItems.PACKED_WOOL_BLOCKS[12]);
        OreDictionary.registerOre("packed_wool_green", ModItems.PACKED_WOOL_BLOCKS[13]);
        OreDictionary.registerOre("packed_wool_red", ModItems.PACKED_WOOL_BLOCKS[14]);
        OreDictionary.registerOre("packed_wool_black", ModItems.PACKED_WOOL_BLOCKS[15]);
    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        for (int i = 0; i < ModItems.PACKED_WOOL_BLOCKS.length; i++)
            event.getRegistry().register(ModItems.PACKED_WOOL_BLOCKS[i]);
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        // for (int i = 0; i < ModItems.ITEMS_COUNT; i++)
        //     if (ModItems.ITEMS[i] instanceof IHasModel)
        //         ((IHasModel)ModItems.ITEMS[i]).registerModels();

		// I don't need to register model that already is being registered.
		//for (int i = 0; i < ModItems.ITEMS_WITH_MODELS.length; i++) 
        //    ((Shears)ModItems.ITEMS_WITH_MODELS[i]).registerModel();

        for (int i = 0; i < ModItems.PACKED_WOOL_BLOCKS.length; i++)
            ModItems.PACKED_WOOL_BLOCKS[i].registerModels();
    }

	public static void removeRecipes() {
        ForgeRegistry<IRecipe> recipeRegistry = (ForgeRegistry<IRecipe>)ForgeRegistries.RECIPES;
        recipeRegistry.remove(new ResourceLocation("minecraft", "light_gray_bed"));
        recipeRegistry.remove(new ResourceLocation("minecraft", "light_blue_bed"));
        recipeRegistry.remove(new ResourceLocation("minecraft", "magneta_bed"));
        recipeRegistry.remove(new ResourceLocation("minecraft", "yellow_bed"));
        recipeRegistry.remove(new ResourceLocation("minecraft", "orange_bed"));
        recipeRegistry.remove(new ResourceLocation("minecraft", "purple_bed"));
       	recipeRegistry.remove(new ResourceLocation("minecraft", "white_bed"));
        recipeRegistry.remove(new ResourceLocation("minecraft", "black_bed"));
        recipeRegistry.remove(new ResourceLocation("minecraft", "green_bed"));
        recipeRegistry.remove(new ResourceLocation("minecraft", "brown_bed"));
        recipeRegistry.remove(new ResourceLocation("minecraft", "blue_bed"));
        recipeRegistry.remove(new ResourceLocation("minecraft", "cyan_bed"));
        recipeRegistry.remove(new ResourceLocation("minecraft", "gray_bed"));
        recipeRegistry.remove(new ResourceLocation("minecraft", "pink_bed"));
        recipeRegistry.remove(new ResourceLocation("minecraft", "lime_bed"));
        recipeRegistry.remove(new ResourceLocation("minecraft", "red_bed"));
	}
}