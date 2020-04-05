package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 787
 * title: Cheapest Flights Within K Stops
 * href: https://leetcode.com/problems/cheapest-flights-within-k-stops
 * desc: There are n cities connected by m flights. Each fight starts from city u and arrives at v with a price w.\nNow given all the cities and flights, together with starting city src and the destination dst, your task is to find the cheapest price from src to dst with up to k stops. If there is no such route, output -1.\nExample 1:\nInput: \nn = 3, edges = [[0,1,100],[1,2,100],[0,2,500]]\nsrc = 0, dst = 2, k = 1\nOutput: 200\nExplanation: \nThe graph looks like this:\n\n\nThe cheapest price from city 0 to city 2 with at most 1 stop costs 200, as marked red in the picture.\nExample 2:\nInput: \nn = 3, edges = [[0,1,100],[1,2,100],[0,2,500]]\nsrc = 0, dst = 2, k = 0\nOutput: 500\nExplanation: \nThe graph looks like this:\n\n\nThe cheapest price from city 0 to city 2 with at most 0 stop costs 500, as marked blue in the picture.\nNote:\nThe number of nodes n will be in range [1, 100], with nodes labeled from 0 to n - 1.\nThe size of flights will be in range [0, n * (n - 1) / 2].\nThe format of each flight will be (src, dst, price).\nThe price of each flight will be in the range [1, 10000].\nk is in the range of [0, n - 1].\nThere will not be any duplicated flights or self cycles.
 * <p>
 * 中文
 * 序号: 787
 * 标题： K 站中转内最便宜的航班
 * 链接： https://leetcode-cn.com/problems/cheapest-flights-within-k-stops
 * 描述： 有 n 个城市通过 m 个航班连接。每个航班都从城市 u 开始，以价格 w 抵达 v。\n现在给定所有的城市和航班，以及出发城市 src 和目的地 dst，你的任务是找到从 src 到 dst 最多经过 k 站中转的最便宜的价格。 如果没有这样的路线，则输出 -1。\n示例 1:\n输入: \nn = 3, edges = [[0,1,100],[1,2,100],[0,2,500]]\nsrc = 0, dst = 2, k = 1\n输出: 200\n解释: \n城市航班图如下\n\n\n从城市 0 到城市 2 在 1 站中转以内的最便宜价格是 200，如图中红色所示。\n示例 2:\n输入: \nn = 3, edges = [[0,1,100],[1,2,100],[0,2,500]]\nsrc = 0, dst = 2, k = 0\n输出: 500\n解释: \n城市航班图如下\n\n\n从城市 0 到城市 2 在 0 站中转以内的最便宜价格是 500，如图中蓝色所示。\n提示：\nn 范围是 [1, 100]，城市标签从 0 到 n - 1.\n航班数量范围是 [0, n * (n - 1) / 2].\n每个航班的格式 (src, dst, price).\n每个航班的价格范围是 [1, 10000].\nk 范围是 [0, n - 1].\n航班没有重复，且不存在环路
 * <p>
 * acceptance: 36.9%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class CheapestFlightsWithinKStops {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        return 0;
    }
}