package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 598
 * title: Range Addition II
 * href: https://leetcode.com/problems/range-addition-ii
 * desc: Given an m * n matrix M initialized with all 0\'s and several update operations.\nOperations are represented by a 2D array, and each operation is represented by an array with two positive integers a and b, which means M[i][j] should be added by one for all 0 <= i < a and 0 <= j < b.\nYou need to count and return the number of maximum integers in the matrix after performing all the operations.\nExample 1:\nInput: \nm = 3, n = 3\noperations = [[2,2],[3,3]]\nOutput: 4\nExplanation: \nInitially, M = \n[[0, 0, 0],\n [0, 0, 0],\n [0, 0, 0]]\n\nAfter performing [2,2], M = \n[[1, 1, 0],\n [1, 1, 0],\n [0, 0, 0]]\n\nAfter performing [3,3], M = \n[[2, 2, 1],\n [2, 2, 1],\n [1, 1, 1]]\n\nSo the maximum integer in M is 2, and there are four of it in M. So return 4.\nNote:\nThe range of m and n is [1,40000].\nThe range of a is [1,m], and the range of b is [1,n].\nThe range of operations size won\'t exceed 10,000.
 * <p>
 * 中文
 * 序号: 598
 * 标题： 范围求和 II
 * 链接： https://leetcode-cn.com/problems/range-addition-ii
 * 描述： 给定一个初始元素全部为 0，大小为 m*n 的矩阵 M 以及在 M 上的一系列更新操作。\n操作用二维数组表示，其中的每个操作用一个含有两个正整数 a 和 b 的数组表示，含义是将所有符合 0 <= i < a 以及 0 <= j < b 的元素 M[i][j] 的值都增加 1。\n在执行给定的一系列操作后，你需要返回矩阵中含有最大整数的元素个数。\n示例 1:\n输入: \nm = 3, n = 3\noperations = [[2,2],[3,3]]\n输出: 4\n解释: \n初始状态, M = \n[[0, 0, 0],\n [0, 0, 0],\n [0, 0, 0]]\n\n执行完操作 [2,2] 后, M = \n[[1, 1, 0],\n [1, 1, 0],\n [0, 0, 0]]\n\n执行完操作 [3,3] 后, M = \n[[2, 2, 1],\n [2, 2, 1],\n [1, 1, 1]]\n\nM 中最大的整数是 2, 而且 M 中有4个值为2的元素。因此返回 4。\n注意:\nm 和 n 的范围是 [1,40000]。\na 的范围是 [1,m]，b 的范围是 [1,n]。\n操作数目不超过 10000。
 * <p>
 * acceptance: 49.2%
 * difficulty: Easy
 * private: False
 */


//TODO init
public class RangeAdditionIi {
    public int maxCount(int m, int n, int[][] ops) {
        return 0;
    }
}