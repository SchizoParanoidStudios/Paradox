// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelgorro_mecanicoja<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "gorro_mecanicoja"), "main");
	private final ModelPart bone;
	private final ModelPart bone6;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart bone5;
	private final ModelPart bone7;

	public Modelgorro_mecanicoja(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bone6 = this.bone.getChild("bone6");
		this.bone2 = this.bone6.getChild("bone2");
		this.bone3 = this.bone6.getChild("bone3");
		this.bone4 = this.bone6.getChild("bone4");
		this.bone5 = this.bone.getChild("bone5");
		this.bone7 = this.bone.getChild("bone7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(32, 23)
						.addBox(-0.5F, -15.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 31)
						.addBox(-1.0F, -8.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 31)
						.addBox(-1.0F, -16.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(35, 47).addBox(-4.0F, -2.0F, 3.25F, 8.0F, 8.0F, 3.0F,
						new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bone6 = bone.addOrReplaceChild("bone6", CubeListBuilder.create(),
				PartPose.offset(0.0F, -4.0F, 1.0F));

		PartDefinition bone2 = bone6.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 3.0F, -3.0F));

		PartDefinition bone3 = bone6.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(3.0F, 5.0F, -6.0F, 1.0368F, -0.5803F, -0.2324F));

		PartDefinition bone4 = bone6.addOrReplaceChild("bone4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-4.0F, 5.0F, -6.0F, 0.7498F, 0.3989F, 0.0243F));

		PartDefinition bone5 = bone.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F,
				1.5F, -8.0F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -17.0F, 0.0F));

		PartDefinition bone7 = bone.addOrReplaceChild("bone7", CubeListBuilder.create(),
				PartPose.offset(0.0F, -4.0F, -2.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.bone5.yRot = ageInTicks;
		this.bone.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.bone.xRot = headPitch / (180F / (float) Math.PI);
	}
}