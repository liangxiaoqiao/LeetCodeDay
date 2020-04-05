package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 566
 * title: Reshape the Matrix
 * href: https://leetcode.com/problems/reshape-the-matrix
 * desc: In MATLAB, there is a very useful function called \'reshape\', which can reshape a matrix into a new one with different size but keep its original data.\nYou\'re given a matrix represented by a two-dimensional array, and two positive integers r and c representing the row number and column number of the wanted reshaped matrix, respectively.\nThe reshaped matrix need to be filled with all the elements of the original matrix in the same row-traversing order as they were.\nIf the \'reshape\' operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.\nExample 1:\nInput: \nnums = \n[[1,2],\n [3,4]]\nr = 1, c = 4\nOutput: \n[[1,2,3,4]]\nExplanation:\nThe row-traversing of nums is [1,2,3,4]. The new reshaped matrix is a 1 * 4 matrix, fill it row by row by using the previous list.\nExample 2:\nInput: \nnums = \n[[1,2],\n [3,4]]\nr = 2, c = 4\nOutput: \n[[1,2],\n [3,4]]\nExplanation:\nThere is no way to reshape a 2 * 2 matrix to a 2 * 4 matrix. So output the original matrix.\nNote:\nThe height and width of the given matrix is in range [1, 100].\nThe given r and c are all positive.
 * <p>
 * 中文
 * 序号: 566
 * 标题： 重塑矩阵
 * 链接： https://leetcode-cn.com/problems/reshape-the-matrix
 * 描述： 在MATLAB中，有一个非常有用的函数 reshape，它可以将一个矩阵重塑为另一个大小不同的新矩阵，但保留其原始数据。\n给出一个由二维数组表示的矩阵，以及两个正整数r和c，分别表示想要的重构的矩阵的行数和列数。\n重构后的矩阵需要将原始矩阵的所有元素以相同的行遍历顺序填充。\n如果具有给定参数的reshape操作是可行且合理的，则输出新的重塑矩阵；否则，输出原始矩阵。\n示例 1:\n输入: \nnums = \n[[1,2],\n [3,4]]\nr = 1, c = 4\n输出: \n[[1,2,3,4]]\n解释:\n行遍历nums的结果是 [1,2,3,4]。新的矩阵是 1 * 4 矩阵, 用之前的元素值一行一行填充新矩阵。\n示例 2:\n输入: \nnums = \n[[1,2],\n [3,4]]\nr = 2, c = 4\n输出: \n[[1,2],\n [3,4]]\n解释:\n没有办法将 2 * 2 矩阵转化为 2 * 4 矩阵。 所以输出原矩阵。\n注意：\n给定矩阵的宽和高范围在 [1, 100]。\n给定的 r 和 c 都是正数。
 * <p>
 * acceptance: 59.7%
 * difficulty: Easy
 * private: False
 */


//TODO init
public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        return null;
    }
}