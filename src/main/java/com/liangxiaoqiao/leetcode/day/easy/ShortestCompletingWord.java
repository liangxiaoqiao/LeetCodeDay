package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 748
 * title: Shortest Completing Word
 * href: https://leetcode.com/problems/shortest-completing-word
 * desc: Find the minimum length word from a given dictionary words, which has all the letters from the string licensePlate. Such a word is said to complete the given string licensePlate\nHere, for letters we ignore case. For example, \"P\" on the licensePlate still matches \"p\" on the word.\nIt is guaranteed an answer exists. If there are multiple answers, return the one that occurs first in the array.\nThe license plate might have the same letter occurring multiple times. For example, given a licensePlate of \"PP\", the word \"pair\" does not complete the licensePlate, but the word \"supper\" does.\nExample 1:\nInput: licensePlate = \"1s3 PSt\", words = [\"step\", \"steps\", \"stripe\", \"stepple\"]\nOutput: \"steps\"\nExplanation: The smallest length word that contains the letters \"S\", \"P\", \"S\", and \"T\".\nNote that the answer is not \"step\", because the letter \"s\" must occur in the word twice.\nAlso note that we ignored case for the purposes of comparing whether a letter exists in the word.\nExample 2:\nInput: licensePlate = \"1s3 456\", words = [\"looks\", \"pest\", \"stew\", \"show\"]\nOutput: \"pest\"\nExplanation: There are 3 smallest length words that contains the letters \"s\".\nWe return the one that occurred first.\nNote:\nlicensePlate will be a string with length in range [1, 7].\nlicensePlate will contain digits, spaces, or letters (uppercase or lowercase).\nwords will have a length in the range [10, 1000].\nEvery words[i] will consist of lowercase letters, and have length in range [1, 15].
 * <p>
 * 中文
 * 序号: 748
 * 标题： 最短完整词
 * 链接： https://leetcode-cn.com/problems/shortest-completing-word
 * 描述： 如果单词列表（words）中的一个单词包含牌照（licensePlate）中所有的字母，那么我们称之为完整词。在所有完整词中，最短的单词我们称之为最短完整词。\n单词在匹配牌照中的字母时不区分大小写，比如牌照中的 \"P\" 依然可以匹配单词中的 \"p\" 字母。\n我们保证一定存在一个最短完整词。当有多个单词都符合最短完整词的匹配条件时取单词列表中最靠前的一个。\n牌照中可能包含多个相同的字符，比如说：对于牌照 \"PP\"，单词 \"pair\" 无法匹配，但是 \"supper\" 可以匹配。\n  示例 1：\n输入：licensePlate = \"1s3 PSt\", words = [\"step\", \"steps\", \"stripe\", \"stepple\"]\n输出：\"steps\"\n说明：最短完整词应该包括 \"s\"、\"p\"、\"s\" 以及 \"t\"。对于 \"step\" 它只包含一个 \"s\" 所以它不符合条件。同时在匹配过程中我们忽略牌照中的大小写。\n  示例 2：\n输入：licensePlate = \"1s3 456\", words = [\"looks\", \"pest\", \"stew\", \"show\"]\n输出：\"pest\"\n说明：存在 3 个包含字母 \"s\" 且有着最短长度的完整词，但我们返回最先出现的完整词。\n  注意:\n牌照（licensePlate）的长度在区域[1, 7]中。\n牌照（licensePlate）将会包含数字、空格、或者字母（大写和小写）。\n单词列表（words）长度在区间 [10, 1000] 中。\n每一个单词 words[i] 都是小写，并且长度在区间 [1, 15] 中。\n
 * <p>
 * acceptance: 55.8%
 * difficulty: Easy
 * private: False
 */


//TODO init
public class ShortestCompletingWord {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        return null;
    }
}