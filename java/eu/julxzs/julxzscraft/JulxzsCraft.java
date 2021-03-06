package eu.julxzs.julxzscraft;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import eu.julxzs.julxzscraft.client.handler.KeyInputEventHandler;
import eu.julxzs.julxzscraft.handler.ConfigHandler;
import eu.julxzs.julxzscraft.init.*;
import eu.julxzs.julxzscraft.proxy.IProxy;
import eu.julxzs.julxzscraft.reference.Reference;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class JulxzsCraft
{
	@Mod.Instance(Reference.MOD_ID)
	public static JulxzsCraft instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigHandler());

		proxy.registerKeyBindings();

		ModItems.init();
		ModBlocks.init();
	}

	@Mod.EventHandler
	public void Init(FMLInitializationEvent event)
	{
		FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());

		ModOreDictionary.init();
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 1);

		Recipes.init();
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
	}
}