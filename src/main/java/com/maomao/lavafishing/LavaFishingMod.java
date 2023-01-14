package com.maomao.lavafishing;

//import com.maomao.lavafishing.items.ObsidianFishingRod;
import com.maomao.lavafishing.Registry.ItemRegistry;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class LavaFishingMod implements ModInitializer {
	public static String MODID = "lava_fishing";
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	public static final ItemGroup.Builder LAVA_FISHING = ItemGroup.builder(ItemGroup.Location.BOTTOM, 0).name(Text.translatable("itemGroup.lava_fishing")).icon(() -> {
			return new ItemStack(Items.FISHING_ROD);})
			.entries((featureFlagBitSet, collector, bl) -> {
					collector.addItem(Items.WOODEN_SHOVEL);
			});
	@Override
	public void onInitialize(ModContainer mod) {
		ItemRegistry.init();
	}
}
