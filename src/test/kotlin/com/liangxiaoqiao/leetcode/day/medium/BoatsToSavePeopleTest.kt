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
        assertEquals(1, target.numRescueBoats(intArrayOf(2,3), 6))
        assertEquals(2, target.numRescueBoats(intArrayOf(3,1,7), 7))
    }
}