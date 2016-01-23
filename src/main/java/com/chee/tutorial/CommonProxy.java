package com.chee.tutorial;

import com.chee.tutorial.blocks.ModBlocks;
import com.chee.tutorial.crafting.ModCrafting;
import com.chee.tutorial.items.ModItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

  public void preInit(FMLPreInitializationEvent e) {
    ModItems.createItems();
    ModBlocks.createBlocks();

  }

  public void init(FMLInitializationEvent e) {
    ModCrafting.initCrafting();

  }

  public void postInit(FMLPostInitializationEvent e) {

  }
}