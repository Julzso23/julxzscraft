package eu.julxzs.julxzscraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import eu.julxzs.julxzscraft.proxy.IProxy;
import eu.julxzs.julxzscraft.reference.Reference;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class JulxzsCraft
{
	@Mod.Instance(Reference.MOD_ID)
	public static JulxzsCraft instance;

	@SidedProxy(clientSide = "eu.julxzs.julxzscraft.proxy.ClientProxy", serverSide = "eu.julxzs.julxzscraft.proxy.ServerProxy")
	public static IProxy proxy;

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