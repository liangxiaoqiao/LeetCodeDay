package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 845
 * title: Longest Mountain in Array
 * href: https://leetcode.com/problems/longest-mountain-in-array
 * desc: Let\'s call any (contiguous) subarray B (of A) a mountain if the following properties hold:\nB.length >= 3\nThere exists some 0 < i < B.length - 1 such that B[0] < B[1] < ... B[i-1] < B[i] > B[i+1] > ... > B[B.length - 1]\n(Note that B could be any subarray of A, including the entire array A.)\nGiven an array A of integers, return the length of the longest mountain. \nReturn 0 if there is no mountain.\nExample 1:\nInput: [2,1,4,7,3,2,5]\nOutput: 5\nExplanation: The largest mountain is [1,4,7,3,2] which has length 5.\nExample 2:\nInput: [2,2,2]\nOutput: 0\nExplanation: There is no mountain.\nNote:\n0 <= A.length <= 10000\n0 <= A[i] <= 10000\nFollow up:\nCan you solve it using only one pass?\nCan you solve it in O(1) space?
 * <p>
 * 中文
 * 序号: 845
 * 标题： 数组中的最长山脉
 * 链接： https://leetcode-cn.com/problems/longest-mountain-in-array
 * 描述： 我们把数组 A 中符合下列属性的任意连续子数组 B 称为 “山脉”：\nB.length >= 3\n存在 0 < i < B.length - 1 使得 B[0] < B[1] < ... B[i-1] < B[i] > B[i+1] > ... > B[B.length - 1]\n（注意：B 可以是 A 的任意子数组，包括整个数组 A。）\n给出一个整数数组 A，返回最长 “山脉” 的长度。\n如果不含有 “山脉” 则返回 0。\n  示例 1：\n输入：[2,1,4,7,3,2,5]\n输出：5\n解释：最长的 “山脉” 是 [1,4,7,3,2]，长度为 5。\n示例 2：\n输入：[2,2,2]\n输出：0\n解释：不含 “山脉”。\n  提示：\n0 <= A.length <= 10000\n0 <= A[i] <= 10000
 * <p>
 * acceptance: 35.6%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class LongestMountainInArray {
    public int longestMountain(int[] A) {
        return 0;
    }
}