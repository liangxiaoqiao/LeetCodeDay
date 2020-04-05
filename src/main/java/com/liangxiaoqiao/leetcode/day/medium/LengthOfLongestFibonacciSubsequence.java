package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 873
 * title: Length of Longest Fibonacci Subsequence
 * href: https://leetcode.com/problems/length-of-longest-fibonacci-subsequence
 * desc: A sequence X_1, X_2, ..., X_n is fibonacci-like if:\nn >= 3\nX_i + X_{i+1} = X_{i+2} for all i + 2 <= n\nGiven a strictly increasing array A of positive integers forming a sequence, find the length of the longest fibonacci-like subsequence of A.  If one does not exist, return 0.\n(Recall that a subsequence is derived from another sequence A by deleting any number of elements (including none) from A, without changing the order of the remaining elements.  For example, [3, 5, 8] is a subsequence of [3, 4, 5, 6, 7, 8].)\n  Example 1:\nInput: [1,2,3,4,5,6,7,8]\nOutput: 5\nExplanation:\nThe longest subsequence that is fibonacci-like: [1,2,3,5,8].\nExample 2:\nInput: [1,3,7,11,12,14,18]\nOutput: 3\nExplanation:\nThe longest subsequence that is fibonacci-like:\n[1,11,12], [3,11,14] or [7,11,18].\n  Note:\n3 <= A.length <= 1000\n1 <= A[0] < A[1] < ... < A[A.length - 1] <= 10^9\n(The time limit has been reduced by 50% for submissions in Java, C, and C++.)
 * <p>
 * 中文
 * 序号: 873
 * 标题： 最长的斐波那契子序列的长度
 * 链接： https://leetcode-cn.com/problems/length-of-longest-fibonacci-subsequence
 * 描述： 如果序列 X_1, X_2, ..., X_n 满足下列条件，就说它是 斐波那契式 的：\nn >= 3\n对于所有 i + 2 <= n，都有 X_i + X_{i+1} = X_{i+2}\n给定一个严格递增的正整数数组形成序列，找到 A 中最长的斐波那契式的子序列的长度。如果一个不存在，返回  0 。\n（回想一下，子序列是从原序列 A 中派生出来的，它从 A 中删掉任意数量的元素（也可以不删），而不改变其余元素的顺序。例如， [3, 5, 8] 是 [3, 4, 5, 6, 7, 8] 的一个子序列）\n  示例 1：\n输入: [1,2,3,4,5,6,7,8]\n输出: 5\n解释:\n最长的斐波那契式子序列为：[1,2,3,5,8] 。\n示例 2：\n输入: [1,3,7,11,12,14,18]\n输出: 3\n解释:\n最长的斐波那契式子序列有：\n[1,11,12]，[3,11,14] 以及 [7,11,18] 。\n  提示：\n3 <= A.length <= 1000\n1 <= A[0] < A[1] < ... < A[A.length - 1] <= 10^9\n（对于以 Java，C，C++，以及 C# 的提交，时间限制被减少了 50%）
 * <p>
 * acceptance: 47.5%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class LengthOfLongestFibonacciSubsequence {
    public int lenLongestFibSubseq(int[] A) {
        return 0;
    }
}