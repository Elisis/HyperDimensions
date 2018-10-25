//This was an example; do not use this technique in any other instance.

package com.elisis.att.block;

import com.elisis.att.AllThings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockRedDiamond extends Block {
	
	private static final String name = "red_diamond_block";
	
	public BlockRedDiamond() {
		
		super(Material.rock);
		GameRegistry.registerBlock(this, name);
		setBlockName(name);
		setBlockTextureName(AllThings.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabBlock);
	}

}
