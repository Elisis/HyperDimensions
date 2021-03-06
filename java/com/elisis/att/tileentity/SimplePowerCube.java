package com.elisis.att.tileentity;

import cofh.api.energy.EnergyStorage;
import cofh.api.energy.IEnergyHandler;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;


public class SimplePowerCube extends TileEntity implements IEnergyHandler {
	
	protected EnergyStorage storage = new EnergyStorage(10000);
	
	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		
		super.readFromNBT(nbt);
		storage.readFromNBT(nbt);
		
	}
	
	@Override
	public void writeToNBT(NBTTagCompound nbt) {
		
		super.writeToNBT(nbt);
		storage.writeToNBT(nbt);
	}

	/* IEnergyConnection */
	@Override
	public boolean canConnectEnergy(ForgeDirection from) {
		
		return true;
	}
	
	/* IEnergyReceiver */
	@Override
	public int receiveEnergy(ForgeDirection from, int maxReceive, boolean simulate) {
		
		return storage.receiveEnergy(maxReceive, simulate);
	}
	
	/* IEnergyProvider */
	@Override
	public int extractEnergy(ForgeDirection from, int maxExtract, boolean simulate) {
		
		return storage.extractEnergy(maxExtract, simulate);
	}
	
	/* IEnergyReceiver and IEnergyProvider */
	@Override
	public int getEnergyStored(ForgeDirection from) {
		
		return storage.getEnergyStored();
	}
	
	@Override
	public int getMaxEnergyStored(ForgeDirection from) {
		
		return storage.getMaxEnergyStored();
	}
}
