package jadestrouble.musicdiscs.mixins;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import jadestrouble.musicdiscs.Config;
import jadestrouble.musicdiscs.items.Discs;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.entity.mob.MonsterEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(CreeperEntity.class)
abstract public class CreeperEntityMixin extends MonsterEntity {

    public CreeperEntityMixin(World arg) {
        super(arg);
    }

    @WrapOperation(
            method = "onKilledBy",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/entity/mob/CreeperEntity;dropItem(II)Lnet/minecraft/entity/ItemEntity;"
            )
    )
    public ItemEntity method_1390(CreeperEntity instance, int id, int count, Operation<ItemEntity> original) {
        if (Config.config.replaceDiscsOnSkeletonKillCreeper) {
            return instance.dropItem(new ItemStack(Discs.creeperDiscSpawnList.get(random.nextInt(Discs.creeperDiscSpawnList.size())), 1), 0.0F);
        } else {
            return original.call(instance, id, count);
        }
    }
}