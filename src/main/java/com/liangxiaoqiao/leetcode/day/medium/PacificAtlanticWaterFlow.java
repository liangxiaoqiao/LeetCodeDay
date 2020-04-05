package com.liangxiaoqiao.leetcode.day.medium;


import java.util.List;
    
/*
 * English
 * id: 417
 * title: Pacific Atlantic Water Flow
 * href: https://leetcode.com/problems/pacific-atlantic-water-flow
 * desc: Given an m x n matrix of non-negative integers representing the height of each unit cell in a continent, the \"Pacific ocean\" touches the left and top edges of the matrix and the \"Atlantic ocean\" touches the right and bottom edges.\nWater can only flow in four directions (up, down, left, or right) from a cell to another one with height equal or lower.\nFind the list of grid coordinates where water can flow to both the Pacific and Atlantic ocean.\nNote:\nThe order of returned grid coordinates does not matter.\nBoth m and n are less than 150.\nExample:\nGiven the following 5x5 matrix:\n\n  Pacific ~   ~   ~   ~   ~ \n       ~  1   2   2   3  (5) *\n       ~  3   2   3  (4) (4) *\n       ~  2   4  (5)  3   1  *\n       ~ (6) (7)  1   4   5  *\n       ~ (5)  1   1   2   4  *\n          *   *   *   *   * Atlantic\n\nReturn:\n\n[[0, 4], [1, 3], [1, 4], [2, 2], [3, 0], [3, 1], [4, 0]] (positions with parentheses in above matrix).
 * <p>
 * 中文
 * 序号: 417
 * 标题： 太平洋大西洋水流问题
 * 链接： https://leetcode-cn.com/problems/pacific-atlantic-water-flow
 * 描述： 给定一个 m x n 的非负整数矩阵来表示一片大陆上各个单元格的高度。“太平洋”处于大陆的左边界和上边界，而“大西洋”处于大陆的右边界和下边界。\n规定水流只能按照上、下、左、右四个方向流动，且只能从高到低或者在同等高度上流动。\n请找出那些水流既可以流动到“太平洋”，又能流动到“大西洋”的陆地单元的坐标。\n  提示：\n输出坐标的顺序不重要\nm 和 n 都小于150\n  示例：\n  给定下面的 5x5 矩阵:\n\n  太平洋 ~   ~   ~   ~   ~ \n       ~  1   2   2   3  (5) *\n       ~  3   2   3  (4) (4) *\n       ~  2   4  (5)  3   1  *\n       ~ (6) (7)  1   4   5  *\n       ~ (5)  1   1   2   4  *\n          *   *   *   *   * 大西洋\n\n返回:\n\n[[0, 4], [1, 3], [1, 4], [2, 2], [3, 0], [3, 1], [4, 0]] (上图中带括号的单元).\n
 * <p>
 * acceptance: 39.0%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class PacificAtlanticWaterFlow {
    public List<int[]> pacificAtlantic(int[][] matrix) {
        return null;
    }
}

