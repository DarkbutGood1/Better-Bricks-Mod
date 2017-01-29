package com.Dark_but_Good.BetterBricksMod;

import com.Dark_but_Good.BetterBricksMod.proxy.CommonProxy;

import init.ModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class BetterBricksMod {

	@Instance
	public static BetterBricksMod instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preIntit(FMLPreInitializationEvent event)
	{
		ModItems.inti();
		ModItems.register();
	}
	@EventHandler
	public void Intit(FMLInitializationEvent event)
	{
		proxy.init();
	}
	
	@EventHandler
	public void PostIntit(FMLPostInitializationEvent event)
	{
		
	}
	
}
