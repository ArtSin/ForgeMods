package org.artsin.claw_ideas_armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.artsin.claw_ideas_armor.items.*;

public class ClawIdeasItems
{
    // Armor materials
    public static ItemArmor.ArmorMaterial armorMaterialLeatherChain = EnumHelper.addArmorMaterial("LeatherChain",
            "clawideas_artsin:leatherChain", 9, new int[] { 2, 3, 3, 1 }, 0);
    public static ItemArmor.ArmorMaterial armorMaterialEmerald = EnumHelper.addArmorMaterial("Emerald",
            "clawideas_artsin:emerald", 15, new int[] { 2, 6, 5, 2 }, 10);
    public static ItemArmor.ArmorMaterial armorMaterialRuby = EnumHelper.addArmorMaterial("Ruby",
            "clawideas_artsin:ruby", 15, new int[] { 2, 6, 5, 2 }, 10);
    public static ItemArmor.ArmorMaterial armorMaterialSteelLapis = EnumHelper.addArmorMaterial("SteelLapis",
            "clawideas_artsin:steelLapis", 18, new int[] { 3, 7, 6, 2 }, 10);

    // Tool materials
    public static Item.ToolMaterial toolMaterialEmeraldAndRuby = EnumHelper.addToolMaterial("EmeraldAndRuby", 2, 600, 6F, 2, 10);
    public static Item.ToolMaterial toolMaterialSteelLapis = EnumHelper.addToolMaterial("SteelLapis", 2, 750, 8F, 4, 10);

    public static Item helmetLeatherChain;
    public static Item plateLeatherChain;
    public static Item legsLeatherChain;
    public static Item bootsLeatherChain;

    public static Item helmetEmerald;
    public static Item plateEmerald;
    public static Item legsEmerald;
    public static Item bootsEmerald;

    public static Item helmetRuby;
    public static Item plateRuby;
    public static Item legsRuby;
    public static Item bootsRuby;

    public static Item helmetSteelLapis;
    public static Item plateSteelLapis;
    public static Item legsSteelLapis;
    public static Item bootsSteelLapis;

    public static Item ruby;
    public static Item steelLapisIngotRaw;
    public static Item steelLapisIngot;

    public static Item emeraldSword;
    public static Item rubySword;
    public static Item steelLapisSword;

    public static Item emeraldPickaxe;
    public static Item rubyPickaxe;
    public static Item steelLapisPickaxe;

    public static Item emeraldAxe;
    public static Item rubyAxe;
    public static Item steelLapisAxe;

    public static Item emeraldShovel;
    public static Item rubyShovel;
    public static Item steelLapisShovel;

    public static void createItems()
    {
        GameRegistry.registerItem(helmetLeatherChain = new ClawIdeasItemArmor("helmetLeatherChain",
                armorMaterialLeatherChain, 1, 0), "helmetLeatherChain");
        GameRegistry.registerItem(plateLeatherChain = new ClawIdeasItemArmor("plateLeatherChain",
                armorMaterialLeatherChain, 1, 1), "plateLeatherChain");
        GameRegistry.registerItem(legsLeatherChain = new ClawIdeasItemArmor("legsLeatherChain",
                armorMaterialLeatherChain, 2, 2), "legsLeatherChain");
        GameRegistry.registerItem(bootsLeatherChain = new ClawIdeasItemArmor("bootsLeatherChain",
                armorMaterialLeatherChain, 1, 3), "bootsLeatherChain");

        GameRegistry.registerItem(helmetEmerald = new ClawIdeasItemArmor("helmetEmerald",
                armorMaterialEmerald, 1, 0), "helmetEmerald");
        GameRegistry.registerItem(plateEmerald = new ClawIdeasItemArmor("plateEmerald",
                armorMaterialEmerald, 1, 1), "plateEmerald");
        GameRegistry.registerItem(legsEmerald = new ClawIdeasItemArmor("legsEmerald",
                armorMaterialEmerald, 2, 2), "legsEmerald");
        GameRegistry.registerItem(bootsEmerald = new ClawIdeasItemArmor("bootsEmerald",
                armorMaterialEmerald, 1, 3), "bootsEmerald");

        GameRegistry.registerItem(helmetRuby = new ClawIdeasItemArmor("helmetRuby",
                armorMaterialRuby, 1, 0), "helmetRuby");
        GameRegistry.registerItem(plateRuby = new ClawIdeasItemArmor("plateRuby",
                armorMaterialRuby, 1, 1), "plateRuby");
        GameRegistry.registerItem(legsRuby = new ClawIdeasItemArmor("legsRuby",
                armorMaterialRuby, 2, 2), "legsRuby");
        GameRegistry.registerItem(bootsRuby = new ClawIdeasItemArmor("bootsRuby",
                armorMaterialRuby, 1, 3), "bootsRuby");

        GameRegistry.registerItem(helmetSteelLapis = new ClawIdeasItemArmor("helmetSteelLapis",
                armorMaterialSteelLapis, 1, 0), "helmetSteelLapis");
        GameRegistry.registerItem(plateSteelLapis = new ClawIdeasItemArmor("plateSteelLapis",
                armorMaterialSteelLapis, 1, 1), "plateSteelLapis");
        GameRegistry.registerItem(legsSteelLapis = new ClawIdeasItemArmor("legsSteelLapis",
                armorMaterialSteelLapis, 2, 2), "legsSteelLapis");
        GameRegistry.registerItem(bootsSteelLapis = new ClawIdeasItemArmor("bootsSteelLapis",
                armorMaterialSteelLapis, 1, 3), "bootsSteelLapis");

        GameRegistry.registerItem(ruby = new ClawIdeasItem("ruby",
                CreativeTabs.tabMaterials), "ruby");
        GameRegistry.registerItem(steelLapisIngotRaw = new ClawIdeasItem("steelLapisIngotRaw",
                CreativeTabs.tabMaterials), "steelLapisIngotRaw");
        GameRegistry.registerItem(steelLapisIngot = new ClawIdeasItem("steelLapisIngot",
                CreativeTabs.tabMaterials), "steelLapisIngot");

        GameRegistry.registerItem(emeraldSword = new ClawIdeasItemSword("emeraldSword",
                toolMaterialEmeraldAndRuby), "emeraldSword");
        GameRegistry.registerItem(rubySword = new ClawIdeasItemSword("rubySword",
                toolMaterialEmeraldAndRuby), "rubySword");
        GameRegistry.registerItem(steelLapisSword = new ClawIdeasItemSword("steelLapisSword",
                toolMaterialSteelLapis), "steelLapisSword");

        GameRegistry.registerItem(emeraldPickaxe = new ClawIdeasItemPickaxe("emeraldPickaxe",
                toolMaterialEmeraldAndRuby), "emeraldPickaxe");
        GameRegistry.registerItem(rubyPickaxe = new ClawIdeasItemPickaxe("rubyPickaxe",
                toolMaterialEmeraldAndRuby), "rubyPickaxe");
        GameRegistry.registerItem(steelLapisPickaxe = new ClawIdeasItemPickaxe("steelLapisPickaxe",
                toolMaterialSteelLapis), "steelLapisPickaxe");

        GameRegistry.registerItem(emeraldAxe = new ClawIdeasItemAxe("emeraldAxe",
                toolMaterialEmeraldAndRuby), "emeraldAxe");
        GameRegistry.registerItem(rubyAxe = new ClawIdeasItemAxe("rubyAxe",
                toolMaterialEmeraldAndRuby), "rubyAxe");
        GameRegistry.registerItem(steelLapisAxe = new ClawIdeasItemAxe("steelLapisAxe",
                toolMaterialSteelLapis), "steelLapisAxe");

        GameRegistry.registerItem(emeraldShovel = new ClawIdeasItemShovel("emeraldShovel",
                toolMaterialEmeraldAndRuby), "emeraldShovel");
        GameRegistry.registerItem(rubyShovel = new ClawIdeasItemShovel("rubyShovel",
                toolMaterialEmeraldAndRuby), "rubyShovel");
        GameRegistry.registerItem(steelLapisShovel = new ClawIdeasItemShovel("steelLapisShovel",
                toolMaterialSteelLapis), "steelLapisShovel");
    }
}
