package com.elisis.att.weapons;

import com.elisis.att.AllThings;
import com.elisis.att.entity.EntityEMP;
import com.elisis.att.item.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EMPGun extends Item 
{
	
	public EMPGun() 
	{
		
		setCreativeTab(CreativeTabs.tabCombat);
		setMaxStackSize(1);
		setMaxDamage(0);
	}
	


	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
		
		if (player.capabilities.isCreativeMode || player.inventory.consumeInventoryItem(ModItems.emp_projectile)) {
			
			player.swingItem();
			world.playSoundAtEntity(player, AllThings.MODID +  ":emp_gun", 0.5F, 1.0F);
			if (!world.isRemote) {
				
				world.spawnEntityInWorld(new EntityEMP(world, player));
			}
		}
		return itemstack;
	}


}