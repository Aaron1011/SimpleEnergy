package pw.aaron1011.simpleenergy.proxy.client;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.IForgeRegistry;
import pw.aaron1011.simpleenergy.Items;
import pw.aaron1011.simpleenergy.proxy.Proxy;

public class ClientProxy implements Proxy {

    @Override
    public void addItems(IForgeRegistry<Item> registry) {
        ModelLoader
                .setCustomModelResourceLocation(Items.creativeEnergy, 0, new ModelResourceLocation(Items.creativeEnergy.getRegistryName(), "inventory"));
    }
}
