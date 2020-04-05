package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 672
 * title: Bulb Switcher II
 * href: https://leetcode.com/problems/bulb-switcher-ii
 * desc: There is a room with n lights which are turned on initially and 4 buttons on the wall. After performing exactly m unknown operations towards buttons, you need to return how many different kinds of status of the n lights could be.\nSuppose n lights are labeled as number [1, 2, 3 ..., n], function of these 4 buttons are given below:\nFlip all the lights.\nFlip lights with even numbers.\nFlip lights with odd numbers.\nFlip lights with (3k + 1) numbers, k = 0, 1, 2, ...\n  Example 1:\nInput: n = 1, m = 1.\nOutput: 2\nExplanation: Status can be: [on], [off]\n  Example 2:\nInput: n = 2, m = 1.\nOutput: 3\nExplanation: Status can be: [on, off], [off, on], [off, off]\n  Example 3:\nInput: n = 3, m = 1.\nOutput: 4\nExplanation: Status can be: [off, on, off], [on, off, on], [off, off, off], [off, on, on].\n  Note: n and m both fit in range [0, 1000].
 * <p>
 * 中文
 * 序号: 672
 * 标题： 灯泡开关 Ⅱ
 * 链接： https://leetcode-cn.com/problems/bulb-switcher-ii
 * 描述： 现有一个房间，墙上挂有 n 只已经打开的灯泡和 4 个按钮。在进行了 m 次未知操作后，你需要返回这 n 只灯泡可能有多少种不同的状态。\n假设这 n 只灯泡被编号为 [1, 2, 3 ..., n]，这 4 个按钮的功能如下：\n将所有灯泡的状态反转（即开变为关，关变为开）\n将编号为偶数的灯泡的状态反转\n将编号为奇数的灯泡的状态反转\n将编号为 3k+1 的灯泡的状态反转（k = 0, 1, 2, ...)\n示例 1:\n输入: n = 1, m = 1.\n输出: 2\n说明: 状态为: [开], [关]\n示例 2:\n输入: n = 2, m = 1.\n输出: 3\n说明: 状态为: [开, 关], [关, 开], [关, 关]\n示例 3:\n输入: n = 3, m = 1.\n输出: 4\n说明: 状态为: [关, 开, 关], [开, 关, 开], [关, 关, 关], [关, 开, 开].\n注意： n 和 m 都属于 [0, 1000].
 * <p>
 * acceptance: 50.3%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class BulbSwitcherIi {
    public int flipLights(int n, int m) {
        return 0;
    }
}