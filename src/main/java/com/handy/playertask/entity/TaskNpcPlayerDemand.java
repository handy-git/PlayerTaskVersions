package com.handy.playertask.entity;

import lombok.Data;

/**
 * 玩家NPC任务目标
 *
 * @author handy
 */
@Data
public class TaskNpcPlayerDemand {

    /**
     * ID
     */
    private Integer id;

    /**
     * 玩家npc任务id
     */
    private Integer taskNpcPlayerId;

    /**
     * npcId
     */
    private Integer npcId;

    /**
     * 玩家名称
     */
    private String playerName;

    /**
     * 玩家Uuid
     */
    private String playerUuid;

    /**
     * 类型
     */
    private String type;

    /**
     * 完成过的数量
     */
    private Integer completionAmount;

    /**
     * 数量
     */
    private Integer amount;

    /**
     * 自定义物品
     */
    private String itemStack;

}