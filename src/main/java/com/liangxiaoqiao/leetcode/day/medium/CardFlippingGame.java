package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 822
 * title: Card Flipping Game
 * href: https://leetcode.com/problems/card-flipping-game
 * desc: On a table are N cards, with a positive integer printed on the front and back of each card (possibly different).\nWe flip any number of cards, and after we choose one card. \nIf the number X on the back of the chosen card is not on the front of any card, then this number X is good.\nWhat is the smallest number that is good?  If no number is good, output 0.\nHere, fronts[i] and backs[i] represent the number on the front and back of card i. \nA flip swaps the front and back numbers, so the value on the front is now on the back and vice versa.\nExample:\nInput: fronts = [1,2,4,4,7], backs = [1,3,4,1,3]\nOutput: 2\nExplanation: If we flip the second card, the fronts are [1,3,4,4,7] and the backs are [1,2,4,1,3].\nWe choose the second card, which has number 2 on the back, and it isn\'t on the front of any card, so 2 is good.\n  Note:\n1 <= fronts.length == backs.length <= 1000.\n1 <= fronts[i] <= 2000.\n1 <= backs[i] <= 2000.
 * <p>
 * 中文
 * 序号: 822
 * 标题： 翻转卡片游戏
 * 链接： https://leetcode-cn.com/problems/card-flipping-game
 * 描述： 在桌子上有 N 张卡片，每张卡片的正面和背面都写着一个正数（正面与背面上的数有可能不一样）。\n我们可以先翻转任意张卡片，然后选择其中一张卡片。\n如果选中的那张卡片背面的数字 X 与任意一张卡片的正面的数字都不同，那么这个数字是我们想要的数字。\n哪个数是这些想要的数字中最小的数（找到这些数中的最小值）呢？如果没有一个数字符合要求的，输出 0。\n其中, fronts[i] 和 backs[i] 分别代表第 i 张卡片的正面和背面的数字。\n如果我们通过翻转卡片来交换正面与背面上的数，那么当初在正面的数就变成背面的数，背面的数就变成正面的数。\n示例：\n输入：fronts = [1,2,4,4,7], backs = [1,3,4,1,3]\n输出：2\n解释：假设我们翻转第二张卡片，那么在正面的数变成了 [1,3,4,4,7] ， 背面的数变成了 [1,2,4,1,3]。\n接着我们选择第二张卡片，因为现在该卡片的背面的数是 2，2 与任意卡片上正面的数都不同，所以 2 就是我们想要的数字。\n  提示：\n1 <= fronts.length == backs.length <= 1000\n1 <= fronts[i] <= 2000\n1 <= backs[i] <= 2000
 * <p>
 * acceptance: 41.9%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class CardFlippingGame {
    public int flipgame(int[] fronts, int[] backs) {
        return 0;
    }
}