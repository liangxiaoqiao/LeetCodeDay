package com.liangxiaoqiao.leetcode.day.medium;


import java.util.List;
    
/*
 * English
 * id: 816
 * title: Ambiguous Coordinates
 * href: https://leetcode.com/problems/ambiguous-coordinates
 * desc: We had some 2-dimensional coordinates, like \"(1, 3)\" or \"(2, 0.5)\".  Then, we removed all commas, decimal points, and spaces, and ended up with the string S.  Return a list of strings representing all possibilities for what our original coordinates could have been.\nOur original representation never had extraneous zeroes, so we never started with numbers like \"00\", \"0.0\", \"0.00\", \"1.0\", \"001\", \"00.01\", or any other number that can be represented with less digits.  Also, a decimal point within a number never occurs without at least one digit occuring before it, so we never started with numbers like \".1\".\nThe final answer list can be returned in any order.  Also note that all coordinates in the final answer have exactly one space between them (occurring after the comma.)\nExample 1:\nInput: \"(123)\"\nOutput: [\"(1, 23)\", \"(12, 3)\", \"(1.2, 3)\", \"(1, 2.3)\"]\nExample 2:\nInput: \"(00011)\"\nOutput:  [\"(0.001, 1)\", \"(0, 0.011)\"]\nExplanation: \n0.0, 00, 0001 or 00.01 are not allowed.\nExample 3:\nInput: \"(0123)\"\nOutput: [\"(0, 123)\", \"(0, 12.3)\", \"(0, 1.23)\", \"(0.1, 23)\", \"(0.1, 2.3)\", \"(0.12, 3)\"]\nExample 4:\nInput: \"(100)\"\nOutput: [(10, 0)]\nExplanation: \n1.0 is not allowed.\n  Note:\n4 <= S.length <= 12.\nS[0] = \"(\", S[S.length - 1] = \")\", and the other elements in S are digits.\n
 * <p>
 * 中文
 * 序号: 816
 * 标题： 模糊坐标
 * 链接： https://leetcode-cn.com/problems/ambiguous-coordinates
 * 描述： 我们有一些二维坐标，如 \"(1, 3)\" 或 \"(2, 0.5)\"，然后我们移除所有逗号，小数点和空格，得到一个字符串S。返回所有可能的原始字符串到一个列表中。\n原始的坐标表示法不会存在多余的零，所以不会出现类似于\"00\", \"0.0\", \"0.00\", \"1.0\", \"001\", \"00.01\"或一些其他更小的数来表示坐标。此外，一个小数点前至少存在一个数，所以也不会出现“.1”形式的数字。\n最后返回的列表可以是任意顺序的。而且注意返回的两个数字中间（逗号之后）都有一个空格。\n  示例 1:\n输入: \"(123)\"\n输出: [\"(1, 23)\", \"(12, 3)\", \"(1.2, 3)\", \"(1, 2.3)\"]\n示例 2:\n输入: \"(00011)\"\n输出:  [\"(0.001, 1)\", \"(0, 0.011)\"]\n解释: \n0.0, 00, 0001 或 00.01 是不被允许的。\n示例 3:\n输入: \"(0123)\"\n输出: [\"(0, 123)\", \"(0, 12.3)\", \"(0, 1.23)\", \"(0.1, 23)\", \"(0.1, 2.3)\", \"(0.12, 3)\"]\n示例 4:\n输入: \"(100)\"\n输出: [(10, 0)]\n解释: \n1.0 是不被允许的。\n  提示:\n4 <= S.length <= 12.\nS[0] = \"(\", S[S.length - 1] = \")\", 且字符串 S 中的其他元素都是数字。\n
 * <p>
 * acceptance: 45.8%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class AmbiguousCoordinates {
    public List<String> ambiguousCoordinates(String S) {
        return null;
    }
}

