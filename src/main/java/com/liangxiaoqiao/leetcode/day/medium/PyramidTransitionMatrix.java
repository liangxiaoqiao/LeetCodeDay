package com.liangxiaoqiao.leetcode.day.medium;


import java.util.List;
    

/*
 * English
 * id: 756
 * title: Pyramid Transition Matrix
 * href: https://leetcode.com/problems/pyramid-transition-matrix
 * desc: We are stacking blocks to form a pyramid. Each block has a color which is a one letter string, like `\'Z\'`.\nFor every block of color `C` we place not in the bottom row, we are placing it on top of a left block of color `A` and right block of color `B`. We are allowed to place the block there only if `(A, B, C)` is an allowed triple.\nWe start with a bottom row of bottom, represented as a single string. We also start with a list of allowed triples allowed. Each allowed triple is represented as a string of length 3.\nReturn true if we can build the pyramid all the way to the top, otherwise false.\nExample 1:\nInput: bottom = \"XYZ\", allowed = [\"XYD\", \"YZE\", \"DEA\", \"FFF\"]\nOutput: true\nExplanation:\nWe can stack the pyramid like this:\n    A\n   / \\\n  D   E\n / \\ / \\\nX   Y   Z\n\nThis works because (\'X\', \'Y\', \'D\'), (\'Y\', \'Z\', \'E\'), and (\'D\', \'E\', \'A\') are allowed triples.\nExample 2:\nInput: bottom = \"XXYX\", allowed = [\"XXX\", \"XXY\", \"XYX\", \"XYY\", \"YXZ\"]\nOutput: false\nExplanation:\nWe can\'t stack the pyramid to the top.\nNote that there could be allowed triples (A, B, C) and (A, B, D) with C != D.\nNote:\nbottom will be a string with length in range [2, 8].\nallowed will have length in range [0, 200].\nLetters in all strings will be chosen from the set {\'A\', \'B\', \'C\', \'D\', \'E\', \'F\', \'G\'}.
 * <p>
 * 中文
 * 序号: 756
 * 标题： 金字塔转换矩阵
 * 链接： https://leetcode-cn.com/problems/pyramid-transition-matrix
 * 描述： 现在，我们用一些方块来堆砌一个金字塔。 每个方块用仅包含一个字母的字符串表示，例如 “Z”。\n使用三元组表示金字塔的堆砌规则如下：\n(A, B, C) 表示，“C”为顶层方块，方块“A”、“B”分别作为方块“C”下一层的的左、右子块。当且仅当(A, B, C)是被允许的三元组，我们才可以将其堆砌上。\n初始时，给定金字塔的基层 bottom，用一个字符串表示。一个允许的三元组列表 allowed，每个三元组用一个长度为 3 的字符串表示。\n如果可以由基层一直堆到塔尖返回true，否则返回false。\n示例 1:\n输入: bottom = \"XYZ\", allowed = [\"XYD\", \"YZE\", \"DEA\", \"FFF\"]\n输出: true\n解析:\n可以堆砌成这样的金字塔:\n    A\n   / \\\n  D   E\n / \\ / \\\nX   Y   Z\n\n因为符合(\'X\', \'Y\', \'D\'), (\'Y\', \'Z\', \'E\') 和 (\'D\', \'E\', \'A\') 三种规则。\n示例 2:\n输入: bottom = \"XXYX\", allowed = [\"XXX\", \"XXY\", \"XYX\", \"XYY\", \"YXZ\"]\n输出: false\n解析:\n无法一直堆到塔尖。\n注意, 允许存在三元组(A, B, C)和 (A, B, D) ，其中 C != D.\n注意：\nbottom 的长度范围在 [2, 8]。\nallowed 的长度范围在[0, 200]。\n方块的标记字母范围为{\'A\', \'B\', \'C\', \'D\', \'E\', \'F\', \'G\'}。
 * <p>
 * acceptance: 53.2%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class PyramidTransitionMatrix {
    public boolean pyramidTransition(String bottom, List<String> allowed) {
        return false;
    }
}