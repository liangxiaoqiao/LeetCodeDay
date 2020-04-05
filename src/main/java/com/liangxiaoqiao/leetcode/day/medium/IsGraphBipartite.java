package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 785
 * title: Is Graph Bipartite?
 * href: https://leetcode.com/problems/is-graph-bipartite
 * desc: Given an undirected graph, return true if and only if it is bipartite.\nRecall that a graph is bipartite if we can split it\'s set of nodes into two independent subsets A and B such that every edge in the graph has one node in A and another node in B.\nThe graph is given in the following form: graph[i] is a list of indexes j for which the edge between nodes i and j exists.  Each node is an integer between 0 and graph.length - 1.  There are no self edges or parallel edges: graph[i] does not contain i, and it doesn\'t contain any element twice.\nExample 1:\nInput: [[1,3], [0,2], [1,3], [0,2]]\nOutput: true\nExplanation: \nThe graph looks like this:\n0----1\n|    |\n|    |\n3----2\nWe can divide the vertices into two groups: {0, 2} and {1, 3}.\nExample 2:\nInput: [[1,2,3], [0,2], [0,1,3], [0,2]]\nOutput: false\nExplanation: \nThe graph looks like this:\n0----1\n| \\  |\n|  \\ |\n3----2\nWe cannot find a way to divide the set of nodes into two independent subsets.\n  Note:\ngraph will have length in range [1, 100].\ngraph[i] will contain integers in range [0, graph.length - 1].\ngraph[i] will not contain i or duplicate values.\nThe graph is undirected: if any element j is in graph[i], then i will be in graph[j].
 * <p>
 * 中文
 * 序号: 785
 * 标题： 判断二分图
 * 链接： https://leetcode-cn.com/problems/is-graph-bipartite
 * 描述： 给定一个无向图graph，当这个图为二分图时返回true。\n如果我们能将一个图的节点集合分割成两个独立的子集A和B，并使图中的每一条边的两个节点一个来自A集合，一个来自B集合，我们就将这个图称为二分图。\ngraph将会以邻接表方式给出，graph[i]表示图中与节点i相连的所有节点。每个节点都是一个在0到graph.length-1之间的整数。这图中没有自环和平行边： graph[i] 中不存在i，并且graph[i]中没有重复的值。\n示例 1:\n输入: [[1,3], [0,2], [1,3], [0,2]]\n输出: true\n解释: \n无向图如下:\n0----1\n|    |\n|    |\n3----2\n我们可以将节点分成两组: {0, 2} 和 {1, 3}。\n示例 2:\n输入: [[1,2,3], [0,2], [0,1,3], [0,2]]\n输出: false\n解释: \n无向图如下:\n0----1\n| \\  |\n|  \\ |\n3----2\n我们不能将节点分割成两个独立的子集。\n注意:\ngraph 的长度范围为 [1, 100]。\ngraph[i] 中的元素的范围为 [0, graph.length - 1]。\ngraph[i] 不会包含 i 或者有重复的值。\n图是无向的: 如果j 在 graph[i]里边, 那么 i 也会在 graph[j]里边。
 * <p>
 * acceptance: 45.6%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class IsGraphBipartite {
    public boolean isBipartite(int[][] graph) {
        return false;
    }
}