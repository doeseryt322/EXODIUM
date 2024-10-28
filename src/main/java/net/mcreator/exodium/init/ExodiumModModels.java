
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.exodium.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.exodium.client.model.Modelheartiron;
import net.mcreator.exodium.client.model.ModelCustomModelblood;
import net.mcreator.exodium.client.model.ModelCustomModel;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ExodiumModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelCustomModel.LAYER_LOCATION, ModelCustomModel::createBodyLayer);
		event.registerLayerDefinition(Modelheartiron.LAYER_LOCATION, Modelheartiron::createBodyLayer);
		event.registerLayerDefinition(ModelCustomModelblood.LAYER_LOCATION, ModelCustomModelblood::createBodyLayer);
	}
}
