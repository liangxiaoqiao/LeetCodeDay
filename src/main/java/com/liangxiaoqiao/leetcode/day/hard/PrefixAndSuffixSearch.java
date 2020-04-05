package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 745
 * title: Prefix and Suffix Search
 * href: https://leetcode.com/problems/prefix-and-suffix-search
 * desc: Given many words, words[i] has weight i.\nDesign a class WordFilter that supports one function, WordFilter.f(String prefix, String suffix). It will return the word with given prefix and suffix with maximum weight. If no word exists, return -1.\nExamples:\nInput:\nWordFilter([\"apple\"])\nWordFilter.f(\"a\", \"e\") // returns 0\nWordFilter.f(\"b\", \"\") // returns -1\n  Note:\nwords has length in range [1, 15000].\nFor each test case, up to words.length queries WordFilter.f may be made.\nwords[i] has length in range [1, 10].\nprefix, suffix have lengths in range [0, 10].\nwords[i] and prefix, suffix queries consist of lowercase letters only.\n
 * <p>
 * 中文
 * 序号: 745
 * 标题： 前缀和后缀搜索
 * 链接： https://leetcode-cn.com/problems/prefix-and-suffix-search
 * 描述： 给定多个 words，words[i] 的权重为 i 。\n设计一个类 WordFilter 实现函数WordFilter.f(String prefix, String suffix)。这个函数将返回具有前缀 prefix 和后缀suffix 的词的最大权重。如果没有这样的词，返回 -1。\n例子:\n输入:\nWordFilter([\"apple\"])\nWordFilter.f(\"a\", \"e\") // 返回 0\nWordFilter.f(\"b\", \"\") // 返回 -1\n注意:\nwords的长度在[1, 15000]之间。\n对于每个测试用例，最多会有words.length次对WordFilter.f的调用。\nwords[i]的长度在[1, 10]之间。\nprefix, suffix的长度在[0, 10]之前。\nwords[i]和prefix, suffix只包含小写字母。
 * <p>
 * acceptance: 32.6%
 * difficulty: Hard
 * private: False
 */


//TODO init
class PrefixAndSuffixSearch {
    public PrefixAndSuffixSearch(String[] words) {
    }

    public int f(String prefix, String suffix) {
        return 0;
    }
}

/*
 * Your WordFilter object will be instantiated and called as such:
 * WordFilter obj = new WordFilter(words);
 * int param_1 = obj.f(prefix,suffix);
 */
