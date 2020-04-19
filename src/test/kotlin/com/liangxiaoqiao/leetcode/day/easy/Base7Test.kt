package com.liangxiaoqiao.leetcode.day.easy

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Base7Test {

    private val target = Base7()

    @Test
    fun testBase7(): Unit {
        val input = 100
        assertEquals("202", target.convertToBase7(input))

        val input2 = -7
        assertEquals("-10", target.convertToBase7(input2))

    }
}