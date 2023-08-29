package net.theos.karpheesstory.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.theos.karpheesstory.KarpheesStory;


public class ModItems {

    public static  final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    //pour ajouter un item, il faut juste dupliquer la ligne d'au dessus puis modifier la var et le nom de l'item
    //il faut ensuite ajouter son nom dans le dossier de langue
    //On peut ensuite l'ajouter dans un groupe d'item (inventaire créatif)
    public static  final Item PAINITE_SHARD = registerItem("painite_shard", new Item(new FabricItemSettings()));
    public static  final Item CHARGED_NETHERITE = registerItem("charged_netherite", new Item(new FabricItemSettings()));


//    pour ajouter un item a un groupe déjà existant dans l'inventaire créatif
//    private static void addItemToIngredientTabItemGroup(FabricItemGroupEntries entries) {
//        entries.add(RUBY);
//    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(KarpheesStory.MOD_ID, name), item);
    }

    public static void registerModItems() {
        KarpheesStory.LOGGER.info("Registering Mod Items For " + KarpheesStory.MOD_ID);

//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToIngredientTabItemGroup);
    }
}
