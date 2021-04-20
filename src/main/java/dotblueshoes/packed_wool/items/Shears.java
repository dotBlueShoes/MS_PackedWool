package dotblueshoes.packed_wool.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.block.Block;

import dotblueshoes.packed_wool.*;

public class Shears extends ItemShears {

    public final static String VANILLA_SHEARS_REGISTRY_NAME = "minecraft:shears";
    public final static float 
        SHEARS_SPEED_FASTEST = 15.0f, 
		SHEARS_SPEED_SLOWEST = 1.0f;

    private float gatheringSpeed;

    public Shears(String name, String registryName, float gatheringSpeed) {
        setCreativeTab(CreativeTabs.TOOLS);
        setUnlocalizedName(name);
        setRegistryName(registryName);
        this.gatheringSpeed = gatheringSpeed; 
    }

    public void registerModel() {
        PackedWool.proxy.registerItemRenderer(this, 0, "inventory");
    }

    public float getDestroySpeed(ItemStack stack, IBlockState state) {
		//PackedWool.logInfo("aaa");
		// This means that the block might not need the isShearable thingy at all..
		//  it should be possible to define a list of blocks and materials 
		//  inside config that will be executed here. 

        Block block = state.getBlock();

        if (block != Blocks.WEB && state.getMaterial() != Material.LEAVES)
            return state.getMaterial() == Material.CLOTH ? gatheringSpeed : super.getDestroySpeed(stack, state);
        else
            return SHEARS_SPEED_FASTEST;
    }
}