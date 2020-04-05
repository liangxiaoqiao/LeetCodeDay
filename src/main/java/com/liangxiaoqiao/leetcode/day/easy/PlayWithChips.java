package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 1217
 * title: Play with Chips
 * href: https://leetcode.com/problems/play-with-chips
 * desc: There are some chips, and the i-th chip is at position chips[i].
 * You can perform any of the two following types of moves any number of times (possibly zero) on any chip:
 * Move the i-th chip by 2 units to the left or to the right with a cost of 0.
 * Move the i-th chip by 1 unit to the left or to the right with a cost of 1.
 * There can be two or more chips at the same position initially.
 * Return the minimum cost needed to move all the chips to the same position (any position).
 * Example 1:
 * Input: chips = [1,2,3]
 * Output: 1
 * Explanation: Second chip will be moved to positon 3 with cost 1. First chip will be moved to position 3 with cost 0. Total cost is 1.
 * Example 2:
 * Input: chips = [2,2,2,3,3]
 * Output: 2
 * Explanation: Both fourth and fifth chip will be moved to position two with cost 1. Total minimum cost will be 2.
 * Constraints:
 * 1 <= chips.length <= 100
 * 1 <= chips[i] <= 10^9
 * <p>
 * 中文
 * 序号: 1217
 * 标题： 玩筹码
 * 链接： https://leetcode-cn.com/problems/play-with-chips
 * 描述： 数轴上放置了一些筹码，每个筹码的位置存在数组 chips 当中。
 * 你可以对 任何筹码 执行下面两种操作之一（不限操作次数，0 次也可以）：
 * 将第 i 个筹码向左或者右移动 2 个单位，代价为 0。
 * 将第 i 个筹码向左或者右移动 1 个单位，代价为 1。
 * 最开始的时候，同一位置上也可能放着两个或者更多的筹码。
 * 返回将所有筹码移动到同一位置（任意位置）上所需要的最小代价。
 * 示例 1：
 * 输入：chips = [1,2,3]
 * 输出：1
 * 解释：第二个筹码移动到位置三的代价是 1，第一个筹码移动到位置三的代价是 0，总代价为 1。
 * 示例 2：
 * 输入：chips = [2,2,2,3,3]
 * 输出：2
 * 解释：第四和第五个筹码移动到位置二的代价都是 1，所以最小总代价为 2。
 * 提示：
 * 1 <= chips.length <= 100
 * 1 <= chips[i] <= 10^9
 * <p>
 * acceptance: 63.9%
 * difficulty: Easy
 * private: False
 */


//TODO init
public class PlayWithChips {
    public int minCostToMoveChips(int[] chips) {
        return 0;
    }
}