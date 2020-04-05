package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 914
 * title: X of a Kind in a Deck of Cards
 * href: https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards
 * desc: In a deck of cards, each card has an integer written on it.\nReturn true if and only if you can choose X >= 2 such that it is possible to split the entire deck into 1 or more groups of cards, where:\nEach group has exactly X cards.\nAll the cards in each group have the same integer.\n  Example 1:\nInput: [1,2,3,4,4,3,2,1]\nOutput: true\nExplanation: Possible partition [1,1],[2,2],[3,3],[4,4]\nExample 2:\nInput: [1,1,1,2,2,2,3,3]\nOutput: false\nExplanation: No possible partition.\nExample 3:\nInput: [1]\nOutput: false\nExplanation: No possible partition.\nExample 4:\nInput: [1,1]\nOutput: true\nExplanation: Possible partition [1,1]\nExample 5:\nInput: [1,1,2,2,2,2]\nOutput: true\nExplanation: Possible partition [1,1],[2,2],[2,2]\n\nNote:\n1 <= deck.length <= 10000\n0 <= deck[i] < 10000\n
 * <p>
 * 中文
 * 序号: 914
 * 标题： 卡牌分组
 * 链接： https://leetcode-cn.com/problems/x-of-a-kind-in-a-deck-of-cards
 * 描述： 给定一副牌，每张牌上都写着一个整数。\n此时，你需要选定一个数字 X，使我们可以将整副牌按下述规则分成 1 组或更多组：\n每组都有 X 张牌。\n组内所有的牌上都写着相同的整数。\n仅当你可选的 X >= 2 时返回 true。\n  示例 1：\n输入：[1,2,3,4,4,3,2,1]\n输出：true\n解释：可行的分组是 [1,1]，[2,2]，[3,3]，[4,4]\n示例 2：\n输入：[1,1,1,2,2,2,3,3]\n输出：false\n解释：没有满足要求的分组。\n示例 3：\n输入：[1]\n输出：false\n解释：没有满足要求的分组。\n示例 4：\n输入：[1,1]\n输出：true\n解释：可行的分组是 [1,1]\n示例 5：\n输入：[1,1,2,2,2,2]\n输出：true\n解释：可行的分组是 [1,1]，[2,2]，[2,2]\n\n提示：\n1 <= deck.length <= 10000\n0 <= deck[i] < 10000\n
 * <p>
 * acceptance: 34.0%
 * difficulty: Easy
 * private: False
 */


//TODO init
public class XOfAKindInADeckOfCards {
    public boolean hasGroupsSizeX(int[] deck) {
        return false;
    }
}