package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 724
 * title: Find Pivot Index
 * href: https://leetcode.com/problems/find-pivot-index
 * desc: Given an array of integers nums, write a method that returns the \"pivot\" index of this array.\nWe define the pivot index as the index where the sum of the numbers to the left of the index is equal to the sum of the numbers to the right of the index.\nIf no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index.\nExample 1:\nInput: \nnums = [1, 7, 3, 6, 5, 6]\nOutput: 3\nExplanation: \nThe sum of the numbers to the left of index 3 (nums[3] = 6) is equal to the sum of numbers to the right of index 3.\nAlso, 3 is the first index where this occurs.\n  Example 2:\nInput: \nnums = [1, 2, 3]\nOutput: -1\nExplanation: \nThere is no index that satisfies the conditions in the problem statement.\n  Note:\nThe length of nums will be in the range [0, 10000].\nEach element nums[i] will be an integer in the range [-1000, 1000].\n
 * <p>
 * 中文
 * 序号: 724
 * 标题： 寻找数组的中心索引
 * 链接： https://leetcode-cn.com/problems/find-pivot-index
 * 描述： 给定一个整数类型的数组 nums，请编写一个能够返回数组“中心索引”的方法。\n我们是这样定义数组中心索引的：数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和。\n如果数组不存在中心索引，那么我们应该返回 -1。如果数组有多个中心索引，那么我们应该返回最靠近左边的那一个。\n示例 1:\n输入: \nnums = [1, 7, 3, 6, 5, 6]\n输出: 3\n解释: \n索引3 (nums[3] = 6) 的左侧数之和(1 + 7 + 3 = 11)，与右侧数之和(5 + 6 = 11)相等。\n同时, 3 也是第一个符合要求的中心索引。\n示例 2:\n输入: \nnums = [1, 2, 3]\n输出: -1\n解释: \n数组中不存在满足此条件的中心索引。\n说明:\nnums 的长度范围为 [0, 10000]。\n任何一个 nums[i] 将会是一个范围在 [-1000, 1000]的整数。
 * <p>
 * acceptance: 42.5%
 * difficulty: Easy
 * private: False
 */


//TODO init
public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        return 0;
    }
}