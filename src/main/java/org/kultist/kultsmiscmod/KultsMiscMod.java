package org.kultist.kultsmiscmod;

import net.fabricmc.api.ModInitializer;
import org.kultist.kultsmiscmod.blocks.ModBlocks;
import org.kultist.kultsmiscmod.items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KultsMiscMod implements ModInitializer {
    public static final String MOD_ID = "kultsmiscmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();


    }
}
