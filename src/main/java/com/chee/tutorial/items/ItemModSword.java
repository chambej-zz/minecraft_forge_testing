package com.chee.tutorial.items;

import net.minecraft.item.ItemSword;

/**
 * Created by JohnPaulChambers on 29/01/2016.
 */
public class ItemModSword extends ItemSword {

    public ItemModSword(String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
    }
}
