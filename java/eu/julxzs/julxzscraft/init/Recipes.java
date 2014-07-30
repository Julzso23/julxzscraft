package eu.julxzs.julxzscraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes
{
	public static void init()
	{
		GameRegistry.addRecipe(new ItemStack(ModBlocks.siliconBlock), "sss", "sss", "sss", 's', new ItemStack(ModItems.silicon));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.ironRing, 4), " i ", "i i", " i ", 'i', "ingotIron"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.knife), " i ", "s  ", "   ", 'i', "ingotIron", 's', "stickWood"));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.breadSlice, 5), new ItemStack(Items.bread), ModItems.knife.setContainerItem(ModItems.knife));
		GameRegistry.addSmelting(new ItemStack(ModItems.breadSlice), new ItemStack(ModItems.toast), 0);
	}
}