package pw.aaron1011.simpleenergy;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pw.aaron1011.simpleenergy.block.Blocks;
import pw.aaron1011.simpleenergy.tileentity.TileEntityCreativeEnergy;

@Mod(
        modid = SimpleEnergy.MOD_ID,
        name = SimpleEnergy.MOD_NAME,
        version = SimpleEnergy.VERSION
)
public class SimpleEnergy {

    public static final String MOD_ID = "simpleenergy";
    public static final String MOD_NAME = "SimpleEnergy";
    public static final String VERSION = "1.0-SNAPSHOT";

    public static Logger LOGGER = LogManager.getLogger(MOD_ID);

    @Mod.Instance(MOD_ID)
    public static SimpleEnergy INSTANCE;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        GameRegistry.registerTileEntity(TileEntityCreativeEnergy.class, MOD_ID + "." + "TECreativeEnergy");
    }

    @Mod.EventBusSubscriber
    public static class ObjectRegistryHandler {

        @SubscribeEvent
        public static void addBlocks(RegistryEvent.Register<Block> event) {
            Blocks.init(event.getRegistry());
        }

        @SubscribeEvent
        public static void addItems(RegistryEvent.Register<Item> event) {
            Items.init(event.getRegistry());
        }
    }
}
