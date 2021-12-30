package dotblueshoes.packed_wool.init;

import dotblueshoes.packed_wool.blocks.slabs.PackedWoolDoubleSlabBlock;
import dotblueshoes.packed_wool.blocks.slabs.PackedWoolHalfSlabBlock;
import dotblueshoes.packed_wool.blocks.slabs.PackedWoolSlabBlock;
import net.minecraft.block.BlockDoubleStoneSlabNew;
import net.minecraft.block.SoundType;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemShears;
import net.minecraft.item.Item;

import net.minecraft.block.material.Material;
import net.minecraft.block.Block;

import dotblueshoes.packed_wool.config.*;
import dotblueshoes.packed_wool.blocks.*;
import dotblueshoes.packed_wool.items.*;
import net.minecraft.item.ItemSlab;

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
        new PackedWoolBlock("packed_wool_black", Material.CLOTH),
    };

	public static PackedWoolSlabBlock PACKED_WOOL_HALF_SLAB_BLOCKS[] = {
		new PackedWoolSlabBlock("packed_wool_black_slab", Material.CLOTH)
	};

	public static PackedWoolDoubleSlabBlock PACKED_WOOL_DOUBLE_SLAB_BLOCKS[] = {
		new PackedWoolDoubleSlabBlock("packed_wool_black_slab", Material.CLOTH)
	};

	public static ItemSlab PACKED_WOOL_ITEMBLOCKS[] = {
		new ItemSlab(PACKED_WOOL_HALF_SLAB_BLOCKS[0], PACKED_WOOL_HALF_SLAB_BLOCKS[0], PACKED_WOOL_DOUBLE_SLAB_BLOCKS[0])
		//new ItemSlab(PACKED_WOOL_BLOCKS[15], PACKED_WOOL_HALF_SLAB_BLOCKS[0], PACKED_WOOL_DOUBLE_SLAB_BLOCKS[0]).setRegistryName("packed_wool_slab_black")
	};

	// registerBlock(181, "double_stone_slab2", (new BlockDoubleStoneSlabNew()).setHardness(2.0F).setResistance(10.0F).setSoundType(SoundType.STONE).setUnlocalizedName("stoneSlab2"));

	public static void overrideShears() {
		ITEMS_WITH_MODELS = new Item[] {
			new Shears("shears", Shears.VANILLA_SHEARS_REGISTRY_NAME, 10.0f)
		};
	}

}