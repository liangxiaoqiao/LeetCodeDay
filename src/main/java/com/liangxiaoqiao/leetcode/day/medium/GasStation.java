package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 134
 * title: Gas Station
 * href: https://leetcode.com/problems/gas-station
 * desc: There are N gas stations along a circular route, where the amount of gas at station i is gas[i].\nYou have a car with an unlimited gas tank and it costs cost[i] of gas to travel from station i to its next station (i+1). You begin the journey with an empty tank at one of the gas stations.\nReturn the starting gas station\'s index if you can travel around the circuit once in the clockwise direction, otherwise return -1.\nNote:\nIf there exists a solution, it is guaranteed to be unique.\nBoth input arrays are non-empty and have the same length.\nEach element in the input arrays is a non-negative integer.\nExample 1:\nInput: \ngas  = [1,2,3,4,5]\ncost = [3,4,5,1,2]\n\nOutput: 3\n\nExplanation:\nStart at station 3 (index 3) and fill up with 4 unit of gas. Your tank = 0 + 4 = 4\nTravel to station 4. Your tank = 4 - 1 + 5 = 8\nTravel to station 0. Your tank = 8 - 2 + 1 = 7\nTravel to station 1. Your tank = 7 - 3 + 2 = 6\nTravel to station 2. Your tank = 6 - 4 + 3 = 5\nTravel to station 3. The cost is 5. Your gas is just enough to travel back to station 3.\nTherefore, return 3 as the starting index.\nExample 2:\nInput: \ngas  = [2,3,4]\ncost = [3,4,3]\n\nOutput: -1\n\nExplanation:\nYou can\'t start at station 0 or 1, as there is not enough gas to travel to the next station.\nLet\'s start at station 2 and fill up with 4 unit of gas. Your tank = 0 + 4 = 4\nTravel to station 0. Your tank = 4 - 3 + 2 = 3\nTravel to station 1. Your tank = 3 - 3 + 3 = 3\nYou cannot travel back to station 2, as it requires 4 unit of gas but you only have 3.\nTherefore, you can\'t travel around the circuit once no matter where you start.
 * <p>
 * 中文
 * 序号: 134
 * 标题： 加油站
 * 链接： https://leetcode-cn.com/problems/gas-station
 * 描述： 在一条环路上有 N 个加油站，其中第 i 个加油站有汽油 gas[i] 升。\n你有一辆油箱容量无限的的汽车，从第 i 个加油站开往第 i+1 个加油站需要消耗汽油 cost[i] 升。你从其中的一个加油站出发，开始时油箱为空。\n如果你可以绕环路行驶一周，则返回出发时加油站的编号，否则返回 -1。\n说明: \n如果题目有解，该答案即为唯一答案。\n输入数组均为非空数组，且长度相同。\n输入数组中的元素均为非负数。\n示例 1:\n输入: \ngas  = [1,2,3,4,5]\ncost = [3,4,5,1,2]\n\n输出: 3\n\n解释:\n从 3 号加油站(索引为 3 处)出发，可获得 4 升汽油。此时油箱有 = 0 + 4 = 4 升汽油\n开往 4 号加油站，此时油箱有 4 - 1 + 5 = 8 升汽油\n开往 0 号加油站，此时油箱有 8 - 2 + 1 = 7 升汽油\n开往 1 号加油站，此时油箱有 7 - 3 + 2 = 6 升汽油\n开往 2 号加油站，此时油箱有 6 - 4 + 3 = 5 升汽油\n开往 3 号加油站，你需要消耗 5 升汽油，正好足够你返回到 3 号加油站。\n因此，3 可为起始索引。\n示例 2:\n输入: \ngas  = [2,3,4]\ncost = [3,4,3]\n\n输出: -1\n\n解释:\n你不能从 0 号或 1 号加油站出发，因为没有足够的汽油可以让你行驶到下一个加油站。\n我们从 2 号加油站出发，可以获得 4 升汽油。 此时油箱有 = 0 + 4 = 4 升汽油\n开往 0 号加油站，此时油箱有 4 - 3 + 2 = 3 升汽油\n开往 1 号加油站，此时油箱有 3 - 3 + 3 = 3 升汽油\n你无法返回 2 号加油站，因为返程需要消耗 4 升汽油，但是你的油箱只有 3 升汽油。\n因此，无论怎样，你都不可能绕环路行驶一周。
 * <p>
 * acceptance: 36.0%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        return 0;
    }
}