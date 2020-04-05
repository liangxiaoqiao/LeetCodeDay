package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 898
 * title: None
 * href: None
 * desc: None
 * <p>
 * 中文
 * 序号: 898
 * 标题： 子数组按位或操作
 * 链接： https://leetcode-cn.com/problems/bitwise-ors-of-subarrays
 * 描述： 我们有一个非负整数数组 A。\n对于每个（连续的）子数组 B = [A[i], A[i+1], ..., A[j]] （ i <= j），我们对 B 中的每个元素进行按位或操作，获得结果 A[i] | A[i+1] | ... | A[j]。\n返回可能结果的数量。 （多次出现的结果在最终答案中仅计算一次。）\n  示例 1：\n输入：[0]\n输出：1\n解释：\n只有一个可能的结果 0 。\n示例 2：\n输入：[1,1,2]\n输出：3\n解释：\n可能的子数组为 [1]，[1]，[2]，[1, 1]，[1, 2]，[1, 1, 2]。\n产生的结果为 1，1，2，1，3，3 。\n有三个唯一值，所以答案是 3 。\n示例 3：\n输入：[1,2,4]\n输出：6\n解释：\n可能的结果是 1，2，3，4，6，以及 7 。\n  提示：\n1 <= A.length <= 50000\n0 <= A[i] <= 10^9
 * <p>
 * acceptance: 25.6%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class BitwiseOrsOfSubarrays {
    public int subarrayBitwiseORs(int[] A) {
        return 0;
    }
}