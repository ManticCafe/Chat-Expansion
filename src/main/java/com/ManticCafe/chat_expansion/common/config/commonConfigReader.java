package com.ManticCafe.chat_expansion.common.config;

public class commonConfigReader {

    /*
    获取服务端是否开启物品展示功能
    */
    public static boolean getdisplayitem() {
        return configManager.COMMON.displayitem.get();
    }

}
