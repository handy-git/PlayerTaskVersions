package com.handy.playertask.entity;

import lombok.Data;

/**
 * 任务奖励
 *
 * @author handy
 */
@Data
public class TaskRewards {

    /**
     * ID
     */
    private Integer id;

    /**
     * 类型
     */
    private String type;

    /**
     * 数量
     */
    private Integer amount;

    /**
     * 自定义物品
     */
    private String itemStack;

    /**
     * 奖励描述
     */
    private String description;
}