package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 861
 * title: Score After Flipping Matrix
 * href: https://leetcode.com/problems/score-after-flipping-matrix
 * desc: We have a two dimensional matrix A where each value is 0 or 1.
 * A move consists of choosing any row or column, and toggling each value in that row or column: changing all 0s to 1s, and all 1s to 0s.
 * After making any number of moves, every row of this matrix is interpreted as a binary number, and the score of the matrix is the sum of these numbers.
 * Return the highest possible score.
 * Example 1:
 * Input: [[0,0,1,1],[1,0,1,0],[1,1,0,0]]
 * Output: 39
 * Explanation:
 * Toggled to [[1,1,1,1],[1,0,0,1],[1,1,1,1]].
 * 0b1111 + 0b1001 + 0b1111 = 15 + 9 + 15 = 39
 * Note:
 * 1 <= A.length <= 20
 * 1 <= A[0].length <= 20
 * A[i][j] is 0 or 1.
 * <p>
 * 中文
 * 序号: 861
 * 标题： 翻转矩阵后的得分
 * 链接： https://leetcode-cn.com/problems/score-after-flipping-matrix
 * 描述： 有一个二维矩阵 A 其中每个元素的值为 0 或 1 。\n移动是指选择任一行或列，并转换该行或列中的每一个值：将所有 0 都更改为 1，将所有 1 都更改为 0。\n在做出任意次数的移动后，将该矩阵的每一行都按照二进制数来解释，矩阵的得分就是这些数字的总和。\n返回尽可能高的分数。\n  示例：\n输入：[[0,0,1,1],[1,0,1,0],[1,1,0,0]]\n输出：39\n解释：\n转换为 [[1,1,1,1],[1,0,0,1],[1,1,1,1]]\n0b1111 + 0b1001 + 0b1111 = 15 + 9 + 15 = 39\n  提示：\n1 <= A.length <= 20\n1 <= A[0].length <= 20\nA[i][j] 是 0 或 1
 * <p>
 * acceptance: 71.1%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class ScoreAfterFlippingMatrix {
    public int matrixScore(int[][] A) {
        return 0;
    }
}