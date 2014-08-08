package eu.julxzs.julxzscraft.block;

import net.minecraft.block.material.Material;

public class BlockOreJC extends BlockJC
{
	public int veins;
	public int veinSize;
	public int yMin;
	public int yMax;

	public BlockOreJC(int veins, int veinSize, int yMin, int yMax)
	{
		super(Material.rock);
		this.veins = veins;
		this.veinSize = veinSize;
		this.yMin = yMin;
		this.yMax = yMax;
	}
}