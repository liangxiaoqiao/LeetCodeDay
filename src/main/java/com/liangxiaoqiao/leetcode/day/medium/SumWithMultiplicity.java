package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 923
 * title: 3Sum With Multiplicity
 * href: https://leetcode.com/problems/3sum-with-multiplicity
 * desc: Given an integer array A, and an integer target, return the number of tuples i, j, k  such that i < j < k and A[i] + A[j] + A[k] == target.\nAs the answer can be very large, return it modulo 10^9 + 7.\n  Example 1:\nInput: A = [1,1,2,2,3,3,4,4,5,5], target = 8\nOutput: 20\nExplanation: \nEnumerating by the values (A[i], A[j], A[k]):\n(1, 2, 5) occurs 8 times;\n(1, 3, 4) occurs 8 times;\n(2, 2, 4) occurs 2 times;\n(2, 3, 3) occurs 2 times.\nExample 2:\nInput: A = [1,1,2,2,2,2], target = 5\nOutput: 12\nExplanation: \nA[i] = 1, A[j] = A[k] = 2 occurs 12 times:\nWe choose one 1 from [1,1] in 2 ways,\nand two 2s from [2,2,2,2] in 6 ways.\n  Note:\n3 <= A.length <= 3000\n0 <= A[i] <= 100\n0 <= target <= 300
 * <p>
 * 中文
 * 序号: 923
 * 标题： 三数之和的多种可能
 * 链接： https://leetcode-cn.com/problems/3sum-with-multiplicity
 * 描述： 给定一个整数数组 A，以及一个整数 target 作为目标值，返回满足 i < j < k 且 A[i] + A[j] + A[k] == target 的元组 i, j, k 的数量。\n由于结果会非常大，请返回 结果除以 10^9 + 7 的余数。\n  示例 1：\n输入：A = [1,1,2,2,3,3,4,4,5,5], target = 8\n输出：20\n解释：\n按值枚举（A[i]，A[j]，A[k]）：\n(1, 2, 5) 出现 8 次；\n(1, 3, 4) 出现 8 次；\n(2, 2, 4) 出现 2 次；\n(2, 3, 3) 出现 2 次。\n示例 2：\n输入：A = [1,1,2,2,2,2], target = 5\n输出：12\n解释：\nA[i] = 1，A[j] = A[k] = 2 出现 12 次：\n我们从 [1,1] 中选择一个 1，有 2 种情况，\n从 [2,2,2,2] 中选出两个 2，有 6 种情况。\n  提示：\n3 <= A.length <= 3000\n0 <= A[i] <= 100\n0 <= target <= 300
 * <p>
 * acceptance: 35.1%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class SumWithMultiplicity {
    public int threeSumMulti(int[] A, int target) {
        return 0;
    }
}