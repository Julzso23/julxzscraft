package eu.julxzs.julxzscraft.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import eu.julxzs.julxzscraft.client.settings.KeyBindings;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerKeyBindings()
	{
		ClientRegistry.registerKeyBinding(KeyBindings.test);
	}
}