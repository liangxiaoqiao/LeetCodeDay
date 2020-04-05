package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 689
 * title: Maximum Sum of 3 Non-Overlapping Subarrays
 * href: https://leetcode.com/problems/maximum-sum-of-3-non-overlapping-subarrays
 * desc: In a given array nums of positive integers, find three non-overlapping subarrays with maximum sum.
 * Each subarray will be of size k, and we want to maximize the sum of all 3*k entries.
 * Return the result as a list of indices representing the starting position of each interval (0-indexed). If there are multiple answers, return the lexicographically smallest one.
 * Example:
 * Input: [1,2,1,2,6,7,5,1], 2
 * Output: [0, 3, 5]
 * Explanation: Subarrays [1, 2], [2, 6], [7, 5] correspond to the starting indices [0, 3, 5].
 * We could have also taken [2, 1], but an answer of [1, 3, 5] would be lexicographically larger.
 * Note:
 * nums.length will be between 1 and 20000.
 * nums[i] will be between 1 and 65535.
 * k will be between 1 and floor(nums.length / 3).
 * <p>
 * <p>
 * 中文
 * 序号: 689
 * 标题： 三个无重叠子数组的最大和
 * 链接： https://leetcode-cn.com/problems/maximum-sum-of-3-non-overlapping-subarrays
 * 描述： 给定数组 nums 由正整数组成，找到三个互不重叠的子数组的最大和。\n每个子数组的长度为k，我们要使这3*k个项的和最大化。\n返回每个区间起始索引的列表（索引从 0 开始）。如果有多个结果，返回字典序最小的一个。\n示例:\n输入: [1,2,1,2,6,7,5,1], 2\n输出: [0, 3, 5]\n解释: 子数组 [1, 2], [2, 6], [7, 5] 对应的起始索引为 [0, 3, 5]。\n我们也可以取 [2, 1], 但是结果 [1, 3, 5] 在字典序上更大。\n注意:\nnums.length的范围在[1, 20000]之间。\nnums[i]的范围在[1, 65535]之间。\nk的范围在[1, floor(nums.length / 3)]之间。
 * <p>
 * acceptance: 44.8%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class MaximumSumOf3NonOverlappingSubarrays {
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        return null;
    }
}