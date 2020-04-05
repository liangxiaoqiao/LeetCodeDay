package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 918
 * title: Maximum Sum Circular Subarray
 * href: https://leetcode.com/problems/maximum-sum-circular-subarray
 * desc: Given a circular array C of integers represented by A, find the maximum possible sum of a non-empty subarray of C.\nHere, a circular array means the end of the array connects to the beginning of the array.  (Formally, C[i] = A[i] when 0 <= i < A.length, and C[i+A.length] = C[i] when i >= 0.)\nAlso, a subarray may only include each element of the fixed buffer A at most once.  (Formally, for a subarray C[i], C[i+1], ..., C[j], there does not exist i <= k1, k2 <= j with k1 % A.length = k2 % A.length.)\n  Example 1:\nInput: [1,-2,3,-2]\nOutput: 3\nExplanation: Subarray [3] has maximum sum 3\nExample 2:\nInput: [5,-3,5]\nOutput: 10\nExplanation: Subarray [5,5] has maximum sum 5 + 5 = 10\nExample 3:\nInput: [3,-1,2,-1]\nOutput: 4\nExplanation: Subarray [2,-1,3] has maximum sum 2 + (-1) + 3 = 4\nExample 4:\nInput: [3,-2,2,-3]\nOutput: 3\nExplanation: Subarray [3] and [3,-2,2] both have maximum sum 3\nExample 5:\nInput: [-2,-3,-1]\nOutput: -1\nExplanation: Subarray [-1] has maximum sum -1\n  Note:\n-30000 <= A[i] <= 30000\n1 <= A.length <= 30000
 * <p>
 * 中文
 * 序号: 918
 * 标题： 环形子数组的最大和
 * 链接： https://leetcode-cn.com/problems/maximum-sum-circular-subarray
 * 描述： 给定一个由整数数组 A 表示的环形数组 C，求 C 的非空子数组的最大可能和。\n在此处，环形数组意味着数组的末端将会与开头相连呈环状。（形式上，当0 <= i < A.length 时 C[i] = A[i]，而当 i >= 0 时 C[i+A.length] = C[i]）\n此外，子数组最多只能包含固定缓冲区 A 中的每个元素一次。（形式上，对于子数组 C[i], C[i+1], ..., C[j]，不存在 i <= k1, k2 <= j 其中 k1 % A.length = k2 % A.length）\n  示例 1：\n输入：[1,-2,3,-2]\n输出：3\n解释：从子数组 [3] 得到最大和 3\n示例 2：\n输入：[5,-3,5]\n输出：10\n解释：从子数组 [5,5] 得到最大和 5 + 5 = 10\n示例 3：\n输入：[3,-1,2,-1]\n输出：4\n解释：从子数组 [2,-1,3] 得到最大和 2 + (-1) + 3 = 4\n示例 4：\n输入：[3,-2,2,-3]\n输出：3\n解释：从子数组 [3] 和 [3,-2,2] 都可以得到最大和 3\n示例 5：\n输入：[-2,-3,-1]\n输出：-1\n解释：从子数组 [-1] 得到最大和 -1\n  提示：\n-30000 <= A[i] <= 30000\n1 <= A.length <= 30000
 * <p>
 * acceptance: 33.7%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class MaximumSumCircularSubarray {
    public int maxSubarraySumCircular(int[] A) {
        return 0;
    }
}