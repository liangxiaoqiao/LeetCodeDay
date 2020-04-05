package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 435
 * title: Non-overlapping Intervals
 * href: https://leetcode.com/problems/non-overlapping-intervals
 * desc: Given a collection of intervals, find the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.\nNote:\nYou may assume the interval\'s end point is always bigger than its start point.\nIntervals like [1,2] and [2,3] have borders \"touching\" but they don\'t overlap each other.\nExample 1:\nInput: [ [1,2], [2,3], [3,4], [1,3] ]\n\nOutput: 1\n\nExplanation: [1,3] can be removed and the rest of intervals are non-overlapping.\nExample 2:\nInput: [ [1,2], [1,2], [1,2] ]\n\nOutput: 2\n\nExplanation: You need to remove two [1,2] to make the rest of intervals non-overlapping.\nExample 3:\nInput: [ [1,2], [2,3] ]\n\nOutput: 0\n\nExplanation: You don\'t need to remove any of the intervals since they\'re already non-overlapping.
 * <p>
 * 中文
 * 序号: 435
 * 标题： 无重叠区间
 * 链接： https://leetcode-cn.com/problems/non-overlapping-intervals
 * 描述： 给定一个区间的集合，找到需要移除区间的最小数量，使剩余区间互不重叠。\n注意:\n可以认为区间的终点总是大于它的起点。\n区间 [1,2] 和 [2,3] 的边界相互“接触”，但没有相互重叠。\n示例 1:\n输入: [ [1,2], [2,3], [3,4], [1,3] ]\n\n输出: 1\n\n解释: 移除 [1,3] 后，剩下的区间没有重叠。\n示例 2:\n输入: [ [1,2], [1,2], [1,2] ]\n\n输出: 2\n\n解释: 你需要移除两个 [1,2] 来使剩下的区间没有重叠。\n示例 3:\n输入: [ [1,2], [2,3] ]\n\n输出: 0\n\n解释: 你不需要移除任何区间，因为它们已经是无重叠的了。
 * <p>
 * acceptance: 42.0%
 * difficulty: Medium
 * private: False
 */


//TODO init

/*
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class NonOverlappingIntervals {
    public int eraseOverlapIntervals(Interval[] intervals) {
        return 0;
    }

    public class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
  }
}