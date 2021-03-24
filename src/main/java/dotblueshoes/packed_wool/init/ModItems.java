package dotblueshoes.packed_wool.init;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemShears;
import net.minecraft.item.Item;
//import java.util.ArrayList;
//import java.util.List;

import dotblueshoes.packed_wool.blocks.PackedWoolBlock;
import dotblueshoes.packed_wool.items.tools.Shears;

public class ModItems {
    public static final int ITEMS_COUNT = 1;
    public static final Item ITEMS[] = {
        new Shears("shears", ToolMaterial.IRON)   // Overriding Shears.
    };
}