package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 820
 * title: Short Encoding of Words
 * href: https://leetcode.com/problems/short-encoding-of-words
 * desc: Given a list of words, we may encode it by writing a reference string S and a list of indexes A.\nFor example, if the list of words is [\"time\", \"me\", \"bell\"], we can write it as S = \"time#bell#\" and indexes = [0, 2, 5].\nThen for each index, we will recover the word by reading from the reference string from that index until we reach a \"#\" character.\nWhat is the length of the shortest reference string S possible that encodes the given words?\nExample:\nInput: words = [\"time\", \"me\", \"bell\"]\nOutput: 10\nExplanation: S = \"time#bell#\" and indexes = [0, 2, 5].\n  Note:\n1 <= words.length <= 2000.\n1 <= words[i].length <= 7.\nEach word has only lowercase letters.
 * <p>
 * 中文
 * 序号: 820
 * 标题： 单词的压缩编码
 * 链接： https://leetcode-cn.com/problems/short-encoding-of-words
 * 描述： 给定一个单词列表，我们将这个列表编码成一个索引字符串 S 与一个索引列表 A。\n例如，如果这个列表是 [\"time\", \"me\", \"bell\"]，我们就可以将其表示为 S = \"time#bell#\" 和 indexes = [0, 2, 5]。\n对于每一个索引，我们可以通过从字符串 S 中索引的位置开始读取字符串，直到 \"#\" 结束，来恢复我们之前的单词列表。\n那么成功对给定单词列表进行编码的最小字符串长度是多少呢？\n  示例：\n输入: words = [\"time\", \"me\", \"bell\"]\n输出: 10\n说明: S = \"time#bell#\" ， indexes = [0, 2, 5] 。\n  提示：\n1 <= words.length <= 2000\n1 <= words[i].length <= 7\n每个单词都是小写字母 。
 * <p>
 * acceptance: 49.0%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class ShortEncodingOfWords {
    public int minimumLengthEncoding(String[] words) {
        return 0;
    }
}