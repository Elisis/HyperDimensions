package com.elisis.att.invincible;

public enum EnumArmorQuality{

	Weak(250, "Weak", 4),
	Strengthened(2500, "Strengthened", 5),
	Imbued(25000, "Imbued", 6),
	Etheric(250000, "Etheric", 7);

	public int storage;
	public String name;
	public int protection;
	EnumArmorQuality(int storage, String name, int protection){
		this.storage = storage;
		this.name = name;
		this.protection = protection;
	}
}
