package com.handy.playertask.api;

import com.handy.playertask.entity.TaskList;
import org.bukkit.entity.Player;

import java.util.List;

/**
 * API
 *
 * @author handy
 * @since 1.11.0
 */
public class PlayerTaskApi {

    private PlayerTaskApi() {
    }

    private static class SingletonHolder {
        private static final PlayerTaskApi INSTANCE = new PlayerTaskApi();
    }

    public static PlayerTaskApi getInstance() {
        return PlayerTaskApi.SingletonHolder.INSTANCE;
    }

    /**
     * 根据任务id查询任务详情
     *
     * @param taskId 任务id
     * @return 任务详情
     * @since 1.11.0
     */
    public TaskList findDetailByTaskId(Integer taskId) {
        return null;
    }

    /**
     * 发送奖励
     *
     * @param playerList       玩家列表
     * @param taskRewardIdList 奖励内容ids
     * @return true
     */
    public boolean reward(List<Player> playerList, List<Integer> taskRewardIdList) {
        return true;
    }

    /**
     * 任务币数量
     *
     * @param player 玩家
     * @return 任务币数量
     * @since 1.11.0
     */
    public Integer findAmountByPlayer(Player player) {
        return 0;
    }

    /**
     * 任务币数量
     *
     * @param playerName 玩家名
     * @return 任务币数量
     * @since 1.11.0
     */
    public Integer findAmountByPlayer(String playerName) {
        return 0;
    }

    /**
     * 添加玩家任务币数量
     *
     * @param player 玩家
     * @param amount 数量
     * @return true
     * @since 1.11.0
     */
    public boolean addCoin(Player player, Integer amount) {
        return true;
    }

    /**
     * 添加玩家任务币数量
     *
     * @param playerName 玩家名
     * @param amount     数量
     * @return true
     * @since 1.11.0
     */
    public boolean addCoin(String playerName, Integer amount) {
        return true;
    }

    /**
     * 减少玩家任务币数量
     *
     * @param player 玩家
     * @param amount 数量
     * @return true
     * @since 1.11.0
     */
    public boolean subtractCoin(Player player, Integer amount) {
        return true;
    }

    /**
     * 减少玩家任务币数量
     *
     * @param playerName 玩家名
     * @param amount     数量
     * @return true
     * @since 1.11.0
     */
    public boolean subtractCoin(String playerName, Integer amount) {
        return true;
    }

}