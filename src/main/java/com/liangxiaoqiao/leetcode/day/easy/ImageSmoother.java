package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 661
 * title: Image Smoother
 * href: https://leetcode.com/problems/image-smoother
 * desc: Given a 2D integer matrix M representing the gray scale of an image, you need to design a smoother to make the gray scale of each cell becomes the average gray scale (rounding down) of all the 8 surrounding cells and itself. If a cell has less than 8 surrounding cells, then use as many as you can.\nExample 1:\nInput:\n[[1,1,1],\n [1,0,1],\n [1,1,1]]\nOutput:\n[[0, 0, 0],\n [0, 0, 0],\n [0, 0, 0]]\nExplanation:\nFor the point (0,0), (0,2), (2,0), (2,2): floor(3/4) = floor(0.75) = 0\nFor the point (0,1), (1,0), (1,2), (2,1): floor(5/6) = floor(0.83333333) = 0\nFor the point (1,1): floor(8/9) = floor(0.88888889) = 0\nNote:\nThe value in the given matrix is in the range of [0, 255].\nThe length and width of the given matrix are in the range of [1, 150].
 * <p>
 * 中文
 * 序号: 661
 * 标题： 图片平滑器
 * 链接： https://leetcode-cn.com/problems/image-smoother
 * 描述： 包含整数的二维矩阵 M 表示一个图片的灰度。你需要设计一个平滑器来让每一个单元的灰度成为平均灰度 (向下舍入) ，平均灰度的计算是周围的8个单元和它本身的值求平均，如果周围的单元格不足八个，则尽可能多的利用它们。\n示例 1:\n输入:\n[[1,1,1],\n [1,0,1],\n [1,1,1]]\n输出:\n[[0, 0, 0],\n [0, 0, 0],\n [0, 0, 0]]\n解释:\n对于点 (0,0), (0,2), (2,0), (2,2): 平均(3/4) = 平均(0.75) = 0\n对于点 (0,1), (1,0), (1,2), (2,1): 平均(5/6) = 平均(0.83333333) = 0\n对于点 (1,1): 平均(8/9) = 平均(0.88888889) = 0\n注意:\n给定矩阵中的整数范围为 [0, 255]。\n矩阵的长和宽的范围均为 [1, 150]。
 * <p>
 * acceptance: 50.0%
 * difficulty: Easy
 * private: False
 */


//TODO init
public class ImageSmoother {
    public int[][] imageSmoother(int[][] M) {
        return null;
    }
}