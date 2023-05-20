package com.handy.playertask;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * 主类
 *
 * @author handy
 */
public class PlayerTask extends JavaPlugin {
    private static PlayerTask INSTANCE;

    @Override
    public void onEnable() {
        INSTANCE = this;
    }

    /**
     * 关闭处理
     */
    @Override
    public void onDisable() {
    }

    /**
     * 获取实例
     *
     * @return PlayerTask
     */
    public static PlayerTask getInstance() {
        return INSTANCE;
    }

}
