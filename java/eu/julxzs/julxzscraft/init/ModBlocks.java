package eu.julxzs.julxzscraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import eu.julxzs.block.BlockJC;
import eu.julxzs.block.BlockSilicon;

public class ModBlocks
{
	public static final BlockJC siliconBlock = new BlockSilicon();

	public static void init()
	{
		GameRegistry.registerBlock(siliconBlock, "siliconBlock");
	}
}