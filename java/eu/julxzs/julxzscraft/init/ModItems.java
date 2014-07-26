package eu.julxzs.julxzscraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import eu.julxzs.julxzscraft.item.ItemJC;
import eu.julxzs.julxzscraft.item.ItemSilicon;

public class ModItems
{
	public static final ItemJC silicon = new ItemSilicon();

	public static void init()
	{
		GameRegistry.registerItem(silicon, "silicon");
	}
}