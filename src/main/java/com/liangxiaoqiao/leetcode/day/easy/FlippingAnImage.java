package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 832
 * title: Flipping an Image
 * href: https://leetcode.com/problems/flipping-an-image
 * desc: Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.\nTo flip an image horizontally means that each row of the image is reversed.  For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].\nTo invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].\nExample 1:\nInput: [[1,1,0],[1,0,1],[0,0,0]]\nOutput: [[1,0,0],[0,1,0],[1,1,1]]\nExplanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].\nThen, invert the image: [[1,0,0],[0,1,0],[1,1,1]]\nExample 2:\nInput: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]\nOutput: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]\nExplanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].\nThen invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]\nNotes:\n1 <= A.length = A[0].length <= 20\n0 <= A[i][j] <= 1
 * <p>
 * 中文
 * 序号: 832
 * 标题： 翻转图像
 * 链接： https://leetcode-cn.com/problems/flipping-an-image
 * 描述： 给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。\n水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。\n反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。\n示例 1:\n输入: [[1,1,0],[1,0,1],[0,0,0]]\n输出: [[1,0,0],[0,1,0],[1,1,1]]\n解释: 首先翻转每一行: [[0,1,1],[1,0,1],[0,0,0]]；\n     然后反转图片: [[1,0,0],[0,1,0],[1,1,1]]\n示例 2:\n输入: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]\n输出: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]\n解释: 首先翻转每一行: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]]；\n     然后反转图片: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]\n说明:\n1 <= A.length = A[0].length <= 20\n0 <= A[i][j] <= 1
 * <p>
 * acceptance: 74.3%
 * difficulty: Easy
 * private: False
 */


//TODO init
public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] A) {
        return null;
    }
}