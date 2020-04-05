package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 835
 * title: Image Overlap
 * href: https://leetcode.com/problems/image-overlap
 * desc: Two images A and B are given, represented as binary, square matrices of the same size.  (A binary matrix has only 0s and 1s as values.)\nWe translate one image however we choose (sliding it left, right, up, or down any number of units), and place it on top of the other image.  After, the overlap of this translation is the number of positions that have a 1 in both images.\n(Note also that a translation does not include any kind of rotation.)\nWhat is the largest possible overlap?\nExample 1:\nInput: A = [[1,1,0],\n            [0,1,0],\n            [0,1,0]]\n       B = [[0,0,0],\n            [0,1,1],\n            [0,0,1]]\nOutput: 3\nExplanation: We slide A to right by 1 unit and down by 1 unit.\nNotes: \n1 <= A.length = A[0].length = B.length = B[0].length <= 30\n0 <= A[i][j], B[i][j] <= 1
 * <p>
 * 中文
 * 序号: 835
 * 标题： 图像重叠
 * 链接： https://leetcode-cn.com/problems/image-overlap
 * 描述： 给出两个图像 A 和 B ，A 和 B 为大小相同的二维正方形矩阵。（并且为二进制矩阵，只包含0和1）。\n我们转换其中一个图像，向左，右，上，或下滑动任何数量的单位，并把它放在另一个图像的上面。之后，该转换的重叠是指两个图像都具有 1 的位置的数目。\n（请注意，转换不包括向任何方向旋转。）\n最大可能的重叠是什么？\n示例 1:\n输入：A = [[1,1,0],\n          [0,1,0],\n          [0,1,0]]\n     B = [[0,0,0],\n          [0,1,1],\n          [0,0,1]]\n输出：3\n解释: 将 A 向右移动一个单位，然后向下移动一个单位。\n注意: \n1 <= A.length = A[0].length = B.length = B[0].length <= 30\n0 <= A[i][j], B[i][j] <= 1
 * <p>
 * acceptance: 55.2%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class ImageOverlap {
    public int largestOverlap(int[][] A, int[][] B) {
        return 0;
    }
}