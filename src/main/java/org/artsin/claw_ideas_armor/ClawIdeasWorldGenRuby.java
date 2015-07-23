package org.artsin.claw_ideas_armor;

import net.minecraft.block.state.pattern.BlockHelper;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class ClawIdeasWorldGenRuby extends WorldGenerator
{
    @Override
    @SuppressWarnings("unchecked")
    public boolean generate(World world, Random random, BlockPos blockPos)
    {
        if (world.getBlockState(blockPos).getBlock().isReplaceableOreGen(world, blockPos,
                BlockHelper.forBlock(Blocks.stone)))
        {
            world.setBlockState(blockPos, ClawIdeasBlocks.rubyOre.getDefaultState());
        }
        return true;
    }
}
