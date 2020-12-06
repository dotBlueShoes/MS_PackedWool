package com.dotblueshoes.packed_wool;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.event.lifecycle.*;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import com.dotblueshoes.packed_wool.init.ModBlocks;
import com.dotblueshoes.packed_wool.init.ModItems;

// Used only in code that isint needed to execute.
import net.minecraftforge.fml.InterModComms;
import java.util.stream.Collectors;

public class SideProxy {

    SideProxy() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(SideProxy::commonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(SideProxy::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(SideProxy::processIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(ModBlocks::registerAll);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(ModItems::registerAll);
        MinecraftForge.EVENT_BUS.addListener(SideProxy::serverStarting);
    }

    private static void commonSetup(FMLCommonSetupEvent event) {
        // Example of code to execute pre init.
        PackedWool.LOGGER.info("HELLO FROM PREINIT");
    }

    private static void enqueueIMC(final InterModEnqueueEvent event) {
        // Some example code to dispatch IMC to another mod.
        InterModComms.sendTo("packed_wool", "helloWorld", () -> { 
            PackedWool.LOGGER.info("Hello world from the MDK"); 
            return "Hello world";
        });
    }

    private static void processIMC(final InterModEnqueueEvent event) {
        // Some example code to receive and process InterModComms from other mods.
        PackedWool.LOGGER.info("Got IMC {}", event.getIMCStream().
            map(m -> m.getMessageSupplier().get()).
            collect(Collectors.toList())
        );
    }

    private static void serverStarting(FMLServerStartingEvent event) {
        // Example code for when server starts.
        PackedWool.LOGGER.info("HELLO FROM PREINIT");
    }

    static class Client extends SideProxy {

        private static void clientSetup(FMLClientSetupEvent event) {}

        Client() {
            FMLJavaModLoadingContext.get().getModEventBus().addListener(Client::clientSetup);
        }
        
    }

    static class Server extends SideProxy {

        private static void serverSetup(FMLDedicatedServerSetupEvent event) {}

        Server() {
            FMLJavaModLoadingContext.get().getModEventBus().addListener(Server::serverSetup);
        }

    }
}