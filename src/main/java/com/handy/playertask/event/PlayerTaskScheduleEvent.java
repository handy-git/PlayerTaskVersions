package com.handy.playertask.event;

import lombok.Getter;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * 玩家任务进度
 *
 * @author handy
 * @since 1.11.0
 */
public class PlayerTaskScheduleEvent extends Event {
    private static final HandlerList HANDLERS = new HandlerList();
    @Getter
    private final Player player;
    @Getter
    private final String demandType;
    @Getter
    private final Integer amount;
    @Getter
    private final String content;

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    /**
     * getHandlerList
     *
     * @return HandlerList
     */
    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    /**
     * 构造
     *
     * @param player     player
     * @param demandType demandType
     * @param amount     amount
     * @param content    content
     */
    public PlayerTaskScheduleEvent(Player player, String demandType, Integer amount, String content) {
        this.player = player;
        this.demandType = demandType;
        this.amount = amount;
        this.content = content;
    }

}