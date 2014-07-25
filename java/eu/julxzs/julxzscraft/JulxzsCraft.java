package eu.julxzs.julxzscraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = "JulxzsCraft", name = "JulxzsCraft", version = "1.7.10-1.0.0")
public class JulxzsCraft
{
	@Mod.Instance("JulxzsCraft")
	public static JulxzsCraft instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
	}

	@Mod.EventHandler
	public void Init(FMLInitializationEvent event)
	{
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
	}
}