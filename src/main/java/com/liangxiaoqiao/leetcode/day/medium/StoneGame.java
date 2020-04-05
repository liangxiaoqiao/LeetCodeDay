package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 877
 * title: Stone Game
 * href: https://leetcode.com/problems/stone-game
 * desc: Alex and Lee play a game with piles of stones.  There are an even number of piles arranged in a row, and each pile has a positive integer number of stones piles[i].\nThe objective of the game is to end with the most stones.  The total number of stones is odd, so there are no ties.\nAlex and Lee take turns, with Alex starting first.  Each turn, a player takes the entire pile of stones from either the beginning or the end of the row.  This continues until there are no more piles left, at which point the person with the most stones wins.\nAssuming Alex and Lee play optimally, return True if and only if Alex wins the game.\n  Example 1:\nInput: [5,3,4,5]\nOutput: true\nExplanation: \nAlex starts first, and can only take the first 5 or the last 5.\nSay he takes the first 5, so that the row becomes [3, 4, 5].\nIf Lee takes 3, then the board is [4, 5], and Alex takes 5 to win with 10 points.\nIf Lee takes the last 5, then the board is [3, 4], and Alex takes 4 to win with 9 points.\nThis demonstrated that taking the first 5 was a winning move for Alex, so we return true.\n  Note:\n2 <= piles.length <= 500\npiles.length is even.\n1 <= piles[i] <= 500\nsum(piles) is odd.
 * <p>
 * 中文
 * 序号: 877
 * 标题： 石子游戏
 * 链接： https://leetcode-cn.com/problems/stone-game
 * 描述： 亚历克斯和李用几堆石子在做游戏。偶数堆石子排成一行，每堆都有正整数颗石子 piles[i] 。\n游戏以谁手中的石子最多来决出胜负。石子的总数是奇数，所以没有平局。\n亚历克斯和李轮流进行，亚历克斯先开始。 每回合，玩家从行的开始或结束处取走整堆石头。 这种情况一直持续到没有更多的石子堆为止，此时手中石子最多的玩家获胜。\n假设亚历克斯和李都发挥出最佳水平，当亚历克斯赢得比赛时返回 true ，当李赢得比赛时返回 false 。\n  示例：\n输入：[5,3,4,5]\n输出：true\n解释：\n亚历克斯先开始，只能拿前 5 颗或后 5 颗石子 。\n假设他取了前 5 颗，这一行就变成了 [3,4,5] 。\n如果李拿走前 3 颗，那么剩下的是 [4,5]，亚历克斯拿走后 5 颗赢得 10 分。\n如果李拿走后 5 颗，那么剩下的是 [3,4]，亚历克斯拿走后 4 颗赢得 9 分。\n这表明，取前 5 颗石子对亚历克斯来说是一个胜利的举动，所以我们返回 true 。\n  提示：\n2 <= piles.length <= 500\npiles.length 是偶数。\n1 <= piles[i] <= 500\nsum(piles) 是奇数。
 * <p>
 * acceptance: 62.8%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class StoneGame {
    public boolean stoneGame(int[] piles) {
        return false;
    }
}