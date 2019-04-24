package net.nevermine.mob.entity.barathos;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.nevermine.izer.Itemizer;
import net.nevermine.izer.SpecialBlockizer;
import net.nevermine.izer.equipment.Weaponizer;

public class EntityNospike extends EntityMob {
	public EntityNospike(final World par1World) {
		super(par1World);
		setSize(1.0f, 1.25f);
	}

	protected String getLivingSound() {
		return "nevermine:NospikeLiving";
	}

	protected String getDeathSound() {
		return "nevermine:NospikeDeath";
	}

	protected String getHurtSound() {
		return "nevermine:NospikeHit";
	}

	public boolean getCanSpawnHere() {
		return worldObj.checkNoEntityCollision(boundingBox) && worldObj.getCollidingBoundingBoxes(this, boundingBox).isEmpty() && !worldObj.isAnyLiquid(boundingBox);
	}

	protected boolean isValidLightLevel() {
		return true;
	}

	private Item dropBanner() {
		return Item.getItemFromBlock(SpecialBlockizer.BaronBanner);
	}

	protected void func_145780_a(final int p_145780_1_, final int p_145780_2_, final int p_145780_3_, final Block p_145780_4_) {
		playSound("mob.pig.step", 0.55f, 1.0f);
	}

	protected void dropFewItems(final boolean par1, final int par2) {
		if (rand.nextInt(40) == 37) {
			dropItem(Weaponizer.DestructionRifle, 1);
		}
		if (rand.nextInt(2) == 1) {
			dropItem(Itemizer.CoinsBarathos, 2);
		}
		if (rand.nextInt(200) == 135) {
			dropItem(Itemizer.UpgradeKitRocky, 1);
		}
		dropItem(Itemizer.CopperCoin, 5 + rand.nextInt(10));
		if (rand.nextInt(8) == 2) {
			dropItem(dropBanner(), 1);
		}
	}

	protected Entity findPlayerToAttack() {
		final EntityPlayer entityPlayer = worldObj.getClosestVulnerablePlayerToEntity(this, 32.0);
		return (entityPlayer != null && canEntityBeSeen(entityPlayer)) ? entityPlayer : null;
	}

	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(3.0);
		getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(52.0);
		getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.5);
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(60.0);
	}

	public void moveEntityWithHeading(final float par1, final float par2) {
		if (isInWater()) {
			final double d0 = posY;
			moveFlying(par1, par2, 0.52f);
			moveEntity(motionX, motionY, motionZ);
			motionX *= 0.800000011920929;
			motionY *= 0.800000011920929;
			motionZ *= 0.800000011920929;
			motionY -= 0.02;
			if (isCollidedHorizontally && isOffsetPositionInLiquid(motionX, motionY + 0.6000000238418579 - posY + d0, motionZ)) {
				motionY = 0.30000001192092896;
			}
		}
		else if (handleLavaMovement()) {
			final double d0 = posY;
			moveFlying(par1, par2, 0.02f);
			moveEntity(motionX, motionY, motionZ);
			motionX *= 0.5;
			motionY *= 0.5;
			motionZ *= 0.5;
			motionY -= 0.02;
			if (isCollidedHorizontally && isOffsetPositionInLiquid(motionX, motionY + 0.6000000238418579 - posY + d0, motionZ)) {
				motionY = 0.30000001192092896;
			}
		}
		else {
			float f2 = 0.91f;
			final float f3 = 0.16277136f / (f2 * f2 * f2);
			float f4;
			if (onGround) {
				f4 = getAIMoveSpeed() * f3;
			}
			else {
				f4 = jumpMovementFactor;
			}
			moveFlying(par1, par2, f4);
			f2 = 0.91f;
			if (isOnLadder()) {
				final float f5 = 0.15f;
				if (motionX < -f5) {
					motionX = -f5;
				}
				if (motionX > f5) {
					motionX = f5;
				}
				if (motionZ < -f5) {
					motionZ = -f5;
				}
				if (motionZ > f5) {
					motionZ = f5;
				}
				fallDistance = 0.0f;
				if (motionY < -0.15) {
					motionY = -0.15;
				}
			}
			moveEntity(motionX, motionY, motionZ);
			if (isCollidedHorizontally && isOnLadder()) {
				motionY = 0.2;
			}
			if (worldObj.isRemote && (!worldObj.blockExists((int)posX, 0, (int)posZ) || !worldObj.getChunkFromBlockCoords((int)posX, (int)posZ).isChunkLoaded)) {
				if (posY > 0.0) {
					motionY = -0.1;
				}
				else {
					motionY = 0.0;
				}
			}
			else {
				motionY -= 0.08;
			}
			motionY *= 0.9800000190734863;
			motionX *= f2;
			motionZ *= f2;
		}
		prevLimbSwingAmount = limbSwingAmount;
		final double d0 = posX - prevPosX;
		final double d2 = posZ - prevPosZ;
		float f6 = MathHelper.sqrt_double(d0 * d0 + d2 * d2) * 4.0f;
		if (f6 > 1.0f) {
			f6 = 1.0f;
		}
		limbSwingAmount += (f6 - limbSwingAmount) * 0.4f;
		limbSwing += limbSwingAmount;
	}

	public float getAIMoveSpeed() {
		return 3.7f;
	}
}