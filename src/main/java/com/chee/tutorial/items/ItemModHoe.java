package com.chee.tutorial.items;

import net.minecraft.item.ItemHoe;

/**
 * Created by JohnPaulChambers on 29/01/2016.
 */
public class ItemModHoe extends ItemHoe {

    public ItemModHoe(String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
    }
}
