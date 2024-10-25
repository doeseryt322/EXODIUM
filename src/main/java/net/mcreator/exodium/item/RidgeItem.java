
package net.mcreator.exodium.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RidgeItem extends Item {
	public RidgeItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
