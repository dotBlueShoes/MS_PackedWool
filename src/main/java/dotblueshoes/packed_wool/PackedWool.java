package dotblueshoes.packed_wool;

import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod;

import dotblueshoes.packed_wool.config.*;
import dotblueshoes.packed_wool.event.*;
import dotblueshoes.packed_wool.proxy.*;
import dotblueshoes.packed_wool.init.*;

import org.apache.logging.log4j.Logger;

@Mod (
    modid = PackedWool.MODID,
    version = PackedWool.VERSION,
    useMetadata = true
)
public class PackedWool {
	public static final String MODID = "packed_wool";
	public static final String VERSION = "1";

	private static Logger logger;

	@Instance("packed_wool")
	public static PackedWool instance;

	@SidedProxy (
    	clientSide = "dotblueshoes.packed_wool.proxy.ClientProxy", 
    	serverSide = "dotblueshoes.packed_wool.proxy.CommonProxy"
    ) public static CommonProxy proxy;

    

    @EventHandler
    public static void preInitialize(FMLPreInitializationEvent event) {
		logger = event.getModLog();

    	ConfigHandler.initConfig(event.getSuggestedConfigurationFile());
		if (!ConfigHandler.isShearsOverridingDisabled)
			ModItems.overrideShears();
    }

    @EventHandler
    public static void initialize(FMLInitializationEvent event) {
		if (!ConfigHandler.isDisableNewBedsRecipes  ||
			ConfigHandler.isReplaceBedsWithLegacyBed)
        	RegistryHandler.removeRecipes();
    }

    //public static void msgDebug(String msg) {
    //    logger.info(msg);
    //}

	// @EventHandler
    // public void postInit(FMLPostInitializationEvent event) {
    //     ForgeRegistries.ITEMS.getValuesCollection().forEach(item -> {
    //         if (item instanceof ItemHoe)
    //             logInfo(item.getUnlocalizedName()); //
    //     });
    // }

	public static void logInfo(String msg) { //
        final String PREFIX = "$$$###$$$###";    
        logger.info(PREFIX + msg);
    }
}
