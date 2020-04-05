package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 818
 * title: Race Car
 * href: https://leetcode.com/problems/race-car
 * desc: Your car starts at position 0 and speed +1 on an infinite number line.  (Your car can go into negative positions.)\nYour car drives automatically according to a sequence of instructions A (accelerate) and R (reverse).\nWhen you get an instruction \"A\", your car does the following: position += speed, speed *= 2.\nWhen you get an instruction \"R\", your car does the following: if your speed is positive then speed = -1 , otherwise speed = 1.  (Your position stays the same.)\nFor example, after commands \"AAR\", your car goes to positions 0->1->3->3, and your speed goes to 1->2->4->-1.\nNow for some target position, say the length of the shortest sequence of instructions to get there.\nExample 1:\nInput: \ntarget = 3\nOutput: 2\nExplanation: \nThe shortest instruction sequence is \"AA\".\nYour position goes from 0->1->3.\nExample 2:\nInput: \ntarget = 6\nOutput: 5\nExplanation: \nThe shortest instruction sequence is \"AAARA\".\nYour position goes from 0->1->3->7->7->6.\n  Note:\n1 <= target <= 10000.
 * <p>
 * 中文
 * 序号: 818
 * 标题： 赛车
 * 链接： https://leetcode-cn.com/problems/race-car
 * 描述： 你的赛车起始停留在位置 0，速度为 +1，正行驶在一个无限长的数轴上。（车也可以向负数方向行驶。）\n你的车会根据一系列由 A（加速）和 R（倒车）组成的指令进行自动驾驶 。\n当车得到指令 \"A\" 时, 将会做出以下操作： position += speed, speed *= 2。\n当车得到指令 \"R\" 时, 将会做出以下操作：如果当前速度是正数，则将车速调整为 speed = -1 ；否则将车速调整为 speed = 1。  (当前所处位置不变。)\n例如，当得到一系列指令 \"AAR\" 后, 你的车将会走过位置 0->1->3->3，并且速度变化为 1->2->4->-1。\n现在给定一个目标位置，请给出能够到达目标位置的最短指令列表的长度。\n示例 1:\n输入: \ntarget = 3\n输出: 2\n解释: \n最短指令列表为 \"AA\"\n位置变化为 0->1->3\n示例 2:\n输入: \ntarget = 6\n输出: 5\n解释: \n最短指令列表为 \"AAARA\"\n位置变化为 0->1->3->7->7->6\n说明:\n1 <= target（目标位置） <= 10000。
 * <p>
 * acceptance: 37.4%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class RaceCar {
    public int racecar(int target) {
        return 0;
    }
}