package com.liangxiaoqiao.leetcode.day.hard;


import java.util.List;
    
/*
 * English
 * id: 68
 * title: Text Justification
 * href: https://leetcode.com/problems/text-justification
 * desc: Given an array of words and a width maxWidth, format the text such that each line has exactly maxWidth characters and is fully (left and right) justified.\nYou should pack your words in a greedy approach; that is, pack as many words as you can in each line. Pad extra spaces \' \' when necessary so that each line has exactly maxWidth characters.\nExtra spaces between words should be distributed as evenly as possible. If the number of spaces on a line do not divide evenly between words, the empty slots on the left will be assigned more spaces than the slots on the right.\nFor the last line of text, it should be left justified and no extra space is inserted between words.\nNote:\nA word is defined as a character sequence consisting of non-space characters only.\nEach word\'s length is guaranteed to be greater than 0 and not exceed maxWidth.\nThe input array words contains at least one word.\nExample 1:\nInput:\nwords = [\"This\", \"is\", \"an\", \"example\", \"of\", \"text\", \"justification.\"]\nmaxWidth = 16\nOutput:\n[\n   \"This    is    an\",\n   \"example  of text\",\n   \"justification.  \"\n]\nExample 2:\nInput:\nwords = [\"What\",\"must\",\"be\",\"acknowledgment\",\"shall\",\"be\"]\nmaxWidth = 16\nOutput:\n[\n  \"What   must   be\",\n  \"acknowledgment  \",\n  \"shall be        \"\n]\nExplanation: Note that the last line is \"shall be    \" instead of \"shall     be\",\n             because the last line must be left-justified instead of fully-justified.\n             Note that the second line is also left-justified becase it contains only one word.\nExample 3:\nInput:\nwords = [\"Science\",\"is\",\"what\",\"we\",\"understand\",\"well\",\"enough\",\"to\",\"explain\",\n         \"to\",\"a\",\"computer.\",\"Art\",\"is\",\"everything\",\"else\",\"we\",\"do\"]\nmaxWidth = 20\nOutput:\n[\n  \"Science  is  what we\",\n  \"understand      well\",\n  \"enough to explain to\",\n  \"a  computer.  Art is\",\n  \"everything  else  we\",\n  \"do                  \"\n]
 * <p>
 * 中文
 * 序号: 68
 * 标题： 文本左右对齐
 * 链接： https://leetcode-cn.com/problems/text-justification
 * 描述： 给定一个单词数组和一个长度 maxWidth，重新排版单词，使其成为每行恰好有 maxWidth 个字符，且左右两端对齐的文本。\n你应该使用“贪心算法”来放置给定的单词；也就是说，尽可能多地往每行中放置单词。必要时可用空格 \' \' 填充，使得每行恰好有 maxWidth 个字符。\n要求尽可能均匀分配单词间的空格数量。如果某一行单词间的空格不能均匀分配，则左侧放置的空格数要多于右侧的空格数。\n文本的最后一行应为左对齐，且单词之间不插入额外的空格。\n说明:\n单词是指由非空格字符组成的字符序列。\n每个单词的长度大于 0，小于等于 maxWidth。\n输入单词数组 words 至少包含一个单词。\n示例:\n输入:\nwords = [\"This\", \"is\", \"an\", \"example\", \"of\", \"text\", \"justification.\"]\nmaxWidth = 16\n输出:\n[\n   \"This    is    an\",\n   \"example  of text\",\n   \"justification.  \"\n]\n示例 2:\n输入:\nwords = [\"What\",\"must\",\"be\",\"acknowledgment\",\"shall\",\"be\"]\nmaxWidth = 16\n输出:\n[\n  \"What   must   be\",\n  \"acknowledgment  \",\n  \"shall be        \"\n]\n解释: 注意最后一行的格式应为 \"shall be    \" 而不是 \"shall     be\",\n     因为最后一行应为左对齐，而不是左右两端对齐。       \n     第二行同样为左对齐，这是因为这行只包含一个单词。\n示例 3:\n输入:\nwords = [\"Science\",\"is\",\"what\",\"we\",\"understand\",\"well\",\"enough\",\"to\",\"explain\",\n         \"to\",\"a\",\"computer.\",\"Art\",\"is\",\"everything\",\"else\",\"we\",\"do\"]\nmaxWidth = 20\n输出:\n[\n  \"Science  is  what we\",\n  \"understand      well\",\n  \"enough to explain to\",\n  \"a  computer.  Art is\",\n  \"everything  else  we\",\n  \"do                  \"\n]
 * <p>
 * acceptance: 25.3%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class TextJustification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        return null;
    }
}

