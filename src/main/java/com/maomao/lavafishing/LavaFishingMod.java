package com.maomao.lavafishing;

//import com.maomao.lavafishing.items.ObsidianFishingRod;
import com.maomao.lavafishing.Registry.ItemRegistry;
import com.maomao.lavafishing.effects.EndlessFlameEffect;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import com.maomao.lavafishing.Registry.ItemRegistry;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class LavaFishingMod implements ModInitializer {
	public static String MODID = "lava_fishing";
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	public static final ItemGroup LAVA_FISHING = FabricItemGroup.builder(new Identifier(MODID, "lava_fishing"))
			.icon(() -> new ItemStack(ItemRegistry.OBSIDIAN_FISHING_ROD))
			.entries((enabledFeatures, ItemStackCollector, TOP) -> {
				ItemStackCollector.addItem(ItemRegistry.QUARTZ_FISH);
				ItemStackCollector.addItem(ItemRegistry.FLAME_SQUAT_LOBSTER);
				ItemStackCollector.addItem(ItemRegistry.OBSIDIAN_SWORD_FISH);
				ItemStackCollector.addItem(ItemRegistry.STEAM_FLYING_FISH);
				ItemStackCollector.addItem(ItemRegistry.AROEANA_FISH);
				ItemStackCollector.addItem(ItemRegistry.AGNI_FISH);
				ItemStackCollector.addItem(ItemRegistry.OBSIDIAN_FISHING_ROD);
	}).build();
	@Override
	public void onInitialize(ModContainer mod) {
		ItemRegistry.init();
	}
}
