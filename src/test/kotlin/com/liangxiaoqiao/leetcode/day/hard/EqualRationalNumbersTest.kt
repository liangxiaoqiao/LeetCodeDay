package com.liangxiaoqiao.leetcode.day.hard

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class EqualRationalNumbersTest {

    val target = EqualRationalNumbers()


    @Test
    fun testEquals() {
        assertTrue(target.isRationalEqual("0.(52)", "0.5(25)"))
        assertTrue(target.isRationalEqual("0.1666(6)", "0.166(66)"))
        assertTrue(target.isRationalEqual("0.9(9)", "1."))
        assertTrue(target.isRationalEqual("0.(9)", "1."))

    }

}