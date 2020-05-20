package com.liangxiaoqiao.leetcode.day.medium

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BeautifulArrangementTest {


    @Test
    fun testBeau() {
        val target = BeautifulArrangement()
        assertEquals(3, target.countArrangement(3))
    }

    @Test
    fun testBeau2() {
        val target = BeautifulArrangement()
        assertEquals(8, target.countArrangement(4))
    }
}