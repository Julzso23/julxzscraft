package eu.julxzs.julxzscraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import eu.julxzs.julxzscraft.block.BlockJC;
import eu.julxzs.julxzscraft.block.BlockSilicon;
import eu.julxzs.julxzscraft.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
	public static final BlockJC siliconBlock = new BlockSilicon();

	public static void init()
	{
		GameRegistry.registerBlock(siliconBlock, "siliconBlock");
	}
}