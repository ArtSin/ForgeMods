package org.artsin.claw_ideas_armor.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.artsin.claw_ideas_armor.ClawIdeasBlocks;
import org.artsin.claw_ideas_armor.ClawIdeasCrafting;
import org.artsin.claw_ideas_armor.ClawIdeasItems;
import org.artsin.claw_ideas_armor.ClawIdeasWorldGenerator;

public class ClawIdeasCommonProxy
{
    public void preInit(FMLPreInitializationEvent e)
    {
        ClawIdeasItems.createItems();
        ClawIdeasBlocks.createBlocks();
    }

    public void init(FMLInitializationEvent e)
    {
        ClawIdeasCrafting.initCrafting();
        GameRegistry.registerWorldGenerator(new ClawIdeasWorldGenerator(), 0);
    }

    public void postInit(FMLPostInitializationEvent e)
    {
    }
}
