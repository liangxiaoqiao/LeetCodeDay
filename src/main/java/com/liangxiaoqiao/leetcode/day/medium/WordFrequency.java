package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 192
 * title: Word Frequency
 * href: https://leetcode.com/problems/word-frequency
 * desc: Write a bash script to calculate the frequency of each word in a text file words.txt.\nFor simplicity sake, you may assume:\nwords.txt contains only lowercase characters and space \' \' characters.\nEach word must consist of lowercase characters only.\nWords are separated by one or more whitespace characters.\nExample:\nAssume that words.txt has the following content:\nthe day is sunny the the\nthe sunny is is\nYour script should output the following, sorted by descending frequency:\nthe 4\nis 3\nsunny 2\nday 1\nNote:\nDon\'t worry about handling ties, it is guaranteed that each word\'s frequency count is unique.\nCould you write it in one-line using Unix pipes?
 * <p>
 * 中文
 * 序号: 192
 * 标题： 统计词频
 * 链接： https://leetcode-cn.com/problems/word-frequency
 * 描述： 写一个 bash 脚本以统计一个文本文件 words.txt 中每个单词出现的频率。\n为了简单起见，你可以假设：\nwords.txt只包括小写字母和 \' \' 。\n每个单词只由小写字母组成。\n单词间由一个或多个空格字符分隔。\n示例:\n假设 words.txt 内容如下：\nthe day is sunny the the\nthe sunny is is\n你的脚本应当输出（以词频降序排列）：\nthe 4\nis 3\nsunny 2\nday 1\n说明:\n不要担心词频相同的单词的排序问题，每个单词出现的频率都是唯一的。\n你可以使用一行 Unix pipes 实现吗？
 * <p>
 * acceptance: 26.6%
 * difficulty: Medium
 * private: False
 */


//TODO init
//# Read from the file words.txt and output the word frequency list to stdout.