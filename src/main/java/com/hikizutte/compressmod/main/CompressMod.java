package com.hikizutte.compressmod.main;

import java.util.Collection;

import com.hikizutte.compressmod.regi.CompressModTab;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod("compressmod")
public class CompressMod {
	public static final String MOD_ID = "compressmod";
	
	public static final ItemGroup COMPRESSMOD_TAB = new CompressModTab();
	
	public CompressMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        Blocks.register(modEventBus);
        Items.register(modEventBus);
        modEventBus.addListener(this::registerProviders);
    }
	
	private void registerProviders(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        if (event.includeClient()) {
            gen.addProvider(new CompressModBlockStateProvider(gen, MOD_ID, event.getExistingFileHelper()));
            gen.addProvider(new CompressModItemModelProvider(gen, MOD_ID, event.getExistingFileHelper()));
            gen.addProvider(new CompressModEnUsLanguageProvider(gen, MOD_ID));
            gen.addProvider(new CompressModJaJpLanguageProvider(gen, MOD_ID));
        }
        if (event.includeServer()) {
            gen.addProvider(new CompressModRecipeProvider(gen));
            gen.addProvider(new CompressModLootTableProvider(gen));
        }
    }
	
	public static class Blocks {
        private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
        public static final RegistryObject<Block> COMPRESSED_BLOCK = BLOCKS.register("compressed_block", () -> new Block(AbstractBlock.Properties
                .of(Material.METAL, MaterialColor.METAL)
                .requiresCorrectToolForDrops()
                .strength(5.0F, 6.0F)
                .sound(SoundType.METAL)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(1)
        ));

        public static void register(IEventBus eventBus) {
            BLOCKS.register(eventBus);
        }

        public static Collection<RegistryObject<Block>> getEntries() {
            return BLOCKS.getEntries();
        }
    }
	
	 public static class Items {
	        private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
	        public static final RegistryObject<Item> COMPRESSED_BLOCK = ITEMS.register("compressed_block", () -> new BlockItem(Blocks.COMPRESSED_BLOCK.get(), new Item.Properties()
	                .tab(ItemGroup.TAB_BUILDING_BLOCKS)));
	        public static final RegistryObject<Item> COMPRESSED_INGOT = ITEMS.register("compressed_ingot", () -> new Item(new Item.Properties()
	                .tab(ItemGroup.TAB_MATERIALS)));

	        public static void register(IEventBus eventBus) {
	            ITEMS.register(eventBus);
	        }
	    }
	
}