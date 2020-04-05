package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 717
 * title: 1-bit and 2-bit Characters
 * href: https://leetcode.com/problems/1-bit-and-2-bit-characters
 * desc: We have two special characters. The first character can be represented by one bit 0. The second character can be represented by two bits (10 or 11).\nNow given a string represented by several bits. Return whether the last character must be a one-bit character or not. The given string will always end with a zero.\nExample 1:\nInput: \nbits = [1, 0, 0]\nOutput: True\nExplanation: \nThe only way to decode it is two-bit character and one-bit character. So the last character is one-bit character.\nExample 2:\nInput: \nbits = [1, 1, 1, 0]\nOutput: False\nExplanation: \nThe only way to decode it is two-bit character and two-bit character. So the last character is NOT one-bit character.\nNote:\n1 <= len(bits) <= 1000.\nbits[i] is always 0 or 1.
 * <p>
 * 中文
 * 序号: 717
 * 标题： 1比特与2比特字符
 * 链接： https://leetcode-cn.com/problems/1-bit-and-2-bit-characters
 * 描述： 有两种特殊字符。第一种字符可以用一比特0来表示。第二种字符可以用两比特(10 或 11)来表示。\n现给一个由若干比特组成的字符串。问最后一个字符是否必定为一个一比特字符。给定的字符串总是由0结束。\n示例 1:\n输入: \nbits = [1, 0, 0]\n输出: True\n解释: \n唯一的编码方式是一个两比特字符和一个一比特字符。所以最后一个字符是一比特字符。\n示例 2:\n输入: \nbits = [1, 1, 1, 0]\n输出: False\n解释: \n唯一的编码方式是两比特字符和两比特字符。所以最后一个字符不是一比特字符。\n注意:\n1 <= len(bits) <= 1000.\nbits[i] 总是0 或 1.
 * <p>
 * acceptance: 49.1%
 * difficulty: Easy
 * private: False
 */


//TODO init
public class BitAnd2BitCharacters {
    public boolean isOneBitCharacter(int[] bits) {
        return false;
    }
}