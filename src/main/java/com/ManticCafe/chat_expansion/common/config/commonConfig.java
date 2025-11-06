package com.ManticCafe.chat_expansion.common.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class commonConfig {
    public final ForgeConfigSpec.BooleanValue displayitem;

    public commonConfig(ForgeConfigSpec.Builder builder) {
        builder.comment("公共配置");

        builder.push("物品展示功能");
        displayitem = builder
                .comment("是否开启物品展示效果(关闭将禁止进行物品展示.默认:true)")
                .define("物品展示效果",true);
        builder.pop();


    }
}
