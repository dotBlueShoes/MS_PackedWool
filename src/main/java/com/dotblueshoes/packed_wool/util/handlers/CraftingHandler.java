package com.dotblueshoes.packed_wool.util.handlers;

import java.util.ArrayList;

import com.google.common.collect.Lists;

import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistry;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;

public class CraftingHandler {
        
        public static void removeRecipes() {
                ForgeRegistry<IRecipe> recipeRegistry = 
                        (ForgeRegistry<IRecipe>)ForgeRegistries.RECIPES;

	        ArrayList<IRecipe> recipes = 
                        Lists.newArrayList(recipeRegistry.getValuesCollection());
	        
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