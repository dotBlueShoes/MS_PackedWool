package dotblueshoes.packed_wool.blocks.utility;

import net.minecraft.block.SoundType;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.IShearable;

import javax.annotation.Nonnull;

public interface IPackedWoolBlock extends IShearable {

	CreativeTabs CREATIVE_TAB = CreativeTabs.BUILDING_BLOCKS; 	// In which creative mode tab block is stored.
	SoundType SOUND_TYPE = SoundType.CLOTH; 					// Setting the sound type when walked on.

	int FIRE_SPREAD_SPEED = 200, 	// 100 should be somewhat faster than wool.
		FLAMMABILITY = 90; 			// 300 Being 100%.

	float RESISTANCE = 1.0f, 	// Resistance to explosions.
		HARDNESS = 1.0f,		// Speed in which we remove the block.
		SHEAR_HARDNESS = 0.5f;	// ^ same, but overridden by shear tool.

	@Override
	default boolean isShearable(@Nonnull ItemStack item, IBlockAccess world, BlockPos pos) {
		return true;
	}

}
