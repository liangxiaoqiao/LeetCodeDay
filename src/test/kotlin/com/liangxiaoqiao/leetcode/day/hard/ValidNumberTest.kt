package com.liangxiaoqiao.leetcode.day.hard

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ValidNumberTest {
    private val target = ValidNumber()

    @Test
    fun testIsNumber() {
        assertTrue(target.isNumber("0"))
        assertTrue(target.isNumber(" 0.1 "))
        assertFalse(target.isNumber("abc"))
        assertFalse(target.isNumber("1 a"))
        assertTrue(target.isNumber("2e10"))
        assertTrue(target.isNumber(" -90e3  "))
        assertFalse(target.isNumber(" 1e"))
        assertFalse(target.isNumber("e3"))
        assertTrue(target.isNumber(" 6e-1"))
        assertFalse(target.isNumber(" 99e2.5 "))
        assertTrue(target.isNumber("53.5e93"))
        assertFalse(target.isNumber(" --6 "))
        assertFalse(target.isNumber("-+3"))
        assertFalse(target.isNumber("95a54e53"))
        assertTrue(target.isNumber(".1"))
        assertTrue(target.isNumber("3."))
        assertTrue(target.isNumber("-3."))

    }
}