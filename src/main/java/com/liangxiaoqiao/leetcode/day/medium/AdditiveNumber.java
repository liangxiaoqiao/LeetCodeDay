package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 306
 * title: Additive Number
 * href: https://leetcode.com/problems/additive-number
 * desc: Additive number is a string whose digits can form additive sequence.

A valid additive sequence should contain at least three numbers. Except for the first two numbers, each subsequent number in the sequence must be the sum of the preceding two.

Given a string containing only digits '0'-'9', write a function to determine if it's an additive number.

Note: Numbers in the additive sequence cannot have leading zeros, so sequence 1, 2, 03 or 1, 02, 3 is invalid.



Example 1:

Input: "112358"
Output: true
Explanation: The digits can form an additive sequence: 1, 1, 2, 3, 5, 8.
             1 + 1 = 2, 1 + 2 = 3, 2 + 3 = 5, 3 + 5 = 8
Example 2:

Input: "199100199"
Output: true
Explanation: The additive sequence is: 1, 99, 100, 199.
             1 + 99 = 100, 99 + 100 = 199


Constraints:

num consists only of digits '0'-'9'.
1 <= num.length <= 35
 * <p>
 * 中文
 * 序号: 306
 * 标题： 累加数
 * 链接： https://leetcode-cn.com/problems/additive-number
 * 描述： 累加数是一个字符串，组成它的数字可以形成累加序列。

一个有效的累加序列必须至少包含 3 个数。除了最开始的两个数以外，字符串中的其他数都等于它之前两个数相加的和。

给定一个只包含数字 '0'-'9' 的字符串，编写一个算法来判断给定输入是否是累加数。

说明: 累加序列里的数不会以 0 开头，所以不会出现 1, 2, 03 或者 1, 02, 3 的情况。

示例 1:

输入: "112358"
输出: true
解释: 累加序列为: 1, 1, 2, 3, 5, 8 。1 + 1 = 2, 1 + 2 = 3, 2 + 3 = 5, 3 + 5 = 8
示例 2:

输入: "199100199"
输出: true
解释: 累加序列为: 1, 99, 100, 199。1 + 99 = 100, 99 + 100 = 199
 * <p>
 * acceptance: 28.9%
 * difficulty: Medium
 * private: False
 */


public class AdditiveNumber {

    public boolean isAdditiveNumber(String num) {
        int length = num.length();
        if (length < 3) {
            return false;
        }

        for (int firstNumLen = 1; firstNumLen <= length - 2; firstNumLen++) {
            if (num.charAt(0) == '0' && firstNumLen > 1) {
                break;
            }
            long first = Long.parseLong(num.substring(0, firstNumLen));
            for (int secondNumLen = 1; secondNumLen <= length - firstNumLen - 1; secondNumLen++) {
                if (num.charAt(firstNumLen) == '0' && secondNumLen > 1) {
                    break;
                }
                long second = Long.parseLong(num.substring(firstNumLen, firstNumLen + secondNumLen));
                boolean valid = validate(first, second, num, firstNumLen + secondNumLen);
                if (valid) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean validate(long first, long second, String num, int thirdStartIndex) {
        if (thirdStartIndex >= num.length()) {
            return true;
        }
        long third = first + second;
        if (num.indexOf(String.valueOf(third), thirdStartIndex) != thirdStartIndex) {
            return false;
        }
        return validate(second, third, num, thirdStartIndex + String.valueOf(third).length());
    }
}