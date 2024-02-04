package com.hikizutte.compressmod.main;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class CompressModEnUsLanguageProvider extends LanguageProvider {
    public CompressModEnUsLanguageProvider(DataGenerator gen, String modId) {
        super(gen, modId, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(CompressMod.Blocks.COMPRESSED_BLOCK.get(), "Block of Titanium");
        add(CompressMod.Items.COMPRESSED_INGOT.get(), "Titanium Ingot");
    }
}