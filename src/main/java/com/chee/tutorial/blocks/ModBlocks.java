package com.chee.tutorial.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Copyright 2016 WANdisco.
 */
public final class ModBlocks {

  public static Block tutorialBlock;
  public static Block propertyBlock;

  public static void createBlocks() {

    GameRegistry.registerBlock(tutorialBlock = new BasicBlock("tutorial_block").setLightLevel(1.0f), "tutorial_block");
    GameRegistry.registerBlock(propertyBlock = new BlockProperties("block_properties"), ItemBlockMeta.class, "block_properties");

  }

}
