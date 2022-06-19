package com.liangxiaoqiao.leetcode.day.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstMissingPositiveTest {

    private FirstMissingPositive target = new FirstMissingPositive();

    @Test
    void firstMissingPositive() {
        int[] nums = new int[]{1, 2, 0};
        assertEquals(3, target.firstMissingPositive(nums));
    }

    @Test
    void firstMissingPositive1() {
        int[] nums = new int[]{3, 4, -1, 1};
        assertEquals(2, target.firstMissingPositive(nums));
    }

    @Test
    void firstMissingPositive2() {
        int[] nums = new int[]{7, 8, 9, 11, 12};
        assertEquals(1, target.firstMissingPositive(nums));
    }
}