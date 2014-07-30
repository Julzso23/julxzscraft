package eu.julxzs.julxzscraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes
{
	public static void init()
	{
		GameRegistry.addRecipe(new ItemStack(ModBlocks.siliconBlock), "sss", "sss", "sss", 's', new ItemStack(ModItems.silicon));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.ironRing, 4), " i ", "i i", " i ", 'i', "ingotIron"));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.breadSlice, 5), new ItemStack(Items.bread), Items.shears.setContainerItem(Items.shears));
		GameRegistry.addSmelting(new ItemStack(ModItems.breadSlice), new ItemStack(ModItems.toast), 0);
	}
}