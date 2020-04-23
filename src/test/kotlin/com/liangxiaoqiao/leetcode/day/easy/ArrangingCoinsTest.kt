package com.liangxiaoqiao.leetcode.day.easy

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ArrangingCoinsTest {
    val target = ArrangingCoins()

    @Test
    fun testCoin() {
        val result = target.arrangeCoins(1804289383)
        assertEquals(60070, result)
        val result2 = target.arrangeCoins(2147483647)
        print(result2)
        assertEquals(60070, result)

    }
}