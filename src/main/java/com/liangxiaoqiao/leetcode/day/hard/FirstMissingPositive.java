package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 41
 * title: First Missing Positive
 * href: https://leetcode.com/problems/first-missing-positive
 * desc: Given an unsorted integer array, find the smallest missing positive integer.\nExample 1:\nInput: [1,2,0]\nOutput: 3\nExample 2:\nInput: [3,4,-1,1]\nOutput: 2\nExample 3:\nInput: [7,8,9,11,12]\nOutput: 1\nNote:\nYour algorithm should run in O(n) time and uses constant extra space.
 * <p>
 * 中文
 * 序号: 41
 * 标题： 缺失的第一个正数
 * 链接： https://leetcode-cn.com/problems/first-missing-positive
 * 描述： 给你一个未排序的整数数组，请你找出其中没有出现的最小的正整数。

 

示例 1:

输入: [1,2,0]
输出: 3
示例 2:

输入: [3,4,-1,1]
输出: 2
示例 3:

输入: [7,8,9,11,12]
输出: 1
 

提示：

你的算法的时间复杂度应为O(n)，并且只能使用常数级别的额外空间。

 * acceptance: 30.4%
 * difficulty: Hard
 * private: False
 */


public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int max = nums.length;
        int[] results = new int[max];
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            if (temp > max || temp < 1) {
                continue;
            }
            results[temp - 1] = 1;
        }
        for (int i = 0; i < results.length; i++) {
            if (results[i] != 1) {
                return i + 1;
            }
        }
        return results.length + 1;
    }
}