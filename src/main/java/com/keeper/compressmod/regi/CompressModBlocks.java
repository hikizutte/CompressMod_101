package com.keeper.compressmod.regi;

import com.google.common.base.Preconditions;
import com.keeper.compressmod.block.BlockCompressedCobblestone;
import com.keeper.compressmod.main.CompressMod;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder("compressmod")
public class CompressModBlocks {
	
	public static final BlockCompressedCobblestone COMPRESSED_COBBLESTONE = null;

	@Mod.EventBusSubscriber(modid = "compressmod", bus = Bus.MOD)
	public static class Register{
		
		@SubscribeEvent
		public static void registerBlock(final RegistryEvent.Register<Block> event) {
			
			final Block[] blocks = {
					new BlockCompressedCobblestone()
					
					
			};
			event.getRegistry().registerAll(blocks);
			
		}
		
		@SubscribeEvent
		public static void registerBlockItem(final RegistryEvent.Register<Item> event) {
			
			final BlockItem[] items = {
					
					new BlockItem(COMPRESSED_COBBLESTONE,new Item.Properties().tab(CompressMod.COMPRESSMOD_TAB))
					
					
			};
			for(BlockItem item : items) {
				final Block block = item.getBlock();
				final ResourceLocation location = Preconditions.checkNotNull(block.getRegistryName(),"レジストリネームがない");
				event.getRegistry().register(item.setRegistryName(location));
			}
			
			
		}
	}
	
}
