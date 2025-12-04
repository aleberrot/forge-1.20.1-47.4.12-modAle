package net.aleberrot.paconimod.item;

import net.aleberrot.paconimod.effect.ModEffects;
import net.aleberrot.paconimod.effect.effects.StandBoundEffect;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class StandArrow extends Item {
    public StandArrow() {
        super(new Item.Properties().stacksTo(1).durability(1));
    };

    @Override
    public net.minecraft.world.InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, net.minecraft.world.InteractionHand pUsedHand) {
        ItemStack itemstack = pPlayer.getItemInHand(pUsedHand); // Obtener la flecha que está en su mano
        if (!pLevel.isClientSide) { // verificar que este lado del servidor

            // 1. Aplicar el efecto de Stand
            // El valor anterior era 1 segundo (20 ticks).
            pPlayer.addEffect(new MobEffectInstance(ModEffects.STAND_BOUND.get(), 20 * 60, 0));

            // 2. Consumir el item
            itemstack.shrink(1);

            // 3. Enviar el mensaje
            pPlayer.sendSystemMessage(Component.literal("¡Un poder oculto ha despertado dentro de ").append(pPlayer.getName()).append("!"));
        }

        // Devolvemos el resultado: Consumir la Flecha y que la acción fue exitosa.
        return net.minecraft.world.InteractionResultHolder.consume(itemstack);
    }
/*
    @Override
    public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pLivingEntity) {
        if(!pLevel.isClientSide){ // verificar que este lado del servidor
            Player player = (Player) pLivingEntity;

            // Crear efecto para el mod
            player.addEffect(new MobEffectInstance(ModEffects.STAND_BOUND.get(), 20,0));
            pStack.shrink(1);

            player.sendSystemMessage(Component.literal("¡Un poder oculto ha despertado dentro de ").append(player.getName()).append("!"));
        }
        return pStack;
    }

 */
}
