package com.ManticCafe.chat_expansion.common.config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import org.apache.commons.lang3.tuple.Pair;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class configManager {

    public static final clientConfig CLIENT;
    public static final ForgeConfigSpec CLIENT_SPEC;
    public static final serverConfig SERVER;
    public static final ForgeConfigSpec SERVER_SPEC;

    static {

        final Pair<clientConfig, ForgeConfigSpec> clientPair = new ForgeConfigSpec.Builder().configure(clientConfig::new);
        final Pair<serverConfig, ForgeConfigSpec> serverPair = new ForgeConfigSpec.Builder().configure(serverConfig::new);
        CLIENT = clientPair.getLeft();
        CLIENT_SPEC = clientPair.getRight();
        SERVER = serverPair.getLeft();
        SERVER_SPEC = serverPair.getRight();

    }


    public static void register() {

        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, CLIENT_SPEC, "ManticCafe/chat_expansion/clientConfig.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, SERVER_SPEC, "ManticCafe/chat_expansion/serverConfig.toml");

    }
}