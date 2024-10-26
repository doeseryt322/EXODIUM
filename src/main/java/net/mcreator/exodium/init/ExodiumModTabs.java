
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.exodium.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.exodium.ExodiumMod;

public class ExodiumModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExodiumMod.MODID);
	public static final RegistryObject<CreativeModeTab> ORGANS = REGISTRY.register("organs",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.exodium.organs")).icon(() -> new ItemStack(Blocks.FIRE_CORAL_BLOCK)).displayItems((parameters, tabData) -> {
				tabData.accept(ExodiumModItems.IRONHEART.get());
				tabData.accept(ExodiumModItems.HUMANHEART.get());
				tabData.accept(ExodiumModItems.STOMACH_1.get());
				tabData.accept(ExodiumModItems.TSHAPFFYA.get());
				tabData.accept(ExodiumModBlocks.BLOOD_BORN.get().asItem());
				tabData.accept(ExodiumModItems.HUMANEYES.get());
				tabData.accept(ExodiumModItems.SKADI.get());
				tabData.accept(ExodiumModItems.BDAGGER.get());
			})

					.build());
}
