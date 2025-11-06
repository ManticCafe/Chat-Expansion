package com.ManticCafe.chat_expansion.common.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class clientConfig {
    public final ForgeConfigSpec.BooleanValue displayitem;

    public clientConfig(ForgeConfigSpec.Builder builder) {
        builder.comment("客户端配置");

        builder.push("物品展示功能");
        displayitem = builder
                .comment("是否显示物品展示效果(关闭将屏蔽聊天栏中的物品展示效果,不影响他人展示.默认:true)")
                .define("物品展示效果",true);
        builder.pop();


    }
}
