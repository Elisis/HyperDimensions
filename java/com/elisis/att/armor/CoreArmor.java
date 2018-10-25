package com.elisis.att.armor;

import com.elisis.att.AllThings;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class CoreArmor extends ItemArmor {
	
	private String textureName;

	public CoreArmor(String unlocalizedName, ArmorMaterial material, String textureName, int type) {
		
		super(material, 0, type);
		this.textureName = textureName;
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(AllThings.MODID + ":" + unlocalizedName);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		
		return AllThings.MODID + ":textures/armor/" + this.textureName + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}
	

}
