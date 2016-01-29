package com.chee.tutorial.items;

import net.minecraft.item.ItemSpade;

/**
 * Created by JohnPaulChambers on 29/01/2016.
 */
public class ItemModSpade extends ItemSpade {

    public ItemModSpade(String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
    }
}
