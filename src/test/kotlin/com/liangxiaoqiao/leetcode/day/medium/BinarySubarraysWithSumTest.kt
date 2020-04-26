package com.liangxiaoqiao.leetcode.day.medium

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BinarySubarraysWithSumTest {
    val target = BinarySubarraysWithSum()

    @Test
    fun testSum() {
        assertEquals(4, target.numSubarraysWithSum(intArrayOf(1, 0, 1, 0, 1), 2))
    }
}