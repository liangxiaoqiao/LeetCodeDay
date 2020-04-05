package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 502
 * title: IPO
 * href: https://leetcode.com/problems/ipo
 * desc: Suppose LeetCode will start its IPO soon. In order to sell a good price of its shares to Venture Capital, LeetCode would like to work on some projects to increase its capital before the IPO. Since it has limited resources, it can only finish at most k distinct projects before the IPO. Help LeetCode design the best way to maximize its total capital after finishing at most k distinct projects.\nYou are given several projects. For each project i, it has a pure profit Pi and a minimum capital of Ci is needed to start the corresponding project. Initially, you have W capital. When you finish a project, you will obtain its pure profit and the profit will be added to your total capital.\nTo sum up, pick a list of at most k distinct projects from given projects to maximize your final capital, and output your final maximized capital.\nExample 1:\nInput: k=2, W=0, Profits=[1,2,3], Capital=[0,1,1].\n\nOutput: 4\n\nExplanation: Since your initial capital is 0, you can only start the project indexed 0.\n             After finishing it you will obtain profit 1 and your capital becomes 1.\n             With capital 1, you can either start the project indexed 1 or the project indexed 2.\n             Since you can choose at most 2 projects, you need to finish the project indexed 2 to get the maximum capital.\n             Therefore, output the final maximized capital, which is 0 + 1 + 3 = 4.\nNote:\nYou may assume all numbers in the input are non-negative integers.\nThe length of Profits array and Capital array will not exceed 50,000.\nThe answer is guaranteed to fit in a 32-bit signed integer.
 * <p>
 * 中文
 * 序号: 502
 * 标题： IPO
 * 链接： https://leetcode-cn.com/problems/ipo
 * 描述： 假设 LeetCode 即将开始其 IPO。为了以更高的价格将股票卖给风险投资公司，LeetCode希望在 IPO 之前开展一些项目以增加其资本。 由于资源有限，它只能在 IPO 之前完成最多 k 个不同的项目。帮助 LeetCode 设计完成最多 k 个不同项目后得到最大总资本的方式。\n给定若干个项目。对于每个项目 i，它都有一个纯利润 Pi，并且需要最小的资本 Ci 来启动相应的项目。最初，你有 W 资本。当你完成一个项目时，你将获得纯利润，且利润将被添加到你的总资本中。\n总而言之，从给定项目中选择最多 k 个不同项目的列表，以最大化最终资本，并输出最终可获得的最多资本。\n示例 1:\n输入: k=2, W=0, Profits=[1,2,3], Capital=[0,1,1].\n\n输出: 4\n\n解释:\n由于你的初始资本为 0，你尽可以从 0 号项目开始。\n在完成后，你将获得 1 的利润，你的总资本将变为 1。\n此时你可以选择开始 1 号或 2 号项目。\n由于你最多可以选择两个项目，所以你需要完成 2 号项目以获得最大的资本。\n因此，输出最后最大化的资本，为 0 + 1 + 3 = 4。\n  注意:\n假设所有输入数字都是非负整数。\n表示利润和资本的数组的长度不超过 50000。\n答案保证在 32 位有符号整数范围内。\n
 * <p>
 * acceptance: 38.8%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class Ipo {
    public int findMaximizedCapital(int k, int W, int[] Profits, int[] Capital) {
        return 0;
    }
}