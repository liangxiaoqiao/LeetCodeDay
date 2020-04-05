package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 446
 * title: Arithmetic Slices II - Subsequence
 * href: https://leetcode.com/problems/arithmetic-slices-ii-subsequence
 * desc: A sequence of numbers is called arithmetic if it consists of at least three elements and if the difference between any two consecutive elements is the same.\nFor example, these are arithmetic sequences:\n1, 3, 5, 7, 9\n7, 7, 7, 7\n3, -1, -5, -9\nThe following sequence is not arithmetic.\n1, 1, 2, 5, 7\n\nA zero-indexed array A consisting of N numbers is given. A subsequence slice of that array is any sequence of integers (P0, P1, ..., Pk) such that 0 ≤ P0 < P1 < ... < Pk < N.\nA subsequence slice (P0, P1, ..., Pk) of array A is called arithmetic if the sequence A[P0], A[P1], ..., A[Pk-1], A[Pk] is arithmetic. In particular, this means that k ≥ 2.\nThe function should return the number of arithmetic subsequence slices in the array A.\nThe input contains N integers. Every integer is in the range of -231 and 231-1 and 0 ≤ N ≤ 1000. The output is guaranteed to be less than 231-1.\n\nExample:\nInput: [2, 4, 6, 8, 10]\n\nOutput: 7\n\nExplanation:\nAll arithmetic subsequence slices are:\n[2,4,6]\n[4,6,8]\n[6,8,10]\n[2,4,6,8]\n[4,6,8,10]\n[2,4,6,8,10]\n[2,6,10]
 * <p>
 * 中文
 * 序号: 446
 * 标题： 等差数列划分 II - 子序列
 * 链接： https://leetcode-cn.com/problems/arithmetic-slices-ii-subsequence
 * 描述： 如果一个数列至少有三个元素，并且任意两个相邻元素之差相同，则称该数列为等差数列。\n例如，以下数列为等差数列:\n1, 3, 5, 7, 9\n7, 7, 7, 7\n3, -1, -5, -9\n以下数列不是等差数列。\n1, 1, 2, 5, 7\n  数组 A 包含 N 个数，且索引从 0 开始。该数组子序列将划分为整数序列 (P0, P1, ..., Pk)，P 与 Q 是整数且满足 0 ≤ P0 < P1 < ... < Pk < N。\n  如果序列 A[P0]，A[P1]，...，A[Pk-1]，A[Pk] 是等差的，那么数组 A 的子序列 (P0，P1，…，PK) 称为等差序列。值得注意的是，这意味着 k ≥ 2。\n函数要返回数组 A 中所有等差子序列的个数。\n输入包含 N 个整数。每个整数都在 -231 和 231-1 之间，另外 0 ≤ N ≤ 1000。保证输出小于 231-1。\n  示例：\n  输入：[2, 4, 6, 8, 10]\n\n输出：7\n\n解释：\n所有的等差子序列为：\n[2,4,6]\n[4,6,8]\n[6,8,10]\n[2,4,6,8]\n[4,6,8,10]\n[2,4,6,8,10]\n[2,6,10]\n
 * <p>
 * acceptance: 31.6%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class ArithmeticSlicesIiSubsequence {
    public int numberOfArithmeticSlices(int[] A) {
        return 0;
    }
}