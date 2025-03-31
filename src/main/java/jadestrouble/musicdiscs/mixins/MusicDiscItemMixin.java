package jadestrouble.musicdiscs.mixins;

import com.llamalad7.mixinextras.injector.WrapWithCondition;
import jadestrouble.musicdiscs.Config;
import jadestrouble.musicdiscs.items.NewDiscs;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.world.World;
import net.modificationstation.stationapi.api.client.item.CustomTooltipProvider;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(MusicDiscItem.class)
public class MusicDiscItemMixin extends Item implements CustomTooltipProvider {

    @Shadow @Final public String sound;

    public MusicDiscItemMixin(int id) {
        super(id);
    }

    @Environment(EnvType.SERVER)
    @WrapWithCondition(
            method = "useOnBlock",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/world/World;worldEvent(Lnet/minecraft/entity/player/PlayerEntity;IIIII)V"
            )
    )
    public boolean cancelSendingJukeboxMessage(World world, PlayerEntity player, int eventId, int x, int y, int z, int id) {
        return !(this.asItem() instanceof NewDiscs);
    }

    @Override
    public String[] getTooltip(ItemStack itemStack, String originalTooltip) {
        if (Config.config.disableModernMusicDiscTooltips) {
            return new String[]{originalTooltip};
        } else {
            return new String[]{"§b" + originalTooltip, "§7C418 - " + sound};
        }
    }
}
