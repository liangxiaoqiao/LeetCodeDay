package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 880
 * title: Decoded String at Index
 * href: https://leetcode.com/problems/decoded-string-at-index
 * desc: An encoded string S is given.  To find and write the decoded string to a tape, the encoded string is read one character at a time and the following steps are taken:\nIf the character read is a letter, that letter is written onto the tape.\nIf the character read is a digit (say d), the entire current tape is repeatedly written d-1 more times in total.\nNow for some encoded string S, and an index K, find and return the K-th letter (1 indexed) in the decoded string.\n  Example 1:\nInput: S = \"leet2code3\", K = 10\nOutput: \"o\"\nExplanation: \nThe decoded string is \"leetleetcodeleetleetcodeleetleetcode\".\nThe 10th letter in the string is \"o\".\nExample 2:\nInput: S = \"ha22\", K = 5\nOutput: \"h\"\nExplanation: \nThe decoded string is \"hahahaha\".  The 5th letter is \"h\".\nExample 3:\nInput: S = \"a2345678999999999999999\", K = 1\nOutput: \"a\"\nExplanation: \nThe decoded string is \"a\" repeated 8301530446056247680 times.  The 1st letter is \"a\".\n  Note:\n2 <= S.length <= 100\nS will only contain lowercase letters and digits 2 through 9.\nS starts with a letter.\n1 <= K <= 10^9\nThe decoded string is guaranteed to have less than 2^63 letters.
 * <p>
 * 中文
 * 序号: 880
 * 标题： 索引处的解码字符串
 * 链接： https://leetcode-cn.com/problems/decoded-string-at-index
 * 描述： 给定一个编码字符串 S。为了找出解码字符串并将其写入磁带，从编码字符串中每次读取一个字符，并采取以下步骤：\n如果所读的字符是字母，则将该字母写在磁带上。\n如果所读的字符是数字（例如 d），则整个当前磁带总共会被重复写 d-1 次。\n现在，对于给定的编码字符串 S 和索引 K，查找并返回解码字符串中的第 K 个字母。\n  示例 1：\n输入：S = \"leet2code3\", K = 10\n输出：\"o\"\n解释：\n解码后的字符串为 \"leetleetcodeleetleetcodeleetleetcode\"。\n字符串中的第 10 个字母是 \"o\"。\n示例 2：\n输入：S = \"ha22\", K = 5\n输出：\"h\"\n解释：\n解码后的字符串为 \"hahahaha\"。第 5 个字母是 \"h\"。\n示例 3：\n输入：S = \"a2345678999999999999999\", K = 1\n输出：\"a\"\n解释：\n解码后的字符串为 \"a\" 重复 8301530446056247680 次。第 1 个字母是 \"a\"。\n  提示：\n2 <= S.length <= 100\nS 只包含小写字母与数字 2 到 9 。\nS 以字母开头。\n1 <= K <= 10^9\n解码后的字符串保证少于 2^63 个字母。
 * <p>
 * acceptance: 23.7%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class DecodedStringAtIndex {
    public String decodeAtIndex(String S, int K) {
        return null;
    }
}