package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 903
 * title: Valid Permutations for DI Sequence
 * href: https://leetcode.com/problems/valid-permutations-for-di-sequence
 * desc: We are given S, a length n string of characters from the set {\'D\', \'I\'}. (These letters stand for \"decreasing\" and \"increasing\".)\nA valid permutation is a permutation P[0], P[1], ..., P[n] of integers {0, 1, ..., n}, such that for all i:\nIf S[i] == \'D\', then P[i] > P[i+1], and;\nIf S[i] == \'I\', then P[i] < P[i+1].\nHow many valid permutations are there?  Since the answer may be large, return your answer modulo 10^9 + 7.\n  Example 1:\nInput: \"DID\"\nOutput: 5\nExplanation: \nThe 5 valid permutations of (0, 1, 2, 3) are:\n(1, 0, 3, 2)\n(2, 0, 3, 1)\n(2, 1, 3, 0)\n(3, 0, 2, 1)\n(3, 1, 2, 0)\n  Note:\n1 <= S.length <= 200\nS consists only of characters from the set {\'D\', \'I\'}.\n
 * <p>
 * 中文
 * 序号: 903
 * 标题： DI 序列的有效排列
 * 链接： https://leetcode-cn.com/problems/valid-permutations-for-di-sequence
 * 描述： 我们给出 S，一个源于 {\'D\', \'I\'} 的长度为 n 的字符串 。（这些字母代表 “减少” 和 “增加”。）\n有效排列 是对整数 {0, 1, ..., n} 的一个排列 P[0], P[1], ..., P[n]，使得对所有的 i：\n如果 S[i] == \'D\'，那么 P[i] > P[i+1]，以及；\n如果 S[i] == \'I\'，那么 P[i] < P[i+1]。\n有多少个有效排列？因为答案可能很大，所以请返回你的答案模 10^9 + 7.\n  示例：\n输入：\"DID\"\n输出：5\n解释：\n(0, 1, 2, 3) 的五个有效排列是：\n(1, 0, 3, 2)\n(2, 0, 3, 1)\n(2, 1, 3, 0)\n(3, 0, 2, 1)\n(3, 1, 2, 0)\n  提示：\n1 <= S.length <= 200\nS 仅由集合 {\'D\', \'I\'} 中的字符组成。\n
 * <p>
 * acceptance: 47.1%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class ValidPermutationsForDiSequence {
    public int numPermsDISequence(String S) {
        return 0;
    }
}