package com.comet.stuff.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab Stuff_Tab = new CreativeModeTab("stufftab"){

        @Override public ItemStack makeIcon() {
            return new ItemStack(ModItems.Citrine.get());
        }
    };
}
