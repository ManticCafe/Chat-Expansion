package com.ManticCafe.chat_expansion.common.config;

public class clientConfigReader {

    /*
    获取客户端是否开启物品展示功能
    */
    public static boolean getdisplayitem() {
        return configManager.CLIENT.displayitem.get();
    }

}
