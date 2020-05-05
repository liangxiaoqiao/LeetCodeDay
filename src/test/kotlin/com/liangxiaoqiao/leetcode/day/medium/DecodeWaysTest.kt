package com.liangxiaoqiao.leetcode.day.medium

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DecodeWaysTest {
    private val target = DecodeWays()
    @Test
    fun testDecode() {
        assertEquals(0, target.numDecodings("230"))
        assertEquals(1, target.numDecodings("110"))
        assertEquals(1, target.numDecodings("101"))
        assertEquals(0, target.numDecodings("000000"))
        assertEquals(0, target.numDecodings("100"))
        assertEquals(0, target.numDecodings("1001"))
        assertEquals(0, target.numDecodings("0"))
        assertEquals(1, target.numDecodings("10"))
        assertEquals(2, target.numDecodings("12"))
        assertEquals(3, target.numDecodings("226"))
        assertEquals(20, target.numDecodings("265231114"))
    }
}