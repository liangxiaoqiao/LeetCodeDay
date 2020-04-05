package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 330
 * title: Patching Array
 * href: https://leetcode.com/problems/patching-array
 * desc: Given a sorted positive integer array nums and an integer n, add/patch elements to the array such that any number in range [1, n] inclusive can be formed by the sum of some elements in the array. Return the minimum number of patches required.\nExample 1:\nInput: nums = [1,3], n = 6\nOutput: 1 \nExplanation:\nCombinations of nums are [1], [3], [1,3], which form possible sums of: 1, 3, 4.\nNow if we add/patch 2 to nums, the combinations are: [1], [2], [3], [1,3], [2,3], [1,2,3].\nPossible sums are 1, 2, 3, 4, 5, 6, which now covers the range [1, 6].\nSo we only need 1 patch.\nExample 2:\nInput: nums = [1,5,10], n = 20\nOutput: 2\nExplanation: The two patches can be [2, 4].\nExample 3:\nInput: nums = [1,2,2], n = 5\nOutput: 0
 * <p>
 * 中文
 * 序号: 330
 * 标题： 按要求补齐数组
 * 链接： https://leetcode-cn.com/problems/patching-array
 * 描述： 给定一个已排序的正整数数组 nums，和一个正整数 n 。从 [1, n] 区间内选取任意个数字补充到 nums 中，使得 [1, n] 区间内的任何数字都可以用 nums 中某几个数字的和来表示。请输出满足上述要求的最少需要补充的数字个数。\n示例 1:\n输入: nums = [1,3], n = 6\n输出: 1 \n解释:\n根据 nums 里现有的组合 [1], [3], [1,3]，可以得出 1, 3, 4。\n现在如果我们将 2 添加到 nums 中， 组合变为: [1], [2], [3], [1,3], [2,3], [1,2,3]。\n其和可以表示数字 1, 2, 3, 4, 5, 6，能够覆盖 [1, 6] 区间里所有的数。\n所以我们最少需要添加一个数字。\n示例 2:\n输入: nums = [1,5,10], n = 20\n输出: 2\n解释: 我们需要添加 [2, 4]。\n示例 3:\n输入: nums = [1,2,2], n = 5\n输出: 0
 * <p>
 * acceptance: 33.9%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class PatchingArray {
    public int minPatches(int[] nums, int n) {
        return 0;
    }
}