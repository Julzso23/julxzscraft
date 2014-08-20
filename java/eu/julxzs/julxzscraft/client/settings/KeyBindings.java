package eu.julxzs.julxzscraft.client.settings;

import eu.julxzs.julxzscraft.reference.Names;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

public class KeyBindings
{
	public static KeyBinding test = new KeyBinding(Names.Keys.TEST, Keyboard.KEY_F, Names.Keys.CATEGORY);
}