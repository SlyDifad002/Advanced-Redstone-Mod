package net.mcreator.sly_adnanced_redstone.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneModElements;

import java.util.Map;

@SlyAdnancedRedstoneModElements.ModElement.Tag
public class StakeFoodEatenProcedure extends SlyAdnancedRedstoneModElements.ModElement {
	public StakeFoodEatenProcedure(SlyAdnancedRedstoneModElements instance) {
		super(instance, 175);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure StakeFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INSTANT_HEALTH, (int) 400, (int) 4, (false), (false)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 400, (int) 4, (false), (false)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 400, (int) 4, (false), (false)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 400, (int) 4, (false), (false)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 400, (int) 4, (false), (false)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.HEALTH_BOOST, (int) 400, (int) 4, (false), (false)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.ABSORPTION, (int) 400, (int) 4, (false), (false)));
	}
}
