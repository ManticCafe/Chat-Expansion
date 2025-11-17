package com.ManticCafe.chat_expansion.mixin.client.gui.screen;

import com.ManticCafe.chat_expansion.common.config.commonConfigReader;
import net.minecraft.client.gui.screens.ChatScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(ChatScreen.class)
public class ChatScreenMix {

    private int chatMaxChar = commonConfigReader.getMaxChatChar();

    @ModifyArg(method = "init", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/components/EditBox;setMaxLength(I)V"), index = 0)
    private int setMaxLengthMix(int reset) {
        return chatMaxChar;
    }

//    @Shadow protected EditBox input;
//
//    @Inject(method = "init",at = @At("TAIL"))
//    private void setMaxLengthMix(CallbackInfo reset) {
//        if (input != null) {
//            this.input.setMaxLength(512);
//        }
//    }
}
