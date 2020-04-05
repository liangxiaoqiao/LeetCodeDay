package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 72
 * title: Edit Distance
 * href: https://leetcode.com/problems/edit-distance
 * desc: Given two words word1 and word2, find the minimum number of operations required to convert word1 to word2.\nYou have the following 3 operations permitted on a word:\nInsert a character\nDelete a character\nReplace a character\nExample 1:\nInput: word1 = \"horse\", word2 = \"ros\"\nOutput: 3\nExplanation: \nhorse -> rorse (replace \'h\' with \'r\')\nrorse -> rose (remove \'r\')\nrose -> ros (remove \'e\')\nExample 2:\nInput: word1 = \"intention\", word2 = \"execution\"\nOutput: 5\nExplanation: \nintention -> inention (remove \'t\')\ninention -> enention (replace \'i\' with \'e\')\nenention -> exention (replace \'n\' with \'x\')\nexention -> exection (replace \'n\' with \'c\')\nexection -> execution (insert \'u\')
 * <p>
 * 中文
 * 序号: 72
 * 标题： 编辑距离
 * 链接： https://leetcode-cn.com/problems/edit-distance
 * 描述： 给定两个单词 word1 和 word2，计算出将 word1 转换成 word2 所使用的最少操作数 。\n你可以对一个单词进行如下三种操作：\n插入一个字符\n删除一个字符\n替换一个字符\n示例 1:\n输入: word1 = \"horse\", word2 = \"ros\"\n输出: 3\n解释: \nhorse -> rorse (将 \'h\' 替换为 \'r\')\nrorse -> rose (删除 \'r\')\nrose -> ros (删除 \'e\')\n示例 2:\n输入: word1 = \"intention\", word2 = \"execution\"\n输出: 5\n解释: \nintention -> inention (删除 \'t\')\ninention -> enention (将 \'i\' 替换为 \'e\')\nenention -> exention (将 \'n\' 替换为 \'x\')\nexention -> exection (将 \'n\' 替换为 \'c\')\nexection -> execution (插入 \'u\')
 * <p>
 * acceptance: 40.7%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class EditDistance {
    public int minDistance(String word1, String word2) {
        return 0;
    }
}