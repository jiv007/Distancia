package net.jiv007.distancia.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab DISTANCIA_TAB = new CreativeModeTab("distanciatab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RUINED_FARSTEEL.get());
        }
    };
}
