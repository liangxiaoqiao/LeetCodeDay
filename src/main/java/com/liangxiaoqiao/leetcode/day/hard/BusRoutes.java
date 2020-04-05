package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 815
 * title: Bus Routes
 * href: https://leetcode.com/problems/bus-routes
 * desc: We have a list of bus routes. Each routes[i] is a bus route that the i-th bus repeats forever. For example if routes[0] = [1, 5, 7], this means that the first bus (0-th indexed) travels in the sequence 1->5->7->1->5->7->1->... forever.\nWe start at bus stop S (initially not on a bus), and we want to go to bus stop T. Travelling by buses only, what is the least number of buses we must take to reach our destination? Return -1 if it is not possible.\nExample:\nInput: \nroutes = [[1, 2, 7], [3, 6, 7]]\nS = 1\nT = 6\nOutput: 2\nExplanation: \nThe best strategy is take the first bus to the bus stop 7, then take the second bus to the bus stop 6.\nNote:\n1 <= routes.length <= 500.\n1 <= routes[i].length <= 500.\n0 <= routes[i][j] < 10 ^ 6.
 * <p>
 * 中文
 * 序号: 815
 * 标题： 公交路线
 * 链接： https://leetcode-cn.com/problems/bus-routes
 * 描述： 我们有一系列公交路线。每一条路线 routes[i] 上都有一辆公交车在上面循环行驶。例如，有一条路线 routes[0] = [1, 5, 7]，表示第一辆 (下标为0) 公交车会一直按照 1->5->7->1->5->7->1->... 的车站路线行驶。\n假设我们从 S 车站开始（初始时不在公交车上），要去往 T 站。 期间仅可乘坐公交车，求出最少乘坐的公交车数量。返回 -1 表示不可能到达终点车站。\n示例:\n输入: \nroutes = [[1, 2, 7], [3, 6, 7]]\nS = 1\nT = 6\n输出: 2\n解释: \n最优策略是先乘坐第一辆公交车到达车站 7, 然后换乘第二辆公交车到车站 6。\n说明:\n1 <= routes.length <= 500.\n1 <= routes[i].length <= 500.\n0 <= routes[i][j] < 10 ^ 6.
 * <p>
 * acceptance: 41.5%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class BusRoutes {
    public int numBusesToDestination(int[][] routes, int S, int T) {
        return 0;
    }
}