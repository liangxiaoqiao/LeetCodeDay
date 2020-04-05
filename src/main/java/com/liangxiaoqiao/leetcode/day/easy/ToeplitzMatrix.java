package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 766
 * title: Toeplitz Matrix
 * href: https://leetcode.com/problems/toeplitz-matrix
 * desc: A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same element.\nNow given an M x N matrix, return True if and only if the matrix is Toeplitz.\n  Example 1:\nInput:\nmatrix = [\n  [1,2,3,4],\n  [5,1,2,3],\n  [9,5,1,2]\n]\nOutput: True\nExplanation:\nIn the above grid, the diagonals are:\n\"[9]\", \"[5, 5]\", \"[1, 1, 1]\", \"[2, 2, 2]\", \"[3, 3]\", \"[4]\".\nIn each diagonal all elements are the same, so the answer is True.\nExample 2:\nInput:\nmatrix = [\n  [1,2],\n  [2,2]\n]\nOutput: False\nExplanation:\nThe diagonal \"[1, 2]\" has different elements.\n\nNote:\nmatrix will be a 2D array of integers.\nmatrix will have a number of rows and columns in range [1, 20].\nmatrix[i][j] will be integers in range [0, 99].\n\nFollow up:\nWhat if the matrix is stored on disk, and the memory is limited such that you can only load at most one row of the matrix into the memory at once?\nWhat if the matrix is so large that you can only load up a partial row into the memory at once?
 * <p>
 * 中文
 * 序号: 766
 * 标题： 托普利茨矩阵
 * 链接： https://leetcode-cn.com/problems/toeplitz-matrix
 * 描述： 如果一个矩阵的每一方向由左上到右下的对角线上具有相同元素，那么这个矩阵是托普利茨矩阵。\n给定一个 M x N 的矩阵，当且仅当它是托普利茨矩阵时返回 True。\n示例 1:\n输入: \nmatrix = [\n  [1,2,3,4],\n  [5,1,2,3],\n  [9,5,1,2]\n]\n输出: True\n解释:\n在上述矩阵中, 其对角线为:\n\"[9]\", \"[5, 5]\", \"[1, 1, 1]\", \"[2, 2, 2]\", \"[3, 3]\", \"[4]\"。\n各条对角线上的所有元素均相同, 因此答案是True。\n示例 2:\n输入:\nmatrix = [\n  [1,2],\n  [2,2]\n]\n输出: False\n解释: \n对角线\"[1, 2]\"上的元素不同。\n说明:\n matrix 是一个包含整数的二维数组。\nmatrix 的行数和列数均在 [1, 20]范围内。\nmatrix[i][j] 包含的整数在 [0, 99]范围内。\n进阶:\n如果矩阵存储在磁盘上，并且磁盘内存是有限的，因此一次最多只能将一行矩阵加载到内存中，该怎么办？\n如果矩阵太大以至于只能一次将部分行加载到内存中，该怎么办？
 * <p>
 * acceptance: 63.2%
 * difficulty: Easy
 * private: False
 */


//TODO init
public class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        return false;
    }
}