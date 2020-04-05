package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 691
 * title: Stickers to Spell Word
 * href: https://leetcode.com/problems/stickers-to-spell-word
 * desc: We are given N different types of stickers. Each sticker has a lowercase English word on it.\nYou would like to spell out the given target string by cutting individual letters from your collection of stickers and rearranging them.\nYou can use each sticker more than once if you want, and you have infinite quantities of each sticker.\nWhat is the minimum number of stickers that you need to spell out the target? If the task is impossible, return -1.\nExample 1:\nInput:\n[\"with\", \"example\", \"science\"], \"thehat\"\nOutput:\n3\nExplanation:\nWe can use 2 \"with\" stickers, and 1 \"example\" sticker.\nAfter cutting and rearrange the letters of those stickers, we can form the target \"thehat\".\nAlso, this is the minimum number of stickers necessary to form the target string.\nExample 2:\nInput:\n[\"notice\", \"possible\"], \"basicbasic\"\nOutput:\n-1\nExplanation:\nWe can\'t form the target \"basicbasic\" from cutting letters from the given stickers.\nNote:\nstickers has length in the range [1, 50].\nstickers consists of lowercase English words (without apostrophes).\ntarget has length in the range [1, 15], and consists of lowercase English letters.\nIn all test cases, all words were chosen randomly from the 1000 most common US English words, and the target was chosen as a concatenation of two random words.\nThe time limit may be more challenging than usual. It is expected that a 50 sticker test case can be solved within 35ms on average.
 * <p>
 * 中文
 * 序号: 691
 * 标题： 贴纸拼词
 * 链接： https://leetcode-cn.com/problems/stickers-to-spell-word
 * 描述： 我们给出了 N 种不同类型的贴纸。每个贴纸上都有一个小写的英文单词。\n你希望从自己的贴纸集合中裁剪单个字母并重新排列它们，从而拼写出给定的目标字符串 target。\n如果你愿意的话，你可以不止一次地使用每一张贴纸，而且每一张贴纸的数量都是无限的。\n拼出目标 target 所需的最小贴纸数量是多少？如果任务不可能，则返回 -1。\n  示例 1：\n输入：\n[\"with\", \"example\", \"science\"], \"thehat\"\n输出：\n3\n解释：\n我们可以使用 2 个 \"with\" 贴纸，和 1 个 \"example\" 贴纸。\n把贴纸上的字母剪下来并重新排列后，就可以形成目标 “thehat“ 了。\n此外，这是形成目标字符串所需的最小贴纸数量。\n示例 2：\n输入：\n[\"notice\", \"possible\"], \"basicbasic\"\n输出：\n-1\n解释：\n我们不能通过剪切给定贴纸的字母来形成目标“basicbasic”。\n  提示：\nstickers 长度范围是 [1, 50]。\nstickers 由小写英文单词组成（不带撇号）。\ntarget 的长度在 [1, 15] 范围内，由小写字母组成。\n在所有的测试案例中，所有的单词都是从 1000 个最常见的美国英语单词中随机选取的，目标是两个随机单词的串联。\n时间限制可能比平时更具挑战性。预计 50 个贴纸的测试案例平均可在35ms内解决。\n
 * <p>
 * acceptance: 40.9%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class StickersToSpellWord {
    public int minStickers(String[] stickers, String target) {
        return 0;
    }
}