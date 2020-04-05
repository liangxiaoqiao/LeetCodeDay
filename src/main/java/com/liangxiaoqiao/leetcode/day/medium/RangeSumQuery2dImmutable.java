package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 304
 * title: Range Sum Query 2D - Immutable
 * href: https://leetcode.com/problems/range-sum-query-2d-immutable
 * desc: Given a 2D matrix matrix, find the sum of the elements inside the rectangle defined by its upper left corner (row1, col1) and lower right corner (row2, col2).\n\nThe above rectangle (with the red border) is defined by (row1, col1) = (2, 1) and (row2, col2) = (4, 3), which contains sum = 8.\nExample:\nGiven matrix = [\n  [3, 0, 1, 4, 2],\n  [5, 6, 3, 2, 1],\n  [1, 2, 0, 1, 5],\n  [4, 1, 0, 1, 7],\n  [1, 0, 3, 0, 5]\n]\n\nsumRegion(2, 1, 4, 3) -> 8\nsumRegion(1, 1, 2, 2) -> 11\nsumRegion(1, 2, 2, 4) -> 12\nNote:\nYou may assume that the matrix does not change.\nThere are many calls to sumRegion function.\nYou may assume that row1 ≤ row2 and col1 ≤ col2.
 * <p>
 * 中文
 * 序号: 304
 * 标题： 二维区域和检索 - 矩阵不可变
 * 链接： https://leetcode-cn.com/problems/range-sum-query-2d-immutable
 * 描述： 给定一个二维矩阵，计算其子矩形范围内元素的总和，该子矩阵的左上角为 (row1, col1) ，右下角为 (row2, col2)。\n\n上图子矩阵左上角 (row1, col1) = (2, 1) ，右下角(row2, col2) = (4, 3)，该子矩形内元素的总和为 8。\n示例:\n给定 matrix = [\n  [3, 0, 1, 4, 2],\n  [5, 6, 3, 2, 1],\n  [1, 2, 0, 1, 5],\n  [4, 1, 0, 1, 7],\n  [1, 0, 3, 0, 5]\n]\n\nsumRegion(2, 1, 4, 3) -> 8\nsumRegion(1, 1, 2, 2) -> 11\nsumRegion(1, 2, 2, 4) -> 12\n说明:\n你可以假设矩阵不可变。\n会多次调用 sumRegion 方法。\n你可以假设 row1 ≤ row2 且 col1 ≤ col2。
 * <p>
 * acceptance: 35.5%
 * difficulty: Medium
 * private: False
 */


//TODO init
class NumMatrix {
    public NumMatrix(int[][] matrix) {

    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return 0;
    }
}

/*
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
