package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 712
 * title: Minimum ASCII Delete Sum for Two Strings
 * href: https://leetcode.com/problems/minimum-ascii-delete-sum-for-two-strings
 * desc: Given two strings s1, s2, find the lowest ASCII sum of deleted characters to make two strings equal.\nExample 1:\nInput: s1 = \"sea\", s2 = \"eat\"\nOutput: 231\nExplanation: Deleting \"s\" from \"sea\" adds the ASCII value of \"s\" (115) to the sum.\nDeleting \"t\" from \"eat\" adds 116 to the sum.\nAt the end, both strings are equal, and 115 + 116 = 231 is the minimum sum possible to achieve this.\nExample 2:\nInput: s1 = \"delete\", s2 = \"leet\"\nOutput: 403\nExplanation: Deleting \"dee\" from \"delete\" to turn the string into \"let\",\nadds 100[d]+101[e]+101[e] to the sum.  Deleting \"e\" from \"leet\" adds 101[e] to the sum.\nAt the end, both strings are equal to \"let\", and the answer is 100+101+101+101 = 403.\nIf instead we turned both strings into \"lee\" or \"eet\", we would get answers of 433 or 417, which are higher.\nNote:\n0 < s1.length, s2.length <= 1000.\nAll elements of each string will have an ASCII value in [97, 122].
 * <p>
 * 中文
 * 序号: 712
 * 标题： 两个字符串的最小ASCII删除和
 * 链接： https://leetcode-cn.com/problems/minimum-ascii-delete-sum-for-two-strings
 * 描述： 给定两个字符串s1, s2，找到使两个字符串相等所需删除字符的ASCII值的最小和。\n示例 1:\n输入: s1 = \"sea\", s2 = \"eat\"\n输出: 231\n解释: 在 \"sea\" 中删除 \"s\" 并将 \"s\" 的值(115)加入总和。\n在 \"eat\" 中删除 \"t\" 并将 116 加入总和。\n结束时，两个字符串相等，115 + 116 = 231 就是符合条件的最小和。\n示例 2:\n输入: s1 = \"delete\", s2 = \"leet\"\n输出: 403\n解释: 在 \"delete\" 中删除 \"dee\" 字符串变成 \"let\"，\n将 100[d]+101[e]+101[e] 加入总和。在 \"leet\" 中删除 \"e\" 将 101[e] 加入总和。\n结束时，两个字符串都等于 \"let\"，结果即为 100+101+101+101 = 403 。\n如果改为将两个字符串转换为 \"lee\" 或 \"eet\"，我们会得到 433 或 417 的结果，比答案更大。\n注意:\n0 < s1.length, s2.length <= 1000。\n所有字符串中的字符ASCII值在[97, 122]之间。
 * <p>
 * acceptance: 56.4%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class MinimumAsciiDeleteSumForTwoStrings {
    public int minimumDeleteSum(String s1, String s2) {
        return 0;
    }
}