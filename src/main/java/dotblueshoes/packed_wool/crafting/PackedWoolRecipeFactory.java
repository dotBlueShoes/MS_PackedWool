package dotblueshoes.packed_wool.crafting;

import com.google.gson.JsonObject;
import dotblueshoes.packed_wool.config.ConfigHandler;
import net.minecraftforge.common.crafting.IConditionFactory;
import net.minecraftforge.common.crafting.JsonContext;

import java.util.function.BooleanSupplier;

@SuppressWarnings("unused")
public class PackedWoolRecipeFactory implements IConditionFactory {

	// This is how we tell that there's a condition in json file.
	//  we also need _factories.json and additional "conditions" in recipes.
	//  as expected this function gets called by the json reader.

	@Override
	public BooleanSupplier parse(JsonContext context, JsonObject json) {
		return () -> !ConfigHandler.isDisablePackedWoolRecipes;
	}
}
