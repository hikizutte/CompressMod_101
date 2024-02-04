package com.hikizutte.compressmod.regi;

import com.google.common.base.Preconditions;
import com.hikizutte.compressmod.block.BlockBulletproofGlass;
import com.hikizutte.compressmod.block.BlockCompressedCobblestone;
import com.hikizutte.compressmod.block.BlockCompressedGoldBlock;
import com.hikizutte.compressmod.block.BlockCompressedIronBlock;
import com.hikizutte.compressmod.main.CompressMod;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
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
	public static final BlockBulletproofGlass BULLETPROOF_GLASS = null;
	public static final BlockCompressedIronBlock COMPRESSED_Iron_Block = null;
	public static final BlockCompressedGoldBlock COMPRESSED_Gold_Block = null;

	@Mod.EventBusSubscriber(modid = "compressmod", bus = Bus.MOD)
	public static class Register{
		
		@SubscribeEvent
		public static void registerBlock(final RegistryEvent.Register<Block> event) {
			
			final Block[] blocks = {
					new BlockCompressedCobblestone(),
					new BlockBulletproofGlass(),
					new BlockCompressedIronBlock(),
					new BlockCompressedGoldBlock()
					
					
			};
			event.getRegistry().registerAll(blocks);
			
			for(Block block : blocks) {
				if (block instanceof BlockBulletproofGlass) {
					RenderTypeLookup.setRenderLayer(block, RenderType.translucent());
					//RenderTypeLookup.setRenderLayer(block, RenderType.cutout());
					//RenderTypeLookup.setRenderLayer(block, RenderType.cutoutMipped());
				}
			}
			
		}
		
		@SubscribeEvent
		public static void registerBlockItem(final RegistryEvent.Register<Item> event) {
			
			final BlockItem[] items = {
					
					new BlockItem(COMPRESSED_COBBLESTONE,new Item.Properties().tab(CompressMod.COMPRESSMOD_TAB)),
					new BlockItem(BULLETPROOF_GLASS,new Item.Properties().tab(CompressMod.COMPRESSMOD_TAB)),
					new BlockItem(COMPRESSED_Iron_Block, new Item.Properties().tab(CompressMod.COMPRESSMOD_TAB)),
					new BlockItem(COMPRESSED_Gold_Block, new Item.Properties().tab(CompressMod.COMPRESSMOD_TAB)),
					
			};
			for(BlockItem item : items) {
				final Block block = item.getBlock();
				final ResourceLocation location = Preconditions.checkNotNull(block.getRegistryName(),"レジストリネームがない");
				event.getRegistry().register(item.setRegistryName(location));
			}
			
			
		}
	}
	
}

