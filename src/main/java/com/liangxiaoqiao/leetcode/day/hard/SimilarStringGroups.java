package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 839
 * title: Similar String Groups
 * href: https://leetcode.com/problems/similar-string-groups
 * desc: Two strings X and Y are similar if we can swap two letters (in different positions) of X, so that it equals Y.\nFor example, \"tars\" and \"rats\" are similar (swapping at positions 0 and 2), and \"rats\" and \"arts\" are similar, but \"star\" is not similar to \"tars\", \"rats\", or \"arts\".\nTogether, these form two connected groups by similarity: {\"tars\", \"rats\", \"arts\"} and {\"star\"}.  Notice that \"tars\" and \"arts\" are in the same group even though they are not similar.  Formally, each group is such that a word is in the group if and only if it is similar to at least one other word in the group.\nWe are given a list A of strings.  Every string in A is an anagram of every other string in A.  How many groups are there?\nExample 1:\nInput: [\"tars\",\"rats\",\"arts\",\"star\"]\nOutput: 2\nNote:\nA.length <= 2000\nA[i].length <= 1000\nA.length * A[i].length <= 20000\nAll words in A consist of lowercase letters only.\nAll words in A have the same length and are anagrams of each other.\nThe judging time limit has been increased for this question.
 * <p>
 * 中文
 * 序号: 839
 * 标题： 相似字符串组
 * 链接： https://leetcode-cn.com/problems/similar-string-groups
 * 描述： 如果我们交换字符串 X 中的两个不同位置的字母，使得它和字符串 Y 相等，那么称 X 和 Y 两个字符串相似。\n例如，\"tars\" 和 \"rats\" 是相似的 (交换 0 与 2 的位置)； \"rats\" 和 \"arts\" 也是相似的，但是 \"star\" 不与 \"tars\"，\"rats\"，或 \"arts\" 相似。\n总之，它们通过相似性形成了两个关联组：{\"tars\", \"rats\", \"arts\"} 和 {\"star\"}。注意，\"tars\" 和 \"arts\" 是在同一组中，即使它们并不相似。形式上，对每个组而言，要确定一个单词在组中，只需要这个词和该组中至少一个单词相似。\n我们给出了一个不包含重复的字符串列表 A。列表中的每个字符串都是 A 中其它所有字符串的一个字母异位词。请问 A 中有多少个相似字符串组？\n示例：\n输入：[\"tars\",\"rats\",\"arts\",\"star\"]\n输出：2\n提示：\nA.length <= 2000\nA[i].length <= 1000\nA.length * A[i].length <= 20000\nA 中的所有单词都只包含小写字母。\nA 中的所有单词都具有相同的长度，且是彼此的字母异位词。\n此问题的判断限制时间已经延长。\n备注：\n      字母异位词[anagram]，一种把某个字符串的字母的位置（顺序）加以改换所形成的新词。
 * <p>
 * acceptance: 36.6%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class SimilarStringGroups {
    public int numSimilarGroups(String[] A) {
        return 0;
    }
}