package com.hikizutte.compressmod.item.tool;

import com.hikizutte.compressmod.main.CompressMod;

import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class ItemReinforcedSword extends SwordItem {

	
	public ItemReinforcedSword(IItemTier tier, int attackDamage, float speed, Properties builderIn) {
		// TODO 自動生成されたコンストラクター・スタブ
		super(CompressTierList.REINFORCED, 3, -2.4F, new Properties()
				.tab(CompressMod.COMPRESSMOD_TAB)
				.rarity(Rarity.UNCOMMON)
				.fireResistant()
				
				);
		
		this.setRegistryName("reinforced_sword");
	}


	
	@Override
	public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
		attacker.addEffect(new EffectInstance(Effects.REGENERATION,2,6));
		stack.hurtAndBreak(1, attacker, (entity) -> {
			entity.broadcastBreakEvent(EquipmentSlotType.MAINHAND);
	      });
	      return true;
	   }
	

}
