package com.keeper.compressmod.item;

import java.util.List;

import com.keeper.compressmod.main.CompressMod;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;


public class ItemPotatoStick extends Item{
	
	@SuppressWarnings("deprecation")
	public ItemPotatoStick() {
		
		super(new Properties().tab(CompressMod.COMPRESSMOD_TAB)
				.food(new Food.Builder()
						.nutrition(6)
						.saturationMod(6)
						.effect(new EffectInstance(Effects.HEALTH_BOOST,1200,2), 1F)
						.build()));
		this.setRegistryName("potato_stick");
	}
	
	@Override
	public void appendHoverText(ItemStack stackIn, World worldIn, List<ITextComponent> toolTip, ITooltipFlag flagIn) {
	      toolTip.add(new TranslationTextComponent(this.getDescriptionId() + ".desc").withStyle(TextFormatting.GRAY));
	}
}