package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 504
 * title: Base 7
 * href: https://leetcode.com/problems/base-7
 * desc: Given an integer, return its base 7 string representation.\nExample 1:\nInput: 100\nOutput: \"202\"\nExample 2:\nInput: -7\nOutput: \"-10\"\nNote: The input will be in range of [-1e7, 1e7].
 * <p>
 * 中文
 * 序号: 504
 * 标题： 七进制数
 * 链接： https://leetcode-cn.com/problems/base-7
 * 描述： 给定一个整数，将其转化为7进制，并以字符串形式输出。

示例 1:

输入: 100
输出: "202"
示例 2:

输入: -7
输出: "-10"
注意: 输入范围是 [-1e7, 1e7] 。

 * <p>
 * acceptance: 45.5%
 * difficulty: Easy
 * private: False
 */


public class Base7 {
    public String convertToBase7(int num) {
        StringBuilder result = new StringBuilder();
        boolean negative = false;
        if (num < 0) {
            num = -num;
            negative = true;
        }
        if (num == 0) {
            return "0";
        }
        while (num >= 7) {
            result.insert(0, num % 7);
            num = num / 7;
        }
        result.insert(0, num);

        return negative ? ("-" + result.toString()) : result.toString();
    }
}