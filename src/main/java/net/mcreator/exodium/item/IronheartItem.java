
package net.mcreator.exodium.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.exodium.procedures.IronheartWhileBaubleIsEquippedTickProcedure;

public class IronheartItem extends Item implements ICurioItem {
	public IronheartItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}

	@Override
	public void curioTick(SlotContext slotContext, ItemStack stack) {
		IronheartWhileBaubleIsEquippedTickProcedure.execute(slotContext.entity());
	}
}
