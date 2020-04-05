package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 396
 * title: Rotate Function
 * href: https://leetcode.com/problems/rotate-function
 * desc: Given an array of integers A and let n to be its length.\nAssume Bk to be an array obtained by rotating the array A k positions clock-wise, we define a \"rotation function\" F on A as follow:\nF(k) = 0 * Bk[0] + 1 * Bk[1] + ... + (n-1) * Bk[n-1].\nCalculate the maximum value of F(0), F(1), ..., F(n-1).\nNote:\nn is guaranteed to be less than 105.\nExample:\nA = [4, 3, 2, 6]\n\nF(0) = (0 * 4) + (1 * 3) + (2 * 2) + (3 * 6) = 0 + 3 + 4 + 18 = 25\nF(1) = (0 * 6) + (1 * 4) + (2 * 3) + (3 * 2) = 0 + 4 + 6 + 6 = 16\nF(2) = (0 * 2) + (1 * 6) + (2 * 4) + (3 * 3) = 0 + 6 + 8 + 9 = 23\nF(3) = (0 * 3) + (1 * 2) + (2 * 6) + (3 * 4) = 0 + 2 + 12 + 12 = 26\n\nSo the maximum value of F(0), F(1), F(2), F(3) is F(3) = 26.
 * <p>
 * 中文
 * 序号: 396
 * 标题： 旋转函数
 * 链接： https://leetcode-cn.com/problems/rotate-function
 * 描述： 给定一个长度为 n 的整数数组 A 。\n假设 Bk 是数组 A 顺时针旋转 k 个位置后的数组，我们定义 A 的“旋转函数” F 为：\nF(k) = 0 * Bk[0] + 1 * Bk[1] + ... + (n-1) * Bk[n-1]。\n计算F(0), F(1), ..., F(n-1)中的最大值。\n注意:\n可以认为 n 的值小于 105。\n示例:\nA = [4, 3, 2, 6]\n\nF(0) = (0 * 4) + (1 * 3) + (2 * 2) + (3 * 6) = 0 + 3 + 4 + 18 = 25\nF(1) = (0 * 6) + (1 * 4) + (2 * 3) + (3 * 2) = 0 + 4 + 6 + 6 = 16\nF(2) = (0 * 2) + (1 * 6) + (2 * 4) + (3 * 3) = 0 + 6 + 8 + 9 = 23\nF(3) = (0 * 3) + (1 * 2) + (2 * 6) + (3 * 4) = 0 + 2 + 12 + 12 = 26\n\n所以 F(0), F(1), F(2), F(3) 中的最大值是 F(3) = 26 。
 * <p>
 * acceptance: 35.7%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class RotateFunction {
    public int maxRotateFunction(int[] A) {
        return 0;
    }
}