
package net.mcreator.exodium.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.exodium.procedures.IstoshenieyesProcedure;
import net.mcreator.exodium.procedures.IstosgenienoProcedure;

public class Stomach1Item extends Item implements ICurioItem {
	public Stomach1Item() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(3).saturationMod(0.3f)

				.meat().build()));
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		IstosgenienoProcedure.execute(slotContext.entity());
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		IstoshenieyesProcedure.execute(slotContext.entity());
	}
}
