package com.ManticCafe.chat_expansion.common.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class commonConfig {
    public final ForgeConfigSpec.BooleanValue displayitem;
    public final ForgeConfigSpec.IntValue maxChatChar;

    public commonConfig(ForgeConfigSpec.Builder builder) {
        builder.comment("公共配置");

        builder.push("物品展示功能:");
        displayitem = builder
                .comment("是否开启物品展示效果(关闭将禁止进行物品展示.默认:true)")
                .define("物品展示效果",true);
        builder.pop();

        builder.push("聊天栏字符上限:");
        maxChatChar = builder
                .comment("聊天栏字符上限(默认:512)")
                .comment("警告:虽然 Chat Expansion 允许你调整字符上限到8192,但参数过高可能超出数据包的限制,引发不可预测的错误,请谨慎调节")
                .defineInRange("聊天栏字符上限",512,1,8192);
        builder.pop();

    }
}
