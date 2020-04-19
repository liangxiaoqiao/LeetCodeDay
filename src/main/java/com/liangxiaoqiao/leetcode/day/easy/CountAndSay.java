package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 38
 * title: Count and Say
 * href: https://leetcode.com/problems/count-and-say
 * desc: The count-and-say sequence is the sequence of integers with the first five terms as following:\n1.     1\n2.     11\n3.     21\n4.     1211\n5.     111221\n1 is read off as \"one 1\" or 11.\n11 is read off as \"two 1s\" or 21.\n21 is read off as \"one 2, then one 1\" or 1211.\nGiven an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.\nNote: Each term of the sequence of integers will be represented as a string.\n  Example 1:\nInput: 1\nOutput: \"1\"\nExample 2:\nInput: 4\nOutput: \"1211\"
 * <p>
 * 中文
 * 序号: 38
 * 标题： 外观数列
 * 链接： https://leetcode-cn.com/problems/count-and-say
 * 描述： 「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。前五项如下：

1.     1
2.     11
3.     21
4.     1211
5.     111221
1 被读作  "one 1"  ("一个一") , 即 11。
11 被读作 "two 1s" ("两个一"）, 即 21。
21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。

给定一个正整数 n（1 ≤ n ≤ 30），输出外观数列的第 n 项。

注意：整数序列中的每一项将表示为一个字符串。

 

示例 1:

输入: 1
输出: "1"
解释：这是一个基本样例。
示例 2:

输入: 4
输出: "1211"
解释：当 n = 3 时，序列是 "21"，其中我们有 "2" 和 "1" 两组，"2" 可以读作 "12"，也就是出现频次 = 1 而 值 = 2；类似 "1" 可以读作 "11"。所以答案是 "12" 和 "11" 组合在一起，也就是 "1211"。

 * <p>
 * acceptance: 42.5%
 * difficulty: Easy
 * private: False
 */

public class CountAndSay {

    public String countAndSay(int n) {
        String target = "1";
        if (n == 1) {
            return target;
        }

        int start = 2;
        while (start <= n) {
            target = parseToNext(target);
            start++;
        }
        return target;
    }

    private String parseToNext(String source) {
        StringBuilder result = new StringBuilder();
        char before = ' ';
        int count = 0;
        for (int i = 0; i < source.length(); i++) {
            char temp = source.charAt(i);
            if (i == 0) {
                before = temp;
                count++;
            } else if (temp != before) {
                result.append(count).append(before);
                before = temp;
                count = 1;
            } else {
                count++;
            }
        }
        result.append(count).append(before);
        return result.toString();
    }
}