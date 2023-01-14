package com.maomao.lavafishing.effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;

public class EndlessFlameEffect extends StatusEffect {
    public EndlessFlameEffect() {
        super(StatusEffectType.HARMFUL, 0xCC3300);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
    @Override
    public void applyUpdateEffect(LivingEntity pLivingEntity, int pAmplifier) {
        pLivingEntity.setFireTicks(20);
        pLivingEntity.setOnFire(true);
        if (pLivingEntity.isInsideWaterOrBubbleColumn()) {
            pLivingEntity.damage(DamageSource.ON_FIRE, 1.0f);
        }
        pLivingEntity.damage(DamageSource.ON_FIRE, 5.0f);
        super.applyUpdateEffect(pLivingEntity, pAmplifier);
    }
}
