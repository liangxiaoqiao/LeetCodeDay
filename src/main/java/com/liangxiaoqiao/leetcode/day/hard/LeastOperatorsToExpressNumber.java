package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 964
 * title: Least Operators to Express Number
 * href: https://leetcode.com/problems/least-operators-to-express-number
 * desc: Given a single positive integer x, we will write an expression of the form x (op1) x (op2) x (op3) x ... where each operator op1, op2, etc. is either addition, subtraction, multiplication, or division (+, -, *, or /).  For example, with x = 3, we might write 3 * 3 / 3 + 3 - 3 which is a value of 3.\nWhen writing such an expression, we adhere to the following conventions:\nThe division operator (/) returns rational numbers.\nThere are no parentheses placed anywhere.\nWe use the usual order of operations: multiplication and division happens before addition and subtraction.\nIt\'s not allowed to use the unary negation operator (-).  For example, \"x - x\" is a valid expression as it only uses subtraction, but \"-x + x\" is not because it uses negation.\nWe would like to write an expression with the least number of operators such that the expression equals the given target.  Return the least number of operators used.\n  Example 1:\nInput: x = 3, target = 19\nOutput: 5\nExplanation: 3 * 3 + 3 * 3 + 3 / 3.  The expression contains 5 operations.\nExample 2:\nInput: x = 5, target = 501\nOutput: 8\nExplanation: 5 * 5 * 5 * 5 - 5 * 5 * 5 + 5 / 5.  The expression contains 8 operations.\nExample 3:\nInput: x = 100, target = 100000000\nOutput: 3\nExplanation: 100 * 100 * 100 * 100.  The expression contains 3 operations.\n  Note:\n2 <= x <= 100\n1 <= target <= 2 * 10^8\n
 * <p>
 * 中文
 * 序号: 964
 * 标题： 表示数字的最少运算符
 * 链接： https://leetcode-cn.com/problems/least-operators-to-express-number
 * 描述： 给定一个正整数 x，我们将会写出一个形如 x (op1) x (op2) x (op3) x ... 的表达式，其中每个运算符 op1，op2，… 可以是加、减、乘、除（+，-，*，或是 /）之一。例如，对于 x = 3，我们可以写出表达式 3 * 3 / 3 + 3 - 3，该式的值为 3 。\n在写这样的表达式时，我们需要遵守下面的惯例：\n除运算符（/）返回有理数。\n任何地方都没有括号。\n我们使用通常的操作顺序：乘法和除法发生在加法和减法之前。\n不允许使用一元否定运算符（-）。例如，“x - x” 是一个有效的表达式，因为它只使用减法，但是 “-x + x” 不是，因为它使用了否定运算符。 \n我们希望编写一个能使表达式等于给定的目标值 target 且运算符最少的表达式。返回所用运算符的最少数量。\n  示例 1：\n输入：x = 3, target = 19\n输出：5\n解释：3 * 3 + 3 * 3 + 3 / 3 。表达式包含 5 个运算符。\n示例 2：\n输入：x = 5, target = 501\n输出：8\n解释：5 * 5 * 5 * 5 - 5 * 5 * 5 + 5 / 5 。表达式包含 8 个运算符。\n示例 3：\n输入：x = 100, target = 100000000\n输出：3\n解释：100 * 100 * 100 * 100 。表达式包含 3 个运算符。\n  提示：\n2 <= x <= 100\n1 <= target <= 2 * 10^8\n
 * <p>
 * acceptance: 43.2%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class LeastOperatorsToExpressNumber {
    public int leastOpsExpressTarget(int x, int target) {
        return 0;
    }
}