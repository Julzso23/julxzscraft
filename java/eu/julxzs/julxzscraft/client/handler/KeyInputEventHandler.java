package eu.julxzs.julxzscraft.client.handler;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import eu.julxzs.julxzscraft.client.settings.KeyBindings;
import eu.julxzs.julxzscraft.reference.Key;

public class KeyInputEventHandler
{
	private static Key getPressedKeybinding()
	{
		if (KeyBindings.test.isPressed())
		{
			return Key.TEST;
		}
		return Key.UNKNOWN;
	}

	@SubscribeEvent
	public void handleKeyInputEvent(InputEvent.KeyInputEvent event)
	{

	}
}