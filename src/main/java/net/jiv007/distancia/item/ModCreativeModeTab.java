package net.jiv007.distancia.item;

import net.jiv007.distancia.block.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab DISTANCIA_TAB = new CreativeModeTab("distanciatab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.FARSTEEL_BULKHEAD.get());
        }
    };
}
