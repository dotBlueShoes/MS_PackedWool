package com.dotblueshoes.packed_wool.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.dotblueshoes.packed_wool.util.IHasModel;
import com.dotblueshoes.packed_wool.init.ModItems;
import com.dotblueshoes.packed_wool.PackedWool;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        PackedWool.proxy.registerItemRenderer(this, 0, "inventory");
    }

}