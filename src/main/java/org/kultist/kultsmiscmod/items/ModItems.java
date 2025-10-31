package org.kultist.kultsmiscmod.items;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import org.kultist.kultsmiscmod.KultsMiscMod;

public class ModItems {

    public static final Item RAW_AURITE = registerItem("raw_aurite",new Item(new Item.Settings().rarity(Rarity.RARE)));






private static Item registerItem(String name, Item item){
    return Registry.register(Registries.ITEM, Identifier.of(KultsMiscMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        KultsMiscMod.LOGGER.info("Registering items for KMM");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(RAW_AURITE);
        });
    }


}
