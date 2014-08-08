package eu.julxzs.julxzscraft.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import eu.julxzs.julxzscraft.creativetab.CreativeTabJC;
import eu.julxzs.julxzscraft.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockJC extends Block
{
	@SideOnly(Side.CLIENT)
	public boolean multiSided = false;
	@SideOnly(Side.CLIENT)
	public IIcon topIcon;
	@SideOnly(Side.CLIENT)
	public IIcon bottomIcon;
	@SideOnly(Side.CLIENT)
	public IIcon sideIcon;

	public BlockJC(boolean multiSided)
	{
		this(Material.rock);
		this.multiSided = multiSided;
	}
	public BlockJC(Material material, boolean multiSided)
	{
		this(material);
		this.multiSided = multiSided;
	}
	public BlockJC(Material material)
	{
		super(material);
		this.setCreativeTab(CreativeTabJC.JC_TAB);
	}
	public BlockJC()
	{
		this(Material.rock);
	}

	@Override
	public String getUnlocalizedName()
	{
		return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		if (this.multiSided)
		{
			topIcon = iconRegister.registerIcon(String.format("%s%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName()), "_top"));
			sideIcon = iconRegister.registerIcon(String.format("%s%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName()), "_side"));
			bottomIcon = iconRegister.registerIcon(String.format("%s%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName()), "_bottom"));
		} else
		{
			blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int metadata)
	{
		if (multiSided)
		{
			if (side == 0)
			{
				return bottomIcon;
			} else if (side == 1)
			{
				return topIcon;
			} else
			{
				return sideIcon;
			}
		} else
		{
			return blockIcon;
		}
	}

	protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	{
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
}