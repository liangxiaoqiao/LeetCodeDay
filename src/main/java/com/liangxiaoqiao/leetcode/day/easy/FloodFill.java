package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 733
 * title: Flood Fill
 * href: https://leetcode.com/problems/flood-fill
 * desc: An image is represented by a 2-D array of integers, each integer representing the pixel value of the image (from 0 to 65535).\nGiven a coordinate (sr, sc) representing the starting pixel (row and column) of the flood fill, and a pixel value newColor, \"flood fill\" the image.\nTo perform a \"flood fill\", consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color as the starting pixel), and so on. Replace the color of all of the aforementioned pixels with the newColor.\nAt the end, return the modified image.\nExample 1:\nInput: \nimage = [[1,1,1],[1,1,0],[1,0,1]]\nsr = 1, sc = 1, newColor = 2\nOutput: [[2,2,2],[2,2,0],[2,0,1]]\nExplanation: \nFrom the center of the image (with position (sr, sc) = (1, 1)), all pixels connected \nby a path of the same color as the starting pixel are colored with the new color.\nNote the bottom corner is not colored 2, because it is not 4-directionally connected\nto the starting pixel.\nNote:\nThe length of image and image[0] will be in the range [1, 50].\nThe given starting pixel will satisfy 0 <= sr < image.length and 0 <= sc < image[0].length.\nThe value of each color in image[i][j] and newColor will be an integer in [0, 65535].
 * <p>
 * 中文
 * 序号: 733
 * 标题： 图像渲染
 * 链接： https://leetcode-cn.com/problems/flood-fill
 * 描述： 有一幅以二维整数数组表示的图画，每一个整数表示该图画的像素值大小，数值在 0 到 65535 之间。\n给你一个坐标 (sr, sc) 表示图像渲染开始的像素值（行 ，列）和一个新的颜色值 newColor，让你重新上色这幅图像。\n为了完成上色工作，从初始坐标开始，记录初始坐标的上下左右四个方向上像素值与初始坐标相同的相连像素点，接着再记录这四个方向上符合条件的像素点与他们对应四个方向上像素值与初始坐标相同的相连像素点，……，重复该过程。将所有有记录的像素点的颜色值改为新的颜色值。\n最后返回经过上色渲染后的图像。\n示例 1:\n输入: \nimage = [[1,1,1],[1,1,0],[1,0,1]]\nsr = 1, sc = 1, newColor = 2\n输出: [[2,2,2],[2,2,0],[2,0,1]]\n解析: \n在图像的正中间，(坐标(sr,sc)=(1,1)),\n在路径上所有符合条件的像素点的颜色都被更改成2。\n注意，右下角的像素没有更改为2，\n因为它不是在上下左右四个方向上与初始点相连的像素点。\n注意:\nimage 和 image[0] 的长度在范围 [1, 50] 内。\n给出的初始点将满足 0 <= sr < image.length 和 0 <= sc < image[0].length。\nimage[i][j] 和 newColor 表示的颜色值在范围 [0, 65535]内。
 * <p>
 * acceptance: 52.6%
 * difficulty: Easy
 * private: False
 */


//TODO init
public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        return null;
    }
}