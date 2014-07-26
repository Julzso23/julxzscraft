package eu.julxzs.julxzscraft.handler;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import eu.julxzs.julxzscraft.reference.Reference;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler
{
	public static Configuration config;

	public static boolean testValue = false;

	public static void init(File configFile)
	{
		if (config == null)
		{
			config = new Configuration(configFile);
			loadConfig();
		}
	}

	@SubscribeEvent
	public void onConfigChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
	{
		if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
		{
			loadConfig();
		}
	}

	public static void loadConfig()
	{
		testValue = config.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "Example config value");

		if (config.hasChanged())
		{
			config.save();
		}
	}
}