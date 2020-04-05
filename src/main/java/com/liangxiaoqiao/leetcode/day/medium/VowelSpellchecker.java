package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 966
 * title: Vowel Spellchecker
 * href: https://leetcode.com/problems/vowel-spellchecker
 * desc: Given a wordlist, we want to implement a spellchecker that converts a query word into a correct word.\nFor a given query word, the spell checker handles two categories of spelling mistakes:\nCapitalization: If the query matches a word in the wordlist (case-insensitive), then the query word is returned with the same case as the case in the wordlist.\nExample: wordlist = [\"yellow\"], query = \"YellOw\": correct = \"yellow\"\nExample: wordlist = [\"Yellow\"], query = \"yellow\": correct = \"Yellow\"\nExample: wordlist = [\"yellow\"], query = \"yellow\": correct = \"yellow\"\nVowel Errors: If after replacing the vowels (\'a\', \'e\', \'i\', \'o\', \'u\') of the query word with any vowel individually, it matches a word in the wordlist (case-insensitive), then the query word is returned with the same case as the match in the wordlist.\nExample: wordlist = [\"YellOw\"], query = \"yollow\": correct = \"YellOw\"\nExample: wordlist = [\"YellOw\"], query = \"yeellow\": correct = \"\" (no match)\nExample: wordlist = [\"YellOw\"], query = \"yllw\": correct = \"\" (no match)\nIn addition, the spell checker operates under the following precedence rules:\nWhen the query exactly matches a word in the wordlist (case-sensitive), you should return the same word back.\nWhen the query matches a word up to capitlization, you should return the first such match in the wordlist.\nWhen the query matches a word up to vowel errors, you should return the first such match in the wordlist.\nIf the query has no matches in the wordlist, you should return the empty string.\nGiven some queries, return a list of words answer, where answer[i] is the correct word for query = queries[i].\n  Example 1:\nInput: wordlist = [\"KiTe\",\"kite\",\"hare\",\"Hare\"], queries = [\"kite\",\"Kite\",\"KiTe\",\"Hare\",\"HARE\",\"Hear\",\"hear\",\"keti\",\"keet\",\"keto\"]\nOutput: [\"kite\",\"KiTe\",\"KiTe\",\"Hare\",\"hare\",\"\",\"\",\"KiTe\",\"\",\"KiTe\"]\n  Note:\n1 <= wordlist.length <= 5000\n1 <= queries.length <= 5000\n1 <= wordlist[i].length <= 7\n1 <= queries[i].length <= 7\nAll strings in wordlist and queries consist only of english letters.
 * <p>
 * 中文
 * 序号: 966
 * 标题： 元音拼写检查器
 * 链接： https://leetcode-cn.com/problems/vowel-spellchecker
 * 描述： 在给定单词列表 wordlist 的情况下，我们希望实现一个拼写检查器，将查询单词转换为正确的单词。\n对于给定的查询单词 query，拼写检查器将会处理两类拼写错误：\n大小写：如果查询匹配单词列表中的某个单词（不区分大小写），则返回的正确单词与单词列表中的大小写相同。\n例如：wordlist = [\"yellow\"], query = \"YellOw\": correct = \"yellow\"\n例如：wordlist = [\"Yellow\"], query = \"yellow\": correct = \"Yellow\"\n例如：wordlist = [\"yellow\"], query = \"yellow\": correct = \"yellow\"\n元音错误：如果在将查询单词中的元音（‘a’、‘e’、‘i’、‘o’、‘u’）分别替换为任何元音后，能与单词列表中的单词匹配（不区分大小写），则返回的正确单词与单词列表中的匹配项大小写相同。\n例如：wordlist = [\"YellOw\"], query = \"yollow\": correct = \"YellOw\"\n例如：wordlist = [\"YellOw\"], query = \"yeellow\": correct = \"\" （无匹配项）\n例如：wordlist = [\"YellOw\"], query = \"yllw\": correct = \"\" （无匹配项）\n此外，拼写检查器还按照以下优先级规则操作：\n当查询完全匹配单词列表中的某个单词（区分大小写）时，应返回相同的单词。\n当查询匹配到大小写问题的单词时，您应该返回单词列表中的第一个这样的匹配项。\n当查询匹配到元音错误的单词时，您应该返回单词列表中的第一个这样的匹配项。\n如果该查询在单词列表中没有匹配项，则应返回空字符串。\n给出一些查询 queries，返回一个单词答案列表 answer，其中 answer[i] 是由查询 query = queries[i] 得到的正确单词。\n  示例：\n输入：wordlist = [\"KiTe\",\"kite\",\"hare\",\"Hare\"], queries = [\"kite\",\"Kite\",\"KiTe\",\"Hare\",\"HARE\",\"Hear\",\"hear\",\"keti\",\"keet\",\"keto\"]\n输出：[\"kite\",\"KiTe\",\"KiTe\",\"Hare\",\"hare\",\"\",\"\",\"KiTe\",\"\",\"KiTe\"]\n  提示：\n1 <= wordlist.length <= 5000\n1 <= queries.length <= 5000\n1 <= wordlist[i].length <= 7\n1 <= queries[i].length <= 7\nwordlist 和 queries 中的所有字符串仅由英文字母组成。
 * <p>
 * acceptance: 45.4%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class VowelSpellchecker {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        return null;
    }
}

