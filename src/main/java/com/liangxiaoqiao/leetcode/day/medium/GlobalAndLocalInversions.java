package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 775
 * title: Global and Local Inversions
 * href: https://leetcode.com/problems/global-and-local-inversions
 * desc: We have some permutation A of [0, 1, ..., N - 1], where N is the length of A.\nThe number of (global) inversions is the number of i < j with 0 <= i < j < N and A[i] > A[j].\nThe number of local inversions is the number of i with 0 <= i < N and A[i] > A[i+1].\nReturn true if and only if the number of global inversions is equal to the number of local inversions.\nExample 1:\nInput: A = [1,0,2]\nOutput: true\nExplanation: There is 1 global inversion, and 1 local inversion.\nExample 2:\nInput: A = [1,2,0]\nOutput: false\nExplanation: There are 2 global inversions, and 1 local inversion.\nNote:\nA will be a permutation of [0, 1, ..., A.length - 1].\nA will have length in range [1, 5000].\nThe time limit for this problem has been reduced.
 * <p>
 * 中文
 * 序号: 775
 * 标题： 全局倒置与局部倒置
 * 链接： https://leetcode-cn.com/problems/global-and-local-inversions
 * 描述： 数组 A 是 [0, 1, ..., N - 1] 的一种排列，N 是数组 A 的长度。全局倒置指的是 i,j 满足 0 <= i < j < N 并且 A[i] > A[j] ，局部倒置指的是 i 满足 0 <= i < N 并且 A[i] > A[i+1] 。\n当数组 A 中全局倒置的数量等于局部倒置的数量时，返回 true 。\n  示例 1:\n输入: A = [1,0,2]\n输出: true\n解释: 有 1 个全局倒置，和 1 个局部倒置。\n示例 2:\n输入: A = [1,2,0]\n输出: false\n解释: 有 2 个全局倒置，和 1 个局部倒置。\n注意:\nA 是 [0, 1, ..., A.length - 1] 的一种排列\nA 的长度在 [1, 5000]之间\n这个问题的时间限制已经减少了。
 * <p>
 * acceptance: 40.5%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class GlobalAndLocalInversions {
    public boolean isIdealPermutation(int[] A) {
        return false;
    }
}