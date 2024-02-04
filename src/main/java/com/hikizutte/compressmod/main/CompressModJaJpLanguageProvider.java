package com.hikizutte.compressmod.main;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class CompressModJaJpLanguageProvider extends LanguageProvider {
    public CompressModJaJpLanguageProvider(DataGenerator gen, String modId) {
        super(gen, modId, "ja_jp");
    }

    @Override
    protected void addTranslations() {
        add(CompressMod.Blocks.COMPRESSED_BLOCK.get(), "圧縮ブロック");
        add(CompressMod.Items.COMPRESSED_INGOT.get(), "圧縮インゴット");
    }
}