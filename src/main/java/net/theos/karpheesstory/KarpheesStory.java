package net.theos.karpheesstory;

import net.fabricmc.api.ModInitializer;

import net.theos.karpheesstory.block.ModBlocks;
import net.theos.karpheesstory.item.ModItemGroups;
import net.theos.karpheesstory.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KarpheesStory implements ModInitializer {
	public static final String MOD_ID = "karpheesstory";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}