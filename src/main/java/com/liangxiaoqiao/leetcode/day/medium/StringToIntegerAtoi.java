package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 8
 * title: String to Integer (atoi)
 * href: https://leetcode.com/problems/string-to-integer-atoi
 * desc: Implement atoi which converts a string to an integer.\nThe function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.\nThe string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.\nIf the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.\nIf no valid conversion could be performed, a zero value is returned.\nNote:\nOnly the space character \' \' is considered as whitespace character.\nAssume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. If the numerical value is out of the range of representable values, INT_MAX (231 − 1) or INT_MIN (−231) is returned.\nExample 1:\nInput: \"42\"\nOutput: 42\nExample 2:\nInput: \"   -42\"\nOutput: -42\nExplanation: The first non-whitespace character is \'-\', which is the minus sign.\n             Then take as many numerical digits as possible, which gets 42.\nExample 3:\nInput: \"4193 with words\"\nOutput: 4193\nExplanation: Conversion stops at digit \'3\' as the next character is not a numerical digit.\nExample 4:\nInput: \"words and 987\"\nOutput: 0\nExplanation: The first non-whitespace character is \'w\', which is not a numerical \n             digit or a +/- sign. Therefore no valid conversion could be performed.\nExample 5:\nInput: \"-91283472332\"\nOutput: -2147483648\nExplanation: The number \"-91283472332\" is out of the range of a 32-bit signed integer.\n             Thefore INT_MIN (−231) is returned.
 * <p>
 * 中文
 * 序号: 8
 * 标题： 字符串转换整数 (atoi)
 * 链接： https://leetcode-cn.com/problems/string-to-integer-atoi
 * 描述： 请你来实现一个 atoi 函数，使其能将字符串转换成整数。\n首先，该函数会根据需要丢弃无用的开头空格字符，直到寻找到第一个非空格的字符为止。\n当我们寻找到的第一个非空字符为正或者负号时，则将该符号与之后面尽可能多的连续数字组合起来，作为该整数的正负号；假如第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成整数。\n该字符串除了有效的整数部分之后也可能会存在多余的字符，这些字符可以被忽略，它们对于函数不应该造成影响。\n注意：假如该字符串中的第一个非空格字符不是一个有效整数字符、字符串为空或字符串仅包含空白字符时，则你的函数不需要进行转换。\n在任何情况下，若函数不能进行有效的转换时，请返回 0。\n说明：\n假设我们的环境只能存储 32 位大小的有符号整数，那么其数值范围为 [−231,  231 − 1]。如果数值超过这个范围，qing返回  INT_MAX (231 − 1) 或 INT_MIN (−231) 。\n示例 1:\n输入: \"42\"\n输出: 42\n示例 2:\n输入: \"   -42\"\n输出: -42\n解释: 第一个非空白字符为 \'-\', 它是一个负号。\n     我们尽可能将负号与后面所有连续出现的数字组合起来，最后得到 -42 。\n示例 3:\n输入: \"4193 with words\"\n输出: 4193\n解释: 转换截止于数字 \'3\' ，因为它的下一个字符不为数字。\n示例 4:\n输入: \"words and 987\"\n输出: 0\n解释: 第一个非空字符是 \'w\', 但它不是数字或正、负号。\n     因此无法执行有效的转换。\n示例 5:\n输入: \"-91283472332\"\n输出: -2147483648\n解释: 数字 \"-91283472332\" 超过 32 位有符号整数范围。 \n     因此返回 INT_MIN (−231) 。
 * <p>
 * acceptance: 14.9%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class StringToIntegerAtoi {
    public int myAtoi(String str) {
        return 0;
    }
}