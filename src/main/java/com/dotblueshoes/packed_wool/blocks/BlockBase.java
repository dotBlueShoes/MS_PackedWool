//https://forums.minecraftforge.net/topic/64469-have-a-modblock-break-faster-with-shears-like-wool/

package com.dotblueshoes.packed_wool.blocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.item.ItemBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import net.minecraftforge.common.IShearable;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.block.state.IBlockState;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import com.dotblueshoes.packed_wool.util.IHasModel;
import com.dotblueshoes.packed_wool.init.ModBlocks;
import com.dotblueshoes.packed_wool.init.ModItems;
import com.dotblueshoes.packed_wool.PackedWool;

public class BlockBase extends Block implements IHasModel, IShearable {

    @Override
    public void registerModels() {
        PackedWool.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }

    // this is deprecated. the returned float value is 0 no matter what.
    //@Override
    //public float getPlayerRelativeBlockHardness(IBlockState state, EntityPlayer player, World worldIn, BlockPos pos){
    //    // check if the item in player's main hand is shears and return a lower value.
    //    return 10000.0f;
    //}

    // Not the thing. i set this thing in constructor.
    //@Override
    //public String getHarvestTool(IBlockState state){
    //    return "pickaxe";
    //}

    @Override
    public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos pos){
        return true;
    }

    @Override
    public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos position, int fortune) {

        List<ItemStack> ret = new ArrayList<ItemStack>();
        ret.add(new ItemStack(Item.getItemFromBlock(this)));

        setHardness(0.5f);
        return ret;
    }

    public BlockBase (String name, Material material) {
        super(material);

        setSoundType(SoundType.CLOTH);
        //setHarvestLevel("shears", 1);
        setResistance(1.0f);
        setHardness(1.0f); 

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }
}