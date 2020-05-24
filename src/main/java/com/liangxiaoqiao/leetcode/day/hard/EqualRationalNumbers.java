package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 972
 * title: Equal Rational Numbers
 * href: https://leetcode.com/problems/equal-rational-numbers
 * desc: Given two strings S and T, each of which represents a non-negative rational number, return True if and only if they represent the same number. The strings may use parentheses to denote the repeating part of the rational number.
 * In general a rational number can be represented using up to three parts: an integer part, a non-repeating part, and a repeating part. The number will be represented in one of the following three ways:
 * <IntegerPart> (e.g. 0, 12, 123)
 * <IntegerPart><.><NonRepeatingPart>  (e.g. 0.5, 1., 2.12, 2.0001)
 * <IntegerPart><.><NonRepeatingPart><(><RepeatingPart><)> (e.g. 0.1(6), 0.9(9), 0.00(1212))
 * The repeating portion of a decimal expansion is conventionally denoted within a pair of round brackets.  For example:
 * 1 / 6 = 0.16666666... = 0.1(6) = 0.1666(6) = 0.166(66)
 * Both 0.1(6) or 0.1666(6) or 0.166(66) are correct representations of 1 / 6.
 * Example 1:
 * Input: S = "0.(52)", T = "0.5(25)"
 * Output: true
 * Explanation:
 * Because "0.(52)" represents 0.52525252..., and "0.5(25)" represents 0.52525252525..... , the strings represent the same number.
 * Example 2:
 * Input: S = "0.1666(6)", T = "0.166(66)"
 * Output: true
 * Example 3:
 * Input: S = "0.9(9)", T = "1."
 * Output: true
 * Explanation:
 * "0.9(9)" represents 0.999999999... repeated forever, which equals 1.  [See this link for an explanation.]
 * "1." represents the number 1, which is formed correctly: (IntegerPart) = "1" and (NonRepeatingPart) = "".
 * Note:
 * Each part consists only of digits.
 * The <IntegerPart> will not begin with 2 or more zeros.  (There is no other restriction on the digits of each part.)
 * 1 <= <IntegerPart>.length <= 4
 * 0 <= <NonRepeatingPart>.length <= 4
 * 1 <= <RepeatingPart>.length <= 4
 * <p>
 * 中文
 * 序号: 972
 * 标题： 相等的有理数
 * 链接： https://leetcode-cn.com/problems/equal-rational-numbers
 * 描述： 给定两个字符串 S 和 T，每个字符串代表一个非负有理数，只有当它们表示相同的数字时才返回 true；否则，返回 false。字符串中可以使用括号来表示有理数的重复部分。
 * 通常，有理数最多可以用三个部分来表示：整数部分 <IntegerPart>、小数非重复部分 <NonRepeatingPart> 和小数重复部分 <(><RepeatingPart><)>。数字可以用以下三种方法之一来表示：
 * <IntegerPart>（例：0，12，123）
 * <IntegerPart><.><NonRepeatingPart> （例：0.5，2.12，2.0001）
 * <IntegerPart><.><NonRepeatingPart><(><RepeatingPart><)>（例：0.1(6)，0.9(9)，0.00(1212)）
 * 十进制展开的重复部分通常在一对圆括号内表示。例如：
 * 1 / 6 = 0.16666666... = 0.1(6) = 0.1666(6) = 0.166(66)
 * 0.1(6) 或 0.1666(6) 或 0.166(66) 都是 1 / 6 的正确表示形式。
 * 示例 1：
 * 输入：S = "0.(52)", T = "0.5(25)"
 * 输出：true
 * 解释：因为 "0.(52)" 代表 0.52525252...，而 "0.5(25)" 代表 0.52525252525.....，则这两个字符串表示相同的数字。
 * 示例 2：
 * 输入：S = "0.1666(6)", T = "0.166(66)"
 * 输出：true
 * 示例 3：
 * 输入：S = "0.9(9)", T = "1."
 * 输出：true
 * 解释：
 * "0.9(9)" 代表 0.999999999... 永远重复，等于 1 。[有关说明，请参阅此链接]
 * "1." 表示数字 1，其格式正确：(IntegerPart) = "1" 且 (NonRepeatingPart) = "" 。
 * 提示：
 * 每个部分仅由数字组成。
 * 整数部分 <IntegerPart> 不会以 2 个或更多的零开头。（对每个部分的数字没有其他限制）。
 * 1 <= <IntegerPart>.length <= 4
 * 0 <= <NonRepeatingPart>.length <= 4
 * 1 <= <RepeatingPart>.length <= 4
 * <p>
 * acceptance: 41.4%
 * difficulty: Hard
 * private: False
 */

