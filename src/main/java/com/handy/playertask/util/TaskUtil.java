package com.handy.playertask.util;

import com.handy.playertask.entity.TaskDemand;
import com.handy.playertask.entity.TaskNpcPlayerDemand;
import com.handy.playertask.entity.TaskPlayer;
import com.handy.playertask.entity.TaskPlayerDemand;
import com.handy.playertask.entity.TaskReel;
import com.handy.playertask.entity.TaskRewards;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 常用方法
 *
 * @author handy
 **/
public class TaskUtil {

    /**
     * 创建任务物品
     *
     * @param taskReel 卷轴任务
     * @param player   玩家
     * @return ItemStack
     * @since 1.13.3
     */
    public static ItemStack createTaskItemStack(TaskReel taskReel, Player player) {
        return null;
    }

    /**
     * 创建任务物品
     *
     * @param player     玩家
     * @param taskPlayer 玩家任务
     * @return ItemStack
     * @since 1.13.3
     */
    public static ItemStack createTaskItemStack(Player player, TaskPlayer taskPlayer) {
        return null;
    }

    /**
     * 创建任务物品 私有方法
     *
     * @param material          物品材质
     * @param customModelDataId 自定义材质物品
     * @param player            玩家
     * @param taskPlayer        玩家任务
     * @param taskLore          任务lore
     * @return ItemStack
     * @since 1.13.3
     */
    private static ItemStack createTaskItemStack(String material, int customModelDataId, Player player, TaskPlayer taskPlayer, List<String> taskLore) {
        return null;
    }

    /**
     * 获取单参数替换lore
     *
     * @param taskPlayer 任务
     * @return loreList
     * @since 1.10.0
     */
    public static Map<String, String> getLoreReplaceMap(TaskPlayer taskPlayer) {
        return new HashMap<>();
    }

    /**
     * 获取替换批量lore map
     *
     * @param taskPlayer 任务
     * @param player     玩家
     * @return map
     * @since 1.13.3
     */
    public static Map<String, List<String>> getLoreBatchReplaceMap(TaskPlayer taskPlayer, Player player) {
        return new HashMap<>();
    }

    /**
     * 玩家任务目标替换map
     *
     * @param taskPlayerDemands 任务
     * @return map
     * @since 1.10.0
     */
    public static List<String> playerTaskTargetReplaceMap(List<TaskPlayerDemand> taskPlayerDemands) {
        return new ArrayList<>();
    }

    /**
     * 任务目标替换map
     *
     * @param taskDemands 任务
     * @return 任务目标
     * @since 1.13.3
     */
    public static List<String> taskTargetReplaceMap(List<TaskDemand> taskDemands) {
        return new ArrayList<>();
    }

    /**
     * Npc任务进度处理
     *
     * @param taskNpcPlayerDemands 任务进度
     * @return 任务进度
     * @since 2.0.0
     */
    public static List<String> taskScheduleLoreList(List<TaskNpcPlayerDemand> taskNpcPlayerDemands) {
        return new ArrayList<>();
    }

    /**
     * 任务目标进度替换map
     *
     * @param taskPlayerDemands 任务目标
     * @return map
     * @since 1.10.0
     */
    public static List<String> taskScheduleReplaceMap(List<TaskPlayerDemand> taskPlayerDemands) {
        return new ArrayList<>();
    }

    /**
     * 任务奖励替换map
     *
     * @param taskRewardsList 任务奖励
     * @param player          玩家
     * @return map
     * @since 1.13.3
     */
    public static List<String> taskRewardReplaceMap(List<TaskRewards> taskRewardsList, Player player) {
        return new ArrayList<>();
    }

    /**
     * 获取描述
     *
     * @param description 描述
     * @return 描述集合
     * @since 1.10.0
     */
    public static List<String> getDescription(String description) {
        return new ArrayList<>();
    }

}