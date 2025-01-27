package twilightforest.client.renderer.entity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import twilightforest.TFConstants;
import twilightforest.client.model.entity.UrGhastModel;
import twilightforest.entity.boss.UrGhastEntity;

public class UrGhastRenderer extends CarminiteGhastRenderer<UrGhastEntity, UrGhastModel> {

	private final ResourceLocation textureLocClosed = TFConstants.getModelTexture("towerboss.png");
	private final ResourceLocation textureLocOpen   = TFConstants.getModelTexture("towerboss_openeyes.png");
	private final ResourceLocation textureLocAttack = TFConstants.getModelTexture("towerboss_fire.png");

	public UrGhastRenderer(EntityRendererProvider.Context manager, UrGhastModel modelTFGhast, float shadowSize, float scale) {
		super(manager, modelTFGhast, shadowSize, scale);
	}

	@Override
	public ResourceLocation getTextureLocation(UrGhastEntity entity) {
		switch (entity.isCharging() ? 2 : entity.getAttackStatus()) {
			default:
			case 0:
				return textureLocClosed;
			case 1:
				return textureLocOpen;
			case 2:
				return textureLocAttack;
		}
	}
}
