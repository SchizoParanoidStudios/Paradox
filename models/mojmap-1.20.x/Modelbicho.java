// Made with Blockbench 4.9.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbicho<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "bicho"), "main");
	private final ModelPart patatraseriata;
	private final ModelPart patatraseraa2;
	private final ModelPart patatraseraa3;
	private final ModelPart patatrasera1;
	private final ModelPart patatrasera2;
	private final ModelPart patatrasera3;
	private final ModelPart cabesa;
	private final ModelPart bb_main;

	public Modelbicho(ModelPart root) {
		this.patatraseriata = root.getChild("patatraseriata");
		this.patatraseraa2 = root.getChild("patatraseraa2");
		this.patatraseraa3 = root.getChild("patatraseraa3");
		this.patatrasera1 = root.getChild("patatrasera1");
		this.patatrasera2 = root.getChild("patatrasera2");
		this.patatrasera3 = root.getChild("patatrasera3");
		this.cabesa = root.getChild("cabesa");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition patatraseriata = partdefinition.addOrReplaceChild("patatraseriata", CubeListBuilder.create(),
				PartPose.offset(-3.0F, 20.0F, 5.0F));

		PartDefinition patatraseraa22 = patatraseriata.addOrReplaceChild("patatraseraa22", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition bone2 = patatraseraa22.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(38, 0).mirror()
						.addBox(-12.0F, -4.0F, 1.0F, 13.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.0F, 0.8727F, 0.0F));

		PartDefinition patatraseraa2 = partdefinition.addOrReplaceChild("patatraseraa2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-3.0F, 20.0F, 0.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition bone7 = patatraseraa2.addOrReplaceChild("bone7",
				CubeListBuilder.create().texOffs(38, 0).mirror()
						.addBox(-12.0F, -4.0F, 1.0F, 13.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition patatraseraa3 = partdefinition.addOrReplaceChild("patatraseraa3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-3.0F, 20.0F, -3.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition bone8 = patatraseraa3.addOrReplaceChild("bone8",
				CubeListBuilder.create().texOffs(38, 0).mirror()
						.addBox(-12.0F, -4.0F, 1.0F, 13.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.0F, -0.2182F, 0.0F));

		PartDefinition patatrasera1 = partdefinition.addOrReplaceChild("patatrasera1", CubeListBuilder.create(),
				PartPose.offset(4.0F, 20.0F, 5.0F));

		PartDefinition bone3 = patatrasera1.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.6581F, 0.0F));

		PartDefinition bone4 = bone3.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(38, 0).mirror()
						.addBox(-12.0F, -4.0F, 1.0F, 13.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.0F, 0.8727F, 0.0F));

		PartDefinition patatrasera2 = partdefinition.addOrReplaceChild("patatrasera2", CubeListBuilder.create(),
				PartPose.offset(4.0F, 20.0F, 0.0F));

		PartDefinition bone5 = patatrasera2.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.0508F, 0.0F));

		PartDefinition bone6 = bone5.addOrReplaceChild("bone6",
				CubeListBuilder.create().texOffs(38, 0).mirror()
						.addBox(-12.0F, -4.0F, 1.0F, 13.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.0F, 0.8727F, 0.0F));

		PartDefinition patatrasera3 = partdefinition.addOrReplaceChild("patatrasera3", CubeListBuilder.create(),
				PartPose.offset(4.0F, 20.0F, -3.0F));

		PartDefinition bone9 = patatrasera3.addOrReplaceChild("bone9", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.618F, 0.0F));

		PartDefinition bone10 = bone9.addOrReplaceChild("bone10",
				CubeListBuilder.create().texOffs(38, 0).mirror()
						.addBox(-12.0F, -4.0F, 1.0F, 13.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.0F, 0.8727F, 0.0F));

		PartDefinition cabesa = partdefinition.addOrReplaceChild("cabesa",
				CubeListBuilder.create().texOffs(36, 9)
						.addBox(-2.0F, -8.5F, -14.0F, 0.0F, 9.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(36, 9)
						.addBox(2.0F, -8.5F, -14.0F, 0.0F, 9.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 21.0F, -8.0F));

		PartDefinition cube_r1 = cabesa
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(0, 24).addBox(-3.0F, -7.5F, -7.0F, 6.0F, 4.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 3.0F, 8.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-5.0F, -6.0F, -7.0F, 11.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		patatraseriata.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		patatraseraa2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		patatraseraa3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		patatrasera1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		patatrasera2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		patatrasera3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		cabesa.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.patatrasera2.zRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.patatrasera3.zRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.patatraseriata.zRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.patatraseraa3.zRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.patatrasera1.zRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.patatraseraa2.zRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}