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

@Mod(modid = PackedWool.ID, name = PackedWool.NAME, version = "")
public class PackedWool {

    public static final String NAME = "Packed Wool";
	public static final String ID = "packed_wool";
    
    @Instance(ID) // Some other mod might want it. lmao.
    public static PackedWool instance;

    @SidedProxy ( // Proxy - Both client and server have a server.
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
        CraftingHandler.removeRecipes();
    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) {
        
    }

    //public static void MsgDebug(String msg) {
    //    logger.info(msg);
    //}
    
    //@EventHandler /* Sereane Sesons command framework */
    //public void serverStarting(FMLServerStartingEvent event){
    //    event.registerServerCommand(new Command());
    //}

}
