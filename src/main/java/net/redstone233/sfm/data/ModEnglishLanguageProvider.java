package net.redstone233.sfm.data;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.redstone233.sfm.SuperFurnaceMod;

public class ModEnglishLanguageProvider extends LanguageProvider {
    public ModEnglishLanguageProvider(PackOutput output) {
        super(output, SuperFurnaceMod.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        // Super Furnace - 使用正确的键名格式
        add("sfm.ponder.super_furnace.header", "Super Furnace Construction Guide");
        add("sfm.ponder.super_furnace.text_1", "Super Furnace, A special structure that greatly improves smelting efficiency");
        add("sfm.ponder.super_furnace.text_2", "Build Layer 1, 3x3 stone base");
        add("sfm.ponder.super_furnace.text_3", "Build Layer 2, Note the center position");
        add("sfm.ponder.super_furnace.text_4", "Place a furnace in the center");
        add("sfm.ponder.super_furnace.text_5", "Build Layer 3, 3x3 stone top cover");
        add("sfm.ponder.super_furnace.text_6", "Done! The Super Furnace significantly boosts smelting speed");

        // Super Blast Furnace - 使用正确的键名格式
        add("sfm.ponder.super_blast_furnace.header", "Super Blast Furnace Construction Guide");
        add("sfm.ponder.super_blast_furnace.text_1", "Super Blast Furnace, A special structure for highly efficient ore smelting");
        add("sfm.ponder.super_blast_furnace.text_2", "Layer 1, 3x3 smooth stone base");
        add("sfm.ponder.super_blast_furnace.text_3", "Layer 2, Surround the blast furnace with iron blocks");
        add("sfm.ponder.super_blast_furnace.text_4", "Place a blast furnace in the center");
        add("sfm.ponder.super_blast_furnace.text_5", "Layer 3, 3x3 block of iron top cover");
        add("sfm.ponder.super_blast_furnace.text_6", "Compared to a regular blast furnace, the Super Blast Furnace is far more efficient");

        // Super Smoker - 使用正确的键名格式
        add("sfm.ponder.super_smoker.header", "Super Smoker Construction Guide");
        add("sfm.ponder.super_smoker.text_1", "Super Smoker, A special structure for quickly smoking food");
        add("sfm.ponder.super_smoker.text_2", "Layer 1, Alternate coal blocks and logs in a cross pattern");
        add("sfm.ponder.super_smoker.text_3", "Layer 2, Keep the cross pattern, place a smoker in the center");
        add("sfm.ponder.super_smoker.text_4", "Place a smoker in the center");
        add("sfm.ponder.super_smoker.text_5", "Layer 3, Mirror Layer 1 exactly");
        add("sfm.ponder.super_smoker.text_6", "Done! The Super Smoker greatly increases food smoking speed");

        // New category tags - 使用正确的键名格式
        add("sfm.ponder.tag.super_furnace", "Super Furnace");
        add("sfm.ponder.tag.super_blast_furnace", "Super Blast Furnace");
        add("sfm.ponder.tag.super_smoker", "Super Smoker");
        add("sfm.ponder.tag.furnaces", "Furnaces");
        add("sfm.ponder.tag.furnaces.description", "Construction guides for high-efficiency smelting setups");

        
        add("itemGroup.sfm", "Example Mod Tab");
        add("block.sfm.example_block", "Example Block");
        add("item.sfm.example_item", "Example Item");

        add("sfm.configuration.title", "Super Furnace Mod Configs");
        add("sfm.configuration.section.sfm.common.toml", "Super Furnace Mod Configs");
        add("sfm.configuration.section.sfm.common.toml.title", "Super Furnace Mod Configs");
        add("sfm.configuration.section.sfm.common.toml.description", "Configuration for Super Furnace Mod");
        add("sfm.configuration.logDirtBlock", "Log Dirt Block");
        add("sfm.configuration.magicNumberIntroduction", "Magic Number Text");
        add("sfm.configuration.magicNumber", "Magic Number");
    }
}
