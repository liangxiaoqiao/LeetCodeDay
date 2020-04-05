package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 927
 * title: Three Equal Parts
 * href: https://leetcode.com/problems/three-equal-parts
 * desc: Given an array A of 0s and 1s, divide the array into 3 non-empty parts such that all of these parts represent the same binary value.\nIf it is possible, return any [i, j] with i+1 < j, such that:\nA[0], A[1], ..., A[i] is the first part;\nA[i+1], A[i+2], ..., A[j-1] is the second part, and\nA[j], A[j+1], ..., A[A.length - 1] is the third part.\nAll three parts have equal binary value.\nIf it is not possible, return [-1, -1].\nNote that the entire part is used when considering what binary value it represents.  For example, [1,1,0] represents 6 in decimal, not 3.  Also, leading zeros are allowed, so [0,1,1] and [1,1] represent the same value.\n  Example 1:\nInput: [1,0,1,0,1]\nOutput: [0,3]\nExample 2:\nInput: [1,1,0,1,1]\nOutput: [-1,-1]\n  Note:\n3 <= A.length <= 30000\nA[i] == 0 or A[i] == 1\n
 * <p>
 * 中文
 * 序号: 927
 * 标题： 三等分
 * 链接： https://leetcode-cn.com/problems/three-equal-parts
 * 描述： 给定一个由 0 和 1 组成的数组 A，将数组分成 3 个非空的部分，使得所有这些部分表示相同的二进制值。\n如果可以做到，请返回任何 [i, j]，其中 i+1 < j，这样一来：\nA[0], A[1], ..., A[i] 组成第一部分；\nA[i+1], A[i+2], ..., A[j-1] 作为第二部分；\nA[j], A[j+1], ..., A[A.length - 1] 是第三部分。\n这三个部分所表示的二进制值相等。\n如果无法做到，就返回 [-1, -1]。\n注意，在考虑每个部分所表示的二进制时，应当将其看作一个整体。例如，[1,1,0] 表示十进制中的 6，而不会是 3。此外，前导零也是被允许的，所以 [0,1,1] 和 [1,1] 表示相同的值。\n  示例 1：\n输入：[1,0,1,0,1]\n输出：[0,3]\n示例 2：\n输出：[1,1,0,1,1]\n输出：[-1,-1]\n  提示：\n3 <= A.length <= 30000\nA[i] == 0 或 A[i] == 1\n
 * <p>
 * acceptance: 32.2%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class ThreeEqualParts {
    public int[] threeEqualParts(int[] A) {
        return null;
    }
}