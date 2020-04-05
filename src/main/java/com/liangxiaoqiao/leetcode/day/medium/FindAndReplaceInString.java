package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 833
 * title: Find And Replace in String
 * href: https://leetcode.com/problems/find-and-replace-in-string
 * desc: To some string S, we will perform some replacement operations that replace groups of letters with new ones (not necessarily the same size).\nEach replacement operation has 3 parameters: a starting index i, a source word x and a target word y.  The rule is that if x starts at position i in the original string S, then we will replace that occurrence of x with y.  If not, we do nothing.\nFor example, if we have S = \"abcd\" and we have some replacement operation i = 2, x = \"cd\", y = \"ffff\", then because \"cd\" starts at position 2 in the original string S, we will replace it with \"ffff\".\nUsing another example on S = \"abcd\", if we have both the replacement operation i = 0, x = \"ab\", y = \"eee\", as well as another replacement operation i = 2, x = \"ec\", y = \"ffff\", this second operation does nothing because in the original string S[2] = \'c\', which doesn\'t match x[0] = \'e\'.\nAll these operations occur simultaneously.  It\'s guaranteed that there won\'t be any overlap in replacement: for example, S = \"abc\", indexes = [0, 1], sources = [\"ab\",\"bc\"] is not a valid test case.\nExample 1:\nInput: S = \"abcd\", indexes = [0,2], sources = [\"a\",\"cd\"], targets = [\"eee\",\"ffff\"]\nOutput: \"eeebffff\"\nExplanation: \"a\" starts at index 0 in S, so it\'s replaced by \"eee\".\n\"cd\" starts at index 2 in S, so it\'s replaced by \"ffff\".\nExample 2:\nInput: S = \"abcd\", indexes = [0,2], sources = [\"ab\",\"ec\"], targets = [\"eee\",\"ffff\"]\nOutput: \"eeecd\"\nExplanation: \"ab\" starts at index 0 in S, so it\'s replaced by \"eee\". \n\"ec\" doesn\'t starts at index 2 in the original S, so we do nothing.\nNotes:\n0 <= indexes.length = sources.length = targets.length <= 100\n0 < indexes[i] < S.length <= 1000\nAll characters in given inputs are lowercase letters.\n
 * <p>
 * 中文
 * 序号: 833
 * 标题： 字符串中的查找与替换
 * 链接： https://leetcode-cn.com/problems/find-and-replace-in-string
 * 描述： 对于某些字符串 S，我们将执行一些替换操作，用新的字母组替换原有的字母组（不一定大小相同）。\n每个替换操作具有 3 个参数：起始索引 i，源字 x 和目标字 y。规则是如果 x 从原始字符串 S 中的位置 i 开始，那么我们将用 y 替换出现的 x。如果没有，我们什么都不做。\n举个例子，如果我们有 S = “abcd” 并且我们有一些替换操作 i = 2，x = “cd”，y = “ffff”，那么因为 “cd” 从原始字符串 S 中的位置 2 开始，我们将用 “ffff” 替换它。\n再来看 S = “abcd” 上的另一个例子，如果我们有替换操作 i = 0，x = “ab”，y = “eee”，以及另一个替换操作 i = 2，x = “ec”，y = “ffff”，那么第二个操作将不执行任何操作，因为原始字符串中 S[2] = \'c\'，与 x[0] = \'e\' 不匹配。\n所有这些操作同时发生。保证在替换时不会有任何重叠： S = \"abc\", indexes = [0, 1], sources = [\"ab\",\"bc\"] 不是有效的测试用例。\n  示例 1：\n输入：S = \"abcd\", indexes = [0,2], sources = [\"a\",\"cd\"], targets = [\"eee\",\"ffff\"]\n输出：\"eeebffff\"\n解释：\n\"a\" 从 S 中的索引 0 开始，所以它被替换为 \"eee\"。\n\"cd\" 从 S 中的索引 2 开始，所以它被替换为 \"ffff\"。\n示例 2：\n输入：S = \"abcd\", indexes = [0,2], sources = [\"ab\",\"ec\"], targets = [\"eee\",\"ffff\"]\n输出：\"eeecd\"\n解释：\n\"ab\" 从 S 中的索引 0 开始，所以它被替换为 \"eee\"。\n\"ec\" 没有从原始的 S 中的索引 2 开始，所以它没有被替换。\n  提示：\n0 <= indexes.length = sources.length = targets.length <= 100\n0 < indexes[i] < S.length <= 1000\n给定输入中的所有字符都是小写字母。\n
 * <p>
 * acceptance: 48.5%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class FindAndReplaceInString {
    public String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
        return null;
    }
}