package com.dotblueshoes.packed_wool.config;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.common.MinecraftForge;

import java.io.File;

import com.dotblueshoes.packed_wool.PackedWool;

public class ConfigHandler {

    public static Configuration config;

    public static boolean sampleBool = true;
    public static String[] sampleStringArray = {};
    public static int sampleInt = 100;

    public static void loadConfig(File file) {
        config = new Configuration(file);
        config.load();
        init();
        MinecraftForge.EVENT_BUS.register(new ChangeListener());
    }

    public static void init() {
        String comment = "";

        comment = "bla bla bla 1.";
        sampleBool = loadBool(Configuration.CATEGORY_GENERAL, "packed_wool.sampleBool", comment, sampleBool);

        comment = "bla bla bla 2.";
        sampleInt = loadInt(Configuration.CATEGORY_GENERAL, "packed_wool.sampleInt", comment, sampleInt);

        comment = "bla bla bla 3.";
        sampleStringArray = loadStringArray(Configuration.CATEGORY_GENERAL, "packed_wool.sampleStringArray", comment, sampleStringArray);

        if (config.hasChanged()) {
            config.save();
        }
    }

    public static String[] loadStringArray(String category, String name, String comment, String[] value) {
        Property prop = config.get(category, name, value);
        prop.setComment(comment);
        return prop.getStringList();
    }

    public static boolean loadBool(String category, String name, String comment, boolean value) {
        final Property prop = config.get(category, name, value);
        prop.setComment(comment);
        return prop.getBoolean(value);
    }

    public static int loadInt(String category, String name, String comment, int value) {
        final Property prop = config.get(category, name, value);
        prop.setComment(comment);
        return prop.getInt(value);
    }

    public static class ChangeListener {
        @SubscribeEvent
        public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
            if (event.getModID() == "packed_wool");
        }
    }

}