// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcapitas<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "capitas"), "main");
	private final ModelPart all;
	private final ModelPart head;
	private final ModelPart bone4;
	private final ModelPart body;
	private final ModelPart leftArm;
	private final ModelPart bone3;
	private final ModelPart rightArm;
	private final ModelPart bone;
	private final ModelPart bone5;
	private final ModelPart leftLeg;
	private final ModelPart bone2;
	private final ModelPart rightLeg;

	public Modelcapitas(ModelPart root) {
		this.all = root.getChild("all");
		this.head = this.all.getChild("head");
		this.bone4 = this.head.getChild("bone4");
		this.body = this.all.getChild("body");
		this.leftArm = this.all.getChild("leftArm");
		this.bone3 = this.leftArm.getChild("bone3");
		this.rightArm = this.all.getChild("rightArm");
		this.bone = this.rightArm.getChild("bone");
		this.bone5 = this.rightArm.getChild("bone5");
		this.leftLeg = this.all.getChild("leftLeg");
		this.bone2 = this.leftLeg.getChild("bone2");
		this.rightLeg = this.all.getChild("rightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition all = partdefinition.addOrReplaceChild("all", CubeListBuilder.create(),
				PartPose.offset(-5.0F, 1.0F, 1.0F));

		PartDefinition head = all.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 21)
						.addBox(-4.0F, -9.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 16)
						.addBox(-4.0F, -9.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.4F)),
				PartPose.offset(5.0F, -1.0F, -2.0F));

		PartDefinition bone4 = head.addOrReplaceChild("bone4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -1.0F, -2.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition body = all.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(32, 0)
						.addBox(-5.0F, -2.0F, -3.0F, 10.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.0F, -2.0F, -3.0F, 10.0F, 15.0F, 6.0F, new CubeDeformation(0.4F)).texOffs(32, 32)
						.addBox(-4.5F, 7.0F, -2.5F, 9.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 37)
						.addBox(-5.0F, 10.0F, -2.0F, 10.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, -1.0F, 0.0F));

		PartDefinition leftArm = all.addOrReplaceChild("leftArm", CubeListBuilder.create(),
				PartPose.offset(1.0F, -2.0F, 0.0F));

		PartDefinition bone3 = leftArm.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(44, 40)
						.addBox(-4.0F, -3.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(60, 41)
						.addBox(-3.9F, 6.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.3F)),
				PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -1.5105F, -0.4954F, -0.0758F));

		PartDefinition rightArm = all.addOrReplaceChild("rightArm", CubeListBuilder.create(),
				PartPose.offset(9.0F, -1.0F, 0.0F));

		PartDefinition bone = rightArm.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(60, 41)
						.addBox(0.1F, 6.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(44, 54).mirror()
						.addBox(0.0F, -3.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -1.4549F, 0.582F, 0.1568F));

		PartDefinition bone5 = rightArm.addOrReplaceChild("bone5",
				CubeListBuilder.create().texOffs(0, 96)
						.addBox(-5.5F, -5.0F, -24.0F, 3.0F, 4.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(17, 119)
						.addBox(-5.0F, -1.0F, -21.0F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(7, 114)
						.addBox(-4.0F, -1.0F, -16.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(29, 116)
						.addBox(-5.0F, -4.0F, -26.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(71, 49)
						.addBox(-4.5F, -3.5F, -26.1F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition cube_r1 = bone5
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(2, 120).addBox(-2.0F, -5.0F, -12.0F, 2.0F, 5.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition leftLeg = all.addOrReplaceChild("leftLeg", CubeListBuilder.create(),
				PartPose.offset(2.1F, 12.0F, 0.0F));

		PartDefinition bone2 = leftLeg.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(0, 44).mirror()
						.addBox(-3.0F, 1.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(16, 56).addBox(-3.0F, 5.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.3F)),
				PartPose.offset(1.0F, -1.0F, 0.0F));

		PartDefinition rightLeg = all.addOrReplaceChild("rightLeg",
				CubeListBuilder.create().texOffs(0, 44)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 56)
						.mirror().addBox(-1.8F, 4.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.3F)).mirror(false),
				PartPose.offset(7.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		all.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.rightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.rightArm.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.rightArm.xRot = headPitch / (180F / (float) Math.PI);
		this.leftArm.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.leftArm.xRot = headPitch / (180F / (float) Math.PI);
		this.leftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}