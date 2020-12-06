package com.dotblueshoes.packed_wool.init;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.event.RegistryEvent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;

import com.dotblueshoes.packed_wool.init.ModItems;
import com.dotblueshoes.packed_wool.PackedWool;

import javax.annotation.Nullable;

public class ModBlocks {

    public static Block PACKED_WOOL_LIGHT_BLUE;
    public static Block PACKED_WOOL_LIGHT_GRAY;
    public static Block PACKED_WOOL_MAGNETA;
    public static Block PACKED_WOOL_ORANGE;
    public static Block PACKED_WOOL_PURPLE;
    public static Block PACKED_WOOL_YELLOW;
    public static Block PACKED_WOOL_BROWN;
    public static Block PACKED_WOOL_GREEN;
    public static Block PACKED_WOOL_BLACK;
    public static Block PACKED_WOOL_WHITE;
    public static Block PACKED_WOOL_BLUE; 
    public static Block PACKED_WOOL_CYAN; 
    public static Block PACKED_WOOL_GRAY; 
    public static Block PACKED_WOOL_LIME; 
    public static Block PACKED_WOOL_PINK;
    public static Block PACKED_WOOL_RED;

    public static void registerAll(RegistryEvent.Register<Block> event) {
        if (!event.getName().equals(ForgeRegistries.BLOCKS.getRegistryName())) return;

        PACKED_WOOL_LIGHT_BLUE = register("packed_wool_light_blue", new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(1.5f, 6f)
            .sound(SoundType.STONE)
        ));

        PACKED_WOOL_LIGHT_GRAY = register("packed_wool_light_gray", new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(1.5f, 6f)
            .sound(SoundType.STONE)
        ));

        PACKED_WOOL_MAGNETA = register("packed_wool_magenta", new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(1.5f, 6f)
            .sound(SoundType.STONE)
        ));

        PACKED_WOOL_ORANGE = register("packed_wool_orange", new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(1.5f, 6f)
            .sound(SoundType.STONE)
        ));

        PACKED_WOOL_PURPLE = register("packed_wool_purple", new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(1.5f, 6f)
            .sound(SoundType.STONE)
        ));

        PACKED_WOOL_YELLOW = register("packed_wool_yellow", new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(1.5f, 6f)
            .sound(SoundType.STONE)
        ));

        PACKED_WOOL_BROWN = register("packed_wool_brown", new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(1.5f, 6f)
            .sound(SoundType.STONE)
        ));

        PACKED_WOOL_GREEN = register("packed_wool_green", new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(1.5f, 6f)
            .sound(SoundType.STONE)
        ));

        PACKED_WOOL_BLACK = register("packed_wool_black", new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(1.5f, 6f)
            .sound(SoundType.STONE)
        ));

        PACKED_WOOL_WHITE = register("packed_wool_white", new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(1.5f, 6f)
            .sound(SoundType.STONE)
        ));

        PACKED_WOOL_BLUE = register("packed_wool_blue", new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(1.5f, 6f)
            .sound(SoundType.STONE)
        ));

        PACKED_WOOL_CYAN = register("packed_wool_cyan", new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(1.5f, 6f)
            .sound(SoundType.STONE)
        ));

        PACKED_WOOL_GRAY = register("packed_wool_gray", new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(1.5f, 6f)
            .sound(SoundType.STONE)
        ));

        PACKED_WOOL_LIME = register("packed_wool_lime", new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(1.5f, 6f)
            .sound(SoundType.STONE)
        ));

        PACKED_WOOL_PINK = register("packed_wool_pink", new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(1.5f, 6f)
            .sound(SoundType.STONE)
        ));

        PACKED_WOOL_RED = register("packed_wool_red", new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(1.5f, 6f)
            .sound(SoundType.STONE)
        ));
    }

    private static <T extends Block> T register(String name, T block) {
        ItemBlock itemBlock = new ItemBlock(block, new Item.Properties()
            .group(PackedWool.ITEM_GROUP/*ItemGroup.BUILDING_BLOCKS*/));
        return register(name, block, itemBlock);
    }

    private static <T extends Block> T register(String name, T block, @Nullable ItemBlock item) {
        ResourceLocation resourceID = new ResourceLocation("packed_wool", name);
        block.setRegistryName(resourceID);
        ForgeRegistries.BLOCKS.register(block);
        if (item != null)
            ModItems.BLOCKS_TO_REGISTER.put(name, item);
        return block;
    }
}