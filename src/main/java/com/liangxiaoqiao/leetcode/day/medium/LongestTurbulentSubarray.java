package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 978
 * title: Longest Turbulent Subarray
 * href: https://leetcode.com/problems/longest-turbulent-subarray
 * desc: A subarray A[i], A[i+1], ..., A[j] of A is said to be turbulent if and only if:\nFor i <= k < j, A[k] > A[k+1] when k is odd, and A[k] < A[k+1] when k is even;\nOR, for i <= k < j, A[k] > A[k+1] when k is even, and A[k] < A[k+1] when k is odd.\nThat is, the subarray is turbulent if the comparison sign flips between each adjacent pair of elements in the subarray.\nReturn the length of a maximum size turbulent subarray of A.\n  Example 1:\nInput: [9,4,2,10,7,8,8,1,9]\nOutput: 5\nExplanation: (A[1] > A[2] < A[3] > A[4] < A[5])\nExample 2:\nInput: [4,8,12,16]\nOutput: 2\nExample 3:\nInput: [100]\nOutput: 1\n  Note:\n1 <= A.length <= 40000\n0 <= A[i] <= 10^9
 * <p>
 * 中文
 * 序号: 978
 * 标题： 最长湍流子数组
 * 链接： https://leetcode-cn.com/problems/longest-turbulent-subarray
 * 描述： 当 A 的子数组 A[i], A[i+1], ..., A[j] 满足下列条件时，我们称其为湍流子数组：
 * 若 i <= k < j，当 k 为奇数时， A[k] > A[k+1]，且当 k 为偶数时，A[k] < A[k+1]；
 * 或 若 i <= k < j，当 k 为偶数时，A[k] > A[k+1] ，且当 k 为奇数时， A[k] < A[k+1]。
 * 也就是说，如果比较符号在子数组中的每个相邻元素对之间翻转，则该子数组是湍流子数组。
 * 返回 A 的最大湍流子数组的长度。
 * 示例 1：
 * 输入：[9,4,2,10,7,8,8,1,9]
 * 输出：5
 * 解释：(A[1] > A[2] < A[3] > A[4] < A[5])
 * 示例 2：
 * 输入：[4,8,12,16]
 * 输出：2
 * 示例 3：
 * 输入：[100]
 * 输出：1
 * 提示：
 * 1 <= A.length <= 40000
 * 0 <= A[i] <= 10^9
 * <p>
 * acceptance: 46.0%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class LongestTurbulentSubarray {
    public int maxTurbulenceSize(int[] A) {
        return 0;
    }
}