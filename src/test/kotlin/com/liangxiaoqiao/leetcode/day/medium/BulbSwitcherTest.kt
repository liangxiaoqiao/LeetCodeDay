package com.liangxiaoqiao.leetcode.day.medium

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BulbSwitcherTest {

    private val target = BulbSwitcher()

    @Test
    fun testSwitch1() {
        assertEquals(1, target.bulbSwitch(3))
    }
}