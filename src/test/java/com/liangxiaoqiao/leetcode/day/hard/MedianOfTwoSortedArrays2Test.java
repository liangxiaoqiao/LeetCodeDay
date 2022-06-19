package com.liangxiaoqiao.leetcode.day.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MedianOfTwoSortedArrays2Test {

    private MedianOfTwoSortedArrays2 target = new MedianOfTwoSortedArrays2();

    @Test
    void findMedianSortedArrays1() {
        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2};
        double result = target.findMedianSortedArrays(nums1, nums2);
        assertEquals(2.0, result);
    }

    @Test
    void findMedianSortedArrays2() {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};
        double result = target.findMedianSortedArrays(nums1, nums2);
        assertEquals(2.5, result);
    }

    @Test
    void findMedianSortedArrays3() {
        int[] nums1 = new int[]{0, 0, 0, 0, 0};
        int[] nums2 = new int[]{-1, 0, 0, 0, 0, 0, 1};
        double result = target.findMedianSortedArrays(nums1, nums2);
        assertEquals(0.0, result);
    }

    @Test
    void findMedianSortedArrays4() {
        int[] nums1 = new int[]{1, 2, 3};
        int[] nums2 = new int[]{1, 2, 2};
        double result = target.findMedianSortedArrays(nums1, nums2);
        assertEquals(2.0, result);
    }

    @Test
    void findMedianSortedArrays5() {
        int[] nums1 = new int[]{1, 2, 4};
        int[] nums2 = new int[]{3};
        double result = target.findMedianSortedArrays(nums1, nums2);
        assertEquals(2.5, result);
    }

}