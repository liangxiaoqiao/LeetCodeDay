package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 746
 * title: Min Cost Climbing Stairs
 * href: https://leetcode.com/problems/min-cost-climbing-stairs
 * desc: On a staircase, the i-th step has some non-negative cost cost[i] assigned (0 indexed).\nOnce you pay the cost, you can either climb one or two steps. You need to find minimum cost to reach the top of the floor, and you can either start from the step with index 0, or the step with index 1.\nExample 1:\nInput: cost = [10, 15, 20]\nOutput: 15\nExplanation: Cheapest is start on cost[1], pay that cost and go to the top.\nExample 2:\nInput: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]\nOutput: 6\nExplanation: Cheapest is start on cost[0], and only step on 1s, skipping cost[3].\nNote:\ncost will have a length in the range [2, 1000].\nEvery cost[i] will be an integer in the range [0, 999].
 * <p>
 * 中文
 * 序号: 746
 * 标题： 使用最小花费爬楼梯
 * 链接： https://leetcode-cn.com/problems/min-cost-climbing-stairs
 * 描述： 数组的每个索引做为一个阶梯，第 i个阶梯对应着一个非负数的体力花费值 cost[i](索引从0开始)。\n每当你爬上一个阶梯你都要花费对应的体力花费值，然后你可以选择继续爬一个阶梯或者爬两个阶梯。\n您需要找到达到楼层顶部的最低花费。在开始时，你可以选择从索引为 0 或 1 的元素作为初始阶梯。\n示例 1:\n输入: cost = [10, 15, 20]\n输出: 15\n解释: 最低花费是从cost[1]开始，然后走两步即可到阶梯顶，一共花费15。\n 示例 2:\n输入: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]\n输出: 6\n解释: 最低花费方式是从cost[0]开始，逐个经过那些1，跳过cost[3]，一共花费6。\n注意：\ncost 的长度将会在 [2, 1000]。\n每一个 cost[i] 将会是一个Integer类型，范围为 [0, 999]。
 * <p>
 * acceptance: 48.7%
 * difficulty: Easy
 * private: False
 */


//TODO init
public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        return 0;
    }
}