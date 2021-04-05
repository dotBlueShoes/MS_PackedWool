package dotblueshoes.packed_wool.config;

import net.minecraftforge.fml.client.event.ConfigChangedEvent.OnConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.common.MinecraftForge;

import java.io.File;

import dotblueshoes.packed_wool.*;

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

	final static String 
		commentDisableOverridingShears = "Vanilla shears are being overrided so they can harvest specified blocks faster. Disable it if required.",
		commentReplaceBedsWithLegacyBed = "Removes all the minecraft beds recipes. Leaves a new bed called 'Legacy Bed' which is the red bed",
		commentDisableNewBedsRecipes = "Keeps the beds recipes unchanged.";

	public static boolean 
		isShearsOverridingDisabled = false,
		isReplaceBedsWithLegacyBed = false, 
		isDisableNewBedsRecipes = false;

	public static void initConfig(File file) {
		config = new Configuration(file);
		syncConfig();
	}

    public static void syncConfig() {
        config.load();

		isShearsOverridingDisabled = loadBool(
			Configuration.CATEGORY_GENERAL,
			"IsShearsOverridingDisabled",
			commentDisableOverridingShears,
			isShearsOverridingDisabled
		);

		isReplaceBedsWithLegacyBed = loadBool(
			Configuration.CATEGORY_GENERAL,
			"IsReplaceBedsWithLegacyBed",
			commentReplaceBedsWithLegacyBed,
			isReplaceBedsWithLegacyBed
		);

		isDisableNewBedsRecipes = loadBool(
			Configuration.CATEGORY_GENERAL,
			"IsDisableNewBedsRecipes",
			commentDisableNewBedsRecipes,
			isDisableNewBedsRecipes
		);
		
        config.save();
    }

    private static boolean loadBool(String category, String name, String comment, boolean value) {
        final Property prop = config.get(category, name, value);
        prop.setComment(comment);
        return prop.getBoolean(value);
    }

	//private static String[] loadStringArray(String category, String name, String comment, String[] value) {
    //    final Property prop = config.get(category, name, value);
    //    prop.setComment(comment);
    //    return prop.getStringList();
    //}

    // private static int loadInt(String category, String name, String comment, int value) {
    //     final Property prop = config.get(category, name, value);
    //     prop.setComment(comment);
    //     return prop.getInt(value);
    // }

}