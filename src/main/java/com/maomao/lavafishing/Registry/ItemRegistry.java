package com.maomao.lavafishing.Registry;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.LinkedHashMap;
import java.util.Map;

import static com.maomao.lavafishing.LavaFishingMod.MODID;
@SuppressWarnings("unused")
public interface ItemRegistry {
	Map<Identifier, Item> ITEMS = new LinkedHashMap<>();
	Item QUARTZ_FISH = register("quartz_fish", new Item(new Item.Settings()));
	Item FLAME_SQUAT_LOBSTER = register("flame_squat_lobster", new Item(new Item.Settings()));
	Item OBSIDIAN_SWORD_FISH = register("obsidian_sword_fish", new Item(new Item.Settings()));
	Item STEAM_FLYING_FISH = register("steam_flying_fish", new Item(new Item.Settings()));
	Item AROEANA_FISH = register("arowana_fish", new Item(new Item.Settings()));
	Item AGNI_FISH = register("agni_fish", new Item(new Item.Settings()));
	Item OBSIDIAN_FISHING_ROD = register("obsidian_fishing_rod", new Item(new Item.Settings()));
	static <T extends Item> T register(String id, T item) {
		ITEMS.put(new Identifier(MODID, id), item);
		return item;
	}
	static void init() {
		ITEMS.forEach((id, item) -> Registry.register(Registries.ITEM, id, item));
	}
}

