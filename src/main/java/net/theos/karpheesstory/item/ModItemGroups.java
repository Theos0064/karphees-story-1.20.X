package net.theos.karpheesstory.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.theos.karpheesstory.KarpheesStory;
import net.theos.karpheesstory.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup KARPHEE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(KarpheesStory.MOD_ID, "karphee"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.karphee"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);

                        entries.add(ModItems.PAINITE_SHARD);
                        entries.add(ModItems.CHARGED_NETHERITE);

                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RAW_RUBY_BLOCK);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);


                    }).build());

    public static void registerItemGroups() {
        KarpheesStory.LOGGER.info("Registering Item Groups for " + KarpheesStory.MOD_ID);
    }
}
