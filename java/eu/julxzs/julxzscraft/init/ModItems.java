package eu.julxzs.julxzscraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import eu.julxzs.julxzscraft.item.ItemBreadSlice;
import eu.julxzs.julxzscraft.item.ItemJC;
import eu.julxzs.julxzscraft.item.ItemSilicon;
import eu.julxzs.julxzscraft.item.ItemToast;

public class ModItems
{
	public static final ItemJC silicon = new ItemSilicon();
	public static final ItemJC breadSlice = new ItemBreadSlice();
	public static final ItemJC toast = new ItemToast();

	public static void init()
	{
		GameRegistry.registerItem(silicon, "silicon");
		GameRegistry.registerItem(breadSlice, "breadSlice");
		GameRegistry.registerItem(toast, "toast");
	}
}