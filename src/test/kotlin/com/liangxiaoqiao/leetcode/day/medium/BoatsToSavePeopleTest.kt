package com.liangxiaoqiao.leetcode.day.medium

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BoatsToSavePeopleTest {
    val target = BoatsToSavePeople()

    @Test
    fun testSavePeople() {
        assertEquals(1, target.numRescueBoats(intArrayOf(1, 2), 3))
        assertEquals(3, target.numRescueBoats(intArrayOf(3, 2, 2, 1), 3))
        assertEquals(4, target.numRescueBoats(intArrayOf(3, 5, 3, 4), 5))
        assertEquals(3, target.numRescueBoats(intArrayOf(1, 5, 3, 5), 7))
        assertEquals(1, target.numRescueBoats(intArrayOf(2, 3), 6))
        assertEquals(2, target.numRescueBoats(intArrayOf(3, 1, 7), 7))
        assertEquals(11, target.numRescueBoats(intArrayOf(2, 49, 10, 7, 11, 41, 47, 2, 22, 6, 13, 12, 33, 18, 10, 26, 2, 6, 50, 10), 50))
    }
}