package com.liangxiaoqiao.leetcode.day.medium

import com.liangxiaoqiao.leetcode.day.util.TreeUtils
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class AdvantageShuffleTest {
    private val target = AdvantageShuffle()


    @Test
    fun testAdvantageCount() {
        val result = target.advantageCount(intArrayOf(2, 7, 11, 15), intArrayOf(1, 10, 4, 11))
        assertTrue(TreeUtils.sameArray(arrayOf(2, 11, 7, 15), result.toTypedArray()))

        val result2 = target.advantageCount(intArrayOf(12,24,8,32), intArrayOf(13,25,32,11))
        assertTrue(TreeUtils.sameArray(arrayOf(24,32,8,12), result2.toTypedArray()))
    }
}