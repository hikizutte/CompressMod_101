package com.keeper.compressmod.regi;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class CompressModTab extends ItemGroup{

	public CompressModTab() {
		super("compressmod");
		// TODO 自動生成されたコンストラクター・スタブ
		
		
	}

	@Override
	public ItemStack makeIcon() {
		
		// TODO 自動生成されたメソッド・スタブ
		ItemStack itemStack = new ItemStack(Blocks.COBBLESTONE);
		
		return itemStack;
	}
	
}
