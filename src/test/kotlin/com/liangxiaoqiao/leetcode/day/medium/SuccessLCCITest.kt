package com.liangxiaoqiao.leetcode.day.medium

import com.liangxiaoqiao.leetcode.day.pojo.TreeNode
import com.liangxiaoqiao.leetcode.day.util.TreeUtils
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SuccessLCCITest {


    @Test
    fun testInorderSuccessor0() {
        val target = SuccessLCCI()
        val param = TreeUtils.arrayToTree(arrayOf(2, 1, 3))
        val find = TreeNode(1)
        val result = target.inorderSuccessor(param, find)
        assertEquals(2, result.`val`)
    }

    @Test
    fun testInorderSuccessor1() {
        val target = SuccessLCCI()
        val param = TreeUtils.arrayToTree(arrayOf(5, 3, 6, 2, 4, null, null, 1))
        val find = TreeNode(6)
        val result = target.inorderSuccessor(param, find)
        assertEquals(null, result)
    }


    @Test
    fun testInorderSuccessor2() {
        val target = SuccessLCCI()
        val param = TreeUtils.arrayToTree(arrayOf(5, 3, 6, 1, 4, null, null, null, 2))
        val find = TreeNode(4)
        val result = target.inorderSuccessor(param, find)
        assertEquals(5, result.`val`)
    }


    @Test
    fun testInorderSuccessor3() {
        val target = SuccessLCCI()
        val param = TreeUtils.arrayToTree(arrayOf(6, 2, 8, 0, 4, 7, 9, null, null, 3, 5))
        val find = TreeNode(5)
        val result = target.inorderSuccessor(param, find)
        assertEquals(6, result.`val`)
    }

    @Test
    fun testInorderSuccessor4() {
        val target = SuccessLCCI()
        val param = TreeUtils.arrayToTree(arrayOf(5, 3, 6, 2, 4, null, null, 1))
        val find = TreeNode(1)
        val result = target.inorderSuccessor(param, find)
        assertEquals(2, result.`val`)
    }


    @Test
    fun testInorderSuccessor5() {
        val target = SuccessLCCI()
        val param = TreeUtils.arrayToTree(arrayOf(6, 2, 8, 0, 4, 7, 9, null, null, 3, 5))
        val find = TreeNode(2)
        val result = target.inorderSuccessor(param, find)
        assertEquals(3, result.`val`)
    }

}