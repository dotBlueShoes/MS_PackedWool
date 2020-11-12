package com.dotblueshoes.packed_wool.init;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemShears;
import net.minecraft.item.Item;
import java.util.ArrayList;
import java.util.List;

import com.dotblueshoes.packed_wool.items.tools.Shears;
import com.dotblueshoes.packed_wool.items.ItemBase;

public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    // Overriding Shears.
    public static final ItemShears SHEARS = new Shears("shears", ToolMaterial.IRON);

    public static final Item COPPER_INGOT = new ItemBase("copper_ingot");
    public static final Item TIN_INGOT = new ItemBase("tin_ingot");
    
}