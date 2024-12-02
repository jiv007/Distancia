package net.jiv007.distancia.item;

import net.jiv007.distancia.distancia;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, distancia.MOD_ID);

    public static final RegistryObject<Item> RUINED_FARSTEEL = ITEMS.register("ruined_farsteel",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DISTANCIA_TAB)));

    public static final RegistryObject<Item> FARCLAY_BALL = ITEMS.register("farclay_ball",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DISTANCIA_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
