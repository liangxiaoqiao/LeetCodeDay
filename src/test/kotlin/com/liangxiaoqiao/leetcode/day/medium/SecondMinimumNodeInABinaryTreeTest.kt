package com.liangxiaoqiao.leetcode.day.medium

import com.liangxiaoqiao.leetcode.day.easy.SecondMinimumNodeInABinaryTree
import com.liangxiaoqiao.leetcode.day.util.TreeUtils
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SecondMinimumNodeInABinaryTreeTest {

    private val target = SecondMinimumNodeInABinaryTree()


    @Test
    fun testFindSecond0() {
        val param = TreeUtils.arrayToTree(arrayOf(2, 2, 5, null, null, 5, 7))
        assertEquals(5, target.findSecondMinimumValue(param))
    }

    @Test
    fun testFindSecond1() {
        val param = TreeUtils.arrayToTree(arrayOf(2, 2, 2))
        assertEquals(-1, target.findSecondMinimumValue(param))
    }

    @Test
    fun testFindSecond2() {
        val param = TreeUtils.arrayToTree(arrayOf(1, 1, 3, 1, 1, 3, 4, 3, 1, 1, 1, 3, 8, 4, 8, 3, 3, 1, 6, 2, 1))
        assertEquals(2, target.findSecondMinimumValue(param))
    }
}