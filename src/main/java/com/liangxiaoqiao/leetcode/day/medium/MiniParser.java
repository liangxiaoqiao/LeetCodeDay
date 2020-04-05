package com.liangxiaoqiao.leetcode.day.medium;

/*
 * English
 * id: 385
 * title: Mini Parser
 * href: https://leetcode.com/problems/mini-parser
 * desc: Given a nested list of integers represented as a string, implement a parser to deserialize it.\nEach element is either an integer, or a list -- whose elements may also be integers or other lists.\nNote: You may assume that the string is well-formed:\nString is non-empty.\nString does not contain white spaces.\nString contains only digits 0-9, [, - ,, ].\nExample 1:\nGiven s = \"324\",\n\nYou should return a NestedInteger object which contains a single integer 324.\nExample 2:\nGiven s = \"[123,[456,[789]]]\",\n\nReturn a NestedInteger object containing a nested list with 2 elements:\n\n1. An integer containing value 123.\n2. A nested list containing two elements:\n    i.  An integer containing value 456.\n    ii. A nested list with one element:\n         a. An integer containing value 789.
 * <p>
 * 中文
 * 序号: 385
 * 标题： 迷你语法分析器
 * 链接： https://leetcode-cn.com/problems/mini-parser
 * 描述： 给定一个用字符串表示的整数的嵌套列表，实现一个解析它的语法分析器。\n列表中的每个元素只可能是整数或整数嵌套列表\n提示：你可以假定这些字符串都是格式良好的：\n字符串非空\n字符串不包含空格\n字符串只包含数字0-9, [, - ,, ]\n  示例 1：\n给定 s = \"324\",\n\n你应该返回一个 NestedInteger 对象，其中只包含整数值 324。\n  示例 2：\n给定 s = \"[123,[456,[789]]]\",\n\n返回一个 NestedInteger 对象包含一个有两个元素的嵌套列表：\n\n1. 一个 integer 包含值 123\n2. 一个包含两个元素的嵌套列表：\n    i.  一个 integer 包含值 456\n    ii. 一个包含一个元素的嵌套列表\n         a. 一个 integer 包含值 789\n
 * <p>
 * acceptance: 32.8%
 * difficulty: Medium
 * private: False
 */


//TODO init

/*
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *     // Constructor initializes an empty nested list.
 *     public NestedInteger();
 *
 *     // Constructor initializes a single integer.
 *     public NestedInteger(int value);
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // Set this NestedInteger to hold a single integer.
 *     public void setInteger(int value);
 *
 *     // Set this NestedInteger to hold a nested list and adds a nested integer to it.
 *     public void add(NestedInteger ni);
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class MiniParser {
    public NestedInteger deserialize(String s) {
        return null;
    }
}

