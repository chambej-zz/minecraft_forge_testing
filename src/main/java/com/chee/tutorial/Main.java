package com.chee.tutorial;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Copyright 2016 WANdisco.
 */
@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {

  public static final String MODID = "tutorial";
  public static final String MODNAME = "Chee Tutorial Mod";
  public static final String VERSION = "1.0.0";

  @SidedProxy(clientSide = "com.chee.tutorial.ClientProxy", serverSide = "com.chee.tutorial.ServerProxy")
  public static CommonProxy proxy;

  @Mod.Instance
  public static Main instance = new Main();

  @Mod.EventHandler
  public void preInit(FMLPreInitializationEvent e) {
    this.proxy.preInit(e);
  }

  @Mod.EventHandler
  public void init(FMLInitializationEvent e) {
    this.proxy.init(e);
  }

  @Mod.EventHandler
  public void postInit(FMLPostInitializationEvent e) {
    this.proxy.postInit(e);
  }
}