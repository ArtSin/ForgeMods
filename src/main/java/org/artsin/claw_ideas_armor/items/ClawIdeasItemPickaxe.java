package org.artsin.claw_ideas_armor.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ClawIdeasItemPickaxe extends ItemPickaxe
{
	public ClawIdeasItemPickaxe(String unlocalizedName, ToolMaterial toolMaterial)
	{
		super(toolMaterial);

		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabTools);
	}
}
