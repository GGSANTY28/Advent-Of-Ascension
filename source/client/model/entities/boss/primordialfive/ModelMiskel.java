package net.tslat.aoa3.client.model.entities.boss.primordialfive;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelMiskel extends ModelBase {
	private ModelRenderer body;
	private ModelRenderer rightLeg;
	private ModelRenderer leftLeg;
	private ModelRenderer body2;
	private ModelRenderer body3;
	private ModelRenderer body4;
	private ModelRenderer body5;
	private ModelRenderer body6;
	private ModelRenderer body7;
	private ModelRenderer head;
	private ModelRenderer head2;
	private ModelRenderer head3;
	private ModelRenderer head4;
	private ModelRenderer head5;
	private ModelRenderer head6;
	private ModelRenderer head7;
	private ModelRenderer leftArm;
	private ModelRenderer rightArm;
	private ModelRenderer rightArm2;
	private ModelRenderer leftArm2;
	private ModelRenderer body8;
	private ModelRenderer head8;
	private ModelRenderer head9;
	private ModelRenderer rightArm3;
	private ModelRenderer rightArm4;

	public ModelMiskel() {
		textureWidth = 128;
		textureHeight = 64;
		(body = new ModelRenderer(this, 16, 16)).addBox(-5.0f, 0.0f, -2.0f, 10, 12, 5);
		body.setRotationPoint(0.0f, 9.0f, -1.0f);
		body.setTextureSize(128, 64);
		body.mirror = true;
		setRotation(body, 0.0f, 0.0f, 0.0f);
		(rightLeg = new ModelRenderer(this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 3, 6, 3);
		rightLeg.setRotationPoint(-2.0f, 18.0f, 0.0f);
		rightLeg.setTextureSize(128, 64);
		rightLeg.mirror = true;
		setRotation(rightLeg, 0.0f, 0.0f, 0.0f);
		(leftLeg = new ModelRenderer(this, 0, 16)).addBox(-1.0f, 0.0f, -2.0f, 3, 6, 3);
		leftLeg.setRotationPoint(2.0f, 18.0f, 0.0f);
		leftLeg.setTextureSize(128, 64);
		leftLeg.mirror = true;
		setRotation(leftLeg, 0.0f, 0.0f, 0.0f);
		(body2 = new ModelRenderer(this, 50, 50)).addBox(-3.0f, -3.0f, -3.5f, 6, 3, 2);
		body2.setRotationPoint(0.0f, 7.0f, 0.0f);
		body2.setTextureSize(128, 64);
		body2.mirror = true;
		setRotation(body2, 0.0f, 0.0f, 0.0f);
		(body3 = new ModelRenderer(this, 1, 36)).addBox(-9.0f, -1.0f, -3.0f, 4, 2, 6);
		body3.setRotationPoint(0.0f, -5.0f, 0.0f);
		body3.setTextureSize(128, 64);
		body3.mirror = true;
		setRotation(body3, 0.0f, 0.0f, 0.0f);
		(body4 = new ModelRenderer(this, 57, 16)).addBox(-4.0f, 0.0f, -2.0f, 8, 12, 4);
		body4.setRotationPoint(0.0f, -5.0f, 0.0f);
		body4.setTextureSize(128, 64);
		body4.mirror = true;
		setRotation(body4, 0.0f, 0.0f, 0.0f);
		(body5 = new ModelRenderer(this, 27, 47)).addBox(2.0f, -1.0f, -3.0f, 3, 4, 6);
		body5.setRotationPoint(0.0f, -5.0f, 0.0f);
		body5.setTextureSize(128, 64);
		body5.mirror = true;
		setRotation(body5, 0.0f, 0.0f, 0.0f);
		(body6 = new ModelRenderer(this, 23, 36)).addBox(5.0f, -1.0f, -3.0f, 4, 2, 6);
		body6.setRotationPoint(0.0f, -5.0f, 0.0f);
		body6.setTextureSize(128, 64);
		body6.mirror = true;
		setRotation(body6, 0.0f, 0.0f, 0.0f);
		(body7 = new ModelRenderer(this, 2, 47)).addBox(-5.0f, -1.0f, -3.0f, 3, 4, 6);
		body7.setRotationPoint(0.0f, -5.0f, 0.0f);
		body7.setTextureSize(128, 64);
		body7.mirror = true;
		setRotation(body7, 0.0f, 0.0f, 0.0f);
		(head = new ModelRenderer(this, 0, 0)).addBox(-3.0f, -8.0f, -4.0f, 6, 8, 6);
		head.setRotationPoint(0.0f, -5.0f, -1.0f);
		head.setTextureSize(128, 64);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(head2 = new ModelRenderer(this, 80, 0)).addBox(-3.0f, -9.0f, 2.0f, 6, 7, 1);
		head2.setRotationPoint(0.0f, -5.0f, -1.0f);
		head2.setTextureSize(128, 64);
		head2.mirror = true;
		setRotation(head2, 0.0f, 0.0f, 0.0f);
		(head3 = new ModelRenderer(this, 103, 10)).addBox(4.0f, -15.0f, -1.5f, 1, 3, 2);
		head3.setRotationPoint(0.0f, -5.0f, -1.0f);
		head3.setTextureSize(128, 64);
		head3.mirror = true;
		setRotation(head3, 0.0f, 0.0f, 0.0f);
		(head4 = new ModelRenderer(this, 65, 0)).addBox(3.0f, -9.0f, -3.0f, 1, 7, 6);
		head4.setRotationPoint(0.0f, -5.0f, -1.0f);
		head4.setTextureSize(128, 64);
		head4.mirror = true;
		setRotation(head4, 0.0f, 0.0f, 0.0f);
		(head5 = new ModelRenderer(this, 25, 0)).addBox(-3.0f, -9.0f, -3.0f, 6, 1, 5);
		head5.setRotationPoint(0.0f, -5.0f, -1.0f);
		head5.setTextureSize(128, 64);
		head5.mirror = true;
		setRotation(head5, 0.0f, 0.0f, 0.0f);
		(head6 = new ModelRenderer(this, 49, 0)).addBox(-4.0f, -9.0f, -3.0f, 1, 7, 6);
		head6.setRotationPoint(0.0f, -5.0f, -1.0f);
		head6.setTextureSize(128, 64);
		head6.mirror = true;
		setRotation(head6, 0.0f, 0.0f, 0.0f);
		(head7 = new ModelRenderer(this, 93, 10)).addBox(-5.0f, -15.0f, -1.5f, 1, 3, 2);
		head7.setRotationPoint(0.0f, -5.0f, -1.0f);
		head7.setTextureSize(128, 64);
		head7.mirror = true;
		setRotation(head7, 0.0f, 0.0f, 0.0f);
		(leftArm = new ModelRenderer(this, 117, 16)).addBox(3.0f, 7.0f, -3.0f, 1, 6, 5);
		leftArm.setRotationPoint(6.0f, -2.0f, 0.0f);
		leftArm.setTextureSize(128, 64);
		leftArm.mirror = true;
		setRotation(leftArm, 0.0f, 0.0f, 0.0f);
		(rightArm = new ModelRenderer(this, 104, 16)).addBox(-4.0f, 7.0f, -3.0f, 1, 6, 5);
		rightArm.setRotationPoint(-6.0f, -2.0f, 0.0f);
		rightArm.setTextureSize(128, 64);
		rightArm.mirror = true;
		setRotation(rightArm, 0.0f, 0.0f, 0.0f);
		(rightArm2 = new ModelRenderer(this, 110, 32)).addBox(-3.5f, -11.0f, -10.0f, 4, 4, 4);
		rightArm2.setRotationPoint(-6.0f, -2.0f, 0.0f);
		rightArm2.setTextureSize(128, 64);
		rightArm2.mirror = true;
		setRotation(rightArm2, 0.5235988f, 0.0f, 0.0f);
		(leftArm2 = new ModelRenderer(this, 83, 16)).addBox(0.0f, -2.0f, -2.0f, 3, 16, 3);
		leftArm2.setRotationPoint(6.0f, -2.0f, 0.0f);
		leftArm2.setTextureSize(128, 64);
		leftArm2.mirror = true;
		setRotation(leftArm2, 0.0f, 0.0f, 0.0f);
		(body8 = new ModelRenderer(this, 50, 39)).addBox(-5.5f, 0.0f, -3.5f, 11, 2, 6);
		body8.setRotationPoint(0.0f, 7.0f, 0.0f);
		body8.setTextureSize(128, 64);
		body8.mirror = true;
		setRotation(body8, 0.0f, 0.0f, 0.0f);
		(head8 = new ModelRenderer(this, 119, 0)).addBox(4.0f, -12.0f, -2.0f, 1, 7, 3);
		head8.setRotationPoint(0.0f, -5.0f, -1.0f);
		head8.setTextureSize(128, 64);
		head8.mirror = true;
		setRotation(head8, 0.0f, 0.0f, 0.0f);
		(head9 = new ModelRenderer(this, 109, 0)).addBox(-5.0f, -12.0f, -2.0f, 1, 7, 3);
		head9.setRotationPoint(0.0f, -5.0f, -1.0f);
		head9.setTextureSize(128, 64);
		head9.mirror = true;
		setRotation(head9, 0.0f, 0.0f, 0.0f);
		(rightArm3 = new ModelRenderer(this, 83, 16)).addBox(-3.0f, -2.0f, -2.0f, 3, 16, 3);
		rightArm3.setRotationPoint(-6.0f, -2.0f, 0.0f);
		rightArm3.setTextureSize(128, 64);
		rightArm3.mirror = true;
		setRotation(rightArm3, 0.0f, 0.0f, 0.0f);
		(rightArm4 = new ModelRenderer(this, 98, 32)).addBox(-2.5f, -7.0f, -9.0f, 2, 28, 2);
		rightArm4.setRotationPoint(-6.0f, -2.0f, 0.0f);
		rightArm4.setTextureSize(128, 64);
		rightArm4.mirror = true;
		setRotation(rightArm4, 0.5235988f, 0.0f, 0.0f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		body.render(par7);
		rightLeg.render(par7);
		leftLeg.render(par7);
		body2.render(par7);
		body3.render(par7);
		body4.render(par7);
		body5.render(par7);
		body6.render(par7);
		body7.render(par7);
		head.render(par7);
		head2.render(par7);
		head3.render(par7);
		head4.render(par7);
		head5.render(par7);
		head6.render(par7);
		head7.render(par7);
		leftArm.render(par7);
		rightArm.render(par7);
		rightArm2.render(par7);
		leftArm2.render(par7);
		body8.render(par7);
		head8.render(par7);
		head9.render(par7);
		rightArm3.render(par7);
		rightArm4.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		head.rotateAngleY = par4 / (float)(180f / Math.PI);
		head2.rotateAngleY = par4 / (float)(180f / Math.PI);
		head3.rotateAngleY = par4 / (float)(180f / Math.PI);
		head4.rotateAngleY = par4 / (float)(180f / Math.PI);
		head5.rotateAngleY = par4 / (float)(180f / Math.PI);
		head6.rotateAngleY = par4 / (float)(180f / Math.PI);
		head7.rotateAngleY = par4 / (float)(180f / Math.PI);
		head8.rotateAngleY = par4 / (float)(180f / Math.PI);
		head9.rotateAngleY = par4 / (float)(180f / Math.PI);
		rightArm.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightArm.rotateAngleZ = 0.0f;
		rightArm2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f + 0.523f;
		rightArm2.rotateAngleZ = 0.0f;
		rightArm3.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightArm4.rotateAngleZ = 0.0f;
		rightArm4.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f + 0.523f;
		rightArm4.rotateAngleZ = 0.0f;
		leftArm.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftArm.rotateAngleZ = 0.0f;
		leftArm2.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftArm2.rotateAngleZ = 0.0f;
		rightLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		rightLeg.rotateAngleY = 0.0f;
		leftLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
	}
}
