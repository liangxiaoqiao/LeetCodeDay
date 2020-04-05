package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 761
 * title: Special Binary String
 * href: https://leetcode.com/problems/special-binary-string
 * desc: Special binary strings are binary strings with the following two properties:\nThe number of 0\'s is equal to the number of 1\'s.\nEvery prefix of the binary string has at least as many 1\'s as 0\'s.\nGiven a special string S, a move consists of choosing two consecutive, non-empty, special substrings of S, and swapping them. (Two strings are consecutive if the last character of the first string is exactly one index before the first character of the second string.)\nAt the end of any number of moves, what is the lexicographically largest resulting string possible?\nExample 1:\nInput: S = \"11011000\"\nOutput: \"11100100\"\nExplanation:\nThe strings \"10\" [occuring at S[1]] and \"1100\" [at S[3]] are swapped.\nThis is the lexicographically largest string possible after some number of swaps.\nNote:\nS has length at most 50.\nS is guaranteed to be a special binary string as defined above.
 * <p>
 * 中文
 * 序号: 761
 * 标题： 特殊的二进制序列
 * 链接： https://leetcode-cn.com/problems/special-binary-string
 * 描述： 特殊的二进制序列是具有以下两个性质的二进制序列：\n0 的数量与 1 的数量相等。\n二进制序列的每一个前缀码中 1 的数量要大于等于 0 的数量。\n给定一个特殊的二进制序列 S，以字符串形式表示。定义一个操作 为首先选择 S 的两个连续且非空的特殊的子串，然后将它们交换。（两个子串为连续的当且仅当第一个子串的最后一个字符恰好为第二个子串的第一个字符的前一个字符。)\n在任意次数的操作之后，交换后的字符串按照字典序排列的最大的结果是什么？\n示例 1:\n输入: S = \"11011000\"\n输出: \"11100100\"\n解释:\n将子串 \"10\" （在S[1]出现） 和 \"1100\" （在S[3]出现）进行交换。\n这是在进行若干次操作后按字典序排列最大的结果。\n说明:\nS 的长度不超过 50。\nS 保证为一个满足上述定义的特殊 的二进制序列。
 * <p>
 * acceptance: 54.0%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class SpecialBinaryString {
    public String makeLargestSpecial(String S) {
        return null;
    }
}