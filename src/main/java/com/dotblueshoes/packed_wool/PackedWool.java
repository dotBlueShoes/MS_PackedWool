package com.dotblueshoes.packed_wool;

import org.apache.logging.log4j.Logger;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

import com.dotblueshoes.packed_wool.util.handlers.CraftingHandler;
import com.dotblueshoes.packed_wool.proxy.CommonProxy;

@Mod(modid = PackedWool.MODID, useMetadata = true, name = PackedWool.NAME, version = PackedWool.VERSION)
public class PackedWool {
    public static final String MODID = "packed_wool";
    public static final String NAME = "Packed Wool";
    public static final String VERSION = "0.1.1.0";

    public static final String CLIENT_PROXY = "com.dotblueshoes.packed_wool.proxy.ClientProxy";
    public static final String COMMON_PROXY = "com.dotblueshoes.packed_wool.proxy.CommonProxy";

    private static Logger logger;

    @SidedProxy(clientSide = CLIENT_PROXY, serverSide = COMMON_PROXY)
    public static CommonProxy proxy;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @EventHandler
    public static void init(FMLInitializationEvent event) {
        CraftingHandler.removeRecipes();
        //logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) {
        
    }

    public static void testCall(String msg) {
        logger.info(msg);
    }

}
