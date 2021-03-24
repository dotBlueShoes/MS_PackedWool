package dotblueshoes.packed_wool.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.block.Block;

import dotblueshoes.packed_wool.util.IHasModel;
import dotblueshoes.packed_wool.PackedWool;

public class Shears extends ItemShears implements IHasModel {
    public Shears(String name, ToolMaterial material) {
        setCreativeTab(CreativeTabs.MATERIALS); // ? 
        setUnlocalizedName(name);
        setRegistryName("minecraft:shears");
    }

    @Override
    public void registerModels(){
        PackedWool.proxy.registerItemRenderer(this, 0, "inventory");
    }

    public float getDestroySpeed(ItemStack stack, IBlockState state) {
	    Block block = state.getBlock();

        if (block != Blocks.WEB && state.getMaterial() != Material.LEAVES) {
            return state.getMaterial() == Material.CLOTH ? 5.0f : super.getDestroySpeed(stack, state);
        } else {
            return 15.0f;
        }

	    //if (block != Blocks.WEB && state.getMaterial() != Material.LEAVES) {
	    //	return block == Blocks.WOOL ? 15.0f : super.getDestroySpeed(stack, state);
	    //} else {
	    //	return 15.0f;
	    //}
    }  
}