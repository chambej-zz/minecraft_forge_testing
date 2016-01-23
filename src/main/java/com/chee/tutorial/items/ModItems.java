package com.chee.tutorial.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Copyright 2016 WANdisco.
 */
public class ModItems {

  public static Item tutorialItem;
  public static void createItems() {
    GameRegistry.registerItem(tutorialItem = new BasicItem("tutorial_item"), "tutorial_item");
  }

}
