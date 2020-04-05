package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 1072
 * title: Flip Columns For Maximum Number of Equal Rows
 * href: https://leetcode.com/problems/flip-columns-for-maximum-number-of-equal-rows
 * desc: Given a matrix consisting of 0s and 1s, we may choose any number of columns in the matrix and flip every cell in that column.  Flipping a cell changes the value of that cell from 0 to 1 or from 1 to 0.
 * Return the maximum number of rows that have all values equal after some number of flips.
 * Example 1:
 * Input: [[0,1],[1,1]]
 * Output: 1
 * Explanation: After flipping no values, 1 row has all values equal.
 * Example 2:
 * Input: [[0,1],[1,0]]
 * Output: 2
 * Explanation: After flipping values in the first column, both rows have equal values.
 * Example 3:
 * Input: [[0,0,0],[0,0,1],[1,1,0]]
 * Output: 2
 * Explanation: After flipping values in the first two columns, the last two rows have equal values.
 * Note:
 * 1 <= matrix.length <= 300
 * 1 <= matrix[i].length <= 300
 * All matrix[i].length's are equal
 * matrix[i][j] is 0 or 1
 * <p>
 * 中文
 * 序号: 1072
 * 标题： 按列翻转得到最大值等行数
 * 链接： https://leetcode-cn.com/problems/flip-columns-for-maximum-number-of-equal-rows
 * 描述： 给定由若干 0 和 1 组成的矩阵 matrix，从中选出任意数量的列并翻转其上的 每个 单元格。翻转后，单元格的值从 0 变成 1，或者从 1 变为 0 。
 * 返回经过一些翻转后，行上所有值都相等的最大行数。
 * 示例 1：
 * 输入：[[0,1],[1,1]]
 * 输出：1
 * 解释：不进行翻转，有 1 行所有值都相等。
 * 示例 2：
 * 输入：[[0,1],[1,0]]
 * 输出：2
 * 解释：翻转第一列的值之后，这两行都由相等的值组成。
 * 示例 3：
 * 输入：[[0,0,0],[0,0,1],[1,1,0]]
 * 输出：2
 * 解释：翻转前两列的值之后，后两行由相等的值组成。
 * 提示：
 * 1 <= matrix.length <= 300
 * 1 <= matrix[i].length <= 300
 * 所有 matrix[i].length 都相等
 * matrix[i][j] 为 0 或 1
 * <p>
 * acceptance: 59.7%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class FlipColumnsForMaximumNumberOfEqualRows {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        return 0;
    }
}