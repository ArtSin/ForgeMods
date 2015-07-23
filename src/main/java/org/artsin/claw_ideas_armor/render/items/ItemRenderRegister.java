package org.artsin.claw_ideas_armor.render.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelResourceLocation;
import org.artsin.claw_ideas_armor.ClawIdeasItems;

public class ItemRenderRegister
{
    public static void registerItemRenderer()
    {
        ItemModelMesher itemModelMesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();

        itemModelMesher.register(ClawIdeasItems.helmetLeatherChain, 0,
                new ModelResourceLocation("clawideas_artsin:helmetLeatherChain", "inventory"));
        itemModelMesher.register(ClawIdeasItems.plateLeatherChain, 0,
                new ModelResourceLocation("clawideas_artsin:plateLeatherChain", "inventory"));
        itemModelMesher.register(ClawIdeasItems.legsLeatherChain, 0,
                new ModelResourceLocation("clawideas_artsin:legsLeatherChain", "inventory"));
        itemModelMesher.register(ClawIdeasItems.bootsLeatherChain, 0,
                new ModelResourceLocation("clawideas_artsin:bootsLeatherChain", "inventory"));

        itemModelMesher.register(ClawIdeasItems.helmetEmerald, 0,
                new ModelResourceLocation("clawideas_artsin:helmetEmerald", "inventory"));
        itemModelMesher.register(ClawIdeasItems.plateEmerald, 0,
                new ModelResourceLocation("clawideas_artsin:plateEmerald", "inventory"));
        itemModelMesher.register(ClawIdeasItems.legsEmerald, 0,
                new ModelResourceLocation("clawideas_artsin:legsEmerald", "inventory"));
        itemModelMesher.register(ClawIdeasItems.bootsEmerald, 0,
                new ModelResourceLocation("clawideas_artsin:bootsEmerald", "inventory"));

        itemModelMesher.register(ClawIdeasItems.helmetRuby, 0,
                new ModelResourceLocation("clawideas_artsin:helmetRuby", "inventory"));
        itemModelMesher.register(ClawIdeasItems.plateRuby, 0,
                new ModelResourceLocation("clawideas_artsin:plateRuby", "inventory"));
        itemModelMesher.register(ClawIdeasItems.legsRuby, 0,
                new ModelResourceLocation("clawideas_artsin:legsRuby", "inventory"));
        itemModelMesher.register(ClawIdeasItems.bootsRuby, 0,
                new ModelResourceLocation("clawideas_artsin:bootsRuby", "inventory"));

        itemModelMesher.register(ClawIdeasItems.helmetSteelLapis, 0,
                new ModelResourceLocation("clawideas_artsin:helmetSteelLapis", "inventory"));
        itemModelMesher.register(ClawIdeasItems.plateSteelLapis, 0,
                new ModelResourceLocation("clawideas_artsin:plateSteelLapis", "inventory"));
        itemModelMesher.register(ClawIdeasItems.legsSteelLapis, 0,
                new ModelResourceLocation("clawideas_artsin:legsSteelLapis", "inventory"));
        itemModelMesher.register(ClawIdeasItems.bootsSteelLapis, 0,
                new ModelResourceLocation("clawideas_artsin:bootsSteelLapis", "inventory"));

        itemModelMesher.register(ClawIdeasItems.ruby, 0,
                new ModelResourceLocation("clawideas_artsin:ruby", "inventory"));
        itemModelMesher.register(ClawIdeasItems.steelLapisIngotRaw, 0,
                new ModelResourceLocation("clawideas_artsin:steelLapisIngotRaw", "inventory"));
        itemModelMesher.register(ClawIdeasItems.steelLapisIngot, 0,
                new ModelResourceLocation("clawideas_artsin:steelLapisIngot", "inventory"));

        itemModelMesher.register(ClawIdeasItems.emeraldSword, 0,
                new ModelResourceLocation("clawideas_artsin:emeraldSword", "inventory"));
        itemModelMesher.register(ClawIdeasItems.rubySword, 0,
                new ModelResourceLocation("clawideas_artsin:rubySword", "inventory"));
        itemModelMesher.register(ClawIdeasItems.steelLapisSword, 0,
                new ModelResourceLocation("clawideas_artsin:steelLapisSword", "inventory"));

        itemModelMesher.register(ClawIdeasItems.emeraldPickaxe, 0,
                new ModelResourceLocation("clawideas_artsin:emeraldPickaxe", "inventory"));
        itemModelMesher.register(ClawIdeasItems.rubyPickaxe, 0,
                new ModelResourceLocation("clawideas_artsin:rubyPickaxe", "inventory"));
        itemModelMesher.register(ClawIdeasItems.steelLapisPickaxe, 0,
                new ModelResourceLocation("clawideas_artsin:steelLapisPickaxe", "inventory"));

        itemModelMesher.register(ClawIdeasItems.emeraldAxe, 0,
                new ModelResourceLocation("clawideas_artsin:emeraldAxe", "inventory"));
        itemModelMesher.register(ClawIdeasItems.rubyAxe, 0,
                new ModelResourceLocation("clawideas_artsin:rubyAxe", "inventory"));
        itemModelMesher.register(ClawIdeasItems.steelLapisAxe, 0,
                new ModelResourceLocation("clawideas_artsin:steelLapisAxe", "inventory"));

        itemModelMesher.register(ClawIdeasItems.emeraldShovel, 0,
                new ModelResourceLocation("clawideas_artsin:emeraldShovel", "inventory"));
        itemModelMesher.register(ClawIdeasItems.rubyShovel, 0,
                new ModelResourceLocation("clawideas_artsin:rubyShovel", "inventory"));
        itemModelMesher.register(ClawIdeasItems.steelLapisShovel, 0,
                new ModelResourceLocation("clawideas_artsin:steelLapisShovel", "inventory"));
    }
}
