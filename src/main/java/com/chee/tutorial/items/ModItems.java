package com.chee.tutorial.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Copyright 2016 WANdisco.
 */
public class ModItems {

  public static Item tutorialItem;
  public static Item.ToolMaterial TUTORIAL = EnumHelper.addToolMaterial("TUTORIAL", 3, 1000, 15.0F, 4.0F, 30);
  public static ItemArmor.ArmorMaterial TUTORIALA = EnumHelper.addArmorMaterial("TUTORIALA", "tutorial:tutorial", 16, new int[] {3, 8, 6, 3}, 30);
  public static ItemModSword tutorialSword;
  public static ItemModPickaxe tutorialPickaxe;
  public static ItemModAxe tutorialAxe;
  public static ItemModSpade tutorialSpade;
  public static ItemModHoe tutorialHoe;
  public static ItemModMultitool tutorialMultitool;

  public static void createItems() {
    GameRegistry.registerItem(tutorialItem = new BasicItem("tutorial_item"), "tutorial_item");
    GameRegistry.registerItem(tutorialPickaxe = new ItemModPickaxe("tutorial_pickaxe", TUTORIAL), "tutorial_pickaxe");
    GameRegistry.registerItem(tutorialAxe = new ItemModAxe("tutorial_axe", TUTORIAL), "tutorial_axe");
    GameRegistry.registerItem(tutorialSpade = new ItemModSpade("tutorial_spade", TUTORIAL), "tutorial_spade");
    GameRegistry.registerItem(tutorialHoe = new ItemModHoe("tutorial_hoe", TUTORIAL), "tutorial_hoe");
    GameRegistry.registerItem(tutorialSword = new ItemModSword("tutorial_sword", TUTORIAL), "tutorial_sword");
    GameRegistry.registerItem(tutorialMultitool = new ItemModMultitool("tutorial_multitool", TUTORIAL), "tutorial_multitool");
  }

}
