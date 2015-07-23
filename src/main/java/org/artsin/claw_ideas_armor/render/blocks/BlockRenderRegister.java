package org.artsin.claw_ideas_armor.render.blocks;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import org.artsin.claw_ideas_armor.ClawIdeasBlocks;

public class BlockRenderRegister
{
    public static void registerBlockRenderer()
    {
        ItemModelMesher itemModelMesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();

        itemModelMesher.register(Item.getItemFromBlock(ClawIdeasBlocks.rubyOre), 0,
                new ModelResourceLocation("clawideas_artsin:rubyOre", "inventory"));
    }
}
