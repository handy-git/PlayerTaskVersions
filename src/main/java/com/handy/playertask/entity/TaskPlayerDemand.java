package com.handy.playertask.entity;

import lombok.Data;

import java.util.Date;

/**
 * 玩家任务目标
 *
 * @author handy
 */
@Data
public class TaskPlayerDemand {

    /**
     * ID
     */
    private Integer id;

    /**
     * 玩家任务id
     */
    private Integer taskPlayerId;

    /**
     * 玩家名称
     */
    private String playerName;

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

    /**
     * 任务日期
     */
    private Date taskDate;

    private Integer reelId;

    private Integer taskNpcPlayerId;

}