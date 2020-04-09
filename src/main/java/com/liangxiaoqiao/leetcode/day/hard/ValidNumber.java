package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 65
 * title: Valid Number
 * href: https://leetcode.com/problems/valid-number
 * desc: alidate if a given string can be interpreted as a decimal number.

Some examples:
"0" => true
" 0.1 " => true
"abc" => false
"1 a" => false
"2e10" => true
" -90e3   " => true
" 1e" => false
"e3" => false
" 6e-1" => true
" 99e2.5 " => false
"53.5e93" => true
" --6 " => false
"-+3" => false
"95a54e53" => false

Note: It is intended for the problem statement to be ambiguous. You should gather all requirements up front before implementing one. However, here is a list of characters that can be in a valid decimal number:

Numbers 0-9
Exponent - "e"
Positive/negative sign - "+"/"-"
Decimal point - "."
Of course, the context of these characters also matters in the input.
 * <p>
 * 中文
 * 序号: 65
 * 标题： 有效数字
 * 链接： https://leetcode-cn.com/problems/valid-number
 * 描述： 验证给定的字符串是否可以解释为十进制数字。

例如:
"0" => true
" 0.1 " => true
"abc" => false
"1 a" => false
"2e10" => true
" -90e3   " => true
" 1e" => false
"e3" => false
" 6e-1" => true
" 99e2.5 " => false
"53.5e93" => true
" --6 " => false
"-+3" => false
"95a54e53" => false

说明: 我们有意将问题陈述地比较模糊。在实现代码之前，你应当事先思考所有可能的情况。这里给出一份可能存在于有效十进制数字中的字符列表：

数字 0-9
指数 - "e"
正/负号 - "+"/"-"
小数点 - "."
当然，在输入中，这些字符的上下文也很重要。
 * <p>
 * acceptance: 14.6%
 * difficulty: Hard
 * private: False
 */

public class ValidNumber {

    // todo
    // 测试用例太多不可思议的  不提交了
    public boolean isNumber(String s) {
        if (s.indexOf("e") != s.lastIndexOf("e") || s.indexOf(".") != s.lastIndexOf(".")) {
            return false;
        }
        s = s.trim();
        if (s.contains("e")) {
            String[] arr = s.split("e");
            if (arr.length != 2) {
                return false;
            }
            return validFloatOrInt(arr[0]) && validInt(arr[1]);
        } else if (s.contains(".")) {
            if (s.startsWith(".")) {
                return validPositiveInt(s.substring(1));
            }
            if (s.endsWith(".")) {
                return validInt(s.substring(0, s.length() - 1));
            }
            String[] arr = s.split("\\.");
            if (arr.length != 2) {
                return false;
            }
            return validInt(arr[0]) && validPositiveInt(arr[1]);
        }

        if (s.indexOf("-") != s.lastIndexOf("-")) {
            return false;
        }

        return validDouble(s);
    }

    private boolean validPositiveDouble(String substring) {
        return !substring.contains("-") && validDouble(substring);
    }

    private boolean validInt(String s) {
        try {
            Long.parseLong(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private boolean validPositiveInt(String s) {
        return !s.contains("-") && validInt(s);
    }

    private boolean validDouble(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private boolean validFloatOrInt(String s) {
        return validDouble(s) || validInt(s);
    }

}