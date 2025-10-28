package net.redstone233.sfm;

import net.redstone233.sfm.core.mod.SuperFurnaceRegistration;
import net.redstone233.sfm.ponder.SuperBlastFurnaceScene;
import net.redstone233.sfm.ponder.SuperFurnaceScene;
import net.redstone233.sfm.ponder.SuperSmokerScene;
import net.redstone233.sfm.ponder.tags.ModPonderTags;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(SuperFurnaceMod.MOD_ID)
public class SuperFurnaceMod {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "sfm";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public SuperFurnaceMod(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);


        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (SuperFurnaceMod) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        // Some common setup code
        long startTime = System.currentTimeMillis();
        LOGGER.info("开始初始化模组内容...");
        LOGGER.info("HELLO FROM COMMON SETUP");

        if (Config.LOG_DIRT_BLOCK.getAsBoolean()) {
            LOGGER.info("DIRT BLOCK >> {}", BuiltInRegistries.BLOCK.getKey(Blocks.DIRT));
        }

        LOGGER.info("{}{}", Config.MAGIC_NUMBER_INTRODUCTION.get(), Config.MAGIC_NUMBER.getAsInt());

        Config.ITEM_STRINGS.get().forEach((item) -> LOGGER.info("ITEM >> {}", item));

        SuperFurnaceScene.init();
        LOGGER.info("超级熔炉思索初始化完成，耗时{}ms", System.currentTimeMillis() - startTime);

        SuperBlastFurnaceScene.init();
        LOGGER.info("超级高炉思索初始化完成，耗时{}ms", System.currentTimeMillis() - startTime);

        SuperSmokerScene.init();
        LOGGER.info("超级烟熏炉思索初始化完成，耗时{}ms", System.currentTimeMillis() - startTime);

        ModPonderTags.init();
        LOGGER.info("思索标签初始化完成，耗时{}ms", System.currentTimeMillis() - startTime);

        SuperFurnaceRegistration.init();
        LOGGER.info("超级熔炼系统注册初始化完成，耗时{}ms", System.currentTimeMillis() - startTime);

        LOGGER.info("模组初始化完成，总耗时{}ms", System.currentTimeMillis() - startTime);
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }
}
