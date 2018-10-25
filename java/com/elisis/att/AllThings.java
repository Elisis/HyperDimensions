package com.elisis.att;

import com.elisis.att.block.ModBlocks;
import com.elisis.att.entity.EntityEMP;
import com.elisis.att.handler.MobDropsHandler;
import com.elisis.att.init.KeyInputHandler;
import com.elisis.att.init.Keybinds;
import com.elisis.att.init.ModTabs;
import com.elisis.att.invincible.IchoriumArmor;
import com.elisis.att.item.ModItems;
import com.elisis.att.item.ModRecipes;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = AllThings.MODID, name = AllThings.NAME, version = AllThings.VERSION)

public class AllThings {
	
	public static CreativeTabs tabAllThings = new ModTabs(CreativeTabs.getNextID(), "All The Things");
	public static final String NAME = "All The Things";
	public static final String MODID = "att";
	public static final String VERSION = "1.7.10-v0.1";
	
	@Mod.Instance("att")
	public static AllThings instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		ModItems.init();
		ModBlocks.init();
		ModRecipes.init();
		IchoriumArmor.register();
		
		Keybinds.register();
		MinecraftForge.EVENT_BUS.register(new KeyInputHandler());
		
		MinecraftForge.EVENT_BUS.register(new MobDropsHandler());
		
		EntityRegistry.registerModEntity(EntityEMP.class, "EMP", 0, this, 64, 10, true);
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {}
}
