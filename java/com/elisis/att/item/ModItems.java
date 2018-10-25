package com.elisis.att.item;

import com.elisis.att.AllThings;
import com.elisis.att.tool.ItemRedAxe;
import com.elisis.att.tool.ItemRedPickaxe;
import com.elisis.att.tool.ItemRedSword;
import com.elisis.att.weapons.EMPGun;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;

public class ModItems {
	
	public static final Item.ToolMaterial diamondRed = EnumHelper.addToolMaterial("diamondRed", 4, 2000, 14.0F, 16, 30);
	
	public static final Item.ToolMaterial ultimate = EnumHelper.addToolMaterial("ultimate", 18, -1, 100, 2048, 30);
	//Init items
	
	public static Item ultimate_pickaxe;
	public static Item ultimate_axe;
	public static Item ultimate_sword;
	
	public static Item gold_ingot = Items.gold_ingot;
	
	public static Item red_pickaxe;
	public static Item red_axe;
	public static Item red_sword;
	
	public static Item red_diamond;
	public static Item roasted_lapis;
	public static Item emp_projectile;
	public static Item emp_gun;
	
	public static Item mundane_catalyst;
	public static Item strengthened_catalyst;
	public static Item greater_catalyst;
	
	public static Item mundane_stone;
	public static Item uncharged_lesser_stone;
	
	//I have absolutely no idea how to add NBT or Damage value, so I'm just making a new item for each charged level. ^_^
	public static Item uncharged_lesser_stone_25;
	public static Item uncharged_lesser_stone_50;
	public static Item uncharged_lesser_stone_75;
	public static Item lesser_stone; //Charged
	public static Item greater_stone;
	
	public static Item copper_ingot;
	public static Item ichor;
	public static Item ichorium;
	
	/*
	public static Item ichorHelmet;
	public static Item ichorChestplate;
	public static Item ichorLeggings;
	public static Item ichorBoots;
	*/
	
	public static Item simple_battery;
	
