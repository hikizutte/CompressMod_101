package com.hikizutte.compressmod.item.tool;

import java.util.function.Supplier;

import com.hikizutte.compressmod.regi.CompressModItems;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum CompressTierList implements IItemTier{
	
	REINFORCED(5, 2404, 12.0F, 6.0F, 30, () -> {
		return Ingredient.of(CompressModItems.REINFORCED_DIAMOND);
	});
	
	
	private final int uses, level, enchantmentValue;
	private final float speed, damage;
	private final LazyValue<Ingredient> repairIngredient;
	
	
	private CompressTierList(int p_i48458_3_, int p_i48458_4_, float p_i48458_5_, float p_i48458_6_, int p_i48458_7_, Supplier<Ingredient> p_i48458_8_) {
	      this.level = p_i48458_3_;
	      this.uses = p_i48458_4_;
	      this.speed = p_i48458_5_;
	      this.damage = p_i48458_6_;
	      this.enchantmentValue = p_i48458_7_;
	      this.repairIngredient = new LazyValue<>(p_i48458_8_);
	   }

		
	
	public int getUses() {
	      return this.uses;
	   }

	public float getSpeed() {
	      return this.speed;
	   }

	public float getAttackDamageBonus() {
	      return this.damage;
	   }

	public int getLevel() {
	      return this.level;
	   }

	public int getEnchantmentValue() {
	      return this.enchantmentValue;
	   }

	public Ingredient getRepairIngredient() {
	      return this.repairIngredient.get();
	   }
	
	
	
}
