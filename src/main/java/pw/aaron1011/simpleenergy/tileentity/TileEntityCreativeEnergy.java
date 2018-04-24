package pw.aaron1011.simpleenergy.tileentity;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.energy.CapabilityEnergy;
import pw.aaron1011.simpleenergy.InfiniteEnergyStorage;

import javax.annotation.Nullable;

public class TileEntityCreativeEnergy extends TileEntity {

    private InfiniteEnergyStorage storage = new InfiniteEnergyStorage();

    @Override
    public boolean hasCapability(Capability<?> capability, @Nullable EnumFacing facing)
    {
        return capability == CapabilityEnergy.ENERGY;
    }

    @Override
    @Nullable
    public <T> T getCapability(Capability<T> capability, @Nullable EnumFacing facing)
    {
        if (capability == CapabilityEnergy.ENERGY) {
            return (T) this.storage;
        }
        return null;
    }

}