	public static void init() {
		
		//ArmorMaterial ICHOR = EnumHelper.addArmorMaterial("ICHOR", (int)Double.POSITIVE_INFINITY, new int[]{5, 8, 8, 4}, 0);
		
		//Red Diamond
		red_diamond = new Item().setUnlocalizedName("red_diamond").setTextureName(AllThings.MODID + ":red_diamond").setCreativeTab(AllThings.tabAllThings);
		GameRegistry.registerItem(red_diamond, red_diamond.getUnlocalizedName());
		
		//Roasted Lapis Lazuli
		roasted_lapis = new Item().setUnlocalizedName("roasted_lapis").setTextureName(AllThings.MODID + ":roasted_lapis").setCreativeTab(AllThings.tabAllThings);
		GameRegistry.registerItem(roasted_lapis, roasted_lapis.getUnlocalizedName());
		
		//Projectile
		emp_projectile = new Item().setUnlocalizedName("emp_projectile").setTextureName(AllThings.MODID + ":emp_projectile").setCreativeTab(AllThings.tabAllThings);
		GameRegistry.registerItem(emp_projectile, emp_projectile.getUnlocalizedName());
		
		copper_ingot = new Item().setUnlocalizedName("copper_ingot").setTextureName(AllThings.MODID + ":copper_ingot").setCreativeTab(AllThings.tabAllThings);
		GameRegistry.registerItem(copper_ingot, copper_ingot.getUnlocalizedName());
		OreDictionary.registerOre("ingotCopper", copper_ingot);
		
		ichor = new Item().setUnlocalizedName("ichor").setTextureName(AllThings.MODID + ":ichor").setCreativeTab(AllThings.tabAllThings);
		
		ichorium = new Item().setUnlocalizedName("ichorium").setTextureName(AllThings.MODID + ":ichorium").setCreativeTab(AllThings.tabAllThings);
		GameRegistry.registerItem(ichorium, ichorium.getUnlocalizedName());
		
		//CATALYSTS
		
		//Mundane Catalyst
		mundane_catalyst = new Item().setUnlocalizedName("mundane_catalyst").setTextureName(AllThings.MODID + ":mundane_catalyst").setCreativeTab(AllThings.tabAllThings);
		GameRegistry.registerItem(mundane_catalyst, mundane_catalyst.getUnlocalizedName());
		
		//Strengthened Catalyst
		strengthened_catalyst = new Item().setUnlocalizedName("strengthened_catalyst").setTextureName(AllThings.MODID + "strengthened_catalyst").setCreativeTab(AllThings.tabAllThings);
		GameRegistry.registerItem(strengthened_catalyst , strengthened_catalyst.getUnlocalizedName());
		
		//Greater Catalyst
		greater_catalyst = new Item().setUnlocalizedName("greater_catalyst").setTextureName(AllThings.MODID + "greater_catalyst").setCreativeTab(AllThings.tabAllThings);
		GameRegistry.registerItem(greater_catalyst , greater_catalyst.getUnlocalizedName());
		
		
		//STONES
		
		//Mundane Stone
		mundane_stone = new Item().setUnlocalizedName("mundane_stone").setTextureName(AllThings.MODID + ":mundane_stone").setCreativeTab(AllThings.tabAllThings).setMaxStackSize(1);
		GameRegistry.registerItem(mundane_stone, mundane_stone.getUnlocalizedName());
		
		//Lesser Stone - Uncharged
		uncharged_lesser_stone = new Item().setUnlocalizedName("uncharged_lesser_stone").setTextureName(AllThings.MODID + ":uncharged_lesser_stone").setCreativeTab(AllThings.tabAllThings).setMaxStackSize(1);
		GameRegistry.registerItem(uncharged_lesser_stone, uncharged_lesser_stone.getUnlocalizedName());
		
		//Lesser Stone - 25% Charged
		uncharged_lesser_stone_25 = new Item().setUnlocalizedName("uncharged_lesser_stone_25").setTextureName(AllThings.MODID + ":uncharged_lesser_stone_25").setCreativeTab(AllThings.tabAllThings).setMaxStackSize(1);
		GameRegistry.registerItem(uncharged_lesser_stone_25, uncharged_lesser_stone_25.getUnlocalizedName());
		
		//Lesser Stone - 50% Charged
		uncharged_lesser_stone_50 = new Item().setUnlocalizedName("uncharged_lesser_stone_50").setTextureName(AllThings.MODID + ":uncharged_lesser_stone_50").setCreativeTab(AllThings.tabAllThings).setMaxStackSize(1);
		GameRegistry.registerItem(uncharged_lesser_stone_50, uncharged_lesser_stone_50.getUnlocalizedName());
		
		//Lesser Stone - 75% Charged
		uncharged_lesser_stone_75 = new Item().setUnlocalizedName("uncharged_lesser_stone_75").setTextureName(AllThings.MODID + ":uncharged_lesser_stone_75").setCreativeTab(AllThings.tabAllThings).setMaxStackSize(1);
		GameRegistry.registerItem(uncharged_lesser_stone_75, uncharged_lesser_stone_75.getUnlocalizedName());
		
		//Lesser Stone - Charged (Fully)
		lesser_stone = new Item().setUnlocalizedName("lesser_stone").setTextureName(AllThings.MODID + ":lesser_stone").setCreativeTab(AllThings.tabAllThings).setMaxStackSize(1);
		GameRegistry.registerItem(lesser_stone, lesser_stone.getUnlocalizedName());
		
		//Greater Stone
	
		
		//TOOLS

		red_pickaxe = new ItemRedPickaxe(diamondRed).setUnlocalizedName("red_pickaxe").setTextureName(AllThings.MODID + ":red_pickaxe").setCreativeTab(AllThings.tabAllThings).setMaxStackSize(1);
		GameRegistry.registerItem(red_pickaxe, red_pickaxe.getUnlocalizedName());
		
		red_axe = new ItemRedAxe(diamondRed).setUnlocalizedName("red_axe").setTextureName(AllThings.MODID + ":red_axe").setCreativeTab(AllThings.tabAllThings).setMaxStackSize(1);
		GameRegistry.registerItem(red_axe, red_axe.getUnlocalizedName());
		
		red_sword = new ItemRedSword(diamondRed).setUnlocalizedName("red_sword").setTextureName(AllThings.MODID + ":red_sword").setCreativeTab(AllThings.tabAllThings).setMaxStackSize(1);
		GameRegistry.registerItem(red_sword, red_sword.getUnlocalizedName());
		
		
		ultimate_pickaxe = new ItemUltiPickaxe(ultimate).setUnlocalizedName("ultimate_pickaxe").setTextureName(AllThings.MODID + "ultimate_pickaxe").setCreativeTab(AllThings.tabAllThings);
		GameRegistry.registerItem(ultimate_pickaxe, ultimate_pickaxe.getUnlocalizedName());
		
		ultimate_axe = new ItemUltiAxe(ultimate).setUnlocalizedName("ultimate_axe").setTextureName(AllThings.MODID + "ultimate_axe").setCreativeTab(AllThings.tabAllThings);
		GameRegistry.registerItem(ultimate_axe, ultimate_axe.getUnlocalizedName());
		
		ultimate_sword = new ItemUltiSword(ultimate).setUnlocalizedName("ultimate_sword").setTextureName(AllThings.MODID + "ultimate_sword").setCreativeTab(AllThings.tabAllThings);
		GameRegistry.registerItem(ultimate_sword, ultimate_sword.getUnlocalizedName());
				
		//EMP Gun
		emp_gun = new EMPGun().setUnlocalizedName("emp_gun").setTextureName(AllThings.MODID + ":emp_gun").setCreativeTab(AllThings.tabAllThings).setMaxStackSize(1);
		GameRegistry.registerItem(emp_gun, emp_gun.getUnlocalizedName());
		
		//Power
		
		simple_battery = new ItemBattery().setCapacity(1000).setUnlocalizedName("simple_battery").setTextureName(AllThings.MODID + ":simple_battery").setCreativeTab(AllThings.tabAllThings);
		GameRegistry.registerItem(simple_battery, simple_battery.getUnlocalizedName());
		
	}
	

}
