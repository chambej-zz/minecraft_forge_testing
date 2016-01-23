package com.chee.tutorial;

import com.chee.tutorial.client.render.blocks.BlockRenderRegister;
import com.chee.tutorial.client.render.items.ItemRenderRegister;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Copyright 2016 WANdisco.
 */
public class ClientProxy extends CommonProxy {

  @Override
  public void preInit(FMLPreInitializationEvent e) {
    super.preInit(e);
  }

  @Override
  public void init(FMLInitializationEvent e) {
    super.init(e);

    ItemRenderRegister.registerItemRenderer();
    BlockRenderRegister.registerBlockRenderer();
  }

  @Override
  public void postInit(FMLPostInitializationEvent e) {
    super.postInit(e);
  }
}
