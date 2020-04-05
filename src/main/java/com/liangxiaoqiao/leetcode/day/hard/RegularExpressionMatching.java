package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 10
 * title: Regular Expression Matching
 * href: https://leetcode.com/problems/regular-expression-matching
 * desc: Given an input string (s) and a pattern (p), implement regular expression matching with support for \'.\' and \'*\'.\n\'.\' Matches any single character.\n\'*\' Matches zero or more of the preceding element.\nThe matching should cover the entire input string (not partial).\nNote:\ns could be empty and contains only lowercase letters a-z.\np could be empty and contains only lowercase letters a-z, and characters like . or *.\nExample 1:\nInput:\ns = \"aa\"\np = \"a\"\nOutput: false\nExplanation: \"a\" does not match the entire string \"aa\".\nExample 2:\nInput:\ns = \"aa\"\np = \"a*\"\nOutput: true\nExplanation: \'*\' means zero or more of the precedeng element, \'a\'. Therefore, by repeating \'a\' once, it becomes \"aa\".\nExample 3:\nInput:\ns = \"ab\"\np = \".*\"\nOutput: true\nExplanation: \".*\" means \"zero or more (*) of any character (.)\".\nExample 4:\nInput:\ns = \"aab\"\np = \"c*a*b\"\nOutput: true\nExplanation: c can be repeated 0 times, a can be repeated 1 time. Therefore it matches \"aab\".\nExample 5:\nInput:\ns = \"mississippi\"\np = \"mis*is*p*.\"\nOutput: false
 * <p>
 * 中文
 * 序号: 10
 * 标题： 正则表达式匹配
 * 链接： https://leetcode-cn.com/problems/regular-expression-matching
 * 描述： 给定一个字符串 (s) 和一个字符模式 (p)。实现支持 \'.\' 和 \'*\' 的正则表达式匹配。\n\'.\' 匹配任意单个字符。\n\'*\' 匹配零个或多个前面的元素。\n匹配应该覆盖整个字符串 (s) ，而不是部分字符串。\n说明:\ns 可能为空，且只包含从 a-z 的小写字母。\np 可能为空，且只包含从 a-z 的小写字母，以及字符 . 和 *。\n示例 1:\n输入:\ns = \"aa\"\np = \"a\"\n输出: false\n解释: \"a\" 无法匹配 \"aa\" 整个字符串。\n示例 2:\n输入:\ns = \"aa\"\np = \"a*\"\n输出: true\n解释: \'*\' 代表可匹配零个或多个前面的元素, 即可以匹配 \'a\' 。因此, 重复 \'a\' 一次, 字符串可变为 \"aa\"。\n示例 3:\n输入:\ns = \"ab\"\np = \".*\"\n输出: true\n解释: \".*\" 表示可匹配零个或多个(\'*\')任意字符(\'.\')。\n示例 4:\n输入:\ns = \"aab\"\np = \"c*a*b\"\n输出: true\n解释: \'c\' 可以不被重复, \'a\' 可以被重复一次。因此可以匹配字符串 \"aab\"。\n示例 5:\n输入:\ns = \"mississippi\"\np = \"mis*is*p*.\"\n输出: false
 * <p>
 * acceptance: 26.0%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class RegularExpressionMatching {
    public boolean isMatch(String s, String p) {
        return false;
    }
}