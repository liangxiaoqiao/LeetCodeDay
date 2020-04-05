package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 443
 * title: String Compression
 * href: https://leetcode.com/problems/string-compression
 * desc: Given an array of characters, compress it in-place.\nThe length after compression must always be smaller than or equal to the original array.\nEvery element of the array should be a character (not int) of length 1.\nAfter you are done modifying the input array in-place, return the new length of the array.\n  Follow up:\nCould you solve it using only O(1) extra space?\n  Example 1:\nInput:\n[\"a\",\"a\",\"b\",\"b\",\"c\",\"c\",\"c\"]\n\nOutput:\nReturn 6, and the first 6 characters of the input array should be: [\"a\",\"2\",\"b\",\"2\",\"c\",\"3\"]\n\nExplanation:\n\"aa\" is replaced by \"a2\". \"bb\" is replaced by \"b2\". \"ccc\" is replaced by \"c3\".\n  Example 2:\nInput:\n[\"a\"]\n\nOutput:\nReturn 1, and the first 1 characters of the input array should be: [\"a\"]\n\nExplanation:\nNothing is replaced.\n  Example 3:\nInput:\n[\"a\",\"b\",\"b\",\"b\",\"b\",\"b\",\"b\",\"b\",\"b\",\"b\",\"b\",\"b\",\"b\"]\n\nOutput:\nReturn 4, and the first 4 characters of the input array should be: [\"a\",\"b\",\"1\",\"2\"].\n\nExplanation:\nSince the character \"a\" does not repeat, it is not compressed. \"bbbbbbbbbbbb\" is replaced by \"b12\".\nNotice each digit has it\'s own entry in the array.\n  Note:\nAll characters have an ASCII value in [35, 126].\n1 <= len(chars) <= 1000.
 * <p>
 * 中文
 * 序号: 443
 * 标题： 压缩字符串
 * 链接： https://leetcode-cn.com/problems/string-compression
 * 描述： 给定一组字符，使用原地算法将其压缩。\n压缩后的长度必须始终小于或等于原数组长度。\n数组的每个元素应该是长度为1 的字符（不是 int 整数类型）。\n在完成原地修改输入数组后，返回数组的新长度。\n  进阶：\n你能否仅使用O(1) 空间解决问题？\n  示例 1：\n输入：\n[\"a\",\"a\",\"b\",\"b\",\"c\",\"c\",\"c\"]\n\n输出：\n返回6，输入数组的前6个字符应该是：[\"a\",\"2\",\"b\",\"2\",\"c\",\"3\"]\n\n说明：\n\"aa\"被\"a2\"替代。\"bb\"被\"b2\"替代。\"ccc\"被\"c3\"替代。\n示例 2：\n输入：\n[\"a\"]\n\n输出：\n返回1，输入数组的前1个字符应该是：[\"a\"]\n\n说明：\n没有任何字符串被替代。\n示例 3：\n输入：\n[\"a\",\"b\",\"b\",\"b\",\"b\",\"b\",\"b\",\"b\",\"b\",\"b\",\"b\",\"b\",\"b\"]\n\n输出：\n返回4，输入数组的前4个字符应该是：[\"a\",\"b\",\"1\",\"2\"]。\n\n说明：\n由于字符\"a\"不重复，所以不会被压缩。\"bbbbbbbbbbbb\"被“b12”替代。\n注意每个数字在数组中都有它自己的位置。\n注意：\n所有字符都有一个ASCII值在[35, 126]区间内。\n1 <= len(chars) <= 1000。
 * <p>
 * acceptance: 39.3%
 * difficulty: Easy
 * private: False
 */


//TODO init
public class StringCompression {
    public int compress(char[] chars) {
        return 0;
    }
}