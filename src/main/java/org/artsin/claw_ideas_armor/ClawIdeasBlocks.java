package org.artsin.claw_ideas_armor;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.artsin.claw_ideas_armor.blocks.ClawIdeasOreRuby;

public class ClawIdeasBlocks
{
    public static Block rubyOre;

    public static void createBlocks()
    {
        GameRegistry.registerBlock(rubyOre = new ClawIdeasOreRuby("rubyOre"), "rubyOre");
    }
}
