package net.redstone233.sfm.core.mod;

import net.createmod.ponder.api.registration.PonderSceneRegistrationHelper;
import net.minecraft.resources.ResourceLocation;
import net.redstone233.sfm.SuperFurnaceMod;
import net.redstone233.sfm.ponder.SuperBlastFurnaceScene;
import net.redstone233.sfm.ponder.SuperFurnaceScene;
import net.redstone233.sfm.ponder.SuperSmokerScene;


public class SuperFurnaceRegistration {

    public static void registerAll(PonderSceneRegistrationHelper<ResourceLocation> helper) {
        // 注册超级熔炉场景
        helper.addStoryBoard(
                ResourceLocation.withDefaultNamespace("furnace"),
                "super_furnace/super_furnace_structure",
                SuperFurnaceScene::superFurnace
        ).highlightAllTags();

        // 注册超级高炉场景
        helper.addStoryBoard(
                ResourceLocation.withDefaultNamespace("blast_furnace"),
                "super_blast_furnace/super_blast_furnace_structure",
                SuperBlastFurnaceScene::superBlastFurnace
        ).highlightAllTags();

        // 注册超级烟熏炉场景
        helper.addStoryBoard(
                ResourceLocation.withDefaultNamespace("smoker"),
                "super_smoker/super_smoker_structure",
                SuperSmokerScene::superSmoker
        ).highlightAllTags();
    }

    public static void init() {
        SuperFurnaceMod.LOGGER.info("Registering SuperFurnace Ponder Scenes");
    }
}