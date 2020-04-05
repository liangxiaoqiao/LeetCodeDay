package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 990
 * title: Satisfiability of Equality Equations
 * href: https://leetcode.com/problems/satisfiability-of-equality-equations
 * desc: Given an array equations of strings that represent relationships between variables, each string equations[i] has length 4 and takes one of two different forms: \"a==b\" or \"a!=b\".  Here, a and b are lowercase letters (not necessarily different) that represent one-letter variable names.\nReturn true if and only if it is possible to assign integers to variable names so as to satisfy all the given equations.\n  Example 1:\nInput: [\"a==b\",\"b!=a\"]\nOutput: false\nExplanation: If we assign say, a = 1 and b = 1, then the first equation is satisfied, but not the second.  There is no way to assign the variables to satisfy both equations.\nExample 2:\nInput: [\"b==a\",\"a==b\"]\nOutput: true\nExplanation: We could assign a = 1 and b = 1 to satisfy both equations.\nExample 3:\nInput: [\"a==b\",\"b==c\",\"a==c\"]\nOutput: true\nExample 4:\nInput: [\"a==b\",\"b!=c\",\"c==a\"]\nOutput: false\nExample 5:\nInput: [\"c==c\",\"b==d\",\"x!=z\"]\nOutput: true\n  Note:\n1 <= equations.length <= 500\nequations[i].length == 4\nequations[i][0] and equations[i][3] are lowercase letters\nequations[i][1] is either \'=\' or \'!\'\nequations[i][2] is \'=\'
 * <p>
 * 中文
 * 序号: 990
 * 标题： 等式方程的可满足性
 * 链接： https://leetcode-cn.com/problems/satisfiability-of-equality-equations
 * 描述： None
 * <p>
 * acceptance: 42.0%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class SatisfiabilityOfEqualityEquations {
    public boolean equationsPossible(String[] equations) {
        return false;
    }
}