package org.artsin.claw_ideas_armor.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemArmor;

public class ClawIdeasItemArmor extends ItemArmor
{
	public ClawIdeasItemArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType)
	{
		super(material, renderIndex, armorType);

		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
}
