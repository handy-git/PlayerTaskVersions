package com.handy.playertask.entity;

import lombok.Data;

import java.util.List;

/**
 * 任务列表
 *
 * @author handy
 */
@Data
public class TaskList {

    /**
     * ID
     */
    private Integer id;

    /**
     * 任务名称
     */
    private String taskName;

    /**
     * 任务要求Ids
     */
    private String taskDemand;

    /**
     * 任务奖励v
     */
    private String taskRewards;

    /**
     * 是否启用
     */
    private Boolean status;

    /**
     * 任务类型
     */
    private String type;

    /**
     * 稀有度
     */
    private String rarity;

    /**
     * 任务描述
     */
    private String description;

    /**
     * 任务具体要求
     */
    List<TaskDemand> taskDemands;

    /**
     * 任务具体奖励
     */
    List<TaskRewards> taskRewardsList;
}