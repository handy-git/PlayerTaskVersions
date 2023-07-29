package com.handy.playertask.entity;

import lombok.Data;

import java.util.List;

/**
 * 卷轴任务
 *
 * @author handy
 */
@Data
public class TaskReel {

    /**
     * ID
     */
    private Integer id;
    /**
     * 玩家卷轴任务id
     */
    private Integer playerReelId;

    /**
     * 玩家名称
     */
    private String playerName;

    /**
     * 玩家Uuid
     */
    private String playerUuid;

    /**
     * 任务id
     */
    private Integer taskId;

    /**
     * 任务名称
     */
    private String taskName;

    /**
     * 任务要求
     */
    private String taskDemand;

    /**
     * 任务奖励
     */
    private String taskRewards;

    /**
     * 稀有度
     */
    private String rarity;

    /**
     * 任务是否完成 0: 未完成，1: 已完成
     */
    private Boolean status;

    /**
     * 卷轴任务目标
     */
    List<TaskReelPlayerDemand> taskReelPlayerDemands;

    /**
     * 任务描述 关联主表数据
     */
    private String description;
}
