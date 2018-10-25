package com.elisis.att.invincible;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.ISpecialArmor;
import net.minecraftforge.common.util.EnumHelper;

public class IchoriumArmor extends ItemArmor implements ISpecialArmor{

	static ArmorMaterial[] materials;

	public IchoriumArmor(EnumArmorType type, EnumArmorQuality quality) {
		super(materials[quality.ordinal()], 0, type.ordinal());
		this.type = type;
		this.quality = quality;
	}

	@Override
	public void registerIcons(IIconRegister par1IconRegister) {
		this.itemIcon = par1IconRegister.registerIcon("att:" + "armor" + quality.name + type.name);
	}

	public static IchoriumArmor[] armors = new IchoriumArmor[16];
	public EnumArmorQuality quality;
	public EnumArmorType type;
	public static void register(){
		
		materials = new ArmorMaterial[4];
		for(int i = 0; i < 4; i++){
			EnumArmorQuality quality=EnumArmorQuality.values()[i];
			materials[i] = EnumHelper.addArmorMaterial(quality.name, 0, new int[]{ quality.protection,quality.protection, quality.protection, quality.protection}, 0);
		}
		for(int i=0; i<4;i++){
			for(int j=0;j<4;j++){

				IchoriumArmor IchoriumArmor = new IchoriumArmor(EnumArmorType.values()[i], EnumArmorQuality.values()[j]);
				IchoriumArmor.setUnlocalizedName(IchoriumArmor.quality.name + IchoriumArmor.type.name);
				
				GameRegistry.registerItem(IchoriumArmor, IchoriumArmor.getUnlocalizedName());
				armors[i+j*4] = IchoriumArmor;
			}
		}
	}

	@Override
	public String getItemStackDisplayName(ItemStack par1ItemStack) {
		return quality.name + " " + type.name;
	}

	@Override
	public ArmorProperties getProperties(EntityLivingBase player, ItemStack armor, DamageSource source, double damage, int slot) {
		return new ArmorProperties(0, getArmorMaterial().getDamageReductionAmount(slot) * 0.0425, Integer.MAX_VALUE);
	}

	@Override
	public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot) {
		return 0;
	}

	@Override
	public void damageArmor(EntityLivingBase entity, ItemStack stack, DamageSource source, int damage, int slot) {

	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return "att:textures/armor/" + quality.name + (slot == 2 ? "_1" : "")+".png";
	}
}
