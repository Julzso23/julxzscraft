package eu.julxzs.julxzscraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import eu.julxzs.julxzscraft.item.*;

public class ModItems
{
	public static final ItemJC silicon = new ItemSilicon();
	public static final ItemJC ironRing = new ItemIronRing();
	public static final ItemFoodJC breadSlice = new ItemBreadSlice();
	public static final ItemFoodJC toast = new ItemToast();
	public static final ItemSwordJC knife = new ItemKnife();

	public static void init()
	{
		GameRegistry.registerItem(silicon, "silicon");
		GameRegistry.registerItem(ironRing, "ironRing");
		GameRegistry.registerItem(breadSlice, "breadSlice");
		GameRegistry.registerItem(toast, "toast");
		GameRegistry.registerItem(knife, "knife");
	}
}