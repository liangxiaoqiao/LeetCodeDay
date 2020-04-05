package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 844
 * title: Backspace String Compare
 * href: https://leetcode.com/problems/backspace-string-compare
 * desc: Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.\nExample 1:\nInput: S = \"ab#c\", T = \"ad#c\"\nOutput: true\nExplanation: Both S and T become \"ac\".\nExample 2:\nInput: S = \"ab##\", T = \"c#d#\"\nOutput: true\nExplanation: Both S and T become \"\".\nExample 3:\nInput: S = \"a##c\", T = \"#a#c\"\nOutput: true\nExplanation: Both S and T become \"c\".\nExample 4:\nInput: S = \"a#c\", T = \"b\"\nOutput: false\nExplanation: S becomes \"c\" while T becomes \"b\".\nNote:\n1 <= S.length <= 200\n1 <= T.length <= 200\nS and T only contain lowercase letters and \'#\' characters.\nFollow up:\nCan you solve it in O(N) time and O(1) space?
 * <p>
 * 中文
 * 序号: 844
 * 标题： 比较含退格的字符串
 * 链接： https://leetcode-cn.com/problems/backspace-string-compare
 * 描述： 给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，判断二者是否相等，并返回结果。 # 代表退格字符。\n  示例 1：\n输入：S = \"ab#c\", T = \"ad#c\"\n输出：true\n解释：S 和 T 都会变成 “ac”。\n示例 2：\n输入：S = \"ab##\", T = \"c#d#\"\n输出：true\n解释：S 和 T 都会变成 “”。\n示例 3：\n输入：S = \"a##c\", T = \"#a#c\"\n输出：true\n解释：S 和 T 都会变成 “c”。\n示例 4：\n输入：S = \"a#c\", T = \"b\"\n输出：false\n解释：S 会变成 “c”，但 T 仍然是 “b”。\n  提示：\n1 <= S.length <= 200\n1 <= T.length <= 200\nS 和 T 只含有小写字母以及字符 \'#\'。\n
 * <p>
 * acceptance: 47.0%
 * difficulty: Easy
 * private: False
 */


//TODO init
public class BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        return false;
    }
}