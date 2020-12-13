package com.dotblueshoes.packed_wool;

import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.init.Blocks;

import org.apache.logging.log4j.Logger;

import com.dotblueshoes.packed_wool.util.handlers.CraftingHandler;
import com.dotblueshoes.packed_wool.proxy.CommonProxy;

import com.dotblueshoes.shears_lib.ShearsLib;
//import baubles.common.Baubles; - thing like that gonna end up in serious_core remove it if its added.

// Forge OreDict things i hate.
import com.dotblueshoes.packed_wool.util.handlers.RegistryHandler;

@Mod (
    modid = "packed_wool",
    //version = "error_version",
    dependencies = "required-before:shears_lib@[0.0.1.0]", 
    useMetadata = true
)

public class PackedWool {

    // The only needed. I need to somehow parse the version from properties or gradle. or some json file.
    //public static final String VERSION = "@VERSION@";

    @Instance("packed_wool") // Some other mod might want it. lmao.
    public static PackedWool instance;

    @SidedProxy( // Proxy - Both client and server have a server.
        clientSide = "com.dotblueshoes.packed_wool.proxy.ClientProxy", 
        serverSide = "com.dotblueshoes.packed_wool.proxy.CommonProxy"
    ) public static CommonProxy proxy;

    private static Logger logger;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @EventHandler
    public static void init(FMLInitializationEvent event) {
        RegistryHandler.registerForgeOredict();
        CraftingHandler.removeRecipes();
    }

    // I could make it as a class and exclude it at compile with gradle i think.
    //public static void msgDebug(String msg) {
    //    logger.info(msg);
    //}

}
