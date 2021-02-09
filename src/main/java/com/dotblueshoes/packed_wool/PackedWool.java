package com.dotblueshoes.packed_wool;

import net.minecraftforge.fml.common.event.FMLPostInitializationEvent; // !
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod;

import org.apache.logging.log4j.Logger;

import com.dotblueshoes.packed_wool.util.handlers.CraftingHandler;
import com.dotblueshoes.packed_wool.proxy.CommonProxy;
import com.dotblueshoes.shears_lib.ShearsLib;
//import baubles.common.Baubles; - thing like that gonna end up in serious_core remove it if its added.

//import net.minecraftforge.fml.ModLoadingContext;
import com.dotblueshoes.packed_wool.config.ConfigHandler;
//import net.minecraftforge.fml.config.ModConfig;

@Mod (
    modid = PackedWool.MODID,
    version = PackedWool.VERSION,
    dependencies = "required-before:shears_lib@[0.0.1.0]", 
    useMetadata = true
)

public class PackedWool {
	public static final String MODID = "packed_wool";
	public static final String VERSION = "0"; // "GRADLE_MOD_VERSION";

	@Instance("packed_wool") // Some other mod might want it. lmao.
	public static PackedWool instance;

	@SidedProxy(
    	clientSide = "com.dotblueshoes.packed_wool.proxy.ClientProxy", 
    	serverSide = "com.dotblueshoes.packed_wool.proxy.CommonProxy"
    ) public static CommonProxy proxy;

    private static Logger logger;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
    	logger = event.getModLog();

    	ConfigHandler.loadConfig(event.getSuggestedConfigurationFile());
    }

    
    /** thats here just to use somewhere at some point.
     @param event the event that is being required or someshit.
     @return nothing
     @throws IllegalArgumentException if someshit i dont have it
     */
    @EventHandler
    public static void init(FMLInitializationEvent event) {
        CraftingHandler.removeRecipes();
    }

    // I could make it as a class and exclude it at compile with gradle i think.
    //public static void msgDebug(String msg) {
    //    logger.info(msg);
    //}

}
