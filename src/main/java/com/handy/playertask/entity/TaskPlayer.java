package com.handy.playertask.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 玩家每日任务
 *
 * @author handy
 */
@Data
public class TaskPlayer {

    /**
     * ID
     */
    private Integer id;

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
     * 任务时间
     */
    private Date taskDate;

    /**
     * 是否完成
     */
    private Boolean status;

    /**
     * 刷新次数
     */
    private Integer refresh;

    /**
     * 任务具体要求
     */
    List<TaskPlayerDemand> taskPlayerDemands;

    /**
     * 任务具体奖励
     */
    List<TaskRewards> taskRewardsList;

    /**
     * 任务npcId
     */
    private Integer npcId;

    /**
     * 任务卷轴Id
     */
    private Integer reelId;

    /**
     * 玩家卷轴任务id
     */
    private Integer playerReelId;

    /**
     * 稀有度
     */
    private String rarity;

    /**
     * 任务描述
     */
    private String description;


}