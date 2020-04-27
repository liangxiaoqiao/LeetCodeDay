package com.liangxiaoqiao.leetcode.day.medium

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ArithmeticSlicesTest {
    private val target = ArithmeticSlices()

    @Test
    fun testSlice() {
        assertEquals(3, target.numberOfArithmeticSlices(intArrayOf(1, 2, 3, 4)))
        assertEquals(2, target.numberOfArithmeticSlices(intArrayOf(1, 2, 3, 8, 9, 10)))
        assertEquals(120, target.numberOfArithmeticSlices(intArrayOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1)))
        assertEquals(5, target.numberOfArithmeticSlices(intArrayOf(-1,2,3,4,5,9,8,7,1,-3,-4,-5,6)))
    }

}