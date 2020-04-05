package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 798
 * title: Smallest Rotation with Highest Score
 * href: https://leetcode.com/problems/smallest-rotation-with-highest-score
 * desc:  Given an array A, we may rotate it by a non-negative integer K so that the array becomes A[K], A[K+1], A{K+2], ... A[A.length - 1], A[0], A[1], ..., A[K-1].  Afterward, any entries that are less than or equal to their index are worth 1 point. \nFor example, if we have [2, 4, 1, 3, 0], and we rotate by K = 2, it becomes [1, 3, 0, 2, 4].  This is worth 3 points because 1 > 0 [no points], 3 > 1 [no points], 0 <= 2 [one point], 2 <= 3 [one point], 4 <= 4 [one point].\nOver all possible rotations, return the rotation index K that corresponds to the highest score we could receive.  If there are multiple answers, return the smallest such index K.\nExample 1:\nInput: [2, 3, 1, 4, 0]\nOutput: 3\nExplanation:  \nScores for each K are listed below: \nK = 0,  A = [2,3,1,4,0],    score 2\nK = 1,  A = [3,1,4,0,2],    score 3\nK = 2,  A = [1,4,0,2,3],    score 3\nK = 3,  A = [4,0,2,3,1],    score 4\nK = 4,  A = [0,2,3,1,4],    score 3\nSo we should choose K = 3, which has the highest score.\n  Example 2:\nInput: [1, 3, 0, 2, 4]\nOutput: 0\nExplanation:  A will always have 3 points no matter how it shifts.\nSo we will choose the smallest K, which is 0.\nNote:\nA will have length at most 20000.\nA[i] will be in the range [0, A.length].
 * <p>
 * 中文
 * 序号: 798
 * 标题： 得分最高的最小轮调
 * 链接： https://leetcode-cn.com/problems/smallest-rotation-with-highest-score
 * 描述： 给定一个数组 A，我们可以将它按一个非负整数 K 进行轮调，这样可以使数组变为 A[K], A[K+1], A{K+2], ... A[A.length - 1], A[0], A[1], ..., A[K-1] 的形式。此后，任何值小于或等于其索引的项都可以记作一分。\n例如，如果数组为 [2, 4, 1, 3, 0]，我们按 K = 2 进行轮调后，它将变成 [1, 3, 0, 2, 4]。这将记作 3 分，因为 1 > 0 [no points], 3 > 1 [no points], 0 <= 2 [one point], 2 <= 3 [one point], 4 <= 4 [one point]。\n在所有可能的轮调中，返回我们所能得到的最高分数对应的轮调索引 K。如果有多个答案，返回满足条件的最小的索引 K。\n示例 1：\n输入：[2, 3, 1, 4, 0]\n输出：3\n解释：\n下面列出了每个 K 的得分：\nK = 0,  A = [2,3,1,4,0],    score 2\nK = 1,  A = [3,1,4,0,2],    score 3\nK = 2,  A = [1,4,0,2,3],    score 3\nK = 3,  A = [4,0,2,3,1],    score 4\nK = 4,  A = [0,2,3,1,4],    score 3\n所以我们应当选择 K = 3，得分最高。\n  示例 2：\n输入：[1, 3, 0, 2, 4]\n输出：0\n解释：\nA 无论怎么变化总是有 3 分。\n所以我们将选择最小的 K，即 0。\n提示：\nA 的长度最大为 20000。\nA[i] 的取值范围是 [0, A.length]。
 * <p>
 * acceptance: 42.3%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class SmallestRotationWithHighestScore {
    public int bestRotation(int[] A) {
        return 0;
    }
}