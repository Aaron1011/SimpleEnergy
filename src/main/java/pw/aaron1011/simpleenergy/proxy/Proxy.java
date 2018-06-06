package pw.aaron1011.simpleenergy.proxy;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public interface Proxy {

    void addItems(IForgeRegistry<Item> event);

}
