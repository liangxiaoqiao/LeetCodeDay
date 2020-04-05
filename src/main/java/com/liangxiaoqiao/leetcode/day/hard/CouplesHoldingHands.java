package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 765
 * title: Couples Holding Hands
 * href: https://leetcode.com/problems/couples-holding-hands
 * desc: N couples sit in 2N seats arranged in a row and want to hold hands. We want to know the minimum number of swaps so that every couple is sitting side by side. A swap consists of choosing any two people, then they stand up and switch seats.\nThe people and seats are represented by an integer from 0 to 2N-1, the couples are numbered in order, the first couple being (0, 1), the second couple being (2, 3), and so on with the last couple being (2N-2, 2N-1).\nThe couples\' initial seating is given by row[i] being the value of the person who is initially sitting in the i-th seat.\nExample 1:\nInput: row = [0, 2, 1, 3]\nOutput: 1\nExplanation: We only need to swap the second (row[1]) and third (row[2]) person.\nExample 2:\nInput: row = [3, 2, 0, 1]\nOutput: 0\nExplanation: All couples are already seated side by side.\nNote:\nlen(row) is even and in the range of [4, 60].\nrow is guaranteed to be a permutation of 0...len(row)-1.
 * <p>
 * 中文
 * 序号: 765
 * 标题： 情侣牵手
 * 链接： https://leetcode-cn.com/problems/couples-holding-hands
 * 描述： N 对情侣坐在连续排列的 2N 个座位上，想要牵到对方的手。 计算最少交换座位的次数，以便每对情侣可以并肩坐在一起。 一次交换可选择任意两人，让他们站起来交换座位。\n人和座位用 0 到 2N-1 的整数表示，情侣们按顺序编号，第一对是 (0, 1)，第二对是 (2, 3)，以此类推，最后一对是 (2N-2, 2N-1)。\n这些情侣的初始座位  row[i] 是由最初始坐在第 i 个座位上的人决定的。\n示例 1:\n输入: row = [0, 2, 1, 3]\n输出: 1\n解释: 我们只需要交换row[1]和row[2]的位置即可。\n示例 2:\n输入: row = [3, 2, 0, 1]\n输出: 0\n解释: 无需交换座位，所有的情侣都已经可以手牵手了。\n说明:\nlen(row) 是偶数且数值在 [4, 60]范围内。\n可以保证row 是序列 0...len(row)-1 的一个全排列。
 * <p>
 * acceptance: 53.0%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class CouplesHoldingHands {
    public int minSwapsCouples(int[] row) {
        return 0;
    }
}