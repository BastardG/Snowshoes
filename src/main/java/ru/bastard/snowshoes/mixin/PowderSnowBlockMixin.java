package ru.bastard.snowshoes.mixin;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.PowderSnowBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.bastard.snowshoes.items.ModItems;

@Mixin(PowderSnowBlock.class)
public class PowderSnowBlockMixin {

    @Inject(method = "canEntityWalkOnPowderSnow", at = @At("HEAD"), cancellable = true)
    private static void canEntityWalkOnPowderSnow(Entity p_154256_, CallbackInfoReturnable<Boolean> r) {
        if (p_154256_ instanceof Player player) {
            if (player.getInventory().getArmor(EquipmentSlot.FEET.getIndex()).is(ModItems.SNOWSHOES.get())) {
                r.setReturnValue(true);
            }
        }
    }

}
