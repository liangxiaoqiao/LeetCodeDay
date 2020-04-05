package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 882
 * title: Reachable Nodes In Subdivided Graph
 * href: https://leetcode.com/problems/reachable-nodes-in-subdivided-graph
 * desc: Starting with an undirected graph (the \"original graph\") with nodes from 0 to N-1, subdivisions are made to some of the edges.\nThe graph is given as follows: edges[k] is a list of integer pairs (i, j, n) such that (i, j) is an edge of the original graph,\nand n is the total number of new nodes on that edge. \nThen, the edge (i, j) is deleted from the original graph, n new nodes (x_1, x_2, ..., x_n) are added to the original graph,\nand n+1 new edges (i, x_1), (x_1, x_2), (x_2, x_3), ..., (x_{n-1}, x_n), (x_n, j) are added to the original graph.\nNow, you start at node 0 from the original graph, and in each move, you travel along one edge. \nReturn how many nodes you can reach in at most M moves.\n  Example 1:\nInput: edges = [[0,1,10],[0,2,1],[1,2,2]], M = 6, N = 3\nOutput: 13\nExplanation: \nThe nodes that are reachable in the final graph after M = 6 moves are indicated below.\nExample 2:\nInput: edges = [[0,1,4],[1,2,6],[0,2,8],[1,3,1]], M = 10, N = 4\nOutput: 23\n  Note:\n0 <= edges.length <= 10000\n0 <= edges[i][0] < edges[i][1] < N\nThere does not exist any i != j for which edges[i][0] == edges[j][0] and edges[i][1] == edges[j][1].\nThe original graph has no parallel edges.\n0 <= edges[i][2] <= 10000\n0 <= M <= 10^9\n1 <= N <= 3000\nA reachable node is a node that can be travelled to using at most M moves starting from node 0.\n
 * <p>
 * 中文
 * 序号: 882
 * 标题： 细分图中的可到达结点
 * 链接： https://leetcode-cn.com/problems/reachable-nodes-in-subdivided-graph
 * 描述： 从具有 0 到 N-1 的结点的无向图（“原始图”）开始，对一些边进行细分。\n该图给出如下：edges[k] 是整数对 (i, j, n) 组成的列表，使 (i, j) 是原始图的边。\nn 是该边上新结点的总数\n然后，将边 (i, j) 从原始图中删除，将 n 个新结点 (x_1, x_2, ..., x_n) 添加到原始图中，\n将 n+1 条新边 (i, x_1), (x_1, x_2), (x_2, x_3), ..., (x_{n-1}, x_n), (x_n, j) 添加到原始图中。\n现在，你将从原始图中的结点 0 处出发，并且每次移动，你都将沿着一条边行进。\n返回最多 M 次移动可以达到的结点数。\n  示例 1：\n输入：edges = [[0,1,10],[0,2,1],[1,2,2]], M = 6, N = 3\n输出：13\n解释：\n在 M = 6 次移动之后在最终图中可到达的结点如下所示。\n示例 2：\n输入：edges = [[0,1,4],[1,2,6],[0,2,8],[1,3,1]], M = 10, N = 4\n输出：23\n  提示：\n0 <= edges.length <= 10000\n0 <= edges[i][0] < edges[i][1] < N\n不存在任何 i != j 情况下 edges[i][0] == edges[j][0] 且 edges[i][1] == edges[j][1].\n原始图没有平行的边。\n0 <= edges[i][2] <= 10000\n0 <= M <= 10^9\n1 <= N <= 3000\n
 * <p>
 * acceptance: 39.3%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class ReachableNodesInSubdividedGraph {
    public int reachableNodes(int[][] edges, int M, int N) {
        return 0;
    }
}