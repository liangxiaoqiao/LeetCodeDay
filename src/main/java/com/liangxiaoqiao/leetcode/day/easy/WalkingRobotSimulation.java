package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 874
 * title: Walking Robot Simulation
 * href: https://leetcode.com/problems/walking-robot-simulation
 * desc: A robot on an infinite grid starts at point (0, 0) and faces north.  The robot can receive one of three possible types of commands:\n-2: turn left 90 degrees\n-1: turn right 90 degrees\n1 <= x <= 9: move forward x units\nSome of the grid squares are obstacles. \nThe i-th obstacle is at grid point (obstacles[i][0], obstacles[i][1])\nIf the robot would try to move onto them, the robot stays on the previous grid square instead (but still continues following the rest of the route.)\nReturn the square of the maximum Euclidean distance that the robot will be from the origin.\n  Example 1:\nInput: commands = [4,-1,3], obstacles = []\nOutput: 25\nExplanation: robot will go to (3, 4)\nExample 2:\nInput: commands = [4,-1,4,-2,4], obstacles = [[2,4]]\nOutput: 65\nExplanation: robot will be stuck at (1, 4) before turning left and going to (1, 8)\n  Note:\n0 <= commands.length <= 10000\n0 <= obstacles.length <= 10000\n-30000 <= obstacle[i][0] <= 30000\n-30000 <= obstacle[i][1] <= 30000\nThe answer is guaranteed to be less than 2 ^ 31.
 * <p>
 * 中文
 * 序号: 874
 * 标题： 模拟行走机器人
 * 链接： https://leetcode-cn.com/problems/walking-robot-simulation
 * 描述： 机器人在一个无限大小的网格上行走，从点 (0, 0) 处开始出发，面向北方。该机器人可以接收以下三种类型的命令：\n-2：向左转 90 度\n-1：向右转 90 度\n1 <= x <= 9：向前移动 x 个单位长度\n在网格上有一些格子被视为障碍物。\n第 i 个障碍物位于网格点  (obstacles[i][0], obstacles[i][1])\n如果机器人试图走到障碍物上方，那么它将停留在障碍物的前一个网格方块上，但仍然可以继续该路线的其余部分。\n返回从原点到机器人的最大欧式距离的平方。\n  示例 1：\n输入: commands = [4,-1,3], obstacles = []\n输出: 25\n解释: 机器人将会到达 (3, 4)\n示例 2：\n输入: commands = [4,-1,4,-2,4], obstacles = [[2,4]]\n输出: 65\n解释: 机器人在左转走到 (1, 8) 之前将被困在 (1, 4) 处\n  提示：\n0 <= commands.length <= 10000\n0 <= obstacles.length <= 10000\n-30000 <= obstacle[i][0] <= 30000\n-30000 <= obstacle[i][1] <= 30000\n答案保证小于 2 ^ 31
 * <p>
 * acceptance: 33.9%
 * difficulty: Easy
 * private: False
 */


//TODO init
public class WalkingRobotSimulation {
    public int robotSim(int[] commands, int[][] obstacles) {
        return 0;
    }
}