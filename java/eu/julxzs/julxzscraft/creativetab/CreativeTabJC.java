package eu.julxzs.julxzscraft.creativetab;

import eu.julxzs.julxzscraft.init.ModItems;
import eu.julxzs.julxzscraft.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabJC
{
	public static final CreativeTabs JC_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
	{
		@Override
		public Item getTabIconItem()
		{
			return ModItems.silicon;
		}
	};
}