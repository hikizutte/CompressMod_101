package com.keeper.compressmod.item;

import java.util.List;

import javax.annotation.Nullable;

import com.keeper.compressmod.main.CompressMod;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;


public class ItemFreshlyFrenchFries extends Item{
	
	@SuppressWarnings("deprecation")
	public ItemFreshlyFrenchFries() {
		
		super(new Properties().tab(CompressMod.COMPRESSMOD_TAB)
				.food(new Food.Builder()
						.nutrition(6)
						.saturationMod(6)
						.effect(new EffectInstance(Effects.ABSORPTION,1200,1), 1F)
						.build())
				.rarity(Rarity.RARE)
				);
		this.setRegistryName("freshly_french_fries");
	}
	
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		
	      tooltip.add(new TranslationTextComponent(this.getDescriptionId() + ".desc").withStyle(TextFormatting.GRAY));
	      
	}
	
	/*
    public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, EquipmentSlotType hand) {
        ItemStack stack = player.getItemBySlot(hand);
        
        

        if (!world.isClientSide()) {
            // 初めての右クリック時にNBTデータを設定
            if (!stack.hasTag()) {
                stack.setTag(new CompoundNBT());
                stack.getTag().putLong("StartTime", world.getGameTime());
            }

            // 経過時間を計算し、30分後にアイテムを変化させる
            long currentTime = world.getGameTime();
            long startTime = stack.getTag().getLong("StartTime");
            long elapsedMinutes = TimeUnit.SECONDS.toMinutes(currentTime - startTime);

            if (elapsedMinutes >= 1) {
                // 冷めた肉にアイテムを変化させる
                ItemStack frenchFries = new ItemStack(CompressModItems.FRESHLY_FRENCH_FRIES.getItem());
                frenchFries.setTag(stack.getTag());
                player.getItemBySlot(hand);

                // メッセージを表示
                player.sendMessage(new StringTextComponent("アイテムが冷めました。"), player.getUUID());
            } else {
                // まだ焼きたての肉
                player.addItem(CompressModItemStack.COLD_FRENCH_FRIES);
            }
        }

        return ActionResult.success(stack);
    }
    */
    
}