package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 87
 * title: Scramble String
 * href: https://leetcode.com/problems/scramble-string
 * desc: Given a string s1, we may represent it as a binary tree by partitioning it to two non-empty substrings recursively.\nBelow is one possible representation of s1 = \"great\":\n    great\n   /    \\\n  gr    eat\n / \\    /  \\\ng   r  e   at\n           / \\\n          a   t\nTo scramble the string, we may choose any non-leaf node and swap its two children.\nFor example, if we choose the node \"gr\" and swap its two children, it produces a scrambled string \"rgeat\".\n    rgeat\n   /    \\\n  rg    eat\n / \\    /  \\\nr   g  e   at\n           / \\\n          a   t\nWe say that \"rgeat\" is a scrambled string of \"great\".\nSimilarly, if we continue to swap the children of nodes \"eat\" and \"at\", it produces a scrambled string \"rgtae\".\n    rgtae\n   /    \\\n  rg    tae\n / \\    /  \\\nr   g  ta  e\n       / \\\n      t   a\nWe say that \"rgtae\" is a scrambled string of \"great\".\nGiven two strings s1 and s2 of the same length, determine if s2 is a scrambled string of s1.\nExample 1:\nInput: s1 = \"great\", s2 = \"rgeat\"\nOutput: true\nExample 2:\nInput: s1 = \"abcde\", s2 = \"caebd\"\nOutput: false
 * <p>
 * 中文
 * 序号: 87
 * 标题： 扰乱字符串
 * 链接： https://leetcode-cn.com/problems/scramble-string
 * 描述： 给定一个字符串 s1，我们可以把它递归地分割成两个非空子字符串，从而将其表示为二叉树。\n下图是字符串 s1 = \"great\" 的一种可能的表示形式。\n    great\n   /    \\\n  gr    eat\n / \\    /  \\\ng   r  e   at\n           / \\\n          a   t\n在扰乱这个字符串的过程中，我们可以挑选任何一个非叶节点，然后交换它的两个子节点。\n例如，如果我们挑选非叶节点 \"gr\" ，交换它的两个子节点，将会产生扰乱字符串 \"rgeat\" 。\n    rgeat\n   /    \\\n  rg    eat\n / \\    /  \\\nr   g  e   at\n           / \\\n          a   t\n我们将 \"rgeat” 称作 \"great\" 的一个扰乱字符串。\n同样地，如果我们继续将其节点 \"eat\" 和 \"at\" 进行交换，将会产生另一个新的扰乱字符串 \"rgtae\" 。\n    rgtae\n   /    \\\n  rg    tae\n / \\    /  \\\nr   g  ta  e\n       / \\\n      t   a\n我们将 \"rgtae” 称作 \"great\" 的一个扰乱字符串。\n给出两个长度相等的字符串 s1 和 s2，判断 s2 是否是 s1 的扰乱字符串。\n示例 1:\n输入: s1 = \"great\", s2 = \"rgeat\"\n输出: true\n示例 2:\n输入: s1 = \"abcde\", s2 = \"caebd\"\n输出: false
 * <p>
 * acceptance: 32.6%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class ScrambleString {
    public boolean isScramble(String s1, String s2) {
        return false;
    }
}