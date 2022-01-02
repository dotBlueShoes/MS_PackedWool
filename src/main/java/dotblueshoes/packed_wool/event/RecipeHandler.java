package dotblueshoes.packed_wool.event;

import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistry;

public class RecipeHandler {

	public static void removeRecipes() {
		ForgeRegistry<IRecipe> recipeRegistry = (ForgeRegistry<IRecipe>) ForgeRegistries.RECIPES;
		recipeRegistry.remove(new ResourceLocation("minecraft", "light_gray_bed"));
		recipeRegistry.remove(new ResourceLocation("minecraft", "light_blue_bed"));
		recipeRegistry.remove(new ResourceLocation("minecraft", "magenta_bed"));
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
