package com.liangxiaoqiao.leetcode.day.medium

import com.liangxiaoqiao.leetcode.day.hard.FirstMissingPositive
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FirstMissingPositivetTest {

    val target = FirstMissingPositive()

    @Test
    fun testFirstMissing() {
        assertEquals(4, target.firstMissingPositive(intArrayOf(2147483647, 2147483646, 2147483645, 3, 2, 1, -1, 0, -2147483648)))
        assertEquals(2, target.firstMissingPositive(intArrayOf(1)))
        assertEquals(3, target.firstMissingPositive(intArrayOf(1, 2, 0)))
        assertEquals(2, target.firstMissingPositive(intArrayOf(3, 4, -1, 1)))
        assertEquals(1, target.firstMissingPositive(intArrayOf(7, 8, 9, 11, 12)))
    }
}