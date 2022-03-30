package trumpetskeleton.ultimate.endermen;// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.EntityModels;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.Identifier;

public class endersent<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final EntityModelLayer LAYER_LOCATION = new EntityModelLayer(new Identifier("ultender", "endersent"), "main");
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart headwear;
	private final ModelPart right_arm;
	private final ModelPart right_leg;
	private final ModelPart left_leg;
	private final ModelPart leftarm;

	public endersent(ModelPart root) {
		this.body = root.getChild("body");
		this.head = root.getChild("head");
		this.headwear = root.getChild("headwear");
		this.right_arm = root.getChild("right_arm");
		this.right_leg = root.getChild("right_leg");
		this.left_leg = root.getChild("left_leg");
		this.leftarm = root.getChild("leftarm");
	}

	public static TexturedModelData createBodyLayer() {
		ModelData meshdefinition = new ModelData();
		ModelPartData partdefinition = meshdefinition.getRoot();

		ModelPartData body = partdefinition.addChild("body", ModelPartBuilder.create().uv(32, 19).cuboid(-4.0F, -7.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -15.0F, 0.0F));

		ModelPartData head = partdefinition.addChild("head", ModelPartBuilder.create().uv(16, 0).cuboid(-4.0F, -11.0F, -4.0F, 8.0F, 11.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -22.0F, 0.0F));

		ModelPartData headwear = partdefinition.addChild("headwear", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -15.0F, 0.0F));

		ModelPartData right_arm = partdefinition.addChild("right_arm", ModelPartBuilder.create(), ModelTransform.of(-4.0F, -19.0F, 1.0F, 0.0F, 0.0F, 0.0873F));

		ModelPartData right_arm_r1 = right_arm.addChild("right_arm_r1", ModelPartBuilder.create().uv(32, 47).cuboid(-7.0F, -5.0F, -1.0F, 4.0F, 5.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(4.0114F, 43.2615F, 0.0F, 0.0F, 0.0F, -0.0436F));

		ModelPartData right_arm_r2 = right_arm.addChild("right_arm_r2", ModelPartBuilder.create().uv(8, 0).cuboid(-6.0F, -45.0F, 0.0F, 2.0F, 42.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(4.0114F, 43.2615F, 0.0F, 0.0436F, 0.0F, 0.0F));

		ModelPartData right_leg = partdefinition.addChild("right_leg", ModelPartBuilder.create().uv(24, 19).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 34.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, -9.0F, 0.0F));

		ModelPartData left_leg = partdefinition.addChild("left_leg", ModelPartBuilder.create(), ModelTransform.pivot(2.0F, -9.0F, 0.0F));

		ModelPartData bone = left_leg.addChild("bone", ModelPartBuilder.create().uv(16, 19).cuboid(-1.0F, -17.5F, -1.0F, 2.0F, 35.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 15.5F, 0.0F));

		ModelPartData leftarm = partdefinition.addChild("leftarm", ModelPartBuilder.create(), ModelTransform.of(5.0F, -19.0F, 1.0F, 0.0F, 0.0F, 0.0436F));

		ModelPartData right_arm_r3 = leftarm.addChild("right_arm_r3", ModelPartBuilder.create().uv(32, 35).cuboid(-7.0F, -5.0F, -1.0F, 4.0F, 5.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(8.9981F, 42.9128F, 0.0F, 0.0F, 0.0F, -0.0873F));

		ModelPartData right_arm_r4 = leftarm.addChild("right_arm_r4", ModelPartBuilder.create().uv(0, 0).cuboid(-6.0F, -45.0F, 0.0F, 2.0F, 42.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(8.9981F, 42.9128F, 0.0F, 0.0435F, 0.0038F, -0.0872F));

		return TexturedModelData.of(meshdefinition, 64, 64);
	}



	@Override
	public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
		body.render(matrices, vertices, light, overlay);
		head.render(matrices, vertices, light, overlay);
		headwear.render(matrices, vertices, light, overlay);
		right_arm.render(matrices, vertices, light, overlay);
		right_leg.render(matrices, vertices, light, overlay);
		left_leg.render(matrices, vertices, light, overlay);
		leftarm.render(matrices, vertices, light, overlay);
	}
}