package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 480
 * title: Sliding Window Median
 * href: https://leetcode.com/problems/sliding-window-median
 * desc: Median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value. So the median is the mean of the two middle value.\nExamples:\n[2,3,4] , the median is 3\n[2,3], the median is (2 + 3) / 2 = 2.5\nGiven an array nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position. Your job is to output the median array for each window in the original array.\nFor example,\nGiven nums = [1,3,-1,-3,5,3,6,7], and k = 3.\nWindow position                Median\n---------------               -----\n[1  3  -1] -3  5  3  6  7       1\n 1 [3  -1  -3] 5  3  6  7       -1\n 1  3 [-1  -3  5] 3  6  7       -1\n 1  3  -1 [-3  5  3] 6  7       3\n 1  3  -1  -3 [5  3  6] 7       5\n 1  3  -1  -3  5 [3  6  7]      6\nTherefore, return the median sliding window as [1,-1,-1,3,5,6].\nNote:\nYou may assume k is always valid, ie: k is always smaller than input array\'s size for non-empty array.
 * <p>
 * 中文
 * 序号: 480
 * 标题： 滑动窗口中位数
 * 链接： https://leetcode-cn.com/problems/sliding-window-median
 * 描述： 中位数是有序序列最中间的那个数。如果序列的大小是偶数，则没有最中间的数；此时中位数是最中间的两个数的平均数。\n例如：\n[2,3,4]，中位数是 3\n[2,3]，中位数是 (2 + 3) / 2 = 2.5\n给出一个数组 nums，有一个大小为 k 的窗口从最左端滑动到最右端。窗口中有 k 个数，每次窗口移动 1 位。你的任务是找出每次窗口移动后得到的新窗口中元素的中位数，并输出由它们组成的数组。\n例如：\n给出 nums = [1,3,-1,-3,5,3,6,7]，以及 k = 3。\n窗口位置                      中位数\n---------------               -----\n[1  3  -1] -3  5  3  6  7       1\n 1 [3  -1  -3] 5  3  6  7       -1\n 1  3 [-1  -3  5] 3  6  7       -1\n 1  3  -1 [-3  5  3] 6  7       3\n 1  3  -1  -3 [5  3  6] 7       5\n 1  3  -1  -3  5 [3  6  7]      6\n 因此，返回该滑动窗口的中位数数组 [1,-1,-1,3,5,6]。\n提示：\n假设k是合法的，即：k 始终小于输入的非空数组的元素个数.
 * <p>
 * acceptance: 34.8%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class SlidingWindowMedian {
    public double[] medianSlidingWindow(int[] nums, int k) {
        return null;
    }
}