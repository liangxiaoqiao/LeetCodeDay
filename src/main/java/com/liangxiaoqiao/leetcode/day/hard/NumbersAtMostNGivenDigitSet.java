package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 902
 * title: Numbers At Most N Given Digit Set
 * href: https://leetcode.com/problems/numbers-at-most-n-given-digit-set
 * desc: We have a sorted set of digits D, a non-empty subset of {\'1\',\'2\',\'3\',\'4\',\'5\',\'6\',\'7\',\'8\',\'9\'}.  (Note that \'0\' is not included.)\nNow, we write numbers using these digits, using each digit as many times as we want.  For example, if D = {\'1\',\'3\',\'5\'}, we may write numbers such as \'13\', \'551\', \'1351315\'.\nReturn the number of positive integers that can be written (using the digits of D) that are less than or equal to N.\n  Example 1:\nInput: D = [\"1\",\"3\",\"5\",\"7\"], N = 100\nOutput: 20\nExplanation: \nThe 20 numbers that can be written are:\n1, 3, 5, 7, 11, 13, 15, 17, 31, 33, 35, 37, 51, 53, 55, 57, 71, 73, 75, 77.\nExample 2:\nInput: D = [\"1\",\"4\",\"9\"], N = 1000000000\nOutput: 29523\nExplanation: \nWe can write 3 one digit numbers, 9 two digit numbers, 27 three digit numbers,\n81 four digit numbers, 243 five digit numbers, 729 six digit numbers,\n2187 seven digit numbers, 6561 eight digit numbers, and 19683 nine digit numbers.\nIn total, this is 29523 integers that can be written using the digits of D.\n  Note:\nD is a subset of digits \'1\'-\'9\' in sorted order.\n1 <= N <= 10^9
 * <p>
 * 中文
 * 序号: 902
 * 标题： 最大为 N 的数字组合
 * 链接： https://leetcode-cn.com/problems/numbers-at-most-n-given-digit-set
 * 描述： 我们有一组排序的数字 D，它是  {\'1\',\'2\',\'3\',\'4\',\'5\',\'6\',\'7\',\'8\',\'9\'} 的非空子集。（请注意，\'0\' 不包括在内。）\n现在，我们用这些数字进行组合写数字，想用多少次就用多少次。例如 D = {\'1\',\'3\',\'5\'}，我们可以写出像 \'13\', \'551\', \'1351315\' 这样的数字。\n返回可以用 D 中的数字写出的小于或等于 N 的正整数的数目。\n  示例 1：\n输入：D = [\"1\",\"3\",\"5\",\"7\"], N = 100\n输出：20\n解释：\n可写出的 20 个数字是：\n1, 3, 5, 7, 11, 13, 15, 17, 31, 33, 35, 37, 51, 53, 55, 57, 71, 73, 75, 77.\n示例 2：\n输入：D = [\"1\",\"4\",\"9\"], N = 1000000000\n输出：29523\n解释：\n我们可以写 3 个一位数字，9 个两位数字，27 个三位数字，\n81 个四位数字，243 个五位数字，729 个六位数字，\n2187 个七位数字，6561 个八位数字和 19683 个九位数字。\n总共，可以使用D中的数字写出 29523 个整数。\n  提示：\nD 是按排序顺序的数字 \'1\'-\'9\' 的子集。\n1 <= N <= 10^9
 * <p>
 * acceptance: 29.9%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class NumbersAtMostNGivenDigitSet {
    public int atMostNGivenDigitSet(String[] D, int N) {
        return 0;
    }
}