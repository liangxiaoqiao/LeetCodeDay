package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 859
 * title: Buddy Strings
 * href: https://leetcode.com/problems/buddy-strings
 * desc: Given two strings A and B of lowercase letters, return true if and only if we can swap two letters in A so that the result equals B.\n  Example 1:\nInput: A = \"ab\", B = \"ba\"\nOutput: true\nExample 2:\nInput: A = \"ab\", B = \"ab\"\nOutput: false\nExample 3:\nInput: A = \"aa\", B = \"aa\"\nOutput: true\nExample 4:\nInput: A = \"aaaaaaabc\", B = \"aaaaaaacb\"\nOutput: true\nExample 5:\nInput: A = \"\", B = \"aa\"\nOutput: false\n  Note:\n0 <= A.length <= 20000\n0 <= B.length <= 20000\nA and B consist only of lowercase letters.
 * <p>
 * 中文
 * 序号: 859
 * 标题： 亲密字符串
 * 链接： https://leetcode-cn.com/problems/buddy-strings
 * 描述： 给定两个由小写字母构成的字符串 A 和 B ，只要我们可以通过交换 A 中的两个字母得到与 B 相等的结果，就返回 true ；否则返回 false 。

 

示例 1：

输入： A = "ab", B = "ba"
输出： true
示例 2：

输入： A = "ab", B = "ab"
输出： false
示例 3:

输入： A = "aa", B = "aa"
输出： true
示例 4：

输入： A = "aaaaaaabc", B = "aaaaaaacb"
输出： true
示例 5：

输入： A = "", B = "aa"
输出： false
 

提示：

0 <= A.length <= 20000
0 <= B.length <= 20000
A 和 B 仅由小写字母构成。

 * <p>
 * acceptance: 27.8%
 * difficulty: Easy
 * private: False
 */

import java.util.HashSet;
import java.util.Set;

public class BuddyStrings {

    public boolean buddyStrings(String A, String B) {
        if (A.length() < 2 || B.length() < 2 || A.length() != B.length()) {
            return false;
        }
        Set<Character> unique = new HashSet<>();
        int count = 0;
        int[] diffIndex = new int[3];
        for (int i = 0; i < A.length() && count <= 2; i++) {
            unique.add(A.charAt(i));
            if (A.charAt(i) != B.charAt(i)) {
                diffIndex[count] = i;
                count++;
            }
        }

        if (count == 0) {
            return unique.size() != A.length();
        }

        if (count == 2) {
            return A.charAt(diffIndex[0]) == B.charAt(diffIndex[1]) && A.charAt(diffIndex[1]) == B.charAt(diffIndex[0]);
        }

        return false;
    }
}