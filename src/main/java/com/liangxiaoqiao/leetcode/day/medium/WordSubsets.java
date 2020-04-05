package com.liangxiaoqiao.leetcode.day.medium;


import java.util.List;
    
/*
 * English
 * id: 916
 * title: Word Subsets
 * href: https://leetcode.com/problems/word-subsets
 * desc: We are given two arrays A and B of words.  Each word is a string of lowercase letters.\nNow, say that word b is a subset of word a if every letter in b occurs in a, including multiplicity.  For example, \"wrr\" is a subset of \"warrior\", but is not a subset of \"world\".\nNow say a word a from A is universal if for every b in B, b is a subset of a. \nReturn a list of all universal words in A.  You can return the words in any order.\n  Example 1:\nInput: A = [\"amazon\",\"apple\",\"facebook\",\"google\",\"leetcode\"], B = [\"e\",\"o\"]\nOutput: [\"facebook\",\"google\",\"leetcode\"]\nExample 2:\nInput: A = [\"amazon\",\"apple\",\"facebook\",\"google\",\"leetcode\"], B = [\"l\",\"e\"]\nOutput: [\"apple\",\"google\",\"leetcode\"]\nExample 3:\nInput: A = [\"amazon\",\"apple\",\"facebook\",\"google\",\"leetcode\"], B = [\"e\",\"oo\"]\nOutput: [\"facebook\",\"google\"]\nExample 4:\nInput: A = [\"amazon\",\"apple\",\"facebook\",\"google\",\"leetcode\"], B = [\"lo\",\"eo\"]\nOutput: [\"google\",\"leetcode\"]\nExample 5:\nInput: A = [\"amazon\",\"apple\",\"facebook\",\"google\",\"leetcode\"], B = [\"ec\",\"oc\",\"ceo\"]\nOutput: [\"facebook\",\"leetcode\"]\n  Note:\n1 <= A.length, B.length <= 10000\n1 <= A[i].length, B[i].length <= 10\nA[i] and B[i] consist only of lowercase letters.\nAll words in A[i] are unique: there isn\'t i != j with A[i] == A[j].
 * <p>
 * 中文
 * 序号: 916
 * 标题： 单词子集
 * 链接： https://leetcode-cn.com/problems/word-subsets
 * 描述： 我们给出两个单词数组 A 和 B。每个单词都是一串小写字母。\n现在，如果 b 中的每个字母都出现在 a 中，包括重复出现的字母，那么称单词 b 是单词 a 的子集。 例如，“wrr” 是 “warrior” 的子集，但不是 “world” 的子集。\n如果对 B 中的每一个单词 b，b 都是 a 的子集，那么我们称 A 中的单词 a 是通用的。\n你可以按任意顺序以列表形式返回 A 中所有的通用单词。\n  示例 1：\n输入：A = [\"amazon\",\"apple\",\"facebook\",\"google\",\"leetcode\"], B = [\"e\",\"o\"]\n输出：[\"facebook\",\"google\",\"leetcode\"]\n示例 2：\n输入：A = [\"amazon\",\"apple\",\"facebook\",\"google\",\"leetcode\"], B = [\"l\",\"e\"]\n输出：[\"apple\",\"google\",\"leetcode\"]\n示例 3：\n输入：A = [\"amazon\",\"apple\",\"facebook\",\"google\",\"leetcode\"], B = [\"e\",\"oo\"]\n输出：[\"facebook\",\"google\"]\n示例 4：\n输入：A = [\"amazon\",\"apple\",\"facebook\",\"google\",\"leetcode\"], B = [\"lo\",\"eo\"]\n输出：[\"google\",\"leetcode\"]\n示例 5：\n输入：A = [\"amazon\",\"apple\",\"facebook\",\"google\",\"leetcode\"], B = [\"ec\",\"oc\",\"ceo\"]\n输出：[\"facebook\",\"leetcode\"]\n  提示：\n1 <= A.length, B.length <= 10000\n1 <= A[i].length, B[i].length <= 10\nA[i] 和 B[i] 只由小写字母组成。\nA[i] 中所有的单词都是独一无二的，也就是说不存在 i != j 使得 A[i] == A[j]。
 * <p>
 * acceptance: 46.5%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class WordSubsets {
    public List<String> wordSubsets(String[] A, String[] B) {
        return null;
    }
}
