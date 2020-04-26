package com.liangxiaoqiao.leetcode.day

import com.liangxiaoqiao.leetcode.day.medium.CanIWin
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class TempTest {

    @Test
    fun testCanIWin() {
        assertFalse(CanIWin().canIWin(10, 11))
        assertTrue(CanIWin().canIWin(10, 0))
        assertFalse(CanIWin().canIWin(10, 40))

    }


}