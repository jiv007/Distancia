package net.jiv007.distancia.block;

import net.jiv007.distancia.distancia;
import net.jiv007.distancia.item.ModCreativeModeTab;
import net.jiv007.distancia.item.ModItems;
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
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries. BLOCKS, distancia.MOD_ID);

    public static final RegistryObject<Block> FARSTEEL_BULKHEAD = registerBlock("farsteel_bulkhead",
            () -> new Block(BlockBehaviour.Properties
                    .of(Material.METAL) // Metal Material
                    .strength(240.0f, 2400.0f) // break time of two minutes regardless of tool
                    .lightLevel(state -> 3) // gives off a low light.
            ),
            ModCreativeModeTab.DISTANCIA_TAB
    );


    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
