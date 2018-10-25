package com.elisis.att.invincible;

public enum EnumArmorType {

	HEAD("Helm"),
	CHEST("Chestplate"),
	LEGS("Leggings"),
	FEET("Boots");

	public String name;

	EnumArmorType(String name){
		this.name = name;
	}

}
