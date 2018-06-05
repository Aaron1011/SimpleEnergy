package pw.aaron1011.simpleenergy.block;

import net.minecraft.block.Block;
import net.minecraftforge.registries.IForgeRegistry;

public class Blocks {

    private static boolean initialized;

    public static BlockCreativeEnergy creativeEnergy;

    public static void init(IForgeRegistry<Block> blockRegistry) {
        if (initialized) {
            throw new RuntimeException("SimpleEnergy blocks already initialized!");
        }

        creativeEnergy = new BlockCreativeEnergy();
        blockRegistry.register(creativeEnergy);
    }
}
