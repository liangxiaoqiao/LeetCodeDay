package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 697
 * title: Degree of an Array
 * href: https://leetcode.com/problems/degree-of-an-array
 * desc: Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum frequency of any one of its elements.
 * Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.
 * Example 1:
 * Input: [1, 2, 2, 3, 1]
 * Output: 2
 * Explanation:
 * The input array has a degree of 2 because both elements 1 and 2 appear twice.
 * Of the subarrays that have the same degree:
 * [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
 * The shortest length is 2. So return 2.
 * Example 2:
 * Input: [1,2,2,3,1,4,2]
 * Output: 6
 * Note:
 * nums.length will be between 1 and 50,000.
 * nums[i] will be an integer between 0 and 49,999.
 * <p>
 * 中文
 * 序号: 697
 * 标题： 数组的度
 * 链接： https://leetcode-cn.com/problems/degree-of-an-array
 * 描述： 给定一个非空且只包含非负数的整数数组 nums, 数组的度的定义是指数组里任一元素出现频数的最大值。\n你的任务是找到与 nums 拥有相同大小的度的最短连续子数组，返回其长度。\n示例 1:\n输入: [1, 2, 2, 3, 1]\n输出: 2\n解释: \n输入数组的度是2，因为元素1和2的出现频数最大，均为2.\n连续子数组里面拥有相同度的有如下所示:\n[1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]\n最短连续子数组[2, 2]的长度为2，所以返回2.\n示例 2:\n输入: [1,2,2,3,1,4,2]\n输出: 6\n注意:\nnums.length 在1到50,000区间范围内。\nnums[i] 是一个在0到49,999范围内的整数。
 * <p>
 * acceptance: 52.4%
 * difficulty: Easy
 * private: False
 */


//TODO init
public class DegreeOfAnArray {
    public int findShortestSubArray(int[] nums) {
        return 0;
    }
}