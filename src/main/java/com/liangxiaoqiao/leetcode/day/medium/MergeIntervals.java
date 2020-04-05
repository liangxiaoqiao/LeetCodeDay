package com.liangxiaoqiao.leetcode.day.medium;
import java.util.List;

/*
 * English
 * id: 56
 * title: Merge Intervals
 * href: https://leetcode.com/problems/merge-intervals
 * desc: Given a collection of intervals, merge all overlapping intervals.\nExample 1:\nInput: [[1,3],[2,6],[8,10],[15,18]]\nOutput: [[1,6],[8,10],[15,18]]\nExplanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].\nExample 2:\nInput: [[1,4],[4,5]]\nOutput: [[1,5]]\nExplanation: Intervals [1,4] and [4,5] are considered overlapping.
 * <p>
 * 中文
 * 序号: 56
 * 标题： 合并区间
 * 链接： https://leetcode-cn.com/problems/merge-intervals
 * 描述： 给出一个区间的集合，请合并所有重叠的区间。
 * 示例 1:
 * 输入: [[1,3],[2,6],[8,10],[15,18]]
 * 输出: [[1,6],[8,10],[15,18]]
 * 解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 * 示例 2:
 * 输入: [[1,4],[4,5]]
 * 输出: [[1,5]]
 * 解释: 区间 [1,4] 和 [4,5] 可被视为重叠区间。
 * <p>
 * acceptance: 37.5%
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
public class MergeIntervals {
    public List<Interval> merge(List<Interval> intervals) {
        return null;
    }

    public class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }
}

