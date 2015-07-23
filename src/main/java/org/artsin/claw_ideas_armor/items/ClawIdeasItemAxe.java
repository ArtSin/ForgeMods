package org.artsin.claw_ideas_armor.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ClawIdeasItemAxe extends ItemAxe
{
	public ClawIdeasItemAxe(String unlocalizedName, ToolMaterial toolMaterial)
	{
		super(toolMaterial);

		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabTools);
	}
}
