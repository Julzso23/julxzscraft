package eu.julxzs.julxzscraft.init;

import cpw.mods.fml.common.IWorldGenerator;
import eu.julxzs.julxzscraft.block.BlockOreJC;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class ModWorldGen implements IWorldGenerator
{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		switch(world.provider.dimensionId)
		{
			case -1:
				generateNether(world, random, chunkX * 16, chunkZ * 16);
				break;
			case 0:
				for(int i=0; i<ModOres.ores.length; i++)
				{
					generateSurface(world, random, chunkX * 16, chunkZ * 16, ModOres.ores[i]);
				}
				break;
			case 1:
				generateEnd(world, random, chunkX * 16, chunkZ * 16);
				break;
		}
	}

	private void generateEnd(World world, Random random, int i, int j)
	{
	}

	private void generateSurface(World world, Random random, int i, int j, BlockOreJC ore)
	{
		for(int k = 0; k < ore.veins; k++)
		{
			(new WorldGenMinable(ore, ore.veinSize)).generate(world, random, i + random.nextInt(16), random.nextInt(ore.yMax)+random.nextInt(ore.yMax)+(ore.yMin-ore.yMax), j + random.nextInt(16));
		}
	}

	private void generateNether(World world, Random random, int i, int j)
	{
	}
}