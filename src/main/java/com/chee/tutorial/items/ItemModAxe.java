package com.chee.tutorial.items;

import net.minecraft.item.ItemAxe;

/**
 * Created by JohnPaulChambers on 29/01/2016.
 */
public class ItemModAxe extends ItemAxe {

    public ItemModAxe(String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
    }
}
