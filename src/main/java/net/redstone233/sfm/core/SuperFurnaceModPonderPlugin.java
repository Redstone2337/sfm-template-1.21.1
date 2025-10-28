package net.redstone233.sfm.core;

import net.createmod.ponder.api.registration.PonderPlugin;
import net.createmod.ponder.api.registration.PonderSceneRegistrationHelper;
import net.createmod.ponder.api.registration.PonderTagRegistrationHelper;
import net.minecraft.resources.ResourceLocation;
import net.redstone233.sfm.SuperFurnaceMod;
import net.redstone233.sfm.core.mod.SuperFurnaceRegistration;
import net.redstone233.sfm.ponder.tags.ModPonderTags;
import org.jetbrains.annotations.NotNull;

public class SuperFurnaceModPonderPlugin implements PonderPlugin {
    @Override
    public @NotNull String getModId() {
        return SuperFurnaceMod.MOD_ID;
    }

    @Override
    public void registerScenes(@NotNull PonderSceneRegistrationHelper<ResourceLocation> helper) {
        SuperFurnaceRegistration.registerAll(helper);
    }

    @Override
    public void registerTags(@NotNull PonderTagRegistrationHelper<ResourceLocation> helper) {
        ModPonderTags.register(helper);
    }
}
