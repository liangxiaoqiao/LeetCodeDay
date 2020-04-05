package com.liangxiaoqiao.leetcode.day.hard;


import java.util.List;
    
/*
 * English
 * id: 1096
 * title: Brace Expansion II
 * href: https://leetcode.com/problems/brace-expansion-ii
 * desc: Under a grammar given below, strings can represent a set of lowercase words.  Let's use R(expr) to denote the set of words the expression represents.
 * Grammar can best be understood through simple examples:
 * Single letters represent a singleton set containing that word.
 * R("a") = {"a"}
 * R("w") = {"w"}
 * When we take a comma delimited list of 2 or more expressions, we take the union of possibilities.
 * R("{a,b,c}") = {"a","b","c"}
 * R("{{a,b},{b,c}}") = {"a","b","c"} (notice the final set only contains each word at most once)
 * When we concatenate two expressions, we take the set of possible concatenations between two words where the first word comes from the first expression and the second word comes from the second expression.
 * R("{a,b}{c,d}") = {"ac","ad","bc","bd"}
 * R("a{b,c}{d,e}f{g,h}") = {"abdfg", "abdfh", "abefg", "abefh", "acdfg", "acdfh", "acefg", "acefh"}
 * Formally, the 3 rules for our grammar:
 * For every lowercase letter x, we have R(x) = {x}
 * For expressions e_1, e_2, ... , e_k with k >= 2, we have R({e_1,e_2,...}) = R(e_1) ∪ R(e_2) ∪ ...
 * For expressions e_1 and e_2, we have R(e_1 + e_2) = {a + b for (a, b) in R(e_1) × R(e_2)}, where + denotes concatenation, and × denotes the cartesian product.
 * Given an expression representing a set of words under the given grammar, return the sorted list of words that the expression represents.
 * Example 1:
 * Input: "{a,b}{c,{d,e}}"
 * Output: ["ac","ad","ae","bc","bd","be"]
 * Example 2:
 * Input: "{{a,z},a{b,c},{ab,z}}"
 * Output: ["a","ab","ac","z"]
 * Explanation: Each distinct word is written only once in the final answer.
 * Constraints:
 * 1 <= expression.length <= 60
 * expression[i] consists of '{', '}', ','or lowercase English letters.
 * The given expression represents a set of words based on the grammar given in the description.
 * <p>
 * 中文
 * 序号: 1096
 * 标题： 花括号展开 II
 * 链接： https://leetcode-cn.com/problems/brace-expansion-ii
 * 描述： 如果你熟悉 Shell 编程，那么一定了解过花括号展开，它可以用来生成任意字符串。
 * 花括号展开的表达式可以看作一个由 花括号、逗号 和 小写英文字母 组成的字符串，定义下面几条语法规则：
 * 如果只给出单一的元素 x，那么表达式表示的字符串就只有 "x"。
 * 例如，表达式 {a} 表示字符串 "a"。
 * 而表达式 {ab} 就表示字符串 "ab"。
 * 当两个或多个表达式并列，以逗号分隔时，我们取这些表达式中元素的并集。
 * 例如，表达式 {a,b,c} 表示字符串 "a","b","c"。
 * 而表达式 {a,b},{b,c} 也可以表示字符串 "a","b","c"。
 * 要是两个或多个表达式相接，中间没有隔开时，我们从这些表达式中各取一个元素依次连接形成字符串。
 * 例如，表达式 {a,b}{c,d} 表示字符串 "ac","ad","bc","bd"。
 * 表达式之间允许嵌套，单一元素与表达式的连接也是允许的。
 * 例如，表达式 a{b,c,d} 表示字符串 "ab","ac","ad"。
 * 例如，表达式 {a{b,c}}{{d,e}f{g,h}} 可以代换为 {ab,ac}{dfg,dfh,efg,efh}，表示字符串 "abdfg", "abdfh", "abefg", "abefh", "acdfg", "acdfh", "acefg", "acefh"。
 * 给出表示基于给定语法规则的表达式 expression，返回它所表示的所有字符串组成的有序列表。
 * 假如你希望以「集合」的概念了解此题，也可以通过点击 “显示英文描述” 获取详情。
 * 示例 1：
 * 输入："{a,b}{c{d,e}}"
 * 输出：["acd","ace","bcd","bce"]
 * 示例 2：
 * 输入："{{a,z}, a{b,c}, {ab,z}}"
 * 输出：["a","ab","ac","z"]
 * 解释：输出中 不应 出现重复的组合结果。
 * 提示：
 * 1 <= expression.length <= 50
 * expression[i] 由 '{'，'}'，',' 或小写英文字母组成
 * 给出的表达式 expression 用以表示一组基于题目描述中语法构造的字符串
 * <p>
 * acceptance: 60.9%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class BraceExpansionIi {
    public List<String> braceExpansionII(String expression) {
        return null;
    }
}

