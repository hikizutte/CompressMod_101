package com.hikizutte.compressmod.main;

import java.util.function.Consumer;

import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.data.ShapelessRecipeBuilder;

@ParametersAreNonnullByDefault
public class CompressModRecipeProvider extends RecipeProvider {
    public CompressModRecipeProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(CompressMod.Blocks.COMPRESSED_BLOCK.get())
                .define('#', CompressMod.Items.COMPRESSED_INGOT.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_Compress_ingot", has(CompressMod.Items.COMPRESSED_INGOT.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(CompressMod.Items.COMPRESSED_INGOT.get(), 9)
                .requires(CompressMod.Blocks.COMPRESSED_BLOCK.get())
                .group("Compressed_ingot")
                .unlockedBy("has_Compressed_block", has(CompressMod.Blocks.COMPRESSED_BLOCK.get()))
                .save(consumer, "Compressmod:Compressed_ingot_from_Compressed_block");
    }
}