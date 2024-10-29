
package net.mcreator.exodium.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class StopkaItem extends Item {
	public StopkaItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
