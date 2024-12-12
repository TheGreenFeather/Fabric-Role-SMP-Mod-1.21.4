package io.github.thegreenfeather.rolesmp.item;

import io.github.thegreenfeather.rolesmp.RoleSMPMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    
    public static final Item DYNAMITE = registerItem("dynamite", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(RoleSMPMod.MOD_ID, name), item);
    }

    public static void registerModItems() {

        RoleSMPMod.LOGGER.info("Registering Mod Items for " + RoleSMPMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(DYNAMITE);
        });
    }
}
