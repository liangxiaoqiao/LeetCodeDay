package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 806
 * title: Number of Lines To Write String
 * href: https://leetcode.com/problems/number-of-lines-to-write-string
 * desc: We are to write the letters of a given string S, from left to right into lines. Each line has maximum width 100 units, and if writing a letter would cause the width of the line to exceed 100 units, it is written on the next line. We are given an array widths, an array where widths[0] is the width of \'a\', widths[1] is the width of \'b\', ..., and widths[25] is the width of \'z\'.\nNow answer two questions: how many lines have at least one character from S, and what is the width used by the last such line? Return your answer as an integer list of length 2.\n  Example :\nInput: \nwidths = [10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10]\nS = \"abcdefghijklmnopqrstuvwxyz\"\nOutput: [3, 60]\nExplanation: \nAll letters have the same length of 10. To write all 26 letters,\nwe need two full lines and one line with 60 units.\nExample :\nInput: \nwidths = [4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10]\nS = \"bbbcccdddaaa\"\nOutput: [2, 4]\nExplanation: \nAll letters except \'a\' have the same length of 10, and \n\"bbbcccdddaa\" will cover 9 * 10 + 2 * 4 = 98 units.\nFor the last \'a\', it is written on the second line because\nthere is only 2 units left in the first line.\nSo the answer is 2 lines, plus 4 units in the second line.\n  Note:\nThe length of S will be in the range [1, 1000].\nS will only contain lowercase letters.\nwidths is an array of length 26.\nwidths[i] will be in the range of [2, 10].
 * <p>
 * 中文
 * 序号: 806
 * 标题： 写字符串需要的行数
 * 链接： https://leetcode-cn.com/problems/number-of-lines-to-write-string
 * 描述： 我们要把给定的字符串 S 从左到右写到每一行上，每一行的最大宽度为100个单位，如果我们在写某个字母的时候会使这行超过了100 个单位，那么我们应该把这个字母写到下一行。我们给定了一个数组 widths ，这个数组 widths[0] 代表 \'a\' 需要的单位， widths[1] 代表 \'b\' 需要的单位，...， widths[25] 代表 \'z\' 需要的单位。\n现在回答两个问题：至少多少行能放下S，以及最后一行使用的宽度是多少个单位？将你的答案作为长度为2的整数列表返回。\n示例 1:\n输入: \nwidths = [10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10]\nS = \"abcdefghijklmnopqrstuvwxyz\"\n输出: [3, 60]\n解释: \n所有的字符拥有相同的占用单位10。所以书写所有的26个字母，\n我们需要2个整行和占用60个单位的一行。\n示例 2:\n输入: \nwidths = [4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10]\nS = \"bbbcccdddaaa\"\n输出: [2, 4]\n解释: \n除去字母\'a\'所有的字符都是相同的单位10，并且字符串 \"bbbcccdddaa\" 将会覆盖 9 * 10 + 2 * 4 = 98 个单位.\n最后一个字母 \'a\' 将会被写到第二行，因为第一行只剩下2个单位了。\n所以，这个答案是2行，第二行有4个单位宽度。\n  注:\n字符串 S 的长度在 [1, 1000] 的范围。\nS 只包含小写字母。\nwidths 是长度为 26的数组。\nwidths[i] 值的范围在 [2, 10]。
 * <p>
 * acceptance: 63.9%
 * difficulty: Easy
 * private: False
 */


//TODO init
public class NumberOfLinesToWriteString {
    public int[] numberOfLines(int[] widths, String S) {
        return null;
    }
}