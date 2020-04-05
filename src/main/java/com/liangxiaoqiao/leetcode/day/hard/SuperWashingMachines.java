package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 517
 * title: Super Washing Machines
 * href: https://leetcode.com/problems/super-washing-machines
 * desc: You have n super washing machines on a line. Initially, each washing machine has some dresses or is empty.\nFor each move, you could choose any m (1 ≤ m ≤ n) washing machines, and pass one dress of each washing machine to one of its adjacent washing machines at the same time .\nGiven an integer array representing the number of dresses in each washing machine from left to right on the line, you should find the minimum number of moves to make all the washing machines have the same number of dresses. If it is not possible to do it, return -1.\nExample1\nInput: [1,0,5]\n\nOutput: 3\n\nExplanation: \n1st move:    1     0 <-- 5    =>    1     1     4\n2nd move:    1 <-- 1 <-- 4    =>    2     1     3    \n3rd move:    2     1 <-- 3    =>    2     2     2   \nExample2\nInput: [0,3,0]\n\nOutput: 2\n\nExplanation: \n1st move:    0 <-- 3     0    =>    1     2     0    \n2nd move:    1     2 --> 0    =>    1     1     1     \nExample3\nInput: [0,2,0]\n\nOutput: -1\n\nExplanation: \nIt\'s impossible to make all the three washing machines have the same number of dresses. \nNote:\nThe range of n is [1, 10000].\nThe range of dresses number in a super washing machine is [0, 1e5].
 * <p>
 * 中文
 * 序号: 517
 * 标题： 超级洗衣机
 * 链接： https://leetcode-cn.com/problems/super-washing-machines
 * 描述： 假设有 n 台超级洗衣机放在同一排上。开始的时候，每台洗衣机内可能有一定量的衣服，也可能是空的。\n在每一步操作中，你可以选择任意 m （1 ≤ m ≤ n） 台洗衣机，与此同时将每台洗衣机的一件衣服送到相邻的一台洗衣机。\n给定一个非负整数数组代表从左至右每台洗衣机中的衣物数量，请给出能让所有洗衣机中剩下的衣物的数量相等的最少的操作步数。如果不能使每台洗衣机中衣物的数量相等，则返回 -1。\n  示例 1：\n输入: [1,0,5]\n\n输出: 3\n\n解释: \n第一步:    1     0 <-- 5    =>    1     1     4\n第二步:    1 <-- 1 <-- 4    =>    2     1     3    \n第三步:    2     1 <-- 3    =>    2     2     2   \n示例 2：\n输入: [0,3,0]\n\n输出: 2\n\n解释: \n第一步:    0 <-- 3     0    =>    1     2     0    \n第二步:    1     2 --> 0    =>    1     1     1     \n示例 3:\n输入: [0,2,0]\n\n输出: -1\n\n解释: \n不可能让所有三个洗衣机同时剩下相同数量的衣物。\n  提示：\nn 的范围是 [1, 10000]。\n在每台超级洗衣机中，衣物数量的范围是 [0, 1e5]。\n
 * <p>
 * acceptance: 37.5%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class SuperWashingMachines {
    public int findMinMoves(int[] machines) {
        return 0;
    }
}