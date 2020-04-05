package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 846
 * title: Hand of Straights
 * href: https://leetcode.com/problems/hand-of-straights
 * desc: Alice has a hand of cards, given as an array of integers.\nNow she wants to rearrange the cards into groups so that each group is size W, and consists of W consecutive cards.\nReturn true if and only if she can.\n  Example 1:\nInput: hand = [1,2,3,6,2,3,4,7,8], W = 3\nOutput: true\nExplanation: Alice\'s hand can be rearranged as [1,2,3],[2,3,4],[6,7,8].\nExample 2:\nInput: hand = [1,2,3,4,5], W = 4\nOutput: false\nExplanation: Alice\'s hand can\'t be rearranged into groups of 4.\n  Note:\n1 <= hand.length <= 10000\n0 <= hand[i] <= 10^9\n1 <= W <= hand.length
 * <p>
 * 中文
 * 序号: 846
 * 标题： 一手顺子
 * 链接： https://leetcode-cn.com/problems/hand-of-straights
 * 描述： 爱丽丝有一手（hand）由整数数组给定的牌。 \n现在她想把牌重新排列成组，使得每个组的大小都是 W，且由 W 张连续的牌组成。\n如果她可以完成分组就返回 true，否则返回 false。\n  示例 1：\n输入：hand = [1,2,3,6,2,3,4,7,8], W = 3\n输出：true\n解释：爱丽丝的手牌可以被重新排列为 [1,2,3]，[2,3,4]，[6,7,8]。\n示例 2：\n输入：hand = [1,2,3,4,5], W = 4\n输出：false\n解释：爱丽丝的手牌无法被重新排列成几个大小为 4 的组。\n  提示：\n1 <= hand.length <= 10000\n0 <= hand[i] <= 10^9\n1 <= W <= hand.length
 * <p>
 * acceptance: 51.1%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class HandOfStraights {
    public boolean isNStraightHand(int[] hand, int W) {
        return false;
    }
}