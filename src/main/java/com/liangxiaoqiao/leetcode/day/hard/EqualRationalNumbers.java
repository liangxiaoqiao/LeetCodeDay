package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 972
 * title: Equal Rational Numbers
 * href: https://leetcode.com/problems/equal-rational-numbers
 * desc: Given two strings S and T, each of which represents a non-negative rational number, return True if and only if they represent the same number. The strings may use parentheses to denote the repeating part of the rational number.
 * In general a rational number can be represented using up to three parts: an integer part, a non-repeating part, and a repeating part. The number will be represented in one of the following three ways:
 * <IntegerPart> (e.g. 0, 12, 123)
 * <IntegerPart><.><NonRepeatingPart>  (e.g. 0.5, 1., 2.12, 2.0001)
 * <IntegerPart><.><NonRepeatingPart><(><RepeatingPart><)> (e.g. 0.1(6), 0.9(9), 0.00(1212))
 * The repeating portion of a decimal expansion is conventionally denoted within a pair of round brackets.  For example:
 * 1 / 6 = 0.16666666... = 0.1(6) = 0.1666(6) = 0.166(66)
 * Both 0.1(6) or 0.1666(6) or 0.166(66) are correct representations of 1 / 6.
 * Example 1:
 * Input: S = "0.(52)", T = "0.5(25)"
 * Output: true
 * Explanation:
 * Because "0.(52)" represents 0.52525252..., and "0.5(25)" represents 0.52525252525..... , the strings represent the same number.
 * Example 2:
 * Input: S = "0.1666(6)", T = "0.166(66)"
 * Output: true
 * Example 3:
 * Input: S = "0.9(9)", T = "1."
 * Output: true
 * Explanation:
 * "0.9(9)" represents 0.999999999... repeated forever, which equals 1.  [See this link for an explanation.]
 * "1." represents the number 1, which is formed correctly: (IntegerPart) = "1" and (NonRepeatingPart) = "".
 * Note:
 * Each part consists only of digits.
 * The <IntegerPart> will not begin with 2 or more zeros.  (There is no other restriction on the digits of each part.)
 * 1 <= <IntegerPart>.length <= 4
 * 0 <= <NonRepeatingPart>.length <= 4
 * 1 <= <RepeatingPart>.length <= 4
 * <p>
 * 中文
 * 序号: 972
 * 标题： 相等的有理数
 * 链接： https://leetcode-cn.com/problems/equal-rational-numbers
 * 描述： 给定两个字符串 S 和 T，每个字符串代表一个非负有理数，只有当它们表示相同的数字时才返回 true；否则，返回 false。字符串中可以使用括号来表示有理数的重复部分。
 * 通常，有理数最多可以用三个部分来表示：整数部分 <IntegerPart>、小数非重复部分 <NonRepeatingPart> 和小数重复部分 <(><RepeatingPart><)>。数字可以用以下三种方法之一来表示：
 * <IntegerPart>（例：0，12，123）
 * <IntegerPart><.><NonRepeatingPart> （例：0.5，2.12，2.0001）
 * <IntegerPart><.><NonRepeatingPart><(><RepeatingPart><)>（例：0.1(6)，0.9(9)，0.00(1212)）
 * 十进制展开的重复部分通常在一对圆括号内表示。例如：
 * 1 / 6 = 0.16666666... = 0.1(6) = 0.1666(6) = 0.166(66)
 * 0.1(6) 或 0.1666(6) 或 0.166(66) 都是 1 / 6 的正确表示形式。
 * 示例 1：
 * 输入：S = "0.(52)", T = "0.5(25)"
 * 输出：true
 * 解释：因为 "0.(52)" 代表 0.52525252...，而 "0.5(25)" 代表 0.52525252525.....，则这两个字符串表示相同的数字。
 * 示例 2：
 * 输入：S = "0.1666(6)", T = "0.166(66)"
 * 输出：true
 * 示例 3：
 * 输入：S = "0.9(9)", T = "1."
 * 输出：true
 * 解释：
 * "0.9(9)" 代表 0.999999999... 永远重复，等于 1 。[有关说明，请参阅此链接]
 * "1." 表示数字 1，其格式正确：(IntegerPart) = "1" 且 (NonRepeatingPart) = "" 。
 * 提示：
 * 每个部分仅由数字组成。
 * 整数部分 <IntegerPart> 不会以 2 个或更多的零开头。（对每个部分的数字没有其他限制）。
 * 1 <= <IntegerPart>.length <= 4
 * 0 <= <NonRepeatingPart>.length <= 4
 * 1 <= <RepeatingPart>.length <= 4
 * <p>
 * acceptance: 41.4%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class EqualRationalNumbers {
    public boolean isRationalEqual(String S, String T) {
        return false;
    }
}