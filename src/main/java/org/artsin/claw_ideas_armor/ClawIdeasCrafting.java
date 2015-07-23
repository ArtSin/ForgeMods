package org.artsin.claw_ideas_armor;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ClawIdeasCrafting
{
    public static void initCrafting()
    {
        GameRegistry.addRecipe(new ItemStack(Items.chainmail_helmet), "PPP", "P#P",
                'P', Items.blaze_powder);
        GameRegistry.addRecipe(new ItemStack(Items.chainmail_chestplate), "P#P", "PPP", "PPP",
                'P', Items.blaze_powder);
        GameRegistry.addRecipe(new ItemStack(Items.chainmail_leggings), "PPP", "P#P", "P#P",
                'P', Items.blaze_powder);
        GameRegistry.addRecipe(new ItemStack(Items.chainmail_boots), "P#P", "P#P",
                'P', Items.blaze_powder);

        GameRegistry.addRecipe(new ItemStack(ClawIdeasItems.helmetLeatherChain), "PPP", "K#K",
                'P', Items.blaze_powder,
                'K', Items.leather);
        GameRegistry.addRecipe(new ItemStack(ClawIdeasItems.plateLeatherChain), "P#P", "KKK", "PPP",
                'P', Items.blaze_powder,
                'K', Items.leather);
        GameRegistry.addRecipe(new ItemStack(ClawIdeasItems.legsLeatherChain), "PPP", "K#K", "P#P",
                'P', Items.blaze_powder,
                'K', Items.leather);
        GameRegistry.addRecipe(new ItemStack(ClawIdeasItems.bootsLeatherChain), "P#P", "K#K",
                'P', Items.blaze_powder,
                'K', Items.leather);

        GameRegistry.addRecipe(new ItemStack(ClawIdeasItems.helmetEmerald), "III", "I#I",
                'I', Items.emerald);
        GameRegistry.addRecipe(new ItemStack(ClawIdeasItems.plateEmerald), "I#I", "III", "III",
                'I', Items.emerald);
        GameRegistry.addRecipe(new ItemStack(ClawIdeasItems.legsEmerald), "III", "I#I", "I#I",
                'I', Items.emerald);
        GameRegistry.addRecipe(new ItemStack(ClawIdeasItems.bootsEmerald), "I#I", "I#I",
                'I', Items.emerald);

        GameRegistry.addRecipe(new ItemStack(ClawIdeasItems.helmetRuby), "RRR", "R#R",
                'R', ClawIdeasItems.ruby);
        GameRegistry.addRecipe(new ItemStack(ClawIdeasItems.plateRuby), "R#R", "RRR", "RRR",
                'R', ClawIdeasItems.ruby);
        GameRegistry.addRecipe(new ItemStack(ClawIdeasItems.legsRuby), "RRR", "R#R", "R#R",
                'R', ClawIdeasItems.ruby);
        GameRegistry.addRecipe(new ItemStack(ClawIdeasItems.bootsRuby), "R#R", "R#R",
                'R', ClawIdeasItems.ruby);

        GameRegistry.addRecipe(new ItemStack(ClawIdeasItems.helmetSteelLapis), "SSS", "S#S",
                'S', ClawIdeasItems.steelLapisIngot);
        GameRegistry.addRecipe(new ItemStack(ClawIdeasItems.plateSteelLapis), "S#S", "SSS", "SSS",
                'S', ClawIdeasItems.steelLapisIngot);
        GameRegistry.addRecipe(new ItemStack(ClawIdeasItems.legsSteelLapis),"SSS", "S#S", "S#S",
                'S', ClawIdeasItems.steelLapisIngot);
        GameRegistry.addRecipe(new ItemStack(ClawIdeasItems.bootsSteelLapis), "S#S", "S#S",
                'S', ClawIdeasItems.steelLapisIngot);

        GameRegistry.addShapelessRecipe(new ItemStack(ClawIdeasItems.steelLapisIngotRaw),
                new ItemStack(Items.iron_ingot),
                new ItemStack(Items.dye, 1, 4),
                new ItemStack(Items.dye, 1, 4));
        GameRegistry.addSmelting(ClawIdeasItems.steelLapisIngotRaw,
                new ItemStack(ClawIdeasItems.steelLapisIngot), 2.0F);

        GameRegistry.addRecipe(new ItemStack(ClawIdeasItems.emeraldSword), "I", "I", "P",
                'I', Items.emerald,
                'P', Items.stick);
        GameRegistry.addRecipe(new ItemStack(ClawIdeasItems.rubySword), "I", "I", "P",
                'I', ClawIdeasItems.ruby,
                'P', Items.stick);
        GameRegistry.addRecipe(new ItemStack(ClawIdeasItems.steelLapisSword), "I", "I", "P",
                'I', ClawIdeasItems.steelLapisIngot,
                'P', Items.stick);

        GameRegistry.addRecipe(new ItemStack(ClawIdeasItems.emeraldPickaxe), "III", "#P#", "#P#",
                'I', Items.emerald,
                'P', Items.stick);
        GameRegistry.addRecipe(new ItemStack(ClawIdeasItems.rubyPickaxe), "III", "#P#", "#P#",
                'I', ClawIdeasItems.ruby,
                'P', Items.stick);
        GameRegistry.addRecipe(new ItemStack(ClawIdeasItems.steelLapisPickaxe), "III", "#P#", "#P#",
                'I', ClawIdeasItems.steelLapisIngot,
                'P', Items.stick);

        GameRegistry.addRecipe(new ItemStack(ClawIdeasItems.emeraldAxe), "II", "IP", "#P",
                'I', Items.emerald,
                'P', Items.stick);
        GameRegistry.addRecipe(new ItemStack(ClawIdeasItems.rubyAxe), "II", "IP", "#P",
                'I', ClawIdeasItems.ruby,
                'P', Items.stick);
        GameRegistry.addRecipe(new ItemStack(ClawIdeasItems.steelLapisAxe), "II", "IP", "#P",
                'I', ClawIdeasItems.steelLapisIngot,
                'P', Items.stick);

        GameRegistry.addRecipe(new ItemStack(ClawIdeasItems.emeraldShovel), "I", "P", "P",
                'I', Items.emerald,
                'P', Items.stick);
        GameRegistry.addRecipe(new ItemStack(ClawIdeasItems.rubyShovel), "I", "P", "P",
                'I', ClawIdeasItems.ruby,
                'P', Items.stick);
        GameRegistry.addRecipe(new ItemStack(ClawIdeasItems.steelLapisShovel), "I", "P", "P",
                'I', ClawIdeasItems.steelLapisIngot,
                'P', Items.stick);
    }
}
