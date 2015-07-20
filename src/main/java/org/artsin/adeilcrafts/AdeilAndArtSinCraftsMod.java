package org.artsin.adeilcrafts;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = "adeilartsincrafts", name = "Adeil and ArtSin Crafts Mod", version = "1.1")
public class AdeilAndArtSinCraftsMod
{
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		// Факел / Torch
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.torch),
				new ItemStack(Blocks.redstone_torch),
				new ItemStack(Items.coal));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.torch),
				new ItemStack(Blocks.redstone_torch),
				new ItemStack(Items.glowstone_dust));
		GameRegistry.addRecipe(new ItemStack(Blocks.torch), "RRR", "RTR", "RRR",
				'T', Blocks.redstone_torch,
				'R', Items.redstone);
		
		// Книга с пером / Book with feather
		GameRegistry.addShapelessRecipe(new ItemStack(Items.writable_book),
				new ItemStack(Items.written_book),
				new ItemStack(Items.potionitem, 1, 0));
		
		// Седло / Saddle
		GameRegistry.addRecipe(new ItemStack(Items.saddle), "KKK", "KKK", "NKN",
				'K', Items.leather,
				'N', Items.string);
		
		// Спаунер свиней / Pig spawner
		GameRegistry.addRecipe(new ItemStack(Blocks.mob_spawner), "MMM", "MTM", "M M",
				'M', Items.cooked_porkchop,
				'T', Blocks.grass);
		GameRegistry.addRecipe(new ItemStack(Blocks.mob_spawner), "MMM", "MVM", "MZM",
				'M', Items.cooked_porkchop,
				'V', Blocks.tallgrass,
				'Z', Blocks.dirt);
		
		// Трава / Grass
		GameRegistry.addRecipe(new ItemStack(Blocks.grass), "T", "Z",
				'T', Blocks.tallgrass,
				'Z', Blocks.dirt);
		
		// Голова скелета / Skeleton skull
		GameRegistry.addRecipe(new ItemStack(Items.skull, 1, 0), "KK", "KK",
				'K', Items.bone);
		
		// Голова игрока / Player head
		GameRegistry.addRecipe(new ItemStack(Items.skull, 1, 3), "KKK", "KGK",
				'K', Items.leather,
				'G', new ItemStack(Items.skull, 1, 0));
		GameRegistry.addRecipe(new ItemStack(Items.skull, 1, 3), "S", "G",
				'S', new ItemStack(Items.leather_helmet),
				'G', new ItemStack(Items.skull, 1, 0));
		
		// Голова скелета-иссушителя / Wither skeleton skull
		GameRegistry.addRecipe(new ItemStack(Items.skull, 1, 1), "UUU", "UGU", "UUU",
				'U', new ItemStack(Items.coal),
				'G', new ItemStack(Items.skull, 1, 0));
		
		// Голова зомби / Zombie head
		GameRegistry.addRecipe(new ItemStack(Items.skull, 1, 2), "III", "IGI", "III",
				'I', new ItemStack(Items.emerald),
				'G', new ItemStack(Items.skull, 1, 3));
		
		// Голова крипера / Creeper head
		GameRegistry.addRecipe(new ItemStack(Items.skull, 1, 4), "III", "IGI", "III",
				'I', new ItemStack(Items.emerald),
				'G', new ItemStack(Items.skull, 1, 2));
		
		// Паутина / Web
		GameRegistry.addRecipe(new ItemStack(Blocks.web), "NNN", "NNN", "NNN",
				'N', new ItemStack(Items.string));
		
		// Губка / Sponge
		GameRegistry.addRecipe(new ItemStack(Blocks.sponge, 4), "SS", "SS",
				'S', new ItemStack(Blocks.wool, 1, 0));
	}
}
