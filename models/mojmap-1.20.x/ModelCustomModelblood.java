// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelCustomModelblood<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custommodelblood"), "main");
	private final ModelPart pravayanoga;
	private final ModelPart levayanoga;
	private final ModelPart telo;
	private final ModelPart levayaruka;
	private final ModelPart bone;
	private final ModelPart pravayaruka;

	public ModelCustomModelblood(ModelPart root) {
		this.pravayanoga = root.getChild("pravayanoga");
		this.levayanoga = root.getChild("levayanoga");
		this.telo = root.getChild("telo");
		this.levayaruka = root.getChild("levayaruka");
		this.bone = root.getChild("bone");
		this.pravayaruka = root.getChild("pravayaruka");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition pravayanoga = partdefinition.addOrReplaceChild("pravayanoga", CubeListBuilder.create()
				.texOffs(0, 32).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 13.0F, 0.0F));

		PartDefinition levayanoga = partdefinition.addOrReplaceChild("levayanoga", CubeListBuilder.create()
				.texOffs(24, 16).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 13.0F, 0.0F));

		PartDefinition telo = partdefinition.addOrReplaceChild("telo", CubeListBuilder.create().texOffs(0, 16)
				.addBox(-1.0F, -12.0F, -1.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 12.0F, 0.0F));

		PartDefinition levayaruka = partdefinition.addOrReplaceChild("levayaruka",
				CubeListBuilder.create().texOffs(32, 0)
						.addBox(-2.0F, -2.0F, -1.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 32)
						.addBox(-3.0F, 5.0F, -1.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 24)
						.addBox(-4.0F, 7.0F, 2.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(32, 41)
						.addBox(-4.0F, 7.0F, 1.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(34, 41)
						.addBox(-4.0F, 7.0F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(32, 15)
						.addBox(-3.0F, 12.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(34, 15)
						.addBox(-3.0F, 12.0F, 1.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(36, 15)
						.addBox(-3.0F, 12.0F, 2.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-7.0F, 2.0F, 0.0F));

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0).addBox(
				-5.0F, -32.0F, -3.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition pravayaruka = partdefinition.addOrReplaceChild("pravayaruka",
				CubeListBuilder.create().texOffs(16, 32)
						.addBox(-2.4375F, -0.625F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 15)
						.addBox(-3.4375F, 6.375F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 41)
						.addBox(-4.4375F, 8.375F, 1.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(38, 41)
						.addBox(-4.4375F, 8.375F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(40, 41)
						.addBox(-4.4375F, 8.375F, -1.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(38, 15)
						.addBox(-3.4375F, 13.375F, -1.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(40, 29)
						.addBox(-3.4375F, 13.375F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(40, 30)
						.addBox(-3.4375F, 13.375F, 1.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5625F, 0.625F, 1.0F, 0.0F, 3.1416F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		pravayanoga.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		levayanoga.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		telo.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		levayaruka.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pravayaruka.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.levayanoga.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.pravayanoga.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.pravayaruka.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.bone.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.bone.xRot = headPitch / (180F / (float) Math.PI);
		this.levayaruka.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}