package com.keeper.compressmod.regi;

import com.keeper.compressmod.item.*;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;


@ObjectHolder("compressmod")
public class CompressModItems {

	@Mod.EventBusSubscriber(modid = "compressmod", bus = Bus.MOD)
	public static class Register{
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {
			
			final Item[] item = {
					new ItemCompressedCobblestoneIngot(),
					new ItemFrenchFries(),
					new ItemPotatoStick()
					
			};
			
			event.getRegistry().registerAll(item);
			
			
		}
	}
	
}
