package net.aleberrot.paconimod.effect;

import net.aleberrot.paconimod.PaconiMod;
import net.aleberrot.paconimod.effect.effects.StandBoundEffect;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {
    public static  final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, PaconiMod.MOD_ID);


    public static  final RegistryObject<MobEffect> STAND_BOUND =
            MOB_EFFECTS.register("stand_bound", () -> new StandBoundEffect(MobEffectCategory.BENEFICIAL, 0x00FF00));
    public static  void register(IEventBus eventBus){
        MOB_EFFECTS.register(eventBus);
    }
}
