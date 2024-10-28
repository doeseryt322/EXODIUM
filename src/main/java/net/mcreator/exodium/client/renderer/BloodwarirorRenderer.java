
package net.mcreator.exodium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.exodium.entity.BloodwarirorEntity;
import net.mcreator.exodium.client.model.ModelCustomModelblood;

public class BloodwarirorRenderer extends MobRenderer<BloodwarirorEntity, ModelCustomModelblood<BloodwarirorEntity>> {
	public BloodwarirorRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCustomModelblood(context.bakeLayer(ModelCustomModelblood.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BloodwarirorEntity entity) {
		return new ResourceLocation("exodium:textures/entities/bloooodddddddddddd.png");
	}
}
