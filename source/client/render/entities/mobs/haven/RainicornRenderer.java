package net.tslat.aoa3.client.render.entities.mobs.haven;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.tslat.aoa3.client.model.entities.mobs.haven.ModelRainicorn;
import net.tslat.aoa3.common.registration.ParticleRegister;
import net.tslat.aoa3.entity.mobs.haven.EntityRainicorn;
import net.tslat.aoa3.library.Enums;

import javax.annotation.Nullable;

@SideOnly(Side.CLIENT)
public class RainicornRenderer extends RenderLiving<EntityRainicorn> {
	private final ResourceLocation texture;

	public RainicornRenderer(RenderManager renderManager, ResourceLocation textureResource) {
		super(renderManager, new ModelRainicorn(), EntityRainicorn.entityWidth / 3);

		this.texture = textureResource;
	}

	@Override
	public void doRender(EntityRainicorn entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (entity.motionX > 0 || entity.motionZ > 0 || entity.motionY > 0) {
			entity.world.spawnParticle(ParticleRegister.FLUFFY, entity.posX, entity.posY + 1.5, entity.posZ, 0, 0, 0, Enums.RGBIntegers.RED, 75, 3, 5);
			entity.world.spawnParticle(ParticleRegister.FLUFFY, entity.posX, entity.posY + 1.25, entity.posZ, 0, 0, 0, Enums.RGBIntegers.ORANGE, 75, 3, 5);
			entity.world.spawnParticle(ParticleRegister.FLUFFY, entity.posX, entity.posY + 1.05, entity.posZ, 0, 0, 0, Enums.RGBIntegers.YELLOW, 75, 3, 5);
			entity.world.spawnParticle(ParticleRegister.FLUFFY, entity.posX, entity.posY + 0.95, entity.posZ, 0, 0, 0, Enums.RGBIntegers.GREEN, 75, 3, 5);
			entity.world.spawnParticle(ParticleRegister.FLUFFY, entity.posX, entity.posY + 0.95, entity.posZ, 0, 0, 0, Enums.RGBIntegers.CYAN, 75, 3, 5);
			entity.world.spawnParticle(ParticleRegister.FLUFFY, entity.posX, entity.posY + 0.75, entity.posZ, 0, 0, 0, Enums.RGBIntegers.BLUE, 75, 3, 5);
			entity.world.spawnParticle(ParticleRegister.FLUFFY, entity.posX, entity.posY + 0.5, entity.posZ, 0, 0, 0, Enums.RGBIntegers.PURPLE, 75, 3, 5);
		}
	}

	@Nullable
	@Override
	protected ResourceLocation getEntityTexture(EntityRainicorn entity) {
		return texture;
	}
}