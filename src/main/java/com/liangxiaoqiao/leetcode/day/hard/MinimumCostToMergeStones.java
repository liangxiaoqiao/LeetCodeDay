package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 1000
 * title: Minimum Cost to Merge Stones
 * href: https://leetcode.com/problems/minimum-cost-to-merge-stones
 * desc: There are N piles of stones arranged in a row.  The i-th pile has stones[i] stones.\nA move consists of merging exactly K consecutive piles into one pile, and the cost of this move is equal to the total number of stones in these K piles.\nFind the minimum cost to merge all piles of stones into one pile.  If it is impossible, return -1.\n  Example 1:\nInput: stones = [3,2,4,1], K = 2\nOutput: 20\nExplanation: \nWe start with [3, 2, 4, 1].\nWe merge [3, 2] for a cost of 5, and we are left with [5, 4, 1].\nWe merge [4, 1] for a cost of 5, and we are left with [5, 5].\nWe merge [5, 5] for a cost of 10, and we are left with [10].\nThe total cost was 20, and this is the minimum possible.\nExample 2:\nInput: stones = [3,2,4,1], K = 3\nOutput: -1\nExplanation: After any merge operation, there are 2 piles left, and we can\'t merge anymore.  So the task is impossible.\nExample 3:\nInput: stones = [3,5,1,2,6], K = 3\nOutput: 25\nExplanation: \nWe start with [3, 5, 1, 2, 6].\nWe merge [5, 1, 2] for a cost of 8, and we are left with [3, 8, 6].\nWe merge [3, 8, 6] for a cost of 17, and we are left with [17].\nThe total cost was 25, and this is the minimum possible.\n  Note:\n1 <= stones.length <= 30\n2 <= K <= 30\n1 <= stones[i] <= 100
 * <p>
 * 中文
 * 序号: 1000
 * 标题： 合并石头的最低成本
 * 链接： https://leetcode-cn.com/problems/minimum-cost-to-merge-stones
 * 描述： None
 * <p>
 * acceptance: 38.0%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class MinimumCostToMergeStones {
    public int mergeStones(int[] stones, int K) {
        return 0;
    }
}