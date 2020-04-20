package com.liangxiaoqiao.leetcode.day.medium

import org.junit.jupiter.api.Test
import java.io.File
import java.util.stream.Collectors
import kotlin.test.assertEquals

class ArrayNestingTest {

    val target = ArrayNesting()

    @Test
    fun testArrayNesting() {
        assertEquals(4, target.arrayNesting(intArrayOf(5, 4, 0, 3, 1, 6, 2)))
        assertEquals(4, target.arrayNesting(intArrayOf(0, 2, 3, 4, 1)))
        assertEquals(3, target.arrayNesting(intArrayOf(1, 0, 3, 4, 2)))
        assertEquals(4, target.arrayNesting2(intArrayOf(5, 4, 0, 3, 1, 6, 2)))
        assertEquals(4, target.arrayNesting2(intArrayOf(0, 2, 3, 4, 1)))
        assertEquals(3, target.arrayNesting2(intArrayOf(1, 0, 3, 4, 2)))
    }

    @Test
    fun test2() {
        val file = File(javaClass.classLoader.getResource("ArrayNesting1.txt").toURI())
        val result = file.readText()
        val arr = result.split(",").stream().map { t -> Integer.parseInt(t) }.collect(Collectors.toList()).toIntArray()
        val length = target.arrayNesting(arr)
        assertEquals(14258, length)
        val length2 = target.arrayNesting2(arr)
        assertEquals(14258, length2)
    }
}