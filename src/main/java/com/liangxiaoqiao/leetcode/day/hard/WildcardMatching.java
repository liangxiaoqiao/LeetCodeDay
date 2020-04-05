package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 44
 * title: Wildcard Matching
 * href: https://leetcode.com/problems/wildcard-matching
 * desc: Given an input string (s) and a pattern (p), implement wildcard pattern matching with support for \'?\' and \'*\'.\n\'?\' Matches any single character.\n\'*\' Matches any sequence of characters (including the empty sequence).\nThe matching should cover the entire input string (not partial).\nNote:\ns could be empty and contains only lowercase letters a-z.\np could be empty and contains only lowercase letters a-z, and characters like ? or *.\nExample 1:\nInput:\ns = \"aa\"\np = \"a\"\nOutput: false\nExplanation: \"a\" does not match the entire string \"aa\".\nExample 2:\nInput:\ns = \"aa\"\np = \"*\"\nOutput: true\nExplanation: \'*\' matches any sequence.\nExample 3:\nInput:\ns = \"cb\"\np = \"?a\"\nOutput: false\nExplanation: \'?\' matches \'c\', but the second letter is \'a\', which does not match \'b\'.\nExample 4:\nInput:\ns = \"adceb\"\np = \"*a*b\"\nOutput: true\nExplanation: The first \'*\' matches the empty sequence, while the second \'*\' matches the substring \"dce\".\nExample 5:\nInput:\ns = \"acdcb\"\np = \"a*c?b\"\nOutput: false
 * <p>
 * 中文
 * 序号: 44
 * 标题： 通配符匹配
 * 链接： https://leetcode-cn.com/problems/wildcard-matching
 * 描述： 给定一个字符串 (s) 和一个字符模式 (p) ，实现一个支持 \'?\' 和 \'*\' 的通配符匹配。\n\'?\' 可以匹配任何单个字符。\n\'*\' 可以匹配任意字符串（包括空字符串）。\n两个字符串完全匹配才算匹配成功。\n说明:\ns 可能为空，且只包含从 a-z 的小写字母。\np 可能为空，且只包含从 a-z 的小写字母，以及字符 ? 和 *。\n示例 1:\n输入:\ns = \"aa\"\np = \"a\"\n输出: false\n解释: \"a\" 无法匹配 \"aa\" 整个字符串。\n示例 2:\n输入:\ns = \"aa\"\np = \"*\"\n输出: true\n解释: \'*\' 可以匹配任意字符串。\n示例 3:\n输入:\ns = \"cb\"\np = \"?a\"\n输出: false\n解释: \'?\' 可以匹配 \'c\', 但第二个 \'a\' 无法匹配 \'b\'。\n示例 4:\n输入:\ns = \"adceb\"\np = \"*a*b\"\n输出: true\n解释: 第一个 \'*\' 可以匹配空字符串, 第二个 \'*\' 可以匹配字符串 \"dce\".\n示例 5:\n输入:\ns = \"acdcb\"\np = \"a*c?b\"\n输入: false
 * <p>
 * acceptance: 23.8%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class WildcardMatching {
    public boolean isMatch(String s, String p) {
        return false;
    }
}