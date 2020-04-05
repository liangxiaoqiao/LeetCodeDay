package com.liangxiaoqiao.leetcode.day.hard;


import java.util.List;
    

/*
 * English
 * id: 1203
 * title: Sort Items by Groups Respecting Dependencies
 * href: https://leetcode.com/problems/sort-items-by-groups-respecting-dependencies
 * desc: There are n items each belonging to zero or one of m groups where group[i] is the group that the i-th item belongs to and it's equal to -1 if the i-th item belongs to no group. The items and the groups are zero indexed. A group can have no item belonging to it.
 * Return a sorted list of the items such that:
 * The items that belong to the same group are next to each other in the sorted list.
 * There are some relations between these items where beforeItems[i] is a list containing all the items that should come before the i-th item in the sorted array (to the left of the i-th item).
 * Return any solution if there is more than one solution and return an empty list if there is no solution.
 * Example 1:
 * Input: n = 8, m = 2, group = [-1,-1,1,0,0,1,0,-1], beforeItems = [[],[6],[5],[6],[3,6],[],[],[]]
 * Output: [6,3,4,1,5,2,0,7]
 * Example 2:
 * Input: n = 8, m = 2, group = [-1,-1,1,0,0,1,0,-1], beforeItems = [[],[6],[5],[6],[3],[],[4],[]]
 * Output: []
 * Explanation: This is the same as example 1 except that 4 needs to be before 6 in the sorted list.
 * Constraints:
 * 1 <= m <= n <= 3*10^4
 * group.length == beforeItems.length == n
 * -1 <= group[i] <= m-1
 * 0 <= beforeItems[i].length <= n-1
 * 0 <= beforeItems[i][j] <= n-1
 * i != beforeItems[i][j]
 * beforeItems[i] does not contain duplicates elements.
 * <p>
 * 中文
 * 序号: 1203
 * 标题： 项目管理
 * 链接： https://leetcode-cn.com/problems/sort-items-by-groups-respecting-dependencies
 * 描述： 公司共有 n 个项目和  m 个小组，每个项目要不没有归属，要不就由其中的一个小组负责。
 * 我们用 group[i] 代表第 i 个项目所属的小组，如果这个项目目前无人接手，那么 group[i] 就等于 -1。（项目和小组都是从零开始编号的）
 * 请你帮忙按要求安排这些项目的进度，并返回排序后的项目列表：
 * 同一小组的项目，排序后在列表中彼此相邻。
 * 项目之间存在一定的依赖关系，我们用一个列表 beforeItems 来表示，其中 beforeItems[i] 表示在进行第 i 个项目前（位于第 i 个项目左侧）应该完成的所有项目。
 * 结果要求：
 * 如果存在多个解决方案，只需要返回其中任意一个即可。
 * 如果没有合适的解决方案，就请返回一个 空列表。
 * 示例 1：
 * 输入：n = 8, m = 2, group = [-1,-1,1,0,0,1,0,-1], beforeItems = [[],[6],[5],[6],[3,6],[],[],[]]
 * 输出：[6,3,4,1,5,2,0,7]
 * 示例 2：
 * 输入：n = 8, m = 2, group = [-1,-1,1,0,0,1,0,-1], beforeItems = [[],[6],[5],[6],[3],[],[4],[]]
 * 输出：[]
 * 解释：与示例 1 大致相同，但是在排序后的列表中，4 必须放在 6 的前面。
 * 提示：
 * 1 <= m <= n <= 3*10^4
 * group.length == beforeItems.length == n
 * -1 <= group[i] <= m-1
 * 0 <= beforeItems[i].length <= n-1
 * 0 <= beforeItems[i][j] <= n-1
 * i != beforeItems[i][j]
 * <p>
 * acceptance: 45.2%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class SortItemsByGroupsRespectingDependencies {
    public int[] sortItems(int n, int m, int[] group, List<List<Integer>> beforeItems) {
        return null;
    }
}