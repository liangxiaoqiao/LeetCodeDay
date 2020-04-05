package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 1041
 * title: Robot Bounded In Circle
 * href: https://leetcode.com/problems/robot-bounded-in-circle
 * desc: On an infinite plane, a robot initially stands at (0, 0) and faces north.  The robot can receive one of three instructions:
 * "G": go straight 1 unit;
 * "L": turn 90 degrees to the left;
 * "R": turn 90 degress to the right.
 * The robot performs the instructions given in order, and repeats them forever.
 * Return true if and only if there exists a circle in the plane such that the robot never leaves the circle.
 * Example 1:
 * Input: "GGLLGG"
 * Output: true
 * Explanation:
 * The robot moves from (0,0) to (0,2), turns 180 degrees, and then returns to (0,0).
 * When repeating these instructions, the robot remains in the circle of radius 2 centered at the origin.
 * Example 2:
 * Input: "GG"
 * Output: false
 * Explanation:
 * The robot moves north indefinitely.
 * Example 3:
 * Input: "GL"
 * Output: true
 * Explanation:
 * The robot moves from (0, 0) -> (0, 1) -> (-1, 1) -> (-1, 0) -> (0, 0) -> ...
 * Note:
 * 1 <= instructions.length <= 100
 * instructions[i] is in {'G', 'L', 'R'}
 * <p>
 * 中文
 * 序号: 1041
 * 标题： 困于环中的机器人
 * 链接： https://leetcode-cn.com/problems/robot-bounded-in-circle
 * 描述： 在无限的平面上，机器人最初位于 (0, 0) 处，面朝北方。机器人可以接受下列三条指令之一：
 * "G"：直走 1 个单位
 * "L"：左转 90 度
 * "R"：右转 90 度
 * 机器人按顺序执行指令 instructions，并一直重复它们。
 * 只有在平面中存在环使得机器人永远无法离开时，返回 true。否则，返回 false。
 * 示例 1：
 * 输入："GGLLGG"
 * 输出：true
 * 解释：
 * 机器人从 (0,0) 移动到 (0,2)，转 180 度，然后回到 (0,0)。
 * 重复这些指令，机器人将保持在以原点为中心，2 为半径的环中进行移动。
 * 示例 2：
 * 输入："GG"
 * 输出：false
 * 解释：
 * 机器人无限向北移动。
 * 示例 3：
 * 输入："GL"
 * 输出：true
 * 解释：
 * 机器人按 (0, 0) -> (0, 1) -> (-1, 1) -> (-1, 0) -> (0, 0) -> ... 进行移动。
 * 提示：
 * 1 <= instructions.length <= 100
 * instructions[i] 在 {'G', 'L', 'R'} 中
 * <p>
 * acceptance: 47.3%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class RobotBoundedInCircle {
    public boolean isRobotBounded(String instructions) {
        return false;
    }
}