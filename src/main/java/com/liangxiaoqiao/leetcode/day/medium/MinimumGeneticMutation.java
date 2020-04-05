package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 433
 * title: Minimum Genetic Mutation
 * href: https://leetcode.com/problems/minimum-genetic-mutation
 * desc: A gene string can be represented by an 8-character long string, with choices from "A", "C", "G", "T".
 * Suppose we need to investigate about a mutation (mutation from "start" to "end"), where ONE mutation is defined as ONE single character changed in the gene string.
 * For example, "AACCGGTT" -> "AACCGGTA" is 1 mutation.
 * Also, there is a given gene "bank", which records all the valid gene mutations. A gene must be in the bank to make it a valid gene string.
 * Now, given 3 things - start, end, bank, your task is to determine what is the minimum number of mutations needed to mutate from "start" to "end". If there is no such a mutation, return -1.
 * Note:
 * Starting point is assumed to be valid, so it might not be included in the bank.
 * If multiple mutations are needed, all mutations during in the sequence must be valid.
 * You may assume start and end string is not the same.
 * Example 1:
 * start: "AACCGGTT"
 * end:   "AACCGGTA"
 * bank: ["AACCGGTA"]
 * <p>
 * return: 1
 * Example 2:
 * start: "AACCGGTT"
 * end:   "AAACGGTA"
 * bank: ["AACCGGTA", "AACCGCTA", "AAACGGTA"]
 * <p>
 * return: 2
 * Example 3:
 * start: "AAAAACCC"
 * end:   "AACCCCCC"
 * bank: ["AAAACCCC", "AAACCCCC", "AACCCCCC"]
 * <p>
 * return: 3
 * <p>
 * <p>
 * 中文
 * 序号: 433
 * 标题： 最小基因变化
 * 链接： https://leetcode-cn.com/problems/minimum-genetic-mutation
 * 描述： 一条基因序列由一个带有8个字符的字符串表示，其中每个字符都属于 \"A\", \"C\", \"G\", \"T\"中的任意一个。\n假设我们要调查一个基因序列的变化。一次基因变化意味着这个基因序列中的一个字符发生了变化。\n例如，基因序列由\"AACCGGTT\" 变化至 \"AACCGGTA\" 即发生了一次基因变化。\n与此同时，每一次基因变化的结果，都需要是一个合法的基因串，即该结果属于一个基因库。\n现在给定3个参数 — start, end, bank，分别代表起始基因序列，目标基因序列及基因库，请找出能够使起始基因序列变化为目标基因序列所需的最少变化次数。如果无法实现目标变化，请返回 -1。\n注意:\n起始基因序列默认是合法的，但是它并不一定会出现在基因库中。\n所有的目标基因序列必须是合法的。\n假定起始基因序列与目标基因序列是不一样的。\n示例 1:\nstart: \"AACCGGTT\"\nend:   \"AACCGGTA\"\nbank: [\"AACCGGTA\"]\n\n返回值: 1\n示例 2:\nstart: \"AACCGGTT\"\nend:   \"AAACGGTA\"\nbank: [\"AACCGGTA\", \"AACCGCTA\", \"AAACGGTA\"]\n\n返回值: 2\n示例 3:\nstart: \"AAAAACCC\"\nend:   \"AACCCCCC\"\nbank: [\"AAAACCCC\", \"AAACCCCC\", \"AACCCCCC\"]\n\n返回值: 3
 * <p>
 * acceptance: 40.0%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class MinimumGeneticMutation {
    public int minMutation(String start, String end, String[] bank) {
        return 0;
    }
}