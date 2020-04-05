package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 827
 * title: Making A Large Island
 * href: https://leetcode.com/problems/making-a-large-island
 * desc: In a 2D grid of 0s and 1s, we change at most one 0 to a 1.\nAfter, what is the size of the largest island? (An island is a 4-directionally connected group of 1s).\nExample 1:\nInput: [[1, 0], [0, 1]]\nOutput: 3\nExplanation: Change one 0 to 1 and connect two 1s, then we get an island with area = 3.\nExample 2:\nInput: [[1, 1], [1, 0]]\nOutput: 4\nExplanation: Change the 0 to 1 and make the island bigger, only one island with area = 4.\nExample 3:\nInput: [[1, 1], [1, 1]]\nOutput: 4\nExplanation: Can\'t change any 0 to 1, only one island with area = 4.\n  Notes:\n1 <= grid.length = grid[0].length <= 50.\n0 <= grid[i][j] <= 1.\n
 * <p>
 * 中文
 * 序号: 827
 * 标题： 最大人工岛
 * 链接： https://leetcode-cn.com/problems/making-a-large-island
 * 描述： 在二维地图上， 0代表海洋， 1代表陆地，我们最多只能将一格 0 海洋变成 1变成陆地。\n进行填海之后，地图上最大的岛屿面积是多少？（上、下、左、右四个方向相连的 1 可形成岛屿）\n示例 1:\n输入: [[1, 0], [0, 1]]\n输出: 3\n解释: 将一格0变成1，最终连通两个小岛得到面积为 3 的岛屿。\n示例 2:\n输入: [[1, 1], [1, 0]]\n输出: 4\n解释: 将一格0变成1，岛屿的面积扩大为 4。\n示例 3:\n输入: [[1, 1], [1, 1]]\n输出: 4\n解释: 没有0可以让我们变成1，面积依然为 4。\n说明:\n1 <= grid.length = grid[0].length <= 50\n0 <= grid[i][j] <= 1
 * <p>
 * acceptance: 44.2%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class MakingALargeIsland {
    public int largestIsland(int[][] grid) {
        return 0;
    }
}