package com.dotblueshoes.packed_wool.util.handlers;

import java.util.ArrayList;

import com.google.common.collect.Lists;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistry;

import com.dotblueshoes.packed_wool.util.recipes.EmptyRecipe;

public class CraftingHandler {
        public static void RegisterRecipes() {}

        public static void removeRecipes() {
        ForgeRegistry<IRecipe> recipeRegistry = (ForgeRegistry<IRecipe>)ForgeRegistries.RECIPES;
	       ArrayList<IRecipe> recipes = Lists.newArrayList(recipeRegistry.getValues());
	        
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
        
	        //for (IRecipe r : recipes) {
                //    ItemStack output = r.getRecipeOutput();
                //    // wood log recipe?
                //    if (output.getItem() == Item.getItemFromBlock(Blocks.PLANKS)) {
                //        recipeRegistry.remove(r.getRegistryName());
                //        
                //        //recipeRegistry.register(EmptyRecipe.from(r));
                //    }
	        //}
	}
}