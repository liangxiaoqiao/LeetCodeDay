package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 764
 * title: Largest Plus Sign
 * href: https://leetcode.com/problems/largest-plus-sign
 * desc: In a 2D grid from (0, 0) to (N-1, N-1), every cell contains a 1, except those cells in the given list mines which are 0. What is the largest axis-aligned plus sign of 1s contained in the grid? Return the order of the plus sign. If there is none, return 0.\nAn \"axis-aligned plus sign of 1s of order k\" has some center grid[x][y] = 1 along with 4 arms of length k-1 going up, down, left, and right, and made of 1s. This is demonstrated in the diagrams below. Note that there could be 0s or 1s beyond the arms of the plus sign, only the relevant area of the plus sign is checked for 1s.\nExamples of Axis-Aligned Plus Signs of Order k:\nOrder 1:\n000\n010\n000\n\nOrder 2:\n00000\n00100\n01110\n00100\n00000\n\nOrder 3:\n0000000\n0001000\n0001000\n0111110\n0001000\n0001000\n0000000\nExample 1:\nInput: N = 5, mines = [[4, 2]]\nOutput: 2\nExplanation:\n11111\n11111\n11111\n11111\n11011\nIn the above grid, the largest plus sign can only be order 2.  One of them is marked in bold.\nExample 2:\nInput: N = 2, mines = []\nOutput: 1\nExplanation:\nThere is no plus sign of order 2, but there is of order 1.\nExample 3:\nInput: N = 1, mines = [[0, 0]]\nOutput: 0\nExplanation:\nThere is no plus sign, so return 0.\nNote:\nN will be an integer in the range [1, 500].\nmines will have length at most 5000.\nmines[i] will be length 2 and consist of integers in the range [0, N-1].\n(Additionally, programs submitted in C, C++, or C# will be judged with a slightly smaller time limit.)
 * <p>
 * 中文
 * 序号: 764
 * 标题： 最大加号标志
 * 链接： https://leetcode-cn.com/problems/largest-plus-sign
 * 描述： 在一个大小在 (0, 0) 到 (N-1, N-1) 的2D网格 grid 中，除了在 mines 中给出的单元为 0，其他每个单元都是 1。网格中包含 1 的最大的轴对齐加号标志是多少阶？返回加号标志的阶数。如果未找到加号标志，则返回 0。\n一个 k\" 阶由 1 组成的“轴对称”加号标志具有中心网格  grid[x][y] = 1 ，以及4个从中心向上、向下、向左、向右延伸，长度为 k-1，由 1 组成的臂。下面给出 k\" 阶“轴对称”加号标志的示例。注意，只有加号标志的所有网格要求为 1，别的网格可能为 0 也可能为 1。\n  k 阶轴对称加号标志示例:\n阶 1:\n000\n010\n000\n\n阶 2:\n00000\n00100\n01110\n00100\n00000\n\n阶 3:\n0000000\n0001000\n0001000\n0111110\n0001000\n0001000\n0000000\n  示例 1：\n输入: N = 5, mines = [[4, 2]]\n输出: 2\n解释:\n\n11111\n11111\n11111\n11111\n11011\n\n在上面的网格中，最大加号标志的阶只能是2。一个标志已在图中标出。\n  示例 2：\n输入: N = 2, mines = []\n输出: 1\n解释:\n\n11\n11\n\n没有 2 阶加号标志，有 1 阶加号标志。\n  示例 3：\n输入: N = 1, mines = [[0, 0]]\n输出: 0\n解释:\n\n0\n\n没有加号标志，返回 0 。\n  提示：\n整数N 的范围： [1, 500].\nmines 的最大长度为 5000.\nmines[i] 是长度为2的由2个 [0, N-1] 中的数组成.\n(另外,使用 C, C++, 或者 C# 编程将以稍小的时间限制进行判断.)\n
 * <p>
 * acceptance: 45.1%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class LargestPlusSign {
    public int orderOfLargestPlusSign(int N, int[][] mines) {
        return 0;
    }
}