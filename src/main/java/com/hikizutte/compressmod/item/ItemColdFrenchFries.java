package com.hikizutte.compressmod.item;

import java.util.List;

import javax.annotation.Nullable;

import com.hikizutte.compressmod.main.CompressMod;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;


public class ItemColdFrenchFries extends Item{
	
	public ItemColdFrenchFries() {
		
		super(new Properties().tab(CompressMod.COMPRESSMOD_TAB)
				.food(new Food.Builder()
						.nutrition(6)
						.saturationMod(6)
						.build())
				.rarity(Rarity.COMMON)
				);
		this.setRegistryName("cold_french_fries");
	}
	
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		
	      tooltip.add(new TranslationTextComponent(this.getDescriptionId() + ".desc").withStyle(TextFormatting.GRAY));
	      
	}
}