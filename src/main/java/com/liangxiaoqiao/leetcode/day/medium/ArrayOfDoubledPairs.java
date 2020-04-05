package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 954
 * title: Array of Doubled Pairs
 * href: https://leetcode.com/problems/array-of-doubled-pairs
 * desc: Given an array of integers A with even length, return true if and only if it is possible to reorder it such that A[2 * i + 1] = 2 * A[2 * i] for every 0 <= i < len(A) / 2.\n  Example 1:\nInput: [3,1,3,6]\nOutput: false\nExample 2:\nInput: [2,1,2,6]\nOutput: false\nExample 3:\nInput: [4,-2,2,-4]\nOutput: true\nExplanation: We can take two groups, [-2,-4] and [2,4] to form [-2,-4,2,4] or [2,4,-2,-4].\nExample 4:\nInput: [1,2,4,16,8,4]\nOutput: false\n  Note:\n0 <= A.length <= 30000\nA.length is even\n-100000 <= A[i] <= 100000
 * <p>
 * 中文
 * 序号: 954
 * 标题： 二倍数对数组
 * 链接： https://leetcode-cn.com/problems/array-of-doubled-pairs
 * 描述： 给定一个长度为偶数的整数数组 A，只有对 A 进行重组后可以满足 “对于每个 0 <= i < len(A) / 2，都有 A[2 * i + 1] = 2 * A[2 * i]” 时，返回 true；否则，返回 false。\n  示例 1：\n输入：[3,1,3,6]\n输出：false\n示例 2：\n输入：[2,1,2,6]\n输出：false\n示例 3：\n输入：[4,-2,2,-4]\n输出：true\n解释：我们可以用 [-2,-4] 和 [2,4] 这两组组成 [-2,-4,2,4] 或是 [2,4,-2,-4]\n示例 4：\n输入：[1,2,4,16,8,4]\n输出：false\n  提示：\n0 <= A.length <= 30000\nA.length 为偶数\n-100000 <= A[i] <= 100000
 * <p>
 * acceptance: 35.5%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class ArrayOfDoubledPairs {
    public boolean canReorderDoubled(int[] A) {
        return false;
    }
}