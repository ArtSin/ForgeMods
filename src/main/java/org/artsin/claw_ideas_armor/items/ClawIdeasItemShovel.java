package org.artsin.claw_ideas_armor.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class ClawIdeasItemShovel extends ItemSpade
{
	public ClawIdeasItemShovel(String unlocalizedName, ToolMaterial toolMaterial)
	{
		super(toolMaterial);

		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabTools);
	}
}
