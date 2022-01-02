package dotblueshoes.packed_wool.crafting;

import net.minecraftforge.common.crafting.IConditionFactory;
import net.minecraftforge.common.crafting.JsonContext;

import java.util.function.BooleanSupplier;
import com.google.gson.JsonObject;

import dotblueshoes.packed_wool.config.*;

@SuppressWarnings("unused")
public class BedRecipeFactory implements IConditionFactory {

	// This is how we tell that there's a condition in json file.
	//  we also need _factories.json and additional "conditions" in recipes.
	//  as expected this function gets called by the json reader.

	@Override
	public BooleanSupplier parse(final JsonContext context, final JsonObject json) {
		return () -> !ConfigHandler.isDisableNewBedsRecipes && ConfigHandler.isReplaceBedsWithLegacyBed;
	}

}