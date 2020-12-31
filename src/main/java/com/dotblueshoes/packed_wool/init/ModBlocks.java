package com.dotblueshoes.packed_wool.init;

import net.minecraft.block.material.Material;
import net.minecraft.block.Block;

//import net.minecraft.item.ItemStack;
//import java.util.ArrayList;
//import java.util.List;

import com.dotblueshoes.packed_wool.blocks.PackedWoolBlock;

public class ModBlocks {
    // List of all Packed Wool blocks i am adding 
    // if i would add non packedWool block i would create a special class for it.
    public static final int BLOCKS_COUNT = 16;
    public static final PackedWoolBlock PACKED_WOOL_BLOCKS[] = {
        new PackedWoolBlock("packed_wool_white", Material.CLOTH),
        new PackedWoolBlock("packed_wool_orange", Material.CLOTH),
        new PackedWoolBlock("packed_wool_magenta", Material.CLOTH),
        new PackedWoolBlock("packed_wool_light_blue", Material.CLOTH),
        new PackedWoolBlock("packed_wool_yellow", Material.CLOTH),
        new PackedWoolBlock("packed_wool_lime", Material.CLOTH),
        new PackedWoolBlock("packed_wool_pink", Material.CLOTH),
        new PackedWoolBlock("packed_wool_gray", Material.CLOTH),
        new PackedWoolBlock("packed_wool_light_gray", Material.CLOTH),
        new PackedWoolBlock("packed_wool_cyan", Material.CLOTH),
        new PackedWoolBlock("packed_wool_purple", Material.CLOTH),
        new PackedWoolBlock("packed_wool_blue", Material.CLOTH),
        new PackedWoolBlock("packed_wool_brown", Material.CLOTH),
        new PackedWoolBlock("packed_wool_green", Material.CLOTH),
        new PackedWoolBlock("packed_wool_red", Material.CLOTH),
        new PackedWoolBlock("packed_wool_black", Material.CLOTH)
    };
}