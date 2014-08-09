package eu.julxzs.julxzscraft.block;

public class BlockMagnesiumOre extends BlockOreJC
{
	public BlockMagnesiumOre()
	{
		super(20, 8, 0, 64);
		this.setBlockName("magnesiumOre");
		this.setHardness(3.0F);
		this.setHarvestLevel("pickaxe", 1);
	}
}