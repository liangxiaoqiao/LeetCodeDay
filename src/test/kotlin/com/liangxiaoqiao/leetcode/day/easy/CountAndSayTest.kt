package com.liangxiaoqiao.leetcode.day.easy

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CountAndSayTest {

    private val target = CountAndSay()

    @Test
    fun testCountAndSay() {
        assertEquals("1",target.countAndSay(1))
        assertEquals("11",target.countAndSay(2))
        assertEquals("21",target.countAndSay(3))
        assertEquals("1211",target.countAndSay(4))
        assertEquals("111221",target.countAndSay(5))
    }
}