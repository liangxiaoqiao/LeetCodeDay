package com.liangxiaoqiao.leetcode.day.easy

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BaseballGameTest {

    val target = BaseballGame()

    @Test
    fun testBaseball() {
        assertEquals(30, target.calPoints(arrayOf("5", "2", "C", "D", "+")))
        assertEquals(27, target.calPoints(arrayOf("5","-2","4","C","D","9","+","+")))
        assertEquals(30, target.calPoints2(arrayOf("5", "2", "C", "D", "+")))
        assertEquals(27, target.calPoints2(arrayOf("5","-2","4","C","D","9","+","+")))
    }

}