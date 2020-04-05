package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 1020
 * title: Number of Enclaves
 * href: https://leetcode.com/problems/number-of-enclaves
 * desc: Given a 2D array A, each cell is 0 (representing sea) or 1 (representing land)
 * A move consists of walking from one land square 4-directionally to another land square, or off the boundary of the grid.
 * Return the number of land squares in the grid for which we cannot walk off the boundary of the grid in any number of moves.
 * Example 1:
 * Input: [[0,0,0,0],[1,0,1,0],[0,1,1,0],[0,0,0,0]]
 * Output: 3
 * Explanation:
 * There are three 1s that are enclosed by 0s, and one 1 that isn't enclosed because its on the boundary.
 * Example 2:
 * Input: [[0,1,1,0],[0,0,1,0],[0,0,1,0],[0,0,0,0]]
 * Output: 0
 * Explanation:
 * All 1s are either on the boundary or can reach the boundary.
 * Note:
 * 1 <= A.length <= 500
 * 1 <= A[i].length <= 500
 * 0 <= A[i][j] <= 1
 * All rows have the same size.
 * <p>
 * 中文
 * 序号: 1020
 * 标题： 飞地的数量
 * 链接： https://leetcode-cn.com/problems/number-of-enclaves
 * 描述： 给出一个二维数组 A，每个单元格为 0（代表海）或 1（代表陆地）。
 * 移动是指在陆地上从一个地方走到另一个地方（朝四个方向之一）或离开网格的边界。
 * 返回网格中无法在任意次数的移动中离开网格边界的陆地单元格的数量。
 * 示例 1：
 * 输入：[[0,0,0,0],[1,0,1,0],[0,1,1,0],[0,0,0,0]]
 * 输出：3
 * 解释：
 * 有三个 1 被 0 包围。一个 1 没有被包围，因为它在边界上。
 * 示例 2：
 * 输入：[[0,1,1,0],[0,0,1,0],[0,0,1,0],[0,0,0,0]]
 * 输出：0
 * 解释：
 * 所有 1 都在边界上或可以到达边界。
 * 提示：
 * 1 <= A.length <= 500
 * 1 <= A[i].length <= 500
 * 0 <= A[i][j] <= 1
 * 所有行的大小都相同
 * <p>
 * acceptance: 55.5%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class NumberOfEnclaves {
    public int numEnclaves(int[][] A) {
        return 0;
    }
}