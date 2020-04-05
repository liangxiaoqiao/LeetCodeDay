package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 753
 * title: Cracking the Safe
 * href: https://leetcode.com/problems/cracking-the-safe
 * desc: There is a box protected by a password. The password is n digits, where each letter can be one of the first k digits 0, 1, ..., k-1.\nYou can keep inputting the password, the password will automatically be matched against the last n digits entered.\nFor example, assuming the password is \"345\", I can open it when I type \"012345\", but I enter a total of 6 digits.\nPlease return any string of minimum length that is guaranteed to open the box after the entire string is inputted.\nExample 1:\nInput: n = 1, k = 2\nOutput: \"01\"\nNote: \"10\" will be accepted too.\nExample 2:\nInput: n = 2, k = 2\nOutput: \"00110\"\nNote: \"01100\", \"10011\", \"11001\" will be accepted too.\nNote:\nn will be in the range [1, 4].\nk will be in the range [1, 10].\nk^n will be at most 4096.
 * <p>
 * 中文
 * 序号: 753
 * 标题： 破解保险箱
 * 链接： https://leetcode-cn.com/problems/cracking-the-safe
 * 描述： 有一个需要密码才能打开的保险箱。密码是 n 位数, 密码的每一位是 k 位序列 0, 1, ..., k-1 中的一个 。\n你可以随意输入密码，保险箱会自动记住最后 n 位输入，如果匹配，则能够打开保险箱。\n举个例子，假设密码是 \"345\"，你可以输入 \"012345\" 来打开它，只是你输入了 6 个字符.\n请返回一个能打开保险箱的最短字符串。\n  示例1:\n输入: n = 1, k = 2\n输出: \"01\"\n说明: \"10\"也可以打开保险箱。\n  示例2:\n输入: n = 2, k = 2\n输出: \"00110\"\n说明: \"01100\", \"10011\", \"11001\" 也能打开保险箱。\n  提示：\nn 的范围是 [1, 4]。\nk 的范围是 [1, 10]。\nk^n 最大可能为 4096。\n
 * <p>
 * acceptance: 49.1%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class CrackingTheSafe {
    public String crackSafe(int n, int k) {
        return null;
    }
}