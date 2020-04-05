package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 982
 * title: Triples with Bitwise AND Equal To Zero
 * href: https://leetcode.com/problems/triples-with-bitwise-and-equal-to-zero
 * desc: Given an array of integers A, find the number of triples of indices (i, j, k) such that:\n0 <= i < A.length\n0 <= j < A.length\n0 <= k < A.length\nA[i] & A[j] & A[k] == 0, where & represents the bitwise-AND operator.\n  Example 1:\nInput: [2,1,3]\nOutput: 12\nExplanation: We could choose the following i, j, k triples:\n(i=0, j=0, k=1) : 2 & 2 & 1\n(i=0, j=1, k=0) : 2 & 1 & 2\n(i=0, j=1, k=1) : 2 & 1 & 1\n(i=0, j=1, k=2) : 2 & 1 & 3\n(i=0, j=2, k=1) : 2 & 3 & 1\n(i=1, j=0, k=0) : 1 & 2 & 2\n(i=1, j=0, k=1) : 1 & 2 & 1\n(i=1, j=0, k=2) : 1 & 2 & 3\n(i=1, j=1, k=0) : 1 & 1 & 2\n(i=1, j=2, k=0) : 1 & 3 & 2\n(i=2, j=0, k=1) : 3 & 2 & 1\n(i=2, j=1, k=0) : 3 & 1 & 2\n  Note:\n1 <= A.length <= 1000\n0 <= A[i] < 2^16
 * <p>
 * 中文
 * 序号: 982
 * 标题： 按位与为零的三元组
 * 链接： https://leetcode-cn.com/problems/triples-with-bitwise-and-equal-to-zero
 * 描述： 给定一个整数数组 A，找出索引为 (i, j, k) 的三元组，使得：
 * 0 <= i < A.length
 * 0 <= j < A.length
 * 0 <= k < A.length
 * A[i] & A[j] & A[k] == 0，其中 & 表示按位与（AND）操作符。
 * 示例：
 * 输入：[2,1,3]
 * 输出：12
 * 解释：我们可以选出如下 i, j, k 三元组：
 * (i=0, j=0, k=1) : 2 & 2 & 1
 * (i=0, j=1, k=0) : 2 & 1 & 2
 * (i=0, j=1, k=1) : 2 & 1 & 1
 * (i=0, j=1, k=2) : 2 & 1 & 3
 * (i=0, j=2, k=1) : 2 & 3 & 1
 * (i=1, j=0, k=0) : 1 & 2 & 2
 * (i=1, j=0, k=1) : 1 & 2 & 1
 * (i=1, j=0, k=2) : 1 & 2 & 3
 * (i=1, j=1, k=0) : 1 & 1 & 2
 * (i=1, j=2, k=0) : 1 & 3 & 2
 * (i=2, j=0, k=1) : 3 & 2 & 1
 * (i=2, j=1, k=0) : 3 & 1 & 2
 * 提示：
 * 1 <= A.length <= 1000
 * 0 <= A[i] < 2^16
 * <p>
 * acceptance: 55.2%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class TriplesWithBitwiseAndEqualToZero {
    public int countTriplets(int[] A) {
        return 0;
    }
}