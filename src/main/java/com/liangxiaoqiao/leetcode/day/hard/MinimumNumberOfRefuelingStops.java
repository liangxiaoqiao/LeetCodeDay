package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 871
 * title: Minimum Number of Refueling Stops
 * href: https://leetcode.com/problems/minimum-number-of-refueling-stops
 * desc: A car travels from a starting position to a destination which is target miles east of the starting position.\nAlong the way, there are gas stations.  Each station[i] represents a gas station that is station[i][0] miles east of the starting position, and has station[i][1] liters of gas.\nThe car starts with an infinite tank of gas, which initially has startFuel liters of fuel in it.  It uses 1 liter of gas per 1 mile that it drives.\nWhen the car reaches a gas station, it may stop and refuel, transferring all the gas from the station into the car.\nWhat is the least number of refueling stops the car must make in order to reach its destination?  If it cannot reach the destination, return -1.\nNote that if the car reaches a gas station with 0 fuel left, the car can still refuel there.  If the car reaches the destination with 0 fuel left, it is still considered to have arrived.\n  Example 1:\nInput: target = 1, startFuel = 1, stations = []\nOutput: 0\nExplanation: We can reach the target without refueling.\nExample 2:\nInput: target = 100, startFuel = 1, stations = [[10,100]]\nOutput: -1\nExplanation: We can\'t reach the target (or even the first gas station).\nExample 3:\nInput: target = 100, startFuel = 10, stations = [[10,60],[20,30],[30,30],[60,40]]\nOutput: 2\nExplanation: \nWe start with 10 liters of fuel.\nWe drive to position 10, expending 10 liters of fuel.  We refuel from 0 liters to 60 liters of gas.\nThen, we drive from position 10 to position 60 (expending 50 liters of fuel),\nand refuel from 10 liters to 50 liters of gas.  We then drive to and reach the target.\nWe made 2 refueling stops along the way, so we return 2.\n  Note:\n1 <= target, startFuel, stations[i][1] <= 10^9\n0 <= stations.length <= 500\n0 < stations[0][0] < stations[1][0] < ... < stations[stations.length-1][0] < target
 * <p>
 * 中文
 * 序号: 871
 * 标题： 最低加油次数
 * 链接： https://leetcode-cn.com/problems/minimum-number-of-refueling-stops
 * 描述： 汽车从起点出发驶向目的地，该目的地位于出发位置东面 target 英里处。\n沿途有加油站，每个 station[i] 代表一个加油站，它位于出发位置东面 station[i][0] 英里处，并且有 station[i][1] 升汽油。\n假设汽车油箱的容量是无限的，其中最初有 startFuel 升燃料。它每行驶 1 英里就会用掉 1 升汽油。\n当汽车到达加油站时，它可能停下来加油，将所有汽油从加油站转移到汽车中。\n为了到达目的地，汽车所必要的最低加油次数是多少？如果无法到达目的地，则返回 -1 。\n注意：如果汽车到达加油站时剩余燃料为 0，它仍然可以在那里加油。如果汽车到达目的地时剩余燃料为 0，仍然认为它已经到达目的地。\n  示例 1：\n输入：target = 1, startFuel = 1, stations = []\n输出：0\n解释：我们可以在不加油的情况下到达目的地。\n示例 2：\n输入：target = 100, startFuel = 1, stations = [[10,100]]\n输出：-1\n解释：我们无法抵达目的地，甚至无法到达第一个加油站。\n示例 3：\n输入：target = 100, startFuel = 10, stations = [[10,60],[20,30],[30,30],[60,40]]\n输出：2\n解释：\n我们出发时有 10 升燃料。\n我们开车来到距起点 10 英里处的加油站，消耗 10 升燃料。将汽油从 0 升加到 60 升。\n然后，我们从 10 英里处的加油站开到 60 英里处的加油站（消耗 50 升燃料），\n并将汽油从 10 升加到 50 升。然后我们开车抵达目的地。\n我们沿途在1两个加油站停靠，所以返回 2 。\n  提示：\n1 <= target, startFuel, stations[i][1] <= 10^9\n0 <= stations.length <= 500\n0 < stations[0][0] < stations[1][0] < ... < stations[stations.length-1][0] < target
 * <p>
 * acceptance: 30.7%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class MinimumNumberOfRefuelingStops {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        return 0;
    }
}