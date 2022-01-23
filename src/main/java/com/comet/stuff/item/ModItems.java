package com.comet.stuff.item;

import com.comet.stuff.StuffMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, StuffMod.MOD_ID);


    public static final RegistryObject<Item> Citrine = ITEMS.register("citrine",
            ()-> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.Stuff_Tab)
            ));
    public static final RegistryObject<Item> Raw_Citrine = ITEMS.register("raw_citrine",
            ()-> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.Stuff_Tab)
            ));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
