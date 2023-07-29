package com.handy.playertask.entity;

import lombok.Data;

/**
 * 任务卷轴任务目标进度
 *
 * @author handy
 */
@Data
public class TaskReelPlayerDemand {

    /**
     * ID
     */
    private Integer id;

    /**
     * 任务卷轴id
     */
    private Integer reelId;

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