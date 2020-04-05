package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 813
 * title: Largest Sum of Averages
 * href: https://leetcode.com/problems/largest-sum-of-averages
 * desc: We partition a row of numbers A into at most K adjacent (non-empty) groups, then our score is the sum of the average of each group. What is the largest score we can achieve?\nNote that our partition must use every number in A, and that scores are not necessarily integers.\nExample:\nInput: \nA = [9,1,2,3,9]\nK = 3\nOutput: 20\nExplanation: \nThe best choice is to partition A into [9], [1, 2, 3], [9]. The answer is 9 + (1 + 2 + 3) / 3 + 9 = 20.\nWe could have also partitioned A into [9, 1], [2], [3, 9], for example.\nThat partition would lead to a score of 5 + 2 + 6 = 13, which is worse.\n  Note:\n1 <= A.length <= 100.\n1 <= A[i] <= 10000.\n1 <= K <= A.length.\nAnswers within 10^-6 of the correct answer will be accepted as correct.
 * <p>
 * 中文
 * 序号: 813
 * 标题： 最大平均值和的分组
 * 链接： https://leetcode-cn.com/problems/largest-sum-of-averages
 * 描述： 我们将给定的数组 A 分成 K 个相邻的非空子数组 ，我们的分数由每个子数组内的平均值的总和构成。计算我们所能得到的最大分数是多少。\n注意我们必须使用 A 数组中的每一个数进行分组，并且分数不一定需要是整数。\n示例:\n输入: \nA = [9,1,2,3,9]\nK = 3\n输出: 20\n解释: \nA 的最优分组是[9], [1, 2, 3], [9]. 得到的分数是 9 + (1 + 2 + 3) / 3 + 9 = 20.\n我们也可以把 A 分成[9, 1], [2], [3, 9].\n这样的分组得到的分数为 5 + 2 + 6 = 13, 但不是最大值.\n说明:\n1 <= A.length <= 100.\n1 <= A[i] <= 10000.\n1 <= K <= A.length.\n答案误差在 10^-6 内被视为是正确的。
 * <p>
 * acceptance: 47.7%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class LargestSumOfAverages {
    public double largestSumOfAverages(int[] A, int K) {
        return 0;
    }
}