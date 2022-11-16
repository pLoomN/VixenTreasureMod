package net.yodnon.vixenoremod.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import net.yodnon.vixenoremod.VixenOreMod;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class VixenOreModMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		VixenOreMod.LOGGER.info("This line is printed by pLoomN!");
	}
}