public class EqualRationalNumbers {
    public boolean isRationalEqual(String S, String T) {
        ParseNumber p1 = new ParseNumber(S);
        ParseNumber p2 = new ParseNumber(T);
        return isSame(p1, p2);
    }

    private boolean isSame(ParseNumber number1, ParseNumber number2) {
        if (number1.getLength() == number2.getLength()) {
            return is1Compare1(number1, number2) || is1Compare1(number2, number1)
                    || is12Compare2(number1, number2) || is12Compare2(number2, number1)
                    || is3Compare3(number1, number2) || is3Compare3(number2, number1);
        } else {
            return is1Compare12or13or123(number1, number2) || is1Compare12or13or123(number2, number1)
                    || is2Compare3(number1, number2) || is2Compare3(number2, number1);
        }
    }

    private boolean is1Compare1(ParseNumber p1, ParseNumber p2) {
        return p1.getN1() == p2.getN1();
    }

    private boolean is12Compare2(ParseNumber number1, ParseNumber number2) {
        if (!number1.isN12()) {
            return false;
        }

        if (!number2.isN12() && !number2.isN13()) {
            return false;
        }

        if (number2.isN12()) {
            if (number1.getN1() != number2.getN1()) {
                return false;
            }
            if (number1.getN2().length() >= number2.getN2().length()) {
                String result = number1.getN2().replace(number2.getN2(), "").replace("0", "");
                return "".equals(result) && number1.getN2().indexOf(number2.getN2()) == 0;
            } else {
                String result = number2.getN2().replace(number1.getN2(), "").replace("0", "");
                return "".equals(result) && number2.getN2().indexOf(number1.getN2()) == 0;
            }

        } else if (number2.isN13()) {   // 1 3 位
            if (number1.getN1() == number2.getN1()) {
                return isAll(number1.getN2(), "0") && isAll(number2.getN3(), "0");
            } else {
                if (number1.getN1() > number2.getN1()) {
                    return number1.getN1() - number2.getN1() == 1 && isAll(number1.getN2(), "0") && isAll(number2.getN3(), "9");
                }
            }
        }
        return false;
    }

    private boolean is3Compare3(ParseNumber number1, ParseNumber number2) {
        if (number1.getN1() == number2.getN1()) {
            if (number1.getN2().equals(number2.getN2())) {
                if (number1.getN3().equals(number2.getN3())) {
                    return true;
                } else {
                    return isAll(number1.getN3(), number2.getN3()) || isAll(number2.getN3(), number1.getN3());
                }
            } else {
                if (number1.getN3().equals(number2.getN3())) {
                    return isAll((number1.getN2() + number1.getN3()), number2.getN2())
                            || isAll((number2.getN2() + number2.getN3()), number1.getN2());
                } else {

                }
            }

        } else {
            if (number1.getN1() > number2.getN1()) {
                return number1.getN1() - number2.getN1() == 1
                        && isAll(number1.getN2(), "0") && isAll(number1.getN3(), "0")
                        && isAll(number2.getN2(), "9") && isAll(number2.getN3(), "9");
            } else {
                return number2.getN1() - number1.getN1() == 1
                        && isAll(number2.getN2(), "0") && isAll(number2.getN3(), "0")
                        && isAll(number1.getN2(), "9") && isAll(number1.getN3(), "9");
            }
        }
        return false;
    }


