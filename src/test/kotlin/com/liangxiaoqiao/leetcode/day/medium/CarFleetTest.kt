package com.liangxiaoqiao.leetcode.day.medium

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CarFleetTest {
    private val target = CarFleet()

    @Test
    fun testCarFleet() {
        assertEquals(3, target.carFleet(12, intArrayOf(10, 8, 0, 5, 3), intArrayOf(2, 4, 1, 1, 3)))
    }
}