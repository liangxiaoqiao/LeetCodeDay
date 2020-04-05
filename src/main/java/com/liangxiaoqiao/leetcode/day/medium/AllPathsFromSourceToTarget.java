package com.liangxiaoqiao.leetcode.day.medium;


import java.util.List;
    
/*
 * English
 * id: 797
 * title: All Paths From Source to Target
 * href: https://leetcode.com/problems/all-paths-from-source-to-target
 * desc: Given a directed, acyclic graph of N nodes.  Find all possible paths from node 0 to node N-1, and return them in any order.\nThe graph is given as follows:  the nodes are 0, 1, ..., graph.length - 1.  graph[i] is a list of all nodes j for which the edge (i, j) exists.\nExample:\nInput: [[1,2], [3], [3], []] \nOutput: [[0,1,3],[0,2,3]] \nExplanation: The graph looks like this:\n0--->1\n|    |\nv    v\n2--->3\nThere are two paths: 0 -> 1 -> 3 and 0 -> 2 -> 3.\nNote:\nThe number of nodes in the graph will be in the range [2, 15].\nYou can print different paths in any order, but you should keep the order of nodes inside one path.
 * <p>
 * 中文
 * 序号: 797
 * 标题： 所有可能的路径
 * 链接： https://leetcode-cn.com/problems/all-paths-from-source-to-target
 * 描述： 给一个有 n 个结点的有向无环图，找到所有从 0 到 n-1 的路径并输出（不要求按顺序）\n二维数组的第 i 个数组中的单元都表示有向图中 i 号结点所能到达的下一些结点（译者注：有向图是有方向的，即规定了a→b你就不能从b→a）空就是没有下一个结点了。\n示例:\n输入: [[1,2], [3], [3], []] \n输出: [[0,1,3],[0,2,3]] \n解释: 图是这样的:\n0--->1\n|    |\nv    v\n2--->3\n这有两条路: 0 -> 1 -> 3 和 0 -> 2 -> 3.\n提示:\n结点的数量会在范围 [2, 15] 内。\n你可以把路径以任意顺序输出，但在路径内的结点的顺序必须保证。
 * <p>
 * acceptance: 72.7%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class AllPathsFromSourceToTarget {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        return null;
    }
}