    private boolean is1Compare12or13or123(ParseNumber number1, ParseNumber number2) {
        if (!number1.isN1()) {
            return false;
        }

        if (number2.isN1()) {
            return false;
        }

        if (number2.isN12()) {
            return number1.getN1() == number2.getN1() && isAll(number2.getN2(), "0");
        }

        if ((number2.isN13() || number2.isN123())) {
            return (number1.getN1() == number2.getN1()
                    && isAll(number2.getN3(), "0")
                    && (isAll(number2.getN2(), "0") || isAll(number2.getN2(), "")))

                    || (number1.getN1() - number2.getN1() == 1
                    && isAll(number2.getN3(), "9")
                    && (isAll(number2.getN2(), "9") || isAll(number2.getN2(), "")));
        }
        return false;
    }

    private boolean is2Compare3(ParseNumber number1, ParseNumber number2) {
        if (!number2.isN123()) {
            return false;
        }
        if (number1.isN12()) {
            boolean f1 = number1.n1 == number2.n1 && number1.n2.equals(number2.n2) && isAll(number2.n2, "0");
            boolean f2 = number1.n1 == number2.n1 && isAll(number1.n2, "0") && isAll(number2.n2, "0") && isAll(number1.n3, "0");
            boolean f3 = number1.n1 - number2.n1 == 1 && isAll(number1.n2, "0") && isAll(number2.n2, "9") && isAll(number1.n3, "9");
            return f1 || f2 || f3;
        } else if (number1.isN13()) {
            boolean f1 = number1.n1 == number2.n1 && isAll(number1.n3, number2.n2) && (isAll(number1.n3, number2.n3) || isAll(number2.n3, number1.n3));
            boolean f2 = number1.n1 - number2.n1 == 1 && isAll(number1.n3, "0") && isAll(number2.n2, "9") && isAll(number2.n3, "9");
            boolean f3 = number2.n1 - number1.n1 == 1 && isAll(number1.n3, "9") && isAll(number2.n2, "0") && isAll(number2.n3, "0");
            return f1 || f2 || f3;
        }
        return false;
    }


    private boolean isAll(String str, String s) {
        return "".equals(str.replace(s, ""));
    }

    class ParseNumber {
        private int n1;
        private String n2 = "";
        private String n3 = "";

        public int getLength() {
            int count2 = "".equals(n2) ? 0 : 1;
            int count3 = "".equals(n3) ? 0 : 1;
            return 1 + count2 + count3;
        }

        public boolean isN1() {
            return "".equals(n2) && "".equals(n3);
        }

        public boolean isN12() {
            return !"".equals(n2) && "".equals(n3);
        }

        public boolean isN13() {
            return !"".equals(n3) && "".equals(n2);
        }

        public boolean isN123() {
            return !"".equals(n3) && !"".equals(n2);
        }

        public int getN1() {
            return n1;
        }

        public void setN1(int n1) {
            this.n1 = n1;
        }

        public String getN2() {
            return n2;
        }

        public void setN2(String n2) {
            this.n2 = n2;
        }

        public String getN3() {
            return n3;
        }

        public void setN3(String n3) {
            this.n3 = n3;
        }

        public ParseNumber(String str) {
            if (str.contains("\\.")) {
                String s1 = str.substring(0, str.indexOf("\\."));
                this.n1 = Integer.parseInt(s1);
                if (str.contains("(")) {
                    this.n2 = str.substring(str.indexOf("\\.") + 1, str.indexOf("("));
                    this.n3 = str.substring(str.indexOf("(") + 1);
                } else {
                    this.n2 = str.substring(str.indexOf("\\.") + 1);
                }
            } else {
                this.n1 = Integer.parseInt(str);
            }

        }
    }
}