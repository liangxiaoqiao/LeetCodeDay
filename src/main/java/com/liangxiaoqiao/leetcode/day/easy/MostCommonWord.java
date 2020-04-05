package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 819
 * title: Most Common Word
 * href: https://leetcode.com/problems/most-common-word
 * desc: Given a paragraph and a list of banned words, return the most frequent word that is not in the list of banned words.  It is guaranteed there is at least one word that isn\'t banned, and that the answer is unique.\nWords in the list of banned words are given in lowercase, and free of punctuation.  Words in the paragraph are not case sensitive.  The answer is in lowercase.\n  Example:\nInput: \nparagraph = \"Bob hit a ball, the hit BALL flew far after it was hit.\"\nbanned = [\"hit\"]\nOutput: \"ball\"\nExplanation: \n\"hit\" occurs 3 times, but it is a banned word.\n\"ball\" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph. \nNote that words in the paragraph are not case sensitive,\nthat punctuation is ignored (even if adjacent to words, such as \"ball,\"), \nand that \"hit\" isn\'t the answer even though it occurs more because it is banned.\n  Note:\n1 <= paragraph.length <= 1000.\n1 <= banned.length <= 100.\n1 <= banned[i].length <= 10.\nThe answer is unique, and written in lowercase (even if its occurrences in paragraph may have uppercase symbols, and even if it is a proper noun.)\nparagraph only consists of letters, spaces, or the punctuation symbols !?\',;.\nThere are no hyphens or hyphenated words.\nWords only consist of letters, never apostrophes or other punctuation symbols.
 * <p>
 * 中文
 * 序号: 819
 * 标题： 最常见的单词
 * 链接： https://leetcode-cn.com/problems/most-common-word
 * 描述： 给定一个段落 (paragraph) 和一个禁用单词列表 (banned)。返回出现次数最多，同时不在禁用列表中的单词。题目保证至少有一个词不在禁用列表中，而且答案唯一。\n禁用列表中的单词用小写字母表示，不含标点符号。段落中的单词不区分大小写。答案都是小写字母。\n  示例：\n输入: \nparagraph = \"Bob hit a ball, the hit BALL flew far after it was hit.\"\nbanned = [\"hit\"]\n输出: \"ball\"\n解释: \n\"hit\" 出现了3次，但它是一个禁用的单词。\n\"ball\" 出现了2次 (同时没有其他单词出现2次)，所以它是段落里出现次数最多的，且不在禁用列表中的单词。 \n注意，所有这些单词在段落里不区分大小写，标点符号需要忽略（即使是紧挨着单词也忽略， 比如 \"ball,\"）， \n\"hit\"不是最终的答案，虽然它出现次数更多，但它在禁用单词列表中。\n  说明：\n1 <= 段落长度 <= 1000.\n1 <= 禁用单词个数 <= 100.\n1 <= 禁用单词长度 <= 10.\n答案是唯一的, 且都是小写字母 (即使在 paragraph 里是大写的，即使是一些特定的名词，答案都是小写的。)\nparagraph 只包含字母、空格和下列标点符号!?\',;.\n不存在没有连字符或者带有连字符的单词。\n单词里只包含字母，不会出现省略号或者其他标点符号。
 * <p>
 * acceptance: 43.4%
 * difficulty: Easy
 * private: False
 */


//TODO init
public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        return null;
    }
}