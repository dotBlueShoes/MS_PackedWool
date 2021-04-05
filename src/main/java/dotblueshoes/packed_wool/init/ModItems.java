package dotblueshoes.packed_wool.init;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemShears;
import net.minecraft.item.Item;

import net.minecraft.block.material.Material;
import net.minecraft.block.Block;

import dotblueshoes.packed_wool.config.*;
import dotblueshoes.packed_wool.blocks.*;
import dotblueshoes.packed_wool.items.*;

public class ModItems {

	// Shears Overriding.
	public static Item ITEMS_WITH_MODELS[] = {};

    // List of all Packed Wool blocks i am adding 
    //  If i would add non packedWool block then 
	//  i would create a special class for it.
    public static PackedWoolBlock PACKED_WOOL_BLOCKS[] = {
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

	public static void overrideShears() {
		ITEMS_WITH_MODELS = new Item[] {
			new Shears("shears", Shears.VANILLA_SHEARS_REGISTRY_NAME, 5.0f)
		};
	}

}