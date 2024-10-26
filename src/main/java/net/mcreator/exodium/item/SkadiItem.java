
package net.mcreator.exodium.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.exodium.procedures.SkadiWhileBaubleIsEquippedTickProcedure;

public class SkadiItem extends Item implements ICurioItem {
	public SkadiItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public void curioTick(SlotContext slotContext, ItemStack stack) {
		SkadiWhileBaubleIsEquippedTickProcedure.execute(slotContext.entity());
	}
}
