package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 91
 * title: Decode Ways
 * href: https://leetcode.com/problems/decode-ways
 * desc: A message containing letters from A-Z is being encoded to numbers using the following mapping:\n\'A\' -> 1\n\'B\' -> 2\n...\n\'Z\' -> 26\nGiven a non-empty string containing only digits, determine the total number of ways to decode it.\nExample 1:\nInput: \"12\"\nOutput: 2\nExplanation: It could be decoded as \"AB\" (1 2) or \"L\" (12).\nExample 2:\nInput: \"226\"\nOutput: 3\nExplanation: It could be decoded as \"BZ\" (2 26), \"VF\" (22 6), or \"BBF\" (2 2 6).
 * <p>
 * 中文
 * 序号: 91
 * 标题： 解码方法
 * 链接： https://leetcode-cn.com/problems/decode-ways
 * 描述： 一条包含字母 A-Z 的消息通过以下方式进行了编码：

'A' -> 1
'B' -> 2
...
'Z' -> 26
给定一个只包含数字的非空字符串，请计算解码方法的总数。

示例 1:

输入: "12"
输出: 2
解释: 它可以解码为 "AB"（1 2）或者 "L"（12）。
示例 2:

输入: "226"
输出: 3
解释: 它可以解码为 "BZ" (2 26), "VF" (22 6), 或者 "BBF" (2 2 6) 。

 * <p>
 * acceptance: 23.4%
 * difficulty: Medium
 * private: False
 */


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DecodeWays {

    private Map<Integer, Integer> map = new HashMap<>();

    public int numDecodings(String s) {
        if (s.startsWith("0") || s.contains("00")) {
            return 0;
        }
        if (s.length() <= 1) {
            return 1;
        }

        List<String> results = new LinkedList<>();

        int start = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                if (s.charAt(i - 1) > '2') {
                    return 0;
                }
                results.add(s.substring(start, i - 1));
                i++;
                start = i;
            } else {
                if (s.charAt(i - 1) > '2' || ((s.charAt(i - 1) == '2' && s.charAt(i) > '6'))) {
                    results.add(s.substring(start, i));
                    start = i;
                }
            }
        }
        if (start < s.length()) {
            results.add(s.substring(start));
        }

        int total = 1;
        for (String result : results) {
            int tempLeng = calc(calcLength(result));
            if (tempLeng == 0) {
                return 0;
            }
            total *= tempLeng;
        }
        return total;
    }

    private int calcLength(String str) {
        int length = str.length();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                length--;
            }
        }
        return length < 1 ? 1 : length;
    }

    private int calc(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }

        if (i == 2) {
            return 2;
        }

        if (map.containsKey(i)) {
            return map.get(i);
        } else {
            int result = calc(i - 2) + calc(i - 1);
            map.put(i, result);
            return result;
        }
    }
}