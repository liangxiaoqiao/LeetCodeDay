package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 730
 * title: Count Different Palindromic Subsequences
 * href: https://leetcode.com/problems/count-different-palindromic-subsequences
 * desc: Given a string S, find the number of different non-empty palindromic subsequences in S, and return that number modulo 10^9 + 7.\nA subsequence of a string S is obtained by deleting 0 or more characters from S.\nA sequence is palindromic if it is equal to the sequence reversed.\nTwo sequences A_1, A_2, ... and B_1, B_2, ... are different if there is some i for which A_i != B_i.\nExample 1:\nInput: \nS = \'bccb\'\nOutput: 6\nExplanation: \nThe 6 different non-empty palindromic subsequences are \'b\', \'c\', \'bb\', \'cc\', \'bcb\', \'bccb\'.\nNote that \'bcb\' is counted only once, even though it occurs twice.\nExample 2:\nInput: \nS = \'abcdabcdabcdabcdabcdabcdabcdabcddcbadcbadcbadcbadcbadcbadcbadcba\'\nOutput: 104860361\nExplanation: \nThere are 3104860382 different non-empty palindromic subsequences, which is 104860361 modulo 10^9 + 7.\nNote:\nThe length of S will be in the range [1, 1000].\nEach character S[i] will be in the set {\'a\', \'b\', \'c\', \'d\'}.
 * <p>
 * 中文
 * 序号: 730
 * 标题： 统计不同回文子字符串
 * 链接： https://leetcode-cn.com/problems/count-different-palindromic-subsequences
 * 描述： 给定一个字符串 S，找出 S 中不同的非空回文子序列个数，并返回该数字与 10^9 + 7 的模。\n通过从 S 中删除 0 个或多个字符来获得子字符序列。\n如果一个字符序列与它反转后的字符序列一致，那么它是回文字符序列。\n如果对于某个  i，A_i != B_i，那么 A_1, A_2, ... 和 B_1, B_2, ... 这两个字符序列是不同的。\n  示例 1：\n输入：\nS = \'bccb\'\n输出：6\n解释：\n6 个不同的非空回文子字符序列分别为：\'b\', \'c\', \'bb\', \'cc\', \'bcb\', \'bccb\'。\n注意：\'bcb\' 虽然出现两次但仅计数一次。\n示例 2：\n输入：\nS = \'abcdabcdabcdabcdabcdabcdabcdabcddcbadcbadcbadcbadcbadcbadcbadcba\'\n输出：104860361\n解释：\n共有 3104860382 个不同的非空回文子字符序列，对 10^9 + 7 取模为 104860361。\n  提示：\n字符串 S 的长度将在[1, 1000]范围内。\n每个字符 S[i] 将会是集合 {\'a\', \'b\', \'c\', \'d\'} 中的某一个。\n
 * <p>
 * acceptance: 40.8%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class CountDifferentPalindromicSubsequences {
    public int countPalindromicSubsequences(String S) {
        return 0;
    }
}