package net.redstone233.sfm.ponder.tags;

import net.createmod.ponder.api.registration.PonderTagRegistrationHelper;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.redstone233.sfm.SuperFurnaceMod;

public class ModPonderTags {
    public static void register(PonderTagRegistrationHelper<ResourceLocation> helper) {
        helper.registerTag(ResourceLocation.fromNamespaceAndPath(SuperFurnaceMod.MOD_ID,"furnace"))
                .addToIndex()
                .item(Blocks.FURNACE,true,false)
                .title("高速熔炼系列")
                .description("这里是一些熔炉的建造场景")
                .register();
        helper.addToTag(ResourceLocation.fromNamespaceAndPath(SuperFurnaceMod.MOD_ID,"furnace"))
                .add(ResourceLocation.withDefaultNamespace("furnace"))
                .add(ResourceLocation.withDefaultNamespace("stone"))
                .add(ResourceLocation.withDefaultNamespace("blast_furnace"))
                .add(ResourceLocation.withDefaultNamespace("smoker"))
                .add(ResourceLocation.withDefaultNamespace("smooth_stone"))
                .add(ResourceLocation.withDefaultNamespace("iron_block"))
                .add(ResourceLocation.withDefaultNamespace("oak_log"));
    }

    public static void init() {
        SuperFurnaceMod.LOGGER.info("Registering Ponder Tags");
    }
}
