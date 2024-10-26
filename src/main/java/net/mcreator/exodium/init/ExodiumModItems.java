
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.exodium.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.exodium.item.TshapffyaItem;
import net.mcreator.exodium.item.Stomach1Item;
import net.mcreator.exodium.item.SkadiItem;
import net.mcreator.exodium.item.RidgeItem;
import net.mcreator.exodium.item.IronheartItem;
import net.mcreator.exodium.item.HumanheartItem;
import net.mcreator.exodium.item.HumaneyesItem;
import net.mcreator.exodium.item.BloodItem;
import net.mcreator.exodium.item.BdaggerItem;
import net.mcreator.exodium.ExodiumMod;

public class ExodiumModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ExodiumMod.MODID);
	public static final RegistryObject<Item> BLOOD_BUCKET = REGISTRY.register("blood_bucket", () -> new BloodItem());
	public static final RegistryObject<Item> IRONHEART = REGISTRY.register("ironheart", () -> new IronheartItem());
	public static final RegistryObject<Item> HUMANHEART = REGISTRY.register("humanheart", () -> new HumanheartItem());
	public static final RegistryObject<Item> STOMACH_1 = REGISTRY.register("stomach_1", () -> new Stomach1Item());
	public static final RegistryObject<Item> RIDGE = REGISTRY.register("ridge", () -> new RidgeItem());
	public static final RegistryObject<Item> TSHAPFFYA = REGISTRY.register("tshapffya", () -> new TshapffyaItem());
	public static final RegistryObject<Item> BLOOD_BORN = block(ExodiumModBlocks.BLOOD_BORN);
	public static final RegistryObject<Item> HUMANEYES = REGISTRY.register("humaneyes", () -> new HumaneyesItem());
	public static final RegistryObject<Item> SKADI = REGISTRY.register("skadi", () -> new SkadiItem());
	public static final RegistryObject<Item> BDAGGER = REGISTRY.register("bdagger", () -> new BdaggerItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
