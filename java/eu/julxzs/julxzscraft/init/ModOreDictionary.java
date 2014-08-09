package eu.julxzs.julxzscraft.init;

import net.minecraftforge.oredict.OreDictionary;

public class ModOreDictionary
{
	public static void init()
	{
		OreDictionary.registerOre("oreMagnesium", ModBlocks.magnesiumOre);
		OreDictionary.registerOre("ingotMagnesium", ModItems.magnesiumIngot);
	}
}