package eu.julxzs.julxzscraft.block;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockBin extends BlockJC
{
	public BlockBin()
	{
		super(Material.iron, true);
		this.setBlockName("bin");
	}

	@Override
	public boolean onBlockActivated(World world, int a, int b, int c, EntityPlayer player, int d, float e, float f, float g)
	{
		player.inventory.mainInventory[player.inventory.currentItem] = null;
		return true;
	}
}