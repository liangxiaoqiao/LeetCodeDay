package com.liangxiaoqiao.leetcode.day.medium

import com.liangxiaoqiao.leetcode.day.util.TreeUtils
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class AllElementsInTwoBinarySearchTreesTest {

    val target = AllElementsInTwoBinarySearchTrees()

    @Test
    fun testTree() {
        val input = TreeUtils.arrayToTree(arrayOf(10, 5, 15, 1, 6, 12, 20))
        val input2 = TreeUtils.arrayToTree(arrayOf(10, 5, 15, 1, 6, 12, 20))
        val result = target.getAllElements(input, input2)
        print(result)
    }

    @Test
    fun testTree1() {
        val input = TreeUtils.arrayToTree(arrayOf(2, 1, 4))
        val input2 = TreeUtils.arrayToTree(arrayOf(1, 0, 3))
        val result = target.getAllElements(input, input2)
        assertTrue(TreeUtils.sameArray(arrayOf(0, 1, 1, 2, 3, 4), result.toTypedArray()))
    }

    @Test
    fun testTree2() {
        val input = TreeUtils.arrayToTree(arrayOf(0, -10, 10))
        val input2 = TreeUtils.arrayToTree(arrayOf(5, 1, 7, 0, 2))
        val result = target.getAllElements(input, input2)
        assertTrue(TreeUtils.sameArray(arrayOf(-10, 0, 0, 1, 2, 5, 7, 10), result.toTypedArray()))
    }


    @Test
    fun testTree3() {
        val input = TreeUtils.arrayToTree(arrayOf())
        val input2 = TreeUtils.arrayToTree(arrayOf(5, 1, 7, 0, 2))
        val result = target.getAllElements(input, input2)
        assertTrue(TreeUtils.sameArray(arrayOf(0, 1, 2, 5, 7), result.toTypedArray()))
    }

    @Test
    fun testTree4() {
        val input = TreeUtils.arrayToTree(arrayOf(0, -10, 10))
        val input2 = TreeUtils.arrayToTree(arrayOf())
        val result = target.getAllElements(input, input2)
        assertTrue(TreeUtils.sameArray(arrayOf(-10, 0, 10), result.toTypedArray()))
    }

    @Test
    fun testTree5() {
        val input = TreeUtils.arrayToTree(arrayOf(1, null, 8))
        val input2 = TreeUtils.arrayToTree(arrayOf(8, 1))
        val result = target.getAllElements(input, input2)
        assertTrue(TreeUtils.sameArray(arrayOf(1, 1, 8, 8), result.toTypedArray()))
    }
}