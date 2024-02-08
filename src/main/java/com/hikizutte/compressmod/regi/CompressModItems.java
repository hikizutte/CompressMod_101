package com.hikizutte.compressmod.regi;

import com.hikizutte.compressmod.item.ItemColdFrenchFries;
import com.hikizutte.compressmod.item.ItemCompressedCobblestoneIngot;
import com.hikizutte.compressmod.item.ItemFreshlyFrenchFries;
import com.hikizutte.compressmod.item.ItemPotatoStick;
import com.hikizutte.compressmod.item.ItemReinforcedDiamond;
import com.hikizutte.compressmod.item.ItemReinforcedGoldIngot;
import com.hikizutte.compressmod.item.ItemReinforcedIronIngot;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;


@ObjectHolder("compressmod")
public class CompressModItems {
	
	public static final ItemFreshlyFrenchFries FRESHLY_FRENCH_FRIES = new ItemFreshlyFrenchFries();
	public static final ItemReinforcedIronIngot REINFORCED_IRON_INGOT = new ItemReinforcedIronIngot();
	public static final ItemReinforcedGoldIngot REINFORCED_GOLD_INGOT = new ItemReinforcedGoldIngot();
	public static final ItemReinforcedDiamond REINFORCED_DIAMOND = new ItemReinforcedDiamond();


	@Mod.EventBusSubscriber(modid = "compressmod", bus = Bus.MOD)
	public static class Register{
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {
			
			final Item[] item = {
					new ItemCompressedCobblestoneIngot(),
					new ItemFreshlyFrenchFries(),
					new ItemColdFrenchFries(),
					new ItemPotatoStick(),
					REINFORCED_IRON_INGOT,
					REINFORCED_GOLD_INGOT,
					REINFORCED_DIAMOND
					
			};
			
			event.getRegistry().registerAll(item);
			
			
		}
	}
	
}
