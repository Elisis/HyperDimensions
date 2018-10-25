package com.elisis.att.init;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.settings.KeyBinding;

public class Keybinds {
	
	public static KeyBinding hello;
	
	public static void register() {
		
		//hello = new KeyBinding(, 0, Keyboard.KEY_V)
		hello = new KeyBinding("key.hello", Keyboard.KEY_V, "key.categories.att");
		ClientRegistry.registerKeyBinding(hello);
	}

}
