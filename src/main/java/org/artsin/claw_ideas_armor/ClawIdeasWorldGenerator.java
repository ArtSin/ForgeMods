package org.artsin.claw_ideas_armor;

import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class ClawIdeasWorldGenerator implements IWorldGenerator
{
	private WorldGenerator worldGenerator;

	public ClawIdeasWorldGenerator()
	{
		this.worldGenerator = new ClawIdeasWorldGenRuby();
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
						 IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		switch (world.provider.getDimensionId())
		{
			case 0:
				generateSurface(random, chunkX * 16, chunkZ * 16, world, chunkGenerator, chunkProvider);
				break;

			default:
				break;
		}
	}

	public void generateSurface(Random random, int chunkX, int chunkZ, World world,
								IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		BiomeGenBase[] biomegen = world.getWorldChunkManager().getBiomeGenAt(null, chunkX, chunkZ, 16, 16, true);
		for (int i = 0; i < biomegen.length; i++)
		{
			if ((BiomeDictionary.isBiomeOfType(biomegen[i], BiomeDictionary.Type.COLD) &&
					BiomeDictionary.isBiomeOfType(biomegen[i], BiomeDictionary.Type.CONIFEROUS) &&
					BiomeDictionary.isBiomeOfType(biomegen[i], BiomeDictionary.Type.FOREST)) ||
				BiomeDictionary.isBiomeOfType(biomegen[i], BiomeDictionary.Type.MOUNTAIN))
			{
				this.runGenerator(this.worldGenerator, world, random, chunkX, chunkZ, 10, 0, 35);
				break;
			}
		}
	}

	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunkX, int chunkZ,
							  int chancesToSpawn, int minHeight, int maxHeight)
	{
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
			throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

		int heightDiff = maxHeight - minHeight + 1;
		for (int i = 0; i < chancesToSpawn; i++)
		{
			int x = chunkX + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ + rand.nextInt(16);
			generator.generate(world, rand, new BlockPos(x, y, z));
		}
	}
}