package pw.aaron1011.simpleenergy;

import net.minecraft.item.ItemBlock;
import pw.aaron1011.simpleenergy.block.Blocks;

public class Items {

    public static ItemBlock creativeEnergy;

    public static void init() {
        creativeEnergy = (ItemBlock) new ItemBlock(Blocks.creativeEnergy).setRegistryName(Blocks.creativeEnergy.getRegistryName()).setHasSubtypes(false).setMaxDamage(0);
    }

}
