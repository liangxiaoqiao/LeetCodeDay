package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 837
 * title: New 21 Game
 * href: https://leetcode.com/problems/new-21-game
 * desc: Alice plays the following game, loosely based on the card game \"21\".\nAlice starts with 0 points, and draws numbers while she has less than K points.  During each draw, she gains an integer number of points randomly from the range [1, W], where W is an integer.  Each draw is independent and the outcomes have equal probabilities.\nAlice stops drawing numbers when she gets K or more points.  What is the probability that she has N or less points?\nExample 1:\nInput: N = 10, K = 1, W = 10\nOutput: 1.00000\nExplanation:  Alice gets a single card, then stops.\nExample 2:\nInput: N = 6, K = 1, W = 10\nOutput: 0.60000\nExplanation:  Alice gets a single card, then stops.\nIn 6 out of W = 10 possibilities, she is at or below N = 6 points.\nExample 3:\nInput: N = 21, K = 17, W = 10\nOutput: 0.73278\nNote:\n0 <= K <= N <= 10000\n1 <= W <= 10000\nAnswers will be accepted as correct if they are within 10^-5 of the correct answer.\nThe judging time limit has been reduced for this question.
 * <p>
 * 中文
 * 序号: 837
 * 标题： 新21点
 * 链接： https://leetcode-cn.com/problems/new-21-game
 * 描述： 爱丽丝参与一个大致基于纸牌游戏 “21点” 规则的游戏，描述如下：\n爱丽丝以 0 分开始，并在她的得分少于 K 分时抽取数字。 抽取时，她从 [1, W] 的范围中随机获得一个整数作为分数进行累计，其中 W 是整数。 每次抽取都是独立的，其结果具有相同的概率。\n当爱丽丝获得不少于 K 分时，她就停止抽取数字。 爱丽丝的分数不超过 N 的概率是多少？\n示例 1：\n输入：N = 10, K = 1, W = 10\n输出：1.00000\n说明：爱丽丝得到一张卡，然后停止。\n示例 2：\n输入：N = 6, K = 1, W = 10\n输出：0.60000\n说明：爱丽丝得到一张卡，然后停止。\n在 W = 10 的 6 种可能下，她的得分不超过 N = 6 分。\n示例 3：\n输入：N = 21, K = 17, W = 10\n输出：0.73278\n提示：\n0 <= K <= N <= 10000\n1 <= W <= 10000\n如果答案与正确答案的误差不超过 10^-5，则该答案将被视为正确答案通过。\n此问题的判断限制时间已经减少。
 * <p>
 * acceptance: 33.5%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class New21Game {
    public double new21Game(int N, int K, int W) {
        return 0;
    }
}