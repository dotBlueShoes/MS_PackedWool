package com.dotblueshoes.packed_wool.config;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.common.MinecraftForge;

import java.io.File;

import com.dotblueshoes.packed_wool.PackedWool;

/* Config Things
 *  Remember to remove config file "packed_wool" after changes to script. 
 *  This is due to the fact that script will think that previous values are ment to be.
 *  
 *  I have no idea why does it sort alphabetically.

 * 	Property	setRequiresMcRestart(boolean requiresMcRestart)
 *  Sets whether or not this Property requires Minecraft to be restarted when changed.
 *  
 * Config files are being created with first run 
 *  Therefore it is important to define comments here.
 *  See if it can read an errortype.
 *  If so see what can i do with it.
*/

public class ConfigHandler {

    public static Configuration config;
	public static String[] hoeDefinedHarvestableBlocks = {
		"packed_wool.packed_wool_white"
	};

	public static boolean 
		disableOverridingShears = false, 
		replaceBedsWithLegacyBed = false, 
		disableNewBedsRecipes = false, 
		makeHoesAbleToHarvestFasterSpecifiedBlocks = false;

    public static void loadConfig(File file) {
        final String 
			disableOverridingShearsComment = "Disable overriding minecraft shears. PackedWool does it to make shears able to harvest 'Packed Wool' block.",
			replaceBedsWithLegacyBedComment = "Removes all the minecraft beds. Leaves a new bed called 'Legacy Bed' which is the original minecraft red bed. Which can be crafted the same way removed beds were.",
			disableNewBedsRecipesComment = "Replaces this mod beds recipes with original minecraft beds recipes.",
			makeHoesAbleToHarvestFasterSpecifiedBlocksComment = "Makes hoes able to harvest wool and defined below blocks with the speed of 0.5f shear equivalent.",
			hoeDefinedHarvestableBlocksComment = "Here define blocks that can be harvested with hoes faster. 'makeHoesAbleToHarvestFasterSpecifiedBlocks' has to be set to true to make it work.";
		
        config = new Configuration(file);
        config.load();

		//Its a shears_lib thing actually. move it.
		disableOverridingShears = loadBool(
			Configuration.CATEGORY_GENERAL,
			"disableOverridingShears",
			disableOverridingShearsComment,
			disableOverridingShears
		);

		replaceBedsWithLegacyBed = loadBool(
			Configuration.CATEGORY_GENERAL,
			"replaceBedsWithLegacyBed",
			replaceBedsWithLegacyBedComment,
			replaceBedsWithLegacyBed
		);

		disableNewBedsRecipes = loadBool(
			Configuration.CATEGORY_GENERAL,
			"disableNewBedsRecipes",
			disableNewBedsRecipesComment,
			disableNewBedsRecipes
		);

		//Its a shears_lib thing actually. move it.
		makeHoesAbleToHarvestFasterSpecifiedBlocks = loadBool(
			Configuration.CATEGORY_GENERAL,
			"makeHoesAbleToHarvestFasterSpecifiedBlocks",
			makeHoesAbleToHarvestFasterSpecifiedBlocksComment,
			makeHoesAbleToHarvestFasterSpecifiedBlocks
		);

		//Its a shears_lib thing actually. move it.
		hoeDefinedHarvestableBlocks = loadStringArray(
			Configuration.CATEGORY_GENERAL,
			"hoeDefinedHarvestableBlocks",
			hoeDefinedHarvestableBlocksComment,
			hoeDefinedHarvestableBlocks
		);

		// ?? Yeah learn what exaclly happends here it's quite important.
        if (config.hasChanged())
            config.save();

        MinecraftForge.EVENT_BUS.register(new ChangeListener());
    }

    private static String[] loadStringArray(String category, String name, String comment, String[] value) {
        final Property prop = config.get(category, name, value);
        prop.setComment(comment);
        return prop.getStringList();
    }

    private static boolean loadBool(String category, String name, String comment, boolean value) {
        final Property prop = config.get(category, name, value);
        prop.setComment(comment);
        return prop.getBoolean(value);
    }

    // private static int loadInt(String category, String name, String comment, int value) {
    //     final Property prop = config.get(category, name, value);
    //     prop.setComment(comment);
    //     return prop.getInt(value);
    // }

    public static class ChangeListener {
        @SubscribeEvent
        public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
            if (event.getModID() == "packed_wool");
        }
    }

}