package ru.bastard.snowshoes.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.PowderSnowBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.EntityCollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.bastard.snowshoes.items.ModItems;

@Mixin(PowderSnowBlock.class)
public class PowderSnowBlockMixin {

    @Inject(method = "getCollisionShape", at = @At("HEAD"), cancellable = true)
    public void getCollisionShape(BlockState p_154285_,
                                  BlockGetter p_154286_,
                                  BlockPos p_154287_,
                                  CollisionContext p_154288_,
                                  CallbackInfoReturnable<VoxelShape> cir) {
        if (p_154288_ instanceof EntityCollisionContext ecc) {
            Entity entity = ecc.getEntity();
            if (entity != null) {
                if (entity instanceof Player player) {
                    if (player.getInventory().getArmor(EquipmentSlot.FEET.getIndex()).is(ModItems.SNOWSHOES.get())) {
                        cir.setReturnValue(Shapes.block());
                    }
                }
            }
        }
    }

}
