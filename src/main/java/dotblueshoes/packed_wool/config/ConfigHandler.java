package dotblueshoes.packed_wool.config;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

import java.io.File;

/* Config Things
 *  Remember to remove config file "packed_wool" after changes to script. 
 *  This is due to the fact that script will think that previous values are meant to be.
 *  
 *  I have no idea why does it sort alphabetically.

 * 	Property	setRequiresMcRestart(boolean requiresMcRestart)
 *  Sets whether this Property requires Minecraft to be restarted when changed.
 *  
 * Config files are being created with first run 
 *  Therefore it is important to define comments here.
 *  See if it can read an error type.
 *  If so see what can I do with it.
*/

public class ConfigHandler {

    public static Configuration config;

	final static String 
		commentIsDisableOverridingShears = "Vanilla shears are being overridden so they can harvest specified blocks faster. Disable it if required.",
		commentIsReplaceBedsWithLegacyBed = "Removes all the minecraft beds recipes. Leaves a new bed called 'Legacy Bed' which is the red bed",
		commentIsDisablePackedWoolRecipes = "When marked this mod itself does not add recipes for packed wool",
		commentIsDisableNewBedsRecipes = "Keeps the beds recipes unchanged.";


	public static boolean 
		isShearsOverridingDisabled = false,
		isReplaceBedsWithLegacyBed = false,
		isDisablePackedWoolRecipes = false,
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
			commentIsDisableOverridingShears,
			isShearsOverridingDisabled
		);

		isReplaceBedsWithLegacyBed = loadBool(
			Configuration.CATEGORY_GENERAL,
			"IsReplaceBedsWithLegacyBed",
			commentIsReplaceBedsWithLegacyBed,
			isReplaceBedsWithLegacyBed
		);

		isDisablePackedWoolRecipes = loadBool(
			Configuration.CATEGORY_GENERAL,
			"IsDisablePackedWoolRecipes",
			commentIsDisablePackedWoolRecipes,
			isDisablePackedWoolRecipes
		);

		isDisableNewBedsRecipes = loadBool(
			Configuration.CATEGORY_GENERAL,
			"IsDisableNewBedsRecipes",
			commentIsDisableNewBedsRecipes,
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