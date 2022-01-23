package com.comet.stuff.block;

import com.comet.stuff.StuffMod;
import com.comet.stuff.item.ModCreativeModeTab;
import com.comet.stuff.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> Blocks =
            DeferredRegister.create(ForgeRegistries.BLOCKS, StuffMod.MOD_ID);


    public static final RegistryObject<Block> Citrine_Block = registerBlock("citrine_block", () -> new Block(BlockBehaviour.Properties
            .of(Material.METAL)
            .strength(9f)
            .requiresCorrectToolForDrops()
    ),
            ModCreativeModeTab.Stuff_Tab
    );
    public static final RegistryObject<Block> Citrine_Ore_Block = registerBlock("citrine_ore", () -> new Block(BlockBehaviour.Properties
                    .of(Material.METAL)
                    .strength(9f)
                    .requiresCorrectToolForDrops()
            ),
            ModCreativeModeTab.Stuff_Tab
    );
    public static final RegistryObject<Block> DeepSlate_Citrine_Ore_Block = registerBlock("deepslate_citrine_ore", () -> new Block(BlockBehaviour.Properties
                    .of(Material.METAL)
                    .strength(9f)
                    .requiresCorrectToolForDrops()
            ),
            ModCreativeModeTab.Stuff_Tab
    );
    public static final RegistryObject<Block> EndStone_Citrine_Ore_Block = registerBlock("endstone_citrine_ore", () -> new Block(BlockBehaviour.Properties
                    .of(Material.METAL)
                    .strength(9f)
                    .requiresCorrectToolForDrops()
            ),
            ModCreativeModeTab.Stuff_Tab
    );
    public static final RegistryObject<Block> NetherRack_Citrine_Ore_Block = registerBlock("netherrack_citrine_ore", () -> new Block(BlockBehaviour.Properties
                    .of(Material.METAL)
                    .strength(9f)
                    .requiresCorrectToolForDrops()
            ),
            ModCreativeModeTab.Stuff_Tab
    );
    public static final RegistryObject<Block> Raw_Citrine_Block = registerBlock("raw_citrine_block", () -> new Block(BlockBehaviour.Properties
                    .of(Material.METAL)
                    .strength(9f)
                    .requiresCorrectToolForDrops()
            ),
            ModCreativeModeTab.Stuff_Tab
    );


    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> Block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(Block.get(),
                new Item.Properties().tab(tab)));
    }
    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> Block, CreativeModeTab tab){
        RegistryObject<T> toReturn = Blocks.register(name, Block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }


    public static void register(IEventBus eventBus){
        Blocks.register(eventBus);
    }
}
