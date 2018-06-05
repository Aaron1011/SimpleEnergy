package pw.aaron1011.simpleenergy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.registries.IForgeRegistry;
import pw.aaron1011.simpleenergy.block.Blocks;

public class Items {

    private static boolean initialized;

    public static ItemBlock creativeEnergy;

    public static void init(IForgeRegistry<Item> registry) {
        if (initialized) {
            throw new RuntimeException("SimpleEnergy items already initialized!");
        }
        initialized = true;

        creativeEnergy = (ItemBlock) new ItemBlock(Blocks.creativeEnergy).setRegistryName(Blocks.creativeEnergy.getRegistryName()).setHasSubtypes(false).setMaxDamage(0);

        registry.register(Items.creativeEnergy);
        ModelLoader.setCustomModelResourceLocation(Items.creativeEnergy, 0, new ModelResourceLocation(Items.creativeEnergy.getRegistryName(), "inventory"));
    }

}
