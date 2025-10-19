// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbrasos<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "brasos"), "main");
	private final ModelPart all;
	private final ModelPart lefatm;
	private final ModelPart eee;
	private final ModelPart bone;
	private final ModelPart bone5;
	private final ModelPart head;
	private final ModelPart bone4;
	private final ModelPart rigtharm;
	private final ModelPart ee;
	private final ModelPart bone3;
	private final ModelPart bone6;
	private final ModelPart bone2;
	private final ModelPart zetaaaa;
	private final ModelPart yigrega;
	private final ModelPart bone9;
	private final ModelPart bb_main;

	public Modelbrasos(ModelPart root) {
		this.all = root.getChild("all");
		this.lefatm = this.all.getChild("lefatm");
		this.eee = this.lefatm.getChild("eee");
		this.bone = this.eee.getChild("bone");
		this.bone5 = this.bone.getChild("bone5");
		this.head = this.all.getChild("head");
		this.bone4 = this.head.getChild("bone4");
		this.rigtharm = this.all.getChild("rigtharm");
		this.ee = this.rigtharm.getChild("ee");
		this.bone3 = this.ee.getChild("bone3");
		this.bone6 = this.bone3.getChild("bone6");
		this.bone2 = this.ee.getChild("bone2");
		this.zetaaaa = this.bone2.getChild("zetaaaa");
		this.yigrega = this.bone2.getChild("yigrega");
		this.bone9 = this.yigrega.getChild("bone9");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition all = partdefinition.addOrReplaceChild("all", CubeListBuilder.create(),
				PartPose.offset(0.0F, -2.0F, 2.0F));

		PartDefinition lefatm = all.addOrReplaceChild("lefatm", CubeListBuilder.create(),
				PartPose.offset(7.0F, -1.0F, 0.0F));

		PartDefinition eee = lefatm.addOrReplaceChild("eee", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.4659F, 0.4293F, 0.0808F));

		PartDefinition bone = eee.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(38, 17)
						.addBox(0.25F, 7.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(0, 41)
						.addBox(0.25F, -3.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 3.0F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition bone5 = bone.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition rightArm_r1 = bone5
				.addOrReplaceChild("rightArm_r1",
						CubeListBuilder.create().texOffs(16, 55).addBox(-1.5F, -4.0F, -2.0F, 4.0F, 6.0F, 4.0F,
								new CubeDeformation(0.5F)),
						PartPose.offsetAndRotation(2.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition head = all.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(32, 26)
						.addBox(-4.0F, -7.0F, -3.0F, 8.0F, 7.0F, 8.0F, new CubeDeformation(0.25F)).texOffs(0, 78)
						.addBox(-4.0F, -7.0F, -3.1F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -3.0F, -2.0F));

		PartDefinition bone4 = head.addOrReplaceChild("bone4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -1.0F, -2.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition rigtharm = all.addOrReplaceChild("rigtharm", CubeListBuilder.create(),
				PartPose.offset(-5.0F, -1.0F, 0.0F));

		PartDefinition ee = rigtharm.addOrReplaceChild("ee", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.4725F, -0.478F, -0.0453F));

		PartDefinition bone3 = ee.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(0, 41)
						.addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(38, 17)
						.addBox(-3.9F, 8.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition bone6 = bone3.addOrReplaceChild("bone6", CubeListBuilder.create(),
				PartPose.offset(-3.0F, 0.0F, 0.0F));

		PartDefinition leftArm_r1 = bone6
				.addOrReplaceChild("leftArm_r1",
						CubeListBuilder.create().texOffs(16, 55).addBox(-1.5F, -4.0F, -2.0F, 4.0F, 6.0F, 4.0F,
								new CubeDeformation(0.5F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition bone2 = ee.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-3.0F, 18.0F, 0.0F, 0.0F, 0.0F, 0.48F));

		PartDefinition zetaaaa = bone2.addOrReplaceChild("zetaaaa", CubeListBuilder.create().texOffs(89, 12)
				.addBox(-5.5F, -5.0F, 0.0F, 11.0F, 10.0F, 0.0F, new CubeDeformation(-0.5F)),
				PartPose.offset(0.0F, 0.0F, -1.0F));

		PartDefinition yigrega = bone2.addOrReplaceChild("yigrega", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone9 = yigrega.addOrReplaceChild("bone9",
				CubeListBuilder.create().texOffs(89, 12).addBox(-5.5F, -5.0F, -1.0F, 11.0F, 10.0F, 0.0F,
						new CubeDeformation(-0.5F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-6.0F, -29.0F, 0.0F, 12.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		all.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.lefatm.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.lefatm.xRot = headPitch / (180F / (float) Math.PI);
		this.zetaaaa.zRot = ageInTicks;
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.rigtharm.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.rigtharm.xRot = headPitch / (180F / (float) Math.PI);
		this.yigrega.yRot = ageInTicks;
	}
}