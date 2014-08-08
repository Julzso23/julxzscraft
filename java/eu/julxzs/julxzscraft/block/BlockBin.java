package eu.julxzs.julxzscraft.block;

import eu.julxzs.julxzscraft.utility.LogHelper;
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
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int sideHit, float hitVecX, float hitVecY, float hitVecZ)
	{
		player.inventory.mainInventory[player.inventory.currentItem] = null;
		return true;
	}
}