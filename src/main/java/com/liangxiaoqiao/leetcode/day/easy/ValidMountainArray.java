package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 941
 * title: Valid Mountain Array
 * href: https://leetcode.com/problems/valid-mountain-array
 * desc: Given an array A of integers, return true if and only if it is a valid mountain array.\nRecall that A is a mountain array if and only if:\nA.length >= 3\nThere exists some i with 0 < i < A.length - 1 such that:\nA[0] < A[1] < ... A[i-1] < A[i]\nA[i] > A[i+1] > ... > A[B.length - 1]\n  Example 1:\nInput: [2,1]\nOutput: false\nExample 2:\nInput: [3,5,5]\nOutput: false\nExample 3:\nInput: [0,3,2,1]\nOutput: true\n  Note:\n0 <= A.length <= 10000\n0 <= A[i] <= 10000 \n
 * <p>
 * 中文
 * 序号: 941
 * 标题： 有效的山脉数组
 * 链接： https://leetcode-cn.com/problems/valid-mountain-array
 * 描述： 给定一个整数数组 A，如果它是有效的山脉数组就返回 true，否则返回 false。\n让我们回顾一下，如果 A 满足下述条件，那么它是一个山脉数组：\nA.length >= 3\n在 0 < i < A.length - 1 条件下，存在 i 使得：\nA[0] < A[1] < ... A[i-1] < A[i]\nA[i] > A[i+1] > ... > A[B.length - 1]\n  示例 1：\n输入：[2,1]\n输出：false\n示例 2：\n输入：[3,5,5]\n输出：false\n示例 3：\n输入：[0,3,2,1]\n输出：true\n  提示：\n0 <= A.length <= 10000\n0 <= A[i] <= 10000 \n
 * <p>
 * acceptance: 35.4%
 * difficulty: Easy
 * private: False
 */


//TODO init
public class ValidMountainArray {
    public boolean validMountainArray(int[] A) {
        return false;
    }
}