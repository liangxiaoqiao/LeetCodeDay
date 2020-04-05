package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 150
 * title: Evaluate Reverse Polish Notation
 * href: https://leetcode.com/problems/evaluate-reverse-polish-notation
 * desc: Evaluate the value of an arithmetic expression in Reverse Polish Notation.\nValid operators are +, -, *, /. Each operand may be an integer or another expression.\nNote:\nDivision between two integers should truncate toward zero.\nThe given RPN expression is always valid. That means the expression would always evaluate to a result and there won\'t be any divide by zero operation.\nExample 1:\nInput: [\"2\", \"1\", \"+\", \"3\", \"*\"]\nOutput: 9\nExplanation: ((2 + 1) * 3) = 9\nExample 2:\nInput: [\"4\", \"13\", \"5\", \"/\", \"+\"]\nOutput: 6\nExplanation: (4 + (13 / 5)) = 6\nExample 3:\nInput: [\"10\", \"6\", \"9\", \"3\", \"+\", \"-11\", \"*\", \"/\", \"*\", \"17\", \"+\", \"5\", \"+\"]\nOutput: 22\nExplanation: \n  ((10 * (6 / ((9 + 3) * -11))) + 17) + 5\n= ((10 * (6 / (12 * -11))) + 17) + 5\n= ((10 * (6 / -132)) + 17) + 5\n= ((10 * 0) + 17) + 5\n= (0 + 17) + 5\n= 17 + 5\n= 22
 * <p>
 * 中文
 * 序号: 150
 * 标题： 逆波兰表达式求值
 * 链接： https://leetcode-cn.com/problems/evaluate-reverse-polish-notation
 * 描述： 根据逆波兰表示法，求表达式的值。\n有效的运算符包括 +, -, *, / 。每个运算对象可以是整数，也可以是另一个逆波兰表达式。\n说明：\n整数除法只保留整数部分。\n给定逆波兰表达式总是有效的。换句话说，表达式总会得出有效数值且不存在除数为 0 的情况。\n示例 1：\n输入: [\"2\", \"1\", \"+\", \"3\", \"*\"]\n输出: 9\n解释: ((2 + 1) * 3) = 9\n示例 2：\n输入: [\"4\", \"13\", \"5\", \"/\", \"+\"]\n输出: 6\n解释: (4 + (13 / 5)) = 6\n示例 3：\n输入: [\"10\", \"6\", \"9\", \"3\", \"+\", \"-11\", \"*\", \"/\", \"*\", \"17\", \"+\", \"5\", \"+\"]\n输出: 22\n解释: \n  ((10 * (6 / ((9 + 3) * -11))) + 17) + 5\n= ((10 * (6 / (12 * -11))) + 17) + 5\n= ((10 * (6 / -132)) + 17) + 5\n= ((10 * 0) + 17) + 5\n= (0 + 17) + 5\n= 17 + 5\n= 22
 * <p>
 * acceptance: 34.3%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        return 0;
    }
}