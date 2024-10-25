
package net.mcreator.exodium.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SkadiItem extends Item implements ICurioItem {
	public SkadiItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
	}
}
