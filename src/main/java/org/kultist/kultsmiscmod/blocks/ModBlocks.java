package org.kultist.kultsmiscmod.blocks;


import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import org.kultist.kultsmiscmod.KultsMiscMod;

public class ModBlocks {

    public static final Block TAN_COBBLESTONE = registerBlock("tan_cobblestone",
            new Block(AbstractBlock.Settings.create()
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)
                    .mapColor(MapColor.DULL_RED)
            ));

    public static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(KultsMiscMod.MOD_ID, name), block);
    }

    public static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(KultsMiscMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
    KultsMiscMod.LOGGER.info("Registering Blocks for KMM");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries ->
                entries.add(ModBlocks.TAN_COBBLESTONE ));
    }

}
