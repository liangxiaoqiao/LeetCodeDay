package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 834
 * title: Sum of Distances in Tree
 * href: https://leetcode.com/problems/sum-of-distances-in-tree
 * desc: An undirected, connected tree with N nodes labelled 0...N-1 and N-1 edges are given.\nThe ith edge connects nodes edges[i][0] and edges[i][1] together.\nReturn a list ans, where ans[i] is the sum of the distances between node i and all other nodes.\nExample 1:\nInput: N = 6, edges = [[0,1],[0,2],[2,3],[2,4],[2,5]]\nOutput: [8,12,6,10,10,10]\nExplanation: \nHere is a diagram of the given tree:\n  0\n / \\\n1   2\n   /|\\\n  3 4 5\nWe can see that dist(0,1) + dist(0,2) + dist(0,3) + dist(0,4) + dist(0,5)\nequals 1 + 1 + 2 + 2 + 2 = 8.  Hence, answer[0] = 8, and so on.\nNote: 1 <= N <= 10000
 * <p>
 * 中文
 * 序号: 834
 * 标题： 树中距离之和
 * 链接： https://leetcode-cn.com/problems/sum-of-distances-in-tree
 * 描述： 给定一个无向、连通的树。树中有 N 个标记为 0...N-1 的节点以及 N-1 条边 。\n第 i 条边连接节点 edges[i][0] 和 edges[i][1] 。\n返回一个表示节点 i 与其他所有节点距离之和的列表 ans。\n示例 1:\n输入: N = 6, edges = [[0,1],[0,2],[2,3],[2,4],[2,5]]\n输出: [8,12,6,10,10,10]\n解释: \n如下为给定的树的示意图：\n  0\n / \\\n1   2\n   /|\\\n  3 4 5\n\n我们可以计算出 dist(0,1) + dist(0,2) + dist(0,3) + dist(0,4) + dist(0,5) \n也就是 1 + 1 + 2 + 2 + 2 = 8。 因此，answer[0] = 8，以此类推。\n说明: 1 <= N <= 10000
 * <p>
 * acceptance: 42.0%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class SumOfDistancesInTree {
    public int[] sumOfDistancesInTree(int N, int[][] edges) {
        return null;
    }
}