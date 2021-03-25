package dotblueshoes.packed_wool;

import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod;

import org.apache.logging.log4j.Logger;

import dotblueshoes.packed_wool.util.handlers.CraftingHandler;
import dotblueshoes.packed_wool.config.ConfigHandler;
import dotblueshoes.packed_wool.proxy.CommonProxy;
import dotblueshoes.shears_lib.*;
//import baubles.common.Baubles; - thing like that gonna end up in serious_core remove it if its added.

@Mod (
    modid = PackedWool.MODID,
    version = PackedWool.VERSION,
    dependencies = "required-before:shears_lib@[2]", 
    useMetadata = true
)
public class PackedWool {
	public static final String MODID = "packed_wool";
	public static final String VERSION = "1"; // "GRADLE_MOD_VERSION";

	@Instance("packed_wool")
	public static PackedWool instance;

	@SidedProxy (
    	clientSide = "dotblueshoes.packed_wool.proxy.ClientProxy", 
    	serverSide = "dotblueshoes.packed_wool.proxy.CommonProxy"
    ) public static CommonProxy proxy;

    //private static Logger logger;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
    	ConfigHandler.loadConfig(event.getSuggestedConfigurationFile());
		//logger = event.getModLog();
    }

    @EventHandler
    public static void init(FMLInitializationEvent event) {
        CraftingHandler.removeRecipes();
    }

    //public static void msgDebug(String msg) {
    //    logger.info(msg);
    //}
}
