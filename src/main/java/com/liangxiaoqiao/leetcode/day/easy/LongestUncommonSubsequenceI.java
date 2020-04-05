package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 521
 * title: Longest Uncommon Subsequence I
 * href: https://leetcode.com/problems/longest-uncommon-subsequence-i
 * desc: Given a group of two strings, you need to find the longest uncommon subsequence of this group of two strings. The longest uncommon subsequence is defined as the longest subsequence of one of these strings and this subsequence should not be any subsequence of the other strings.\nA subsequence is a sequence that can be derived from one sequence by deleting some characters without changing the order of the remaining elements. Trivially, any string is a subsequence of itself and an empty string is a subsequence of any string.\nThe input will be two strings, and the output needs to be the length of the longest uncommon subsequence. If the longest uncommon subsequence doesn\'t exist, return -1.\nExample 1:\nInput: \"aba\", \"cdc\"\nOutput: 3\nExplanation: The longest uncommon subsequence is \"aba\" (or \"cdc\"), \nbecause \"aba\" is a subsequence of \"aba\", \nbut not a subsequence of any other strings in the group of two strings. \nNote:\nBoth strings\' lengths will not exceed 100.\nOnly letters from a ~ z will appear in input strings.
 * <p>
 * 中文
 * 序号: 521
 * 标题： 最长特殊序列 Ⅰ
 * 链接： https://leetcode-cn.com/problems/longest-uncommon-subsequence-i
 * 描述： 给定两个字符串，你需要从这两个字符串中找出最长的特殊序列。最长特殊序列定义如下：该序列为某字符串独有的最长子序列（即不能是其他字符串的子序列）。\n子序列可以通过删去字符串中的某些字符实现，但不能改变剩余字符的相对顺序。空序列为所有字符串的子序列，任何字符串为其自身的子序列。\n输入为两个字符串，输出最长特殊序列的长度。如果不存在，则返回 -1。\n示例 :\n输入: \"aba\", \"cdc\"\n输出: 3\n解析: 最长特殊序列可为 \"aba\" (或 \"cdc\")\n说明:\n两个字符串长度均小于100。\n字符串中的字符仅含有 \'a\'~\'z\'。
 * <p>
 * acceptance: 57.1%
 * difficulty: Easy
 * private: False
 */


//TODO init
public class LongestUncommonSubsequenceI {
    public int findLUSlength(String a, String b) {
        return 0;
    }
}