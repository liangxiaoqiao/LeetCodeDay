package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 1046
 * title: Last Stone Weight
 * href: https://leetcode.com/problems/last-stone-weight
 * desc: We have a collection of rocks, each rock has a positive integer weight.
 * Each turn, we choose the two heaviest rocks and smash them together.  Suppose the stones have weights x and y with x <= y.  The result of this smash is:
 * If x == y, both stones are totally destroyed;
 * If x != y, the stone of weight x is totally destroyed, and the stone of weight y has new weight y-x.
 * At the end, there is at most 1 stone left.  Return the weight of this stone (or 0 if there are no stones left.)
 * Example 1:
 * Input: [2,7,4,1,8,1]
 * Output: 1
 * Explanation:
 * We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
 * we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
 * we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
 * we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of last stone.
 * Note:
 * 1 <= stones.length <= 30
 * 1 <= stones[i] <= 1000
 * <p>
 * 中文
 * 序号: 1046
 * 标题： 最后一块石头的重量
 * 链接： https://leetcode-cn.com/problems/last-stone-weight
 * 描述： 有一堆石头，每块石头的重量都是正整数。
 * 每一回合，从中选出两块最重的石头，然后将它们一起粉碎。假设石头的重量分别为 x 和 y，且 x <= y。那么粉碎的可能结果如下：
 * 如果 x == y，那么两块石头都会被完全粉碎；
 * 如果 x != y，那么重量为 x 的石头将会完全粉碎，而重量为 y 的石头新重量为 y-x。
 * 最后，最多只会剩下一块石头。返回此石头的重量。如果没有石头剩下，就返回 0。
 * 提示：
 * 1 <= stones.length <= 30
 * 1 <= stones[i] <= 1000
 * <p>
 * acceptance: 62.5%
 * difficulty: Easy
 * private: False
 */


//TODO init
public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        return 0;
    }
}