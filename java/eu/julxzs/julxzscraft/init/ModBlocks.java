package eu.julxzs.julxzscraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import eu.julxzs.julxzscraft.block.*;
import eu.julxzs.julxzscraft.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
	public static final BlockJC siliconBlock = new BlockSilicon();
	public static final BlockJC bin = new BlockBin();
	public static final BlockOreJC magnesiumOre = new BlockMagnesiumOre();

	public static void init()
	{
		GameRegistry.registerBlock(siliconBlock, "siliconBlock");
		GameRegistry.registerBlock(bin, "bin");
		GameRegistry.registerBlock(magnesiumOre, "magnesiumOre");
	}
}