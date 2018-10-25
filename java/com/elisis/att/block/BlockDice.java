package com.elisis.att.block;

import com.elisis.att.AllThings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class BlockDice extends Block {
	
	private static final String name = "dice";
	
	private IIcon[] icons = new IIcon[6];  
	
	public BlockDice() {
		
		super(Material.iron);
		GameRegistry.registerBlock(this, name);
		setBlockName(name);
		setCreativeTab(CreativeTabs.tabBlock);
		
	}
	
	@Override
	public void registerBlockIcons(IIconRegister reg) {
		
		for (int i = 0; i < 6; i++) {
			
			icons[i] = reg.registerIcon(AllThings.MODID + ":" + name + "_" +  (i + 1));
		}
	}
	
	@Override
	public IIcon getIcon(int side, int meta) {
		
		return icons[side];
	}

}
