package com.liangxiaoqiao.leetcode.day.medium

import junit.framework.Assert.assertFalse
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue


class AdditiveNumberTest {

    private val target = AdditiveNumber()

    @Test
    fun testAdditiveNumber1() {
        val s1 = "112358"
        assertTrue(target.isAdditiveNumber(s1))

        val s2 = "1203"
        assertFalse(target.isAdditiveNumber(s2))

        val s3 = "199100199"
        assertTrue(target.isAdditiveNumber(s3))

        val s4 = "1023"
        assertFalse(target.isAdditiveNumber(s4))

        val s5 = "101"
        assertTrue(target.isAdditiveNumber(s5))

        val s6 = "0235813"
        assertFalse(target.isAdditiveNumber(s6))

        val s7 = "0224610"
        assertTrue(target.isAdditiveNumber(s7))

        val s8 = "198019823962"
        assertTrue(target.isAdditiveNumber(s8))
    }

}