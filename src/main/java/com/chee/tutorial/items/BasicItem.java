package com.chee.tutorial.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Copyright 2016 WANdisco.
 */
public class BasicItem extends Item {

  public BasicItem(String unlocalizedName) {
    super();

    this.setUnlocalizedName(unlocalizedName);
    this.setCreativeTab(CreativeTabs.tabMaterials);
  }
}
