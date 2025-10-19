// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmochilajet<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mochilajet"), "main");
	private final ModelPart bone;
	private final ModelPart bone2;

	public Modelmochilajet(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bone2 = this.bone.getChild("bone2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 16)
				.addBox(-4.0F, -13.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 13.0F, 0.0F));

		PartDefinition bone2 = bone.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(24, 0)
						.addBox(-4.0F, -23.5F, 2.0F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.25F)).texOffs(0, 0)
						.addBox(-4.0F, -22.0F, 2.0F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 11.0F, 1.0F, 0.0436F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}