package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 532
 * title: K-diff Pairs in an Array
 * href: https://leetcode.com/problems/k-diff-pairs-in-an-array
 * desc: Given an array of integers and an integer k, you need to find the number of unique k-diff pairs in the array. Here a k-diff pair is defined as an integer pair (i, j), where i and j are both numbers in the array and their absolute difference is k.\nExample 1:\nInput: [3, 1, 4, 1, 5], k = 2\nOutput: 2\nExplanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).\nAlthough we have two 1s in the input, we should only return the number of unique pairs.\nExample 2:\nInput:[1, 2, 3, 4, 5], k = 1\nOutput: 4\nExplanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).\nExample 3:\nInput: [1, 3, 1, 5, 4], k = 0\nOutput: 1\nExplanation: There is one 0-diff pair in the array, (1, 1).\nNote:\nThe pairs (i, j) and (j, i) count as the same pair.\nThe length of the array won\'t exceed 10,000.\nAll the integers in the given input belong to the range: [-1e7, 1e7].
 * <p>
 * 中文
 * 序号: 532
 * 标题： 数组中的K-diff数对
 * 链接： https://leetcode-cn.com/problems/k-diff-pairs-in-an-array
 * 描述： 给定一个整数数组和一个整数 k, 你需要在数组里找到不同的 k-diff 数对。这里将 k-diff 数对定义为一个整数对 (i, j), 其中 i 和 j 都是数组中的数字，且两数之差的绝对值是 k.\n示例 1:\n输入: [3, 1, 4, 1, 5], k = 2\n输出: 2\n解释: 数组中有两个 2-diff 数对, (1, 3) 和 (3, 5)。\n尽管数组中有两个1，但我们只应返回不同的数对的数量。\n示例 2:\n输入:[1, 2, 3, 4, 5], k = 1\n输出: 4\n解释: 数组中有四个 1-diff 数对, (1, 2), (2, 3), (3, 4) 和 (4, 5)。\n示例 3:\n输入: [1, 3, 1, 5, 4], k = 0\n输出: 1\n解释: 数组中只有一个 0-diff 数对，(1, 1)。\n注意:\n数对 (i, j) 和数对 (j, i) 被算作同一数对。\n数组的长度不超过10,000。\n所有输入的整数的范围在 [-1e7, 1e7]。
 * <p>
 * acceptance: 30.7%
 * difficulty: Easy
 * private: False
 */


//TODO init
public class KDiffPairsInAnArray {
    public int findPairs(int[] nums, int k) {
        return 0;
    }
}