package com.chee.tutorial.items;

import net.minecraft.item.ItemPickaxe;

/**
 * Created by JohnPaulChambers on 29/01/2016.
 */
public class ItemModPickaxe extends ItemPickaxe {

    public ItemModPickaxe(String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
    }
}
