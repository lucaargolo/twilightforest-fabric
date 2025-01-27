package twilightforest.client.renderer.entity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import twilightforest.TFConstants;
import twilightforest.client.model.entity.TinyBirdModel;
import twilightforest.entity.passive.TinyBirdEntity;

public class TinyBirdRenderer extends BirdRenderer<TinyBirdEntity, TinyBirdModel> {

	private static final ResourceLocation textureLocSparrow  = TFConstants.getModelTexture("tinybirdbrown.png");
	private static final ResourceLocation textureLocFinch    = TFConstants.getModelTexture("tinybirdgold.png");
	private static final ResourceLocation textureLocCardinal = TFConstants.getModelTexture("tinybirdred.png");
	private static final ResourceLocation textureLocBluebird = TFConstants.getModelTexture("tinybirdblue.png");

	public TinyBirdRenderer(EntityRendererProvider.Context manager, TinyBirdModel model, float shadowSize) {
		super(manager, model, shadowSize, "");
	}

	@Override
	public ResourceLocation getTextureLocation(TinyBirdEntity entity) {
		switch (entity.getBirdType()) {
			default:
			case 0:
				return textureLocSparrow;
			case 1:
				return textureLocBluebird;
			case 2:
				return textureLocCardinal;
			case 3:
				return textureLocFinch;
		}
	}
}
