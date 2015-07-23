package org.artsin.claw_ideas_armor.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import org.artsin.claw_ideas_armor.ClawIdeasItems;

import java.util.Random;

public class ClawIdeasOreRuby extends Block
{
	public ClawIdeasOreRuby(String unlocalizedName)
    {
        super(Material.rock);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
        this.setHarvestLevel("pickaxe", 2);
        //MinecraftForge.setBlockHarvestLevel(this, "pickaxe", 2);
    }

    @Override
    public Item getItemDropped(IBlockState blockstate, Random random, int fortune)
    {
        return ClawIdeasItems.ruby;
    }

    @Override
    public int damageDropped(IBlockState blockstate)
    {
        return 0;
    }

    @Override
    public int quantityDropped(IBlockState blockstate, int fortune, Random random)
    {
        return 3 + random.nextInt(4 + fortune);
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    /*public int idDropped(int par1, Random par2Random, int par3)
    {
        return ClawIdeasMod.ruby.shiftedIndex;
    }*/

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    /*public int quantityDropped(Random par1Random)
    {
        return 1;
    }*/

    /**
     * Drops the block items with a specified chance of dropping the specified items
     */
    /*public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
    {
        super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, par7);

        int var5 = 1;
        
		if (this.blockID == ClawIdeasMod.rubyOre.blockID)
        {
        	var5 = MathHelper.getRandomIntegerInRange(par1World.rand, 3, 7);
        }

        this.dropXpOnBlockBreak(par1World, par2, par3, par4, var5);
    }*/
    
	/*@SideOnly(Side.CLIENT)
	public String getTextureFile()
	{
		return "/Claw_ideas_armor_textures.png";
	}*/
}
