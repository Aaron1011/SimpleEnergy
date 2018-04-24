package pw.aaron1011.simpleenergy.block;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import pw.aaron1011.simpleenergy.SimpleEnergy;
import pw.aaron1011.simpleenergy.tileentity.TileEntityCreativeEnergy;

import javax.annotation.Nullable;

public class BlockCreativeEnergy extends Block implements ITileEntityProvider {

    public BlockCreativeEnergy() {
        super(Material.ROCK);
        this.setUnlocalizedName(SimpleEnergy.MOD_ID + "." + "creative_energy");
        this.setRegistryName(SimpleEnergy.MOD_ID, "creative_energy");
    }

    @Nullable
    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityCreativeEnergy();
    }
}
