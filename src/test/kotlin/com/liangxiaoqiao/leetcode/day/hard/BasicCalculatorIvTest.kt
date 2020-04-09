package com.liangxiaoqiao.leetcode.day.hard

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BasicCalculatorIvTest {

    private val target = BasicCalculatorIv()

    @Test
    fun testExpressionToList() {
        assertEquals(listOf("a", "b"), target.expressionToList("a + b"))
        assertEquals(listOf("a"), target.expressionToList("a"))
        assertEquals(listOf("-a"), target.expressionToList("-a"))
        assertEquals(listOf("-a", "b"), target.expressionToList("-a + b"))
        assertEquals(listOf("a", "-b"), target.expressionToList("a - b"))
        assertEquals(listOf("-a", "-b"), target.expressionToList("-a - b"))
        assertEquals(listOf("a", "b", "-c"), target.expressionToList("a + b - c"))
    }
}