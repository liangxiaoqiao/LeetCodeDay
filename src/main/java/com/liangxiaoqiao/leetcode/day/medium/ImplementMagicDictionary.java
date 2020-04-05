package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 676
 * title: Implement Magic Dictionary
 * href: https://leetcode.com/problems/implement-magic-dictionary
 * desc: Implement a magic directory with buildDict, and search methods.\nFor the method buildDict, you\'ll be given a list of non-repetitive words to build a dictionary.\nFor the method search, you\'ll be given a word, and judge whether if you modify exactly one character into another character in this word, the modified word is in the dictionary you just built.\nExample 1:\nInput: buildDict([\"hello\", \"leetcode\"]), Output: Null\nInput: search(\"hello\"), Output: False\nInput: search(\"hhllo\"), Output: True\nInput: search(\"hell\"), Output: False\nInput: search(\"leetcoded\"), Output: False\nNote:\nYou may assume that all the inputs are consist of lowercase letters a-z.\nFor contest purpose, the test data is rather small by now. You could think about highly efficient algorithm after the contest.\nPlease remember to RESET your class variables declared in class MagicDictionary, as static/class variables are persisted across multiple test cases. Please see here for more details.
 * <p>
 * 中文
 * 序号: 676
 * 标题： 实现一个魔法字典
 * 链接： https://leetcode-cn.com/problems/implement-magic-dictionary
 * 描述： 实现一个带有buildDict, 以及 search方法的魔法字典。\n对于buildDict方法，你将被给定一串不重复的单词来构建一个字典。\n对于search方法，你将被给定一个单词，并且判定能否只将这个单词中一个字母换成另一个字母，使得所形成的新单词存在于你构建的字典中。\n示例 1:\nInput: buildDict([\"hello\", \"leetcode\"]), Output: Null\nInput: search(\"hello\"), Output: False\nInput: search(\"hhllo\"), Output: True\nInput: search(\"hell\"), Output: False\nInput: search(\"leetcoded\"), Output: False\n注意:\n你可以假设所有输入都是小写字母 a-z。\n为了便于竞赛，测试所用的数据量很小。你可以在竞赛结束后，考虑更高效的算法。\n请记住重置MagicDictionary类中声明的类变量，因为静态/类变量会在多个测试用例中保留。 请参阅这里了解更多详情。
 * <p>
 * acceptance: 52.7%
 * difficulty: Medium
 * private: False
 */


//TODO init
class MagicDictionary {
    /*
     * Initialize your data structure here.
     */
    public MagicDictionary() {
        
    }

    /*
     * Build a dictionary through a list of words
     */
    public void buildDict(String[] dict) {
    }

    /*
     * Returns if there is any word in the trie that equals to the given word after modifying exactly one character
     */
    public boolean search(String word) {
        return false;
    }
}

/*
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dict);
 * boolean param_2 = obj.search(word);
 */
