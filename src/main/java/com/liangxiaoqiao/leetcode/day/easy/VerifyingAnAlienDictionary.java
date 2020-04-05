package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 953
 * title: Verifying an Alien Dictionary
 * href: https://leetcode.com/problems/verifying-an-alien-dictionary
 * desc: In an alien language, surprisingly they also use english lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.\nGiven a sequence of words written in the alien language, and the order of the alphabet, return true if and only if the given words are sorted lexicographicaly in this alien language.\n  Example 1:\nInput: words = [\"hello\",\"leetcode\"], order = \"hlabcdefgijkmnopqrstuvwxyz\"\nOutput: true\nExplanation: As \'h\' comes before \'l\' in this language, then the sequence is sorted.\nExample 2:\nInput: words = [\"word\",\"world\",\"row\"], order = \"worldabcefghijkmnpqstuvxyz\"\nOutput: false\nExplanation: As \'d\' comes after \'l\' in this language, then words[0] > words[1], hence the sequence is unsorted.\nExample 3:\nInput: words = [\"apple\",\"app\"], order = \"abcdefghijklmnopqrstuvwxyz\"\nOutput: false\nExplanation: The first three characters \"app\" match, and the second string is shorter (in size.) According to lexicographical rules \"apple\" > \"app\", because \'l\' > \'∅\', where \'∅\' is defined as the blank character which is less than any other character (More info).\n  Note:\n1 <= words.length <= 100\n1 <= words[i].length <= 20\norder.length == 26\nAll characters in words[i] and order are english lowercase letters.
 * <p>
 * 中文
 * 序号: 953
 * 标题： 验证外星语词典
 * 链接： https://leetcode-cn.com/problems/verifying-an-alien-dictionary
 * 描述： 某种外星语也使用英文小写字母，但可能顺序 order 不同。字母表的顺序（order）是一些小写字母的排列。\n给定一组用外星语书写的单词 words，以及其字母表的顺序 order，只有当给定的单词在这种外星语中按字典序排列时，返回 true；否则，返回 false。\n  示例 1：\n输入：words = [\"hello\",\"leetcode\"], order = \"hlabcdefgijkmnopqrstuvwxyz\"\n输出：true\n解释：在该语言的字母表中，\'h\' 位于 \'l\' 之前，所以单词序列是按字典序排列的。\n示例 2：\n输入：words = [\"word\",\"world\",\"row\"], order = \"worldabcefghijkmnpqstuvxyz\"\n输出：false\n解释：在该语言的字母表中，\'d\' 位于 \'l\' 之后，那么 words[0] > words[1]，因此单词序列不是按字典序排列的。\n示例 3：\n输入：words = [\"apple\",\"app\"], order = \"abcdefghijklmnopqrstuvwxyz\"\n输出：false\n解释：当前三个字符 \"app\" 匹配时，第二个字符串相对短一些，然后根据词典编纂规则 \"apple\" > \"app\"，因为 \'l\' > \'∅\'，其中 \'∅\' 是空白字符，定义为比任何其他字符都小（更多信息）。\n  提示：\n1 <= words.length <= 100\n1 <= words[i].length <= 20\norder.length == 26\n在 words[i] 和 order 中的所有字符都是英文小写字母。
 * <p>
 * acceptance: 55.3%
 * difficulty: Easy
 * private: False
 */


//TODO init
public class VerifyingAnAlienDictionary {
    public boolean isAlienSorted(String[] words, String order) {
        return false;
    }
}