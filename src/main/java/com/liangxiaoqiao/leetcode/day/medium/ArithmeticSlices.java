package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 413
 * title: Arithmetic Slices
 * href: https://leetcode.com/problems/arithmetic-slices
 * desc: A sequence of number is called arithmetic if it consists of at least three elements and if the difference between any two consecutive elements is the same.
 * For example, these are arithmetic sequence:
 * 1, 3, 5, 7, 9
 * 7, 7, 7, 7
 * 3, -1, -5, -9
 * The following sequence is not arithmetic.
 * 1, 1, 2, 5, 7
 * <p>
 * A zero-indexed array A consisting of N numbers is given. A slice of that array is any pair of integers (P, Q) such that 0 <= P < Q < N.
 * A slice (P, Q) of array A is called arithmetic if the sequence:
 * A[P], A[p + 1], ..., A[Q - 1], A[Q] is arithmetic. In particular, this means that P + 1 < Q.
 * The function should return the number of arithmetic slices in the array A.
 * <p>
 * Example:
 * A = [1, 2, 3, 4]
 * <p>
 * return: 3, for 3 arithmetic slices in A: [1, 2, 3], [2, 3, 4] and [1, 2, 3, 4] itself.
 * <p>
 * 中文
 * 序号: 413
 * 标题： 等差数列划分
 * 链接： https://leetcode-cn.com/problems/arithmetic-slices
 * 描述： 如果一个数列至少有三个元素，并且任意两个相邻元素之差相同，则称该数列为等差数列。

例如，以下数列为等差数列:

1, 3, 5, 7, 9
7, 7, 7, 7
3, -1, -5, -9
以下数列不是等差数列。

1, 1, 2, 5, 7
 

数组 A 包含 N 个数，且索引从0开始。数组 A 的一个子数组划分为数组 (P, Q)，P 与 Q 是整数且满足 0<=P<Q<N 。

如果满足以下条件，则称子数组(P, Q)为等差数组：

元素 A[P], A[p + 1], ..., A[Q - 1], A[Q] 是等差的。并且 P + 1 < Q 。

函数要返回数组 A 中所有为等差数组的子数组个数。

 

示例:

A = [1, 2, 3, 4]

返回: 3, A 中有三个子等差数组: [1, 2, 3], [2, 3, 4] 以及自身 [1, 2, 3, 4]。
 * acceptance: 56.8%
 * difficulty: Medium
 * private: False
 */


import java.util.ArrayList;
import java.util.List;

public class ArithmeticSlices {

    public int numberOfArithmeticSlices(int[] A) {
        if (A == null || A.length < 3) {
            return 0;
        }
        //List<Integer> diffList = new ArrayList<>();
        List<Integer> countOfList = new ArrayList<>();
        int diff = A[1] - A[0];
        int size = 2;
        int startIndex = 0;
        for (int i = 1; i < A.length; i++) {
            if (i - startIndex == 1) {
                diff = A[i] - A[startIndex];
            } else {
                int tempDiff = A[i] - A[i - 1];
                if (tempDiff != diff) {
                    //diffList.add(diff);
                    if (size >= 3) {
                        countOfList.add(size);
                    }
                    startIndex = i - 1;
                    size = 2;
                    i--;
                } else {
                    size++;
                    if (i == A.length - 1) {
                        //diffList.add(diff);
                        if (size >= 3) {
                            countOfList.add(size);
                        }
                    }
                }
            }
        }
        int total = 0;
        for (int i = 0; i < countOfList.size(); i++) {
            total += calc(countOfList.get(i));
        }
        return total;
    }

    private int calc(int length) {
        int total = 0;
        int start = 1;
        while (length >= 3) {
            total += start;
            start++;
            length--;
        }
        return total;
    }
}