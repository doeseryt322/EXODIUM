
package net.mcreator.exodium.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.exodium.procedures.Manabarproc9Procedure;
import net.mcreator.exodium.procedures.Manabarproc8Procedure;
import net.mcreator.exodium.procedures.Manabarproc7Procedure;
import net.mcreator.exodium.procedures.Manabarproc6Procedure;
import net.mcreator.exodium.procedures.Manabarproc5Procedure;
import net.mcreator.exodium.procedures.Manabarproc4Procedure;
import net.mcreator.exodium.procedures.Manabarproc3Procedure;
import net.mcreator.exodium.procedures.Manabarproc2Procedure;
import net.mcreator.exodium.procedures.Manabarproc10Procedure;
import net.mcreator.exodium.procedures.Bloodbarproc1Procedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class BloodbarOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (true) {
			event.getGuiGraphics().blit(new ResourceLocation("exodium:textures/screens/new_piskel-1.png_1.png"), w / 2 + 81, h / 2 + 79, 0, 0, 60, 60, 60, 60);

			if (Manabarproc10Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("exodium:textures/screens/new_piskel-2.png_2.png"), w / 2 + 81, h / 2 + 79, 0, 0, 60, 60, 60, 60);
			}
			if (Manabarproc9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("exodium:textures/screens/new_piskel-2.png_2.png"), w / 2 + 81, h / 2 + 83, 0, 0, 60, 60, 60, 60);
			}
			if (Manabarproc8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("exodium:textures/screens/new_piskel-2.png_2.png"), w / 2 + 81, h / 2 + 87, 0, 0, 60, 60, 60, 60);
			}
			if (Manabarproc7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("exodium:textures/screens/new_piskel-2.png_2.png"), w / 2 + 81, h / 2 + 91, 0, 0, 60, 60, 60, 60);
			}
			if (Manabarproc6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("exodium:textures/screens/new_piskel-2.png_2.png"), w / 2 + 81, h / 2 + 95, 0, 0, 60, 60, 60, 60);
			}
			if (Manabarproc5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("exodium:textures/screens/new_piskel-2.png_2.png"), w / 2 + 81, h / 2 + 99, 0, 0, 60, 60, 60, 60);
			}
			if (Manabarproc4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("exodium:textures/screens/new_piskel-2.png_2.png"), w / 2 + 81, h / 2 + 103, 0, 0, 60, 60, 60, 60);
			}
			if (Manabarproc3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("exodium:textures/screens/new_piskel-2.png_2.png"), w / 2 + 81, h / 2 + 107, 0, 0, 60, 60, 60, 60);
			}
			if (Manabarproc2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("exodium:textures/screens/new_piskel-2.png_2.png"), w / 2 + 81, h / 2 + 111, 0, 0, 60, 60, 60, 60);
			}
			if (Bloodbarproc1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("exodium:textures/screens/new_piskel-2.png_2.png"), w / 2 + 81, h / 2 + 115, 0, 0, 60, 60, 60, 60);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
