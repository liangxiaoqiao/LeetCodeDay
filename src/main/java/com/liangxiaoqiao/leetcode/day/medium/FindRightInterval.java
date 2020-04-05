package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 436
 * title: Find Right Interval
 * href: https://leetcode.com/problems/find-right-interval
 * desc: Given a set of intervals, for each of the interval i, check if there exists an interval j whose start point is bigger than or equal to the end point of the interval i, which can be called that j is on the "right" of i.
 * For any interval i, you need to store the minimum interval j's index, which means that the interval j has the minimum start point to build the "right" relationship for interval i. If the interval j doesn't exist, store -1 for the interval i. Finally, you need output the stored value of each interval as an array.
 * Note:
 * You may assume the interval's end point is always bigger than its start point.
 * You may assume none of these intervals have the same start point.
 * Example 1:
 * Input: [ [1,2] ]
 * <p>
 * Output: [-1]
 * <p>
 * Explanation: There is only one interval in the collection, so it outputs -1.
 * Example 2:
 * Input: [ [3,4], [2,3], [1,2] ]
 * <p>
 * Output: [-1, 0, 1]
 * <p>
 * Explanation: There is no satisfied "right" interval for [3,4].
 * For [2,3], the interval [3,4] has minimum-"right" start point;
 * For [1,2], the interval [2,3] has minimum-"right" start point.
 * Example 3:
 * Input: [ [1,4], [2,3], [3,4] ]
 * <p>
 * Output: [-1, 2, -1]
 * <p>
 * Explanation: There is no satisfied "right" interval for [1,4] and [3,4].
 * For [2,3], the interval [3,4] has minimum-"right" start point.
 * NOTE: input types have been changed on April 15, 2019. Please reset to default code definition to get new method signature.
 * <p>
 * 中文
 * 序号: 436
 * 标题： 寻找右区间
 * 链接： https://leetcode-cn.com/problems/find-right-interval
 * 描述： 给定一组区间，对于每一个区间 i，检查是否存在一个区间 j，它的起始点大于或等于区间 i 的终点，这可以称为 j 在 i 的“右侧”。\n对于任何区间，你需要存储的满足条件的区间 j 的最小索引，这意味着区间 j 有最小的起始点可以使其成为“右侧”区间。如果区间 j 不存在，则将区间 i 存储为 -1。最后，你需要输出一个值为存储的区间值的数组。\n注意:\n你可以假设区间的终点总是大于它的起始点。\n你可以假定这些区间都不具有相同的起始点。\n示例 1:\n输入: [ [1,2] ]\n输出: [-1]\n\n解释:集合中只有一个区间，所以输出-1。\n示例 2:\n输入: [ [3,4], [2,3], [1,2] ]\n输出: [-1, 0, 1]\n\n解释:对于[3,4]，没有满足条件的“右侧”区间。\n对于[2,3]，区间[3,4]具有最小的“右”起点;\n对于[1,2]，区间[2,3]具有最小的“右”起点。\n示例 3:\n输入: [ [1,4], [2,3], [3,4] ]\n输出: [-1, 2, -1]\n\n解释:对于区间[1,4]和[3,4]，没有满足条件的“右侧”区间。\n对于[2,3]，区间[3,4]有最小的“右”起点。
 * <p>
 * acceptance: 44.0%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class FindRightInterval {
    public int[] findRightInterval(int[][] intervals) {
        return null;
    }
}