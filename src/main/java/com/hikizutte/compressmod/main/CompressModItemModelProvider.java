package com.hikizutte.compressmod.main;

import java.util.Objects;

import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class CompressModItemModelProvider extends ItemModelProvider {
    public CompressModItemModelProvider(DataGenerator gen, String modId, ExistingFileHelper existingFileHelper) {
        super(gen, modId, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(CompressMod.Items.COMPRESSED_INGOT.get());
    }

    private void simpleItem(Item item) {
        ResourceLocation name = Objects.requireNonNull(item.getRegistryName());
        singleTexture(name.getPath(), mcLoc(folder + "/generated"), "layer0", new ResourceLocation(name.getNamespace(), folder + "/" + name.getPath()));
    }
}