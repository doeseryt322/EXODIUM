
package net.mcreator.exodium.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.exodium.procedures.SlepotayesProcedure;
import net.mcreator.exodium.procedures.SlepotanoProcedure;

public class HumaneyesItem extends Item implements ICurioItem {
	public HumaneyesItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f)

				.meat().build()));
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		SlepotanoProcedure.execute(slotContext.entity());
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		SlepotayesProcedure.execute(slotContext.entity());
	}
}
