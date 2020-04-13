package com.liangxiaoqiao.leetcode.day.medium

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class AlphabetBoardPathTest {
    private val target = AlphabetBoardPath()

    @Test
    fun testBoard() {
        val result = target.alphabetBoardPath("leet")
        assertEquals("DDR!UURRR!!DDD!", result)

        val result2 = target.alphabetBoardPath("code")
        assertEquals("RR!DDRR!UUL!R!", result2)

        val result3 = target.alphabetBoardPath("zdz")
        assertEquals("DDDDD!UUUUURRR!LLLDDDDD!", result3)
    }
}