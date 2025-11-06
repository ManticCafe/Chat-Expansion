package com.ManticCafe.chat_expansion;

import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(main.MODID)
public class main {
    public static final String MODID = "chat_expansion";
    private static final Logger LOGGER = LogUtils.getLogger();

    public main(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();
        modEventBus.addListener(this::onCommonSetup);

        LOGGER.info("Starting mod initialization...");

//        configManager.register();
//        entityhandler.register(modEventBus);
//        itemhandler.register(modEventBus);
//        tabhandler.register(modEventBus);
//        blockhandler.register(modEventBus);

        LOGGER.info("Mod initialization phase 1 complete");
    }

    private void onCommonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Common setup - verifying configuration cache...");

    }
}