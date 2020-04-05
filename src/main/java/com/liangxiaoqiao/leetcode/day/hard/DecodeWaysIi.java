package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 639
 * title: Decode Ways II
 * href: https://leetcode.com/problems/decode-ways-ii
 * desc: A message containing letters from A-Z is being encoded to numbers using the following mapping way:\n\'A\' -> 1\n\'B\' -> 2\n...\n\'Z\' -> 26\nBeyond that, now the encoded string can also contain the character \'*\', which can be treated as one of the numbers from 1 to 9.\nGiven the encoded message containing digits and the character \'*\', return the total number of ways to decode it.\nAlso, since the answer may be very large, you should return the output mod 109 + 7.\nExample 1:\nInput: \"*\"\nOutput: 9\nExplanation: The encoded message can be decoded to the string: \"A\", \"B\", \"C\", \"D\", \"E\", \"F\", \"G\", \"H\", \"I\".\nExample 2:\nInput: \"1*\"\nOutput: 9 + 9 = 18\nNote:\nThe length of the input string will fit in range [1, 105].\nThe input string will only contain the character \'*\' and digits \'0\' - \'9\'.
 * <p>
 * 中文
 * 序号: 639
 * 标题： 解码方法 2
 * 链接： https://leetcode-cn.com/problems/decode-ways-ii
 * 描述： 一条包含字母 A-Z 的消息通过以下的方式进行了编码：\n\'A\' -> 1\n\'B\' -> 2\n...\n\'Z\' -> 26\n除了上述的条件以外，现在加密字符串可以包含字符 \'*\'了，字符\'*\'可以被当做1到9当中的任意一个数字。\n给定一条包含数字和字符\'*\'的加密信息，请确定解码方法的总数。\n同时，由于结果值可能会相当的大，所以你应当对109 + 7取模。（翻译者标注：此处取模主要是为了防止溢出）\n示例 1 :\n输入: \"*\"\n输出: 9\n解释: 加密的信息可以被解密为: \"A\", \"B\", \"C\", \"D\", \"E\", \"F\", \"G\", \"H\", \"I\".\n示例 2 :\n输入: \"1*\"\n输出: 9 + 9 = 18（翻译者标注：这里1*可以分解为1,* 或者当做1*来处理，所以结果是9+9=18）\n说明 :\n输入的字符串长度范围是 [1, 105]。\n输入的字符串只会包含字符 \'*\' 和 数字\'0\' - \'9\'。
 * <p>
 * acceptance: 25.8%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class DecodeWaysIi {
    public int numDecodings(String s) {
        return 0;
    }
}