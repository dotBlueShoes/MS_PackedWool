package com.dotblueshoes.packed_wool;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModContainer;
import net.minecraftforge.fml.ModList;

import java.util.Optional;

import com.dotblueshoes.packed_wool.init.ModBlocks;

@Mod("packed_wool")
public class PackedWool {

    public static final Logger LOGGER = LogManager.getLogger();
    public static SideProxy PROXY;

    public static final ItemGroup ITEM_GROUP = new ItemGroup("packed_wool") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.PACKED_WOOL_WHITE);
        }
    };

    // ResourceLocation(mod_id, string_path);

    public PackedWool() {
        PROXY = DistExecutor.runForDist(
            () -> () -> new SideProxy.Client(),
            () -> () -> new SideProxy.Server()
        );
        
        // Register the setup method for modloading
        //FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the enqueueIMC method for modloading
        //FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        //FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        // Register the doClientStuff method for modloading
        //FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        // Register ourselves for server and other game events we are interested in
        //MinecraftForge.EVENT_BUS.register(this);
    }

    public static String getVersion() { // calling modlist
        Optional<? extends ModContainer> o = ModList.get().getModContainerById("packed_wool");
        if (o.isPresent()) {
            return o.get().getModInfo().getVersion().toString();
        }
        return "ERR_VERSION";
    }

    //private void setup(final FMLCommonSetupEvent event) {
    //    // Some preinit code
    //    LOGGER.info("HELLO FROM PREINIT");
    //    LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    //}

    //private void doClientStuff(final FMLClientSetupEvent event) {
    //    // Do something that can only be done on the client
    //    LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().gameSettings);
    //}

    //private void enqueueIMC(final InterModEnqueueEvent event) {
    //    // Some example code to dispatch IMC to another mod
    //    InterModComms.sendTo("examplemod", "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
    //}

    //private void processIMC(final InterModProcessEvent event) {
    //    // Some example code to receive and process InterModComms from other mods
    //    LOGGER.info("Got IMC {}", event.getIMCStream().
    //            map(m->m.getMessageSupplier().get()).
    //            collect(Collectors.toList()));
    //}

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    //@SubscribeEvent // HERE!
    //public void onServerStarting(FMLServerStartingEvent event) {
    //    // Do something when the server starts
    //    LOGGER.info("HELLO from server starting");
    //}

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // Register a new block here
            LOGGER.info("HELLO from Register Block");
        }
    }
}
