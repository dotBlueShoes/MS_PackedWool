package dotblueshoes.packed_wool.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraft.item.Item;

public class ClientProxy extends CommonProxy {

    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(
            item,
            meta, 
            new ModelResourceLocation(
                item.getRegistryName(), 
                id
            )
        );
    }

}