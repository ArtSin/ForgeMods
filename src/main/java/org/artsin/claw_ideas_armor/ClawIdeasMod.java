package org.artsin.claw_ideas_armor;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.artsin.claw_ideas_armor.proxy.ClawIdeasCommonProxy;

@Mod(modid = "clawideas_artsin", name = "Claw's Armor Ideas Mod - made by ArtSin", version = "0.7")
public class ClawIdeasMod
{
	@Mod.Instance("clawideas_artsin")
	public static ClawIdeasMod instance;
	
	@SidedProxy(clientSide = "org.artsin.claw_ideas_armor.proxy.ClawIdeasClientProxy",
				serverSide = "org.artsin.claw_ideas_armor.proxy.ClawIdeasServerProxy")
	public static ClawIdeasCommonProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e)
	{
		proxy.preInit(e);
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent e)
	{
		proxy.init(e);
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e)
	{
		proxy.postInit(e);
	}
}
