package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 828
 * title: Unique Letter String
 * href: https://leetcode.com/problems/unique-letter-string
 * desc: A character is unique in string S if it occurs exactly once in it.
 * For example, in string S = "LETTER", the only unique characters are "L" and "R".
 * Let's define UNIQ(S) as the number of unique characters in string S.
 * For example, UNIQ("LETTER") =  2.
 * Given a string S with only uppercases, calculate the sum of UNIQ(substring) over all non-empty substrings of S.
 * If there are two or more equal substrings at different positions in S, we consider them different.
 * Since the answer can be very large, return the answer modulo 10 ^ 9 + 7.
 * Example 1:
 * Input: "ABC"
 * Output: 10
 * Explanation: All possible substrings are: "A","B","C","AB","BC" and "ABC".
 * Evey substring is composed with only unique letters.
 * Sum of lengths of all substring is 1 + 1 + 1 + 2 + 2 + 3 = 10
 * Example 2:
 * Input: "ABA"
 * Output: 8
 * Explanation: The same as example 1, except uni("ABA") = 1.
 * Note: 0 <= S.length <= 10000.
 * <p>
 * 中文
 * 序号: 828
 * 标题： 独特字符串
 * 链接： https://leetcode-cn.com/problems/unique-letter-string
 * 描述： 如果一个字符在字符串 S 中有且仅有出现一次，那么我们称其为独特字符。\n例如，在字符串 S = \"LETTER\" 中，\"L\" 和 \"R\" 可以被称为独特字符。\n我们再定义 UNIQ(S) 作为字符串 S 中独特字符的个数。\n那么，在 S = \"LETTER\" 中， UNIQ(\"LETTER\") =  2。\n对于给定字符串 S，计算其所有非空子串的独特字符的个数，即 UNIQ(substring)。\n如果出现两个或者多个相同的子串，将其认为是不同的两个子串。\n考虑到答案可能会非常大，规定返回格式为：结果 mod 10 ^ 9 + 7。\n示例 1:\n输入: \"ABC\"\n输出: 10\n解释: 所有可能的子串为：\"A\",\"B\",\"C\",\"AB\",\"BC\" 和 \"ABC\"。\n     其中，每一个子串都由独特字符构成。\n     所以其长度总和为：1 + 1 + 1 + 2 + 2 + 3 = 10\n示例 2:\n输入: \"ABA\"\n输出: 8\n解释: 除了子串 UNIQ(\'ABA\') = 1，其余与示例1相同。\n说明: 0 <= S.length <= 10000。
 * <p>
 * acceptance: 42.6%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class UniqueLetterString {
    public int uniqueLetterString(String S) {
        return 0;
    }
}