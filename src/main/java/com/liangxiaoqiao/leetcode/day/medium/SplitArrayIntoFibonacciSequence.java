package com.liangxiaoqiao.leetcode.day.medium;


import java.util.List;
    
/*
 * English
 * id: 842
 * title: Split Array into Fibonacci Sequence
 * href: https://leetcode.com/problems/split-array-into-fibonacci-sequence
 * desc: Given a string S of digits, such as S = \"123456579\", we can split it into a Fibonacci-like sequence [123, 456, 579].\nFormally, a Fibonacci-like sequence is a list F of non-negative integers such that:\n0 <= F[i] <= 2^31 - 1, (that is, each integer fits a 32-bit signed integer type);\nF.length >= 3;\nand F[i] + F[i+1] = F[i+2] for all 0 <= i < F.length - 2.\nAlso, note that when splitting the string into pieces, each piece must not have extra leading zeroes, except if the piece is the number 0 itself.\nReturn any Fibonacci-like sequence split from S, or return [] if it cannot be done.\nExample 1:\nInput: \"123456579\"\nOutput: [123,456,579]\nExample 2:\nInput: \"11235813\"\nOutput: [1,1,2,3,5,8,13]\nExample 3:\nInput: \"112358130\"\nOutput: []\nExplanation: The task is impossible.\nExample 4:\nInput: \"0123\"\nOutput: []\nExplanation: Leading zeroes are not allowed, so \"01\", \"2\", \"3\" is not valid.\nExample 5:\nInput: \"1101111\"\nOutput: [110, 1, 111]\nExplanation: The output [11, 0, 11, 11] would also be accepted.\nNote:\n1 <= S.length <= 200\nS contains only digits.
 * <p>
 * 中文
 * 序号: 842
 * 标题： 将数组拆分成斐波那契序列
 * 链接： https://leetcode-cn.com/problems/split-array-into-fibonacci-sequence
 * 描述： 给定一个数字字符串 S，比如 S = \"123456579\"，我们可以将它分成斐波那契式的序列 [123, 456, 579]。\n形式上，斐波那契式序列是一个非负整数列表 F，且满足：\n0 <= F[i] <= 2^31 - 1，（也就是说，每个整数都符合 32 位有符号整数类型）；\nF.length >= 3；\n对于所有的0 <= i < F.length - 2，都有 F[i] + F[i+1] = F[i+2] 成立。\n另外，请注意，将字符串拆分成小块时，每个块的数字一定不要以零开头，除非这个块是数字 0 本身。\n返回从 S 拆分出来的所有斐波那契式的序列块，如果不能拆分则返回 []。\n示例 1：\n输入：\"123456579\"\n输出：[123,456,579]\n示例 2：\n输入: \"11235813\"\n输出: [1,1,2,3,5,8,13]\n示例 3：\n输入: \"112358130\"\n输出: []\n解释: 这项任务无法完成。\n示例 4：\n输入：\"0123\"\n输出：[]\n解释：每个块的数字不能以零开头，因此 \"01\"，\"2\"，\"3\" 不是有效答案。\n示例 5：\n输入: \"1101111\"\n输出: [110, 1, 111]\n解释: 输出 [11,0,11,11] 也同样被接受。\n提示：\n1 <= S.length <= 200\n字符串 S 中只含有数字。
 * <p>
 * acceptance: 35.5%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class SplitArrayIntoFibonacciSequence {
    public List<Integer> splitIntoFibonacci(String S) {
        return null;
    }
}

