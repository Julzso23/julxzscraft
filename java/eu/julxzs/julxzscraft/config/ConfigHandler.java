package eu.julxzs.julxzscraft.config;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler
{
	public static void init(File configFile)
	{
		Configuration config = new Configuration(configFile);
		boolean configValue = false;

		try
		{
			config.load();

			configValue = config.get(Configuration.CATEGORY_GENERAL, "configValue", true, "Example config value").getBoolean(true);
		}
		catch (Exception e)
		{
			// Log the exception
		}
		finally
		{
			config.save();
		}
		System.out.println(configValue);
	}
}