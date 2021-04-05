package dotblueshoes.packed_wool.blocks;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.SoundType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemBlock;
import net.minecraft.world.World;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.common.IShearable;

import java.util.ArrayList;
import java.util.List;

import dotblueshoes.packed_wool.init.*;
import dotblueshoes.packed_wool.*;

public class PackedWoolBlock extends Block implements IShearable {

    public String name;

    public PackedWoolBlock(String blockName, Material material) {
        super(material); // calls parent class constructor. no idea. c# is better.

        name = blockName; // Because i only use list this might come in handy.

        setCreativeTab(CreativeTabs.BUILDING_BLOCKS); // Sets in which tab block is stored.
        setSoundType(SoundType.CLOTH); // Setting the sound type when walked on.
        setResistance(1.0f); // Boom resistance if i remember well.
        setHardness(1.0f);  // Pickaxde if i remember well.

        setUnlocalizedName(blockName);
        setRegistryName(blockName);
    }

    public ItemBlock getItemBlock() {
        ItemBlock temp = new ItemBlock(this);
        temp.setRegistryName(name);
        return temp; 
    }

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
    public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos pos) {
        return true;
    }

    @Override
    public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos position, int fortune) {

        List<ItemStack> ret = new ArrayList<ItemStack>();
        ret.add(new ItemStack(Item.getItemFromBlock(this)));

        setHardness(0.5f);
        return ret;
    }
    
    @Override // 300 Being 100%.
    public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
        return 90;
    }
    
    @Override // That should be somewhat faster then wool.
    public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
        return 100;
    }
}