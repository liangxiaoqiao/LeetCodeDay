package com.liangxiaoqiao.leetcode.day.hard;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
    
/*
 * English
 * id: 472
 * title: Concatenated Words
 * href: https://leetcode.com/problems/concatenated-words
 * desc: Given a list of words (without duplicates), please write a program that returns all concatenated words in the given list of words.\nA concatenated word is defined as a string that is comprised entirely of at least two shorter words in the given array.\nExample:\nInput: [\"cat\",\"cats\",\"catsdogcats\",\"dog\",\"dogcatsdog\",\"hippopotamuses\",\"rat\",\"ratcatdogcat\"]\n\nOutput: [\"catsdogcats\",\"dogcatsdog\",\"ratcatdogcat\"]\n\nExplanation: \"catsdogcats\" can be concatenated by \"cats\", \"dog\" and \"cats\"; \n \"dogcatsdog\" can be concatenated by \"dog\", \"cats\" and \"dog\"; \n\"ratcatdogcat\" can be concatenated by \"rat\", \"cat\", \"dog\" and \"cat\".\nNote:\nThe number of elements of the given array will not exceed 10,000\nThe length sum of elements in the given array will not exceed 600,000.\nAll the input string will only include lower case letters.\nThe returned elements order does not matter.
 * <p>
 * 中文
 * 序号: 472
 * 标题： 连接词
 * 链接： https://leetcode-cn.com/problems/concatenated-words
 * 描述： 给定一个不含重复单词的列表，编写一个程序，返回给定单词列表中所有的连接词。

连接词的定义为：一个字符串完全是由至少两个给定数组中的单词组成的。

示例:

输入: ["cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"]

输出: ["catsdogcats","dogcatsdog","ratcatdogcat"]

解释: "catsdogcats"由"cats", "dog" 和 "cats"组成;
     "dogcatsdog"由"dog", "cats"和"dog"组成;
     "ratcatdogcat"由"rat", "cat", "dog"和"cat"组成。
说明:

给定数组的元素总数不超过 10000。
给定数组中元素的长度总和不超过 600000。
所有输入字符串只包含小写字母。
不需要考虑答案输出的顺序。

 * <p>
 * acceptance: 39.5%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class ConcatenatedWords {

    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> result = new ArrayList<>();
        Stream.of(words).forEach(word -> {
            if (isConcat(words, word, true)) {
                result.add(word);
            }
        });
        return result;
    }

    private boolean isConcat(String[] words, String word, boolean first) {
        List<String> matched = Stream.of(words).filter(w -> !"".equals(w) && word.contains(w)).collect(Collectors.toList());
        if (!first && matched.size() == 1 && word.split(matched.get(0)).length == 0) {
            return true;
        }

        for (String match : matched) {
            if (word.equals(match)) {
                continue;
            }
            String[] splits = word.split(match);
            boolean flag = Stream.of(splits).filter(split -> !split.equals("")).allMatch(split -> isConcat(matched.toArray(new String[0]), split, false));
            if (flag) {
                return true;
            }
        }
        return false;
    }
}

