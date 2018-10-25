package com.elisis.att.item;

import com.elisis.att.block.ModBlocks;
import com.elisis.att.invincible.IchoriumArmor;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModRecipes {
	
	public static void init() {
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.red_diamond_block), "XXX", "XXX", "XXX", 'X', ModItems.red_diamond);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.red_diamond, 9), ModBlocks.red_diamond_block);
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.mundane_catalyst, 4), Items.blaze_powder, Items.gunpowder, Items.redstone, Items.glowstone_dust);
		GameRegistry.addRecipe(new ItemStack(ModItems.strengthened_catalyst, 4), " L ", " S ", " D ", 'L', ModItems.roasted_lapis, 'S', ModItems.uncharged_lesser_stone, 'D', ModItems.red_diamond);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.greater_catalyst, 1), new Object[] {ModItems.strengthened_catalyst, Items.nether_star, Items.ender_eye, Items.poisonous_potato})	;
		
		//TOOLS
		GameRegistry.addRecipe(new ItemStack(ModItems.red_pickaxe), "XXX", " S ", " S ", 'X', ModItems.red_diamond, 'S', Items.stick);
		
		
		//Stones
		
		GameRegistry.addRecipe(new ItemStack(ModItems.mundane_stone), " X ", "XXX", " X ", 'X', ModItems.red_diamond);
		GameRegistry.addRecipe(new ItemStack(ModItems.uncharged_lesser_stone), "XGX", "GYG", "XGX", 'Y', ModItems.mundane_stone, 'X', ModItems.mundane_catalyst, 'G', Items.gold_ingot);
		GameRegistry.addRecipe(new ItemStack(ModItems.lesser_stone), "BBB", "BSB", "BBB", 'B', ModItems.strengthened_catalyst, 'S', ModItems.uncharged_lesser_stone);
		GameRegistry.addRecipe(new ItemStack(ModItems.greater_stone), "EDE", "CLC", "ECE", 'E', Blocks.emerald_block, 'D', Blocks.dragon_egg, 'C', ModItems.greater_catalyst);
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gold_ingot), new Object[] {ModItems.lesser_stone, Items.iron_ingot, Items.iron_ingot, Items.iron_ingot});
	
		GameRegistry.addRecipe(new ItemStack(IchoriumArmor.armors[0]), "III", "IDI", "  ", 'I', ModItems.ichorium, 'D', Items.diamond_helmet);
		GameRegistry.addRecipe(new ItemStack(IchoriumArmor.armors[1]), "IDI", "III", "III", 'I', ModItems.ichorium, 'D', Items.diamond_helmet);
		
		
	}
	

}
