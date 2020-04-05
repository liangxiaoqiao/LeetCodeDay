package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 684
 * title: Redundant Connection
 * href: https://leetcode.com/problems/redundant-connection
 * desc: In this problem, a tree is an undirected graph that is connected and has no cycles.\nThe given input is a graph that started as a tree with N nodes (with distinct values 1, 2, ..., N), with one additional edge added. The added edge has two different vertices chosen from 1 to N, and was not an edge that already existed.\nThe resulting graph is given as a 2D-array of edges. Each element of edges is a pair [u, v] with u < v, that represents an undirected edge connecting nodes u and v.\nReturn an edge that can be removed so that the resulting graph is a tree of N nodes. If there are multiple answers, return the answer that occurs last in the given 2D-array. The answer edge [u, v] should be in the same format, with u < v.\nExample 1:\nInput: [[1,2], [1,3], [2,3]]\nOutput: [2,3]\nExplanation: The given undirected graph will be like this:\n  1\n / \\\n2 - 3\nExample 2:\nInput: [[1,2], [2,3], [3,4], [1,4], [1,5]]\nOutput: [1,4]\nExplanation: The given undirected graph will be like this:\n5 - 1 - 2\n    |   |\n    4 - 3\nNote:\nThe size of the input 2D-array will be between 3 and 1000.\nEvery integer represented in the 2D-array will be between 1 and N, where N is the size of the input array.\n\nUpdate (2017-09-26):\nWe have overhauled the problem description + test cases and specified clearly the graph is an undirected graph. For the directed graph follow up please see Redundant Connection II). We apologize for any inconvenience caused.
 * <p>
 * 中文
 * 序号: 684
 * 标题： 冗余连接
 * 链接： https://leetcode-cn.com/problems/redundant-connection
 * 描述： 在本问题中, 树指的是一个连通且无环的无向图。\n输入一个图，该图由一个有着N个节点 (节点值不重复1, 2, ..., N) 的树及一条附加的边构成。附加的边的两个顶点包含在1到N中间，这条附加的边不属于树中已存在的边。\n结果图是一个以边组成的二维数组。每一个边的元素是一对[u, v] ，满足 u < v，表示连接顶点u 和v的无向图的边。\n返回一条可以删去的边，使得结果图是一个有着N个节点的树。如果有多个答案，则返回二维数组中最后出现的边。答案边 [u, v] 应满足相同的格式 u < v。\n示例 1：\n输入: [[1,2], [1,3], [2,3]]\n输出: [2,3]\n解释: 给定的无向图为:\n  1\n / \\\n2 - 3\n示例 2：\n输入: [[1,2], [2,3], [3,4], [1,4], [1,5]]\n输出: [1,4]\n解释: 给定的无向图为:\n5 - 1 - 2\n    |   |\n    4 - 3\n注意:\n输入的二维数组大小在 3 到 1000。\n二维数组中的整数在1到N之间，其中N是输入数组的大小。\n更新(2017-09-26):\n我们已经重新检查了问题描述及测试用例，明确图是无向 图。对于有向图详见冗余连接II。对于造成任何不便，我们深感歉意。
 * <p>
 * acceptance: 54.8%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class RedundantConnection {
    public int[] findRedundantConnection(int[][] edges) {
        return null;
    }
}