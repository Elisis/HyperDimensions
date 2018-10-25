package com.elisis.att.handler;

import com.elisis.att.item.ModItems;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

@SuppressWarnings("unused")
public class MobDropsHandler {
	
	
	
	@SubscribeEvent
	public void onMobDrops(LivingDropsEvent event) {
		
		
		//Pig
		/*if (event.entity instanceof EntityPig) {
			
			ItemStack stack = new ItemStack(Items.gold_ingot);
			EntityItem drop = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, stack);
			
			event.drops.add(drop);
		}
		*/
		
		//Enderman
		if (event.entity instanceof EntityEnderman) {
			
			ItemStack stack = new ItemStack(ModItems.red_diamond);
			EntityItem drop = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, stack);
			
			event.drops.add(drop);
		}
		
	}

}
