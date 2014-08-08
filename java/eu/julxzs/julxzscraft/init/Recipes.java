package eu.julxzs.julxzscraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import java.util.ArrayList;

public class Recipes
{
	public static void init()
	{
		GameRegistry.addRecipe(new ItemStack(ModBlocks.siliconBlock), "sss", "sss", "sss", 's', new ItemStack(ModItems.silicon));

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.ironRing, 4), " i ", "i i", " i ", 'i', "ingotIron"));

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.knife), " i", "s ", 'i', "ingotIron", 's', "stickWood"));

		removeRecipesWithResult(new ItemStack(Items.bread));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.flour), "cropWheat"));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dough), Items.water_bucket.setContainerItem(Items.bucket), new ItemStack(ModItems.flour), new ItemStack(ModItems.flour), new ItemStack(ModItems.flour));
		GameRegistry.addSmelting(new ItemStack(ModItems.dough), new ItemStack(Items.bread), 0);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.breadSlice, 5), new ItemStack(Items.bread), ModItems.knife.setContainerItem(ModItems.knife));
		GameRegistry.addSmelting(new ItemStack(ModItems.breadSlice), new ItemStack(ModItems.toast), 0);

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.jar), " w ", "g g", "ggg", 'w', "plankWood", 'g', "paneGlass"));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.butter), Items.milk_bucket.setContainerItem(Items.bucket), ModItems.jar.setContainerItem(ModItems.jar));

		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.butteredToast), ModItems.knife.setContainerItem(ModItems.knife), new ItemStack(ModItems.butter), new ItemStack(ModItems.toast));
	}

	private static void removeRecipesWithResult(ItemStack resultItem)
	{
		ArrayList recipes = (ArrayList) CraftingManager.getInstance().getRecipeList();

		for (int scan = 0; scan < recipes.size(); scan++)
		{
			IRecipe tmpRecipe = (IRecipe) recipes.get(scan);
			ItemStack recipeResult = tmpRecipe.getRecipeOutput();
			if (ItemStack.areItemStacksEqual(resultItem, recipeResult))
			{
				recipes.remove(scan);
			}
		}
	}
}