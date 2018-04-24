package pw.aaron1011.simpleenergy.tileentity;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.energy.CapabilityEnergy;
import pw.aaron1011.simpleenergy.InfiniteEnergyStorage;

import javax.annotation.Nullable;

public class TileEntityCreativeEnergy extends TileEntity implements ITickable {

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

    @Override
    public void update() {
        if(!this.world.isRemote) {
            for(EnumFacing side : EnumFacing.values()){
                EnumFacing opposite = side.getOpposite();
                TileEntity tile = this.world.getTileEntity(this.pos.offset(side));
                if(tile != null) {
                    if (tile.hasCapability(CapabilityEnergy.ENERGY, side)) {
                        tile.getCapability(CapabilityEnergy.ENERGY, side).receiveEnergy(Integer.MAX_VALUE, false);
                    }
                }
            }
        }
    }

}
