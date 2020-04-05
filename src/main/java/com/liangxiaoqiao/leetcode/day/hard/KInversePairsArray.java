package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 629
 * title: K Inverse Pairs Array
 * href: https://leetcode.com/problems/k-inverse-pairs-array
 * desc: Given two integers n and k, find how many different arrays consist of numbers from 1 to n such that there are exactly k inverse pairs.\nWe define an inverse pair as following: For ith and jth element in the array, if i < j and a[i] > a[j] then it\'s an inverse pair; Otherwise, it\'s not.\nSince the answer may be very large, the answer should be modulo 109 + 7.\nExample 1:\nInput: n = 3, k = 0\nOutput: 1\nExplanation: \nOnly the array [1,2,3] which consists of numbers from 1 to 3 has exactly 0 inverse pair.\n  Example 2:\nInput: n = 3, k = 1\nOutput: 2\nExplanation: \nThe array [1,3,2] and [2,1,3] have exactly 1 inverse pair.\n  Note:\nThe integer n is in the range [1, 1000] and k is in the range [0, 1000].\n
 * <p>
 * 中文
 * 序号: 629
 * 标题： K个逆序对数组
 * 链接： https://leetcode-cn.com/problems/k-inverse-pairs-array
 * 描述： 给出两个整数 n 和 k，找出所有包含从 1 到 n 的数字，且恰好拥有 k 个逆序对的不同的数组的个数。\n逆序对的定义如下：对于数组的第i个和第 j个元素，如果满i < j且 a[i] > a[j]，则其为一个逆序对；否则不是。\n由于答案可能很大，只需要返回 答案 mod 109 + 7 的值。\n示例 1:\n输入: n = 3, k = 0\n输出: 1\n解释: \n只有数组 [1,2,3] 包含了从1到3的整数并且正好拥有 0 个逆序对。\n示例 2:\n输入: n = 3, k = 1\n输出: 2\n解释: \n数组 [1,3,2] 和 [2,1,3] 都有 1 个逆序对。\n说明:\n n 的范围是 [1, 1000] 并且 k 的范围是 [0, 1000]。
 * <p>
 * acceptance: 30.2%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class KInversePairsArray {
    public int kInversePairs(int n, int k) {
        return 0;
    }
}