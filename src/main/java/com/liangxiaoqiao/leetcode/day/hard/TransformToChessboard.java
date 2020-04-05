package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 782
 * title: Transform to Chessboard
 * href: https://leetcode.com/problems/transform-to-chessboard
 * desc: An N x N board contains only 0s and 1s. In each move, you can swap any 2 rows with each other, or any 2 columns with each other.\nWhat is the minimum number of moves to transform the board into a \"chessboard\" - a board where no 0s and no 1s are 4-directionally adjacent? If the task is impossible, return -1.\nExamples:\nInput: board = [[0,1,1,0],[0,1,1,0],[1,0,0,1],[1,0,0,1]]\nOutput: 2\nExplanation:\nOne potential sequence of moves is shown below, from left to right:\n\n0110     1010     1010\n0110 --> 1010 --> 0101\n1001     0101     1010\n1001     0101     0101\n\nThe first move swaps the first and second column.\nThe second move swaps the second and third row.\n\n\nInput: board = [[0, 1], [1, 0]]\nOutput: 0\nExplanation:\nAlso note that the board with 0 in the top left corner,\n01\n10\n\nis also a valid chessboard.\n\nInput: board = [[1, 0], [1, 0]]\nOutput: -1\nExplanation:\nNo matter what sequence of moves you make, you cannot end with a valid chessboard.\nNote:\nboard will have the same number of rows and columns, a number in the range [2, 30].\nboard[i][j] will be only 0s or 1s.
 * <p>
 * 中文
 * 序号: 782
 * 标题： 变为棋盘
 * 链接： https://leetcode-cn.com/problems/transform-to-chessboard
 * 描述： 一个 N x N的 board 仅由 0 和 1 组成 。每次移动，你能任意交换两列或是两行的位置。\n输出将这个矩阵变为 “棋盘” 所需的最小移动次数。“棋盘” 是指任意一格的上下左右四个方向的值均与本身不同的矩阵。如果不存在可行的变换，输出 -1。\n示例:\n输入: board = [[0,1,1,0],[0,1,1,0],[1,0,0,1],[1,0,0,1]]\n输出: 2\n解释:\n一种可行的变换方式如下，从左到右：\n\n0110     1010     1010\n0110 --> 1010 --> 0101\n1001     0101     1010\n1001     0101     0101\n\n第一次移动交换了第一列和第二列。\n第二次移动交换了第二行和第三行。\n\n\n输入: board = [[0, 1], [1, 0]]\n输出: 0\n解释:\n注意左上角的格值为0时也是合法的棋盘，如：\n\n01\n10\n\n也是合法的棋盘.\n\n输入: board = [[1, 0], [1, 0]]\n输出: -1\n解释:\n任意的变换都不能使这个输入变为合法的棋盘。\n  提示：\nboard 是方阵，且行列数的范围是[2, 30]。\nboard[i][j] 将只包含 0或 1。
 * <p>
 * acceptance: 40.7%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class TransformToChessboard {
    public int movesToChessboard(int[][] board) {
        return 0;
    }
}