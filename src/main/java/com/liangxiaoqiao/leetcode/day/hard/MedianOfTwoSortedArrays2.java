package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 4
 * title: Median of Two Sorted Arrays
 * href: https://leetcode.com/problems/median-of-two-sorted-arrays
 * desc: There are two sorted arrays nums1 and nums2 of size m and n respectively.\n
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).\n
 * You may assume nums1 and nums2 cannot be both empty.\n
 * Example 1:\n
 * nums1 = [1, 3]\n
 * nums2 = [2]\n\n
 * The median is 2.0\n
 * Example 2:\nnums1 = [1, 2]\n
 * nums2 = [3, 4]\n\n
 * The median is (2 + 3)/2 = 2.5
 * <p>
 * 中文
 * 序号: 4
 * 标题： 寻找两个有序数组的中位数
 * 链接： https://leetcode-cn.com/problems/median-of-two-sorted-arrays
 * 描述： 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。\n请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。\n你可以假设 nums1 和 nums2 不会同时为空。\n示例 1:\nnums1 = [1, 3]\nnums2 = [2]\n\n则中位数是 2.0\n示例 2:\nnums1 = [1, 2]\nnums2 = [3, 4]\n\n则中位数是 (2 + 3)/2 = 2.5
 * <p>
 * acceptance: 28.0%
 * difficulty: Hard
 * private: False
 */

public class MedianOfTwoSortedArrays2 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = nums1.length + nums2.length;
        int end = total >> 1;
        int i = 0, j = 0, index = 0;
        int firstResult = 0;
        int secondResult = 0;
        while (i < nums1.length && j < nums2.length && index <= end) {
            if (nums1[i] < nums2[j]) {
                if (index == end - 1) {
                    firstResult = nums1[i];
                } else if (index == end) {
                    secondResult = nums1[i];
                }
                i++;
            } else {
                if (index == end - 1) {
                    firstResult = nums2[j];
                } else if (index == end) {
                    secondResult = nums2[j];
                }
                j++;
            }
            index++;
        }

        while (i < nums1.length && index <= end) {
            if (index == end - 1) {
                firstResult = nums1[i];
            } else if (index == end) {
                secondResult = nums1[i];
            }
            i++;
            index++;
        }
        while (j < nums2.length && index <= end) {
            if (index == end - 1) {
                firstResult = nums2[j];
            } else if (index == end) {
                secondResult = nums2[j];
            }
            j++;
            index++;
        }
        return total % 2 == 0 ? (firstResult + secondResult) / 2.0 : secondResult;
    }
}