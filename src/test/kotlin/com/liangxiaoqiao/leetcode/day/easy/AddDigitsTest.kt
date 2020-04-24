package com.liangxiaoqiao.leetcode.day.easy

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class AddDigitsTest {

    val target = AddDigits()

    @Test
    fun testAdd() {
        assertEquals(2, target.addDigits(38))
        assertEquals(8, target.addDigits(998))
    }
}