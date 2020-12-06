package com.dotblueshoes.packed_wool.init;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.event.RegistryEvent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;

import java.util.LinkedHashMap;
import java.util.Map;

public class ModItems {
    // It's nice because the order we add items in is the odrer we get the items back out.
    public static final Map<String, ItemBlock> BLOCKS_TO_REGISTER = new LinkedHashMap<>();

    public static void registerAll(RegistryEvent.Register<Item> event) {
        if (!event.getName().equals(ForgeRegistries.ITEMS.getRegistryName())) return;

        // Blocks
        BLOCKS_TO_REGISTER.forEach(ModItems::register);

        // Items
    }

    private static <T extends Item> T register(String name, T item) {
        ResourceLocation resourceID = new ResourceLocation("packed_wool", name);
        item.setRegistryName(resourceID);
        ForgeRegistries.ITEMS.register(item);
        return item;
    }
}