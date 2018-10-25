package com.elisis.att.init;

import com.elisis.att.block.ModBlocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModTabs extends CreativeTabs {
	
	public ModTabs(int par1, String par2Str) {
		
		super(par1, par2Str);

		}

		@Override
		@SideOnly(Side.CLIENT)
		public ItemStack getIconItemStack() {
	
			return new ItemStack(ModBlocks.red_diamond_block, 1, 0);
		
		}
		
		public String getTranslatedTabLabel() {
			return "All The Things";
		}

		@Override
		public Item getTabIconItem() {
			// TODO Auto-generated method stub
			return null;
		}

}
