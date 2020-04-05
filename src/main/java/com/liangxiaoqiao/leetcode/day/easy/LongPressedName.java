package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 925
 * title: Long Pressed Name
 * href: https://leetcode.com/problems/long-pressed-name
 * desc: Your friend is typing his name into a keyboard.  Sometimes, when typing a character c, the key might get long pressed, and the character will be typed 1 or more times.\nYou examine the typed characters of the keyboard.  Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.\n  Example 1:\nInput: name = \"alex\", typed = \"aaleex\"\nOutput: true\nExplanation: \'a\' and \'e\' in \'alex\' were long pressed.\nExample 2:\nInput: name = \"saeed\", typed = \"ssaaedd\"\nOutput: false\nExplanation: \'e\' must have been pressed twice, but it wasn\'t in the typed output.\nExample 3:\nInput: name = \"leelee\", typed = \"lleeelee\"\nOutput: true\nExample 4:\nInput: name = \"laiden\", typed = \"laiden\"\nOutput: true\nExplanation: It\'s not necessary to long press any character.\n  Note:\nname.length <= 1000\ntyped.length <= 1000\nThe characters of name and typed are lowercase letters.\n
 * <p>
 * 中文
 * 序号: 925
 * 标题： 长按键入
 * 链接： https://leetcode-cn.com/problems/long-pressed-name
 * 描述： 你的朋友正在使用键盘输入他的名字 name。偶尔，在键入字符 c 时，按键可能会被长按，而字符可能被输入 1 次或多次。\n你将会检查键盘输入的字符 typed。如果它对应的可能是你的朋友的名字（其中一些字符可能被长按），那么就返回 True。\n  示例 1：\n输入：name = \"alex\", typed = \"aaleex\"\n输出：true\n解释：\'alex\' 中的 \'a\' 和 \'e\' 被长按。\n示例 2：\n输入：name = \"saeed\", typed = \"ssaaedd\"\n输出：false\n解释：\'e\' 一定需要被键入两次，但在 typed 的输出中不是这样。\n示例 3：\n输入：name = \"leelee\", typed = \"lleeelee\"\n输出：true\n示例 4：\n输入：name = \"laiden\", typed = \"laiden\"\n输出：true\n解释：长按名字中的字符并不是必要的。\n  提示：\nname.length <= 1000\ntyped.length <= 1000\nname 和 typed 的字符都是小写字母。\n
 * <p>
 * acceptance: 44.5%
 * difficulty: Easy
 * private: False
 */


//TODO init
public class LongPressedName {
    public boolean isLongPressedName(String name, String typed) {
        return false;
    }
}