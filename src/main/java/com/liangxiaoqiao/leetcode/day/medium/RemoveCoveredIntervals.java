package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 1288
 * title: Remove Covered Intervals
 * href: https://leetcode.com/problems/remove-covered-intervals
 * desc: Given a list of intervals, remove all intervals that are covered by another interval in the list. Interval [a,b) is covered by interval [c,d) if and only if c <= a and b <= d.
 * After doing so, return the number of remaining intervals.
 * Example 1:
 * Input: intervals = [[1,4],[3,6],[2,8]]
 * Output: 2
 * Explanation: Interval [3,6] is covered by [2,8], therefore it is removed.
 * Constraints:
 * 1 <= intervals.length <= 1000
 * 0 <= intervals[i][0] < intervals[i][1] <= 10^5
 * intervals[i] != intervals[j] for all i != j
 * <p>
 * 中文
 * 序号: 1288
 * 标题： 删除被覆盖区间
 * 链接： https://leetcode-cn.com/problems/remove-covered-intervals
 * 描述： 给你一个区间列表，请你删除列表中被其他区间所覆盖的区间。
 * 只有当 c <= a 且 b <= d 时，我们才认为区间 [a,b) 被区间 [c,d) 覆盖。
 * 在完成所有删除操作后，请你返回列表中剩余区间的数目。
 * 示例：
 * 输入：intervals = [[1,4],[3,6],[2,8]]
 * 输出：2
 * 解释：区间 [3,6] 被区间 [2,8] 覆盖，所以它被删除了。
 * 提示：
 * 1 <= intervals.length <= 1000
 * 0 <= intervals[i][0] < intervals[i][1] <= 10^5
 * 对于所有的 i != j：intervals[i] != intervals[j]
 * <p>
 * acceptance: 59.8%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class RemoveCoveredIntervals {
    public int removeCoveredIntervals(int[][] intervals) {
        return 0;
    }
}