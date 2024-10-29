
package net.mcreator.exodium.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.exodium.procedures.BleedoryesProcedure;
import net.mcreator.exodium.procedures.BleedornoProcedure;

public class HumanheartItem extends Item implements ICurioItem {
	public HumanheartItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(6).saturationMod(0.3f)

				.meat().build()));
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		BleedoryesProcedure.execute(slotContext.entity());
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		BleedornoProcedure.execute(slotContext.entity());
	}
}
