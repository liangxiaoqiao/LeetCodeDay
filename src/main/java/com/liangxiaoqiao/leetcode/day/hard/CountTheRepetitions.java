package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 466
 * title: Count The Repetitions
 * href: https://leetcode.com/problems/count-the-repetitions
 * desc: Define S = [s,n] as the string S which consists of n connected strings s. For example, [\"abc\", 3] =\"abcabcabc\".\nOn the other hand, we define that string s1 can be obtained from string s2 if we can remove some characters from s2 such that it becomes s1. For example, “abc” can be obtained from “abdbec” based on our definition, but it can not be obtained from “acbbe”.\nYou are given two non-empty strings s1 and s2 (each at most 100 characters long) and two integers 0 ≤ n1 ≤ 106 and 1 ≤ n2 ≤ 106. Now consider the strings S1 and S2, where S1=[s1,n1] and S2=[s2,n2]. Find the maximum integer M such that [S2,M] can be obtained from S1.\nExample:\nInput:\ns1=\"acb\", n1=4\ns2=\"ab\", n2=2\n\nReturn:\n2
 * <p>
 * 中文
 * 序号: 466
 * 标题： 统计重复个数
 * 链接： https://leetcode-cn.com/problems/count-the-repetitions
 * 描述： 定义由 n 个连接的字符串 s 组成字符串 S，即 S = [s,n]。例如，[\"abc\", 3]=“abcabcabc”。\n另一方面，如果我们可以从 s2 中删除某些字符使其变为 s1，我们称字符串 s1 可以从字符串 s2 获得。例如，“abc” 可以根据我们的定义从 “abdbec” 获得，但不能从 “acbbe” 获得。\n现在给出两个非空字符串 S1 和 S2（每个最多 100 个字符长）和两个整数 0 ≤ N1 ≤ 106 和 1 ≤ N2 ≤ 106。现在考虑字符串 S1 和 S2，其中S1=[s1,n1]和S2=[s2,n2]。找出可以使[S2,M]从 S1 获得的最大整数 M。\n示例：\n输入：\ns1 =\"acb\",n1 = 4\ns2 =\"ab\",n2 = 2\n\n返回：\n2
 * <p>
 * acceptance: 27.7%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class CountTheRepetitions {
    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        return 0;
    }
}