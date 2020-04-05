package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 115
 * title: Distinct Subsequences
 * href: https://leetcode.com/problems/distinct-subsequences
 * desc: Given a string S and a string T, count the number of distinct subsequences of S which equals T.\nA subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (ie, \"ACE\" is a subsequence of \"ABCDE\" while \"AEC\" is not).\nExample 1:\nInput: S = \"rabbbit\", T = \"rabbit\"\nOutput: 3\nExplanation:\n\nAs shown below, there are 3 ways you can generate \"rabbit\" from S.\n(The caret symbol ^ means the chosen letters)\n\nrabbbit\n^^^^ ^^\nrabbbit\n^^ ^^^^\nrabbbit\n^^^ ^^^\nExample 2:\nInput: S = \"babgbag\", T = \"bag\"\nOutput: 5\nExplanation:\n\nAs shown below, there are 5 ways you can generate \"bag\" from S.\n(The caret symbol ^ means the chosen letters)\n\nbabgbag\n^^ ^\nbabgbag\n^^    ^\nbabgbag\n^    ^^\nbabgbag\n  ^  ^^\nbabgbag\n    ^^^
 * <p>
 * 中文
 * 序号: 115
 * 标题： 不同的子序列
 * 链接： https://leetcode-cn.com/problems/distinct-subsequences
 * 描述： 给定一个字符串 S 和一个字符串 T，计算在 S 的子序列中 T 出现的个数。\n一个字符串的一个子序列是指，通过删除一些（也可以不删除）字符且不干扰剩余字符相对位置所组成的新字符串。（例如，\"ACE\" 是 \"ABCDE\" 的一个子序列，而 \"AEC\" 不是）\n示例 1:\n输入: S = \"rabbbit\", T = \"rabbit\"\n输出: 3\n解释:\n\n如下图所示, 有 3 种可以从 S 中得到 \"rabbit\" 的方案。\n(上箭头符号 ^ 表示选取的字母)\n\nrabbbit\n^^^^ ^^\nrabbbit\n^^ ^^^^\nrabbbit\n^^^ ^^^\n示例 2:\n输入: S = \"babgbag\", T = \"bag\"\n输出: 5\n解释:\n\n如下图所示, 有 5 种可以从 S 中得到 \"bag\" 的方案。 \n(上箭头符号 ^ 表示选取的字母)\n\nbabgbag\n^^ ^\nbabgbag\n^^    ^\nbabgbag\n^    ^^\nbabgbag\n  ^  ^^\nbabgbag\n    ^^^
 * <p>
 * acceptance: 36.4%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class DistinctSubsequences {
    public int numDistinct(String s, String t) {
        return 0;
    }
}