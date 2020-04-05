package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 931
 * title: Minimum Falling Path Sum
 * href: https://leetcode.com/problems/minimum-falling-path-sum
 * desc: Given a square array of integers A, we want the minimum sum of a falling path through A.\nA falling path starts at any element in the first row, and chooses one element from each row.  The next row\'s choice must be in a column that is different from the previous row\'s column by at most one.\n  Example 1:\nInput: [[1,2,3],[4,5,6],[7,8,9]]\nOutput: 12\nExplanation: \nThe possible falling paths are:\n[1,4,7], [1,4,8], [1,5,7], [1,5,8], [1,5,9]\n[2,4,7], [2,4,8], [2,5,7], [2,5,8], [2,5,9], [2,6,8], [2,6,9]\n[3,5,7], [3,5,8], [3,5,9], [3,6,8], [3,6,9]\nThe falling path with the smallest sum is [1,4,7], so the answer is 12.\n  Note:\n1 <= A.length == A[0].length <= 100\n-100 <= A[i][j] <= 100
 * <p>
 * 中文
 * 序号: 931
 * 标题： 下降路径最小和
 * 链接： https://leetcode-cn.com/problems/minimum-falling-path-sum
 * 描述： 给定一个方形整数数组 A，我们想要得到通过 A 的下降路径的最小和。\n下降路径可以从第一行中的任何元素开始，并从每一行中选择一个元素。在下一行选择的元素和当前行所选元素最多相隔一列。\n  示例：\n输入：[[1,2,3],[4,5,6],[7,8,9]]\n输出：12\n解释：\n可能的下降路径有：\n[1,4,7], [1,4,8], [1,5,7], [1,5,8], [1,5,9]\n[2,4,7], [2,4,8], [2,5,7], [2,5,8], [2,5,9], [2,6,8], [2,6,9]\n[3,5,7], [3,5,8], [3,5,9], [3,6,8], [3,6,9]\n和最小的下降路径是 [1,4,7]，所以答案是 12。\n  提示：\n1 <= A.length == A[0].length <= 100\n-100 <= A[i][j] <= 100
 * <p>
 * acceptance: 60.2%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class MinimumFallingPathSum {
    public int minFallingPathSum(int[][] A) {
        return 0;
    }
}