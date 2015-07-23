package org.artsin.claw_ideas_armor.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ClawIdeasItemSword extends ItemSword
{
	public ClawIdeasItemSword(String unlocalizedName, ToolMaterial toolMaterial)
	{
		super(toolMaterial);

		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
}
