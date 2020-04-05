package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 207
 * title: Course Schedule
 * href: https://leetcode.com/problems/course-schedule
 * desc: There are a total of n courses you have to take, labeled from 0 to n-1.\nSome courses may have prerequisites, for example to take course 0 you have to first take course 1, which is expressed as a pair: [0,1]\nGiven the total number of courses and a list of prerequisite pairs, is it possible for you to finish all courses?\nExample 1:\nInput: 2, [[1,0]] \nOutput: true\nExplanation: There are a total of 2 courses to take. \n             To take course 1 you should have finished course 0. So it is possible.\nExample 2:\nInput: 2, [[1,0],[0,1]]\nOutput: false\nExplanation: There are a total of 2 courses to take. \n             To take course 1 you should have finished course 0, and to take course 0 you should\n             also have finished course 1. So it is impossible.\nNote:\nThe input prerequisites is a graph represented by a list of edges, not adjacency matrices. Read more about how a graph is represented.\nYou may assume that there are no duplicate edges in the input prerequisites.
 * <p>
 * 中文
 * 序号: 207
 * 标题： 课程表
 * 链接： https://leetcode-cn.com/problems/course-schedule
 * 描述： 现在你总共有 n 门课需要选，记为 0 到 n-1。\n在选修某些课程之前需要一些先修课程。 例如，想要学习课程 0 ，你需要先完成课程 1 ，我们用一个匹配来表示他们: [0,1]\n给定课程总量以及它们的先决条件，判断是否可能完成所有课程的学习？\n示例 1:\n输入: 2, [[1,0]] \n输出: true\n解释: 总共有 2 门课程。学习课程 1 之前，你需要完成课程 0。所以这是可能的。\n示例 2:\n输入: 2, [[1,0],[0,1]]\n输出: false\n解释: 总共有 2 门课程。学习课程 1 之前，你需要先完成课程 0；并且学习课程 0 之前，你还应先完成课程 1。这是不可能的。\n说明:\n输入的先决条件是由边缘列表表示的图形，而不是邻接矩阵。详情请参见图的表示法。\n你可以假定输入的先决条件中没有重复的边。\n提示:\n这个问题相当于查找一个循环是否存在于有向图中。如果存在循环，则不存在拓扑排序，因此不可能选取所有课程进行学习。\n通过 DFS 进行拓扑排序 - 一个关于Coursera的精彩视频教程（21分钟），介绍拓扑排序的基本概念。\n拓扑排序也可以通过 BFS 完成。
 * <p>
 * acceptance: 40.3%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        return false;
    }
}