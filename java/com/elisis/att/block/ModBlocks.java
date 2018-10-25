package com.elisis.att.block;

import com.elisis.att.tileentity.SimplePowerCube;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlocks {

	public static Block red_diamond_block;
	public static Block dice;
	public static SimplePowerCube simple_power_cube;
	
	public static void init() {
		
		red_diamond_block = new BlockRedDiamond();
		dice = new BlockDice();
		
		simple_power_cube = new SimplePowerCube();
		GameRegistry.registerTileEntity(simple_power_cube.getClass(), "simple_power_cube");
	
	}
}
