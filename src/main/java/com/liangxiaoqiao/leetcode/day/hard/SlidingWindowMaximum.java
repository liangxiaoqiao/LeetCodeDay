package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 239
 * title: Sliding Window Maximum
 * href: https://leetcode.com/problems/sliding-window-maximum
 * desc: Given an array nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position. Return the max sliding window.\nExample:\nInput: nums = [1,3,-1,-3,5,3,6,7], and k = 3\nOutput: [3,3,5,5,6,7] \nExplanation: \n\nWindow position                Max\n---------------               -----\n[1  3  -1] -3  5  3  6  7       3\n 1 [3  -1  -3] 5  3  6  7       3\n 1  3 [-1  -3  5] 3  6  7       5\n 1  3  -1 [-3  5  3] 6  7       5\n 1  3  -1  -3 [5  3  6] 7       6\n 1  3  -1  -3  5 [3  6  7]      7\nNote:\nYou may assume k is always valid, 1 ≤ k ≤ input array\'s size for non-empty array.\nFollow up:\nCould you solve it in linear time?
 * <p>
 * 中文
 * 序号: 239
 * 标题： 滑动窗口最大值
 * 链接： https://leetcode-cn.com/problems/sliding-window-maximum
 * 描述： 给定一个数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口 k 内的数字。滑动窗口每次只向右移动一位。\n返回滑动窗口最大值。\n示例:\n输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3\n输出: [3,3,5,5,6,7] \n解释: \n\n  滑动窗口的位置                最大值\n---------------               -----\n[1  3  -1] -3  5  3  6  7       3\n 1 [3  -1  -3] 5  3  6  7       3\n 1  3 [-1  -3  5] 3  6  7       5\n 1  3  -1 [-3  5  3] 6  7       5\n 1  3  -1  -3 [5  3  6] 7       6\n 1  3  -1  -3  5 [3  6  7]      7\n注意：\n你可以假设 k 总是有效的，1 ≤ k ≤ 输入数组的大小，且输入数组不为空。\n进阶：\n你能在线性时间复杂度内解决此题吗？
 * <p>
 * acceptance: 40.3%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        return null;
    }
}