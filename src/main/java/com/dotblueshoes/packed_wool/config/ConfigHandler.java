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
        String comment = "";

        config = new Configuration(file);
        config.load();

        // Config files are being created with first run therefore it is important to parse comment.
        // Sprawdź czy ten sampleBool który wysyłam ma jakąś wartość bez przypisania ale tylko jako parametr coś ma.. u know 
        comment = "bla bla bla 1.";
        sampleBool = loadBool(
            Configuration.CATEGORY_GENERAL, 
            "packed_wool.sampleBool", 
            comment, 
            sampleBool
        );

        comment = "bla bla bla 2.";
        sampleInt = loadInt(Configuration.CATEGORY_GENERAL, "packed_wool.sampleInt", comment, sampleInt);

        comment = "bla bla bla 3.";
        sampleStringArray = loadStringArray(Configuration.CATEGORY_GENERAL, "packed_wool.sampleStringArray", comment, sampleStringArray);

        if (config.hasChanged()) {
            config.save();
        }

        MinecraftForge.EVENT_BUS.register(new ChangeListener());
    }

    private static String[] loadStringArray(String category, String name, String comment, String[] value) {
        final Property prop = config.get(category, name, value);
        prop.setComment(comment);
        return prop.getStringList();
    }

    private static boolean loadBool(String category, String name, String comment, boolean value) {
        final Property prop = config.get(category, name, value);
        prop.setComment(comment);
        return prop.getBoolean(value);
    }

    private static int loadInt(String category, String name, String comment, int value) {
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