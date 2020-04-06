package com.liangxiaoqiao.leetcode.day.util

import com.liangxiaoqiao.leetcode.day.pojo.TreeNode
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TreeUtilsTest {

    @Test
    fun testSameArray() {
        assertEquals(true, TreeUtils.sameArray(null, null))
        assertEquals(false, TreeUtils.sameArray(null, arrayOf()))
        assertEquals(true, TreeUtils.sameArray(arrayOf(), arrayOf()))
        assertEquals(true, TreeUtils.sameArray(arrayOf(1, 2, 3), arrayOf(1, 2, 3)))
        assertEquals(true, TreeUtils.sameArray(arrayOf(1, null, 2, 3, null, 4), arrayOf(1, null, 2, 3, null, 4)))
        assertEquals(false, TreeUtils.sameArray(arrayOf(1, 2, 3), arrayOf(3, 2, 1)))
    }

    @Test
    fun testTreeToArray() {
        val t1 = TreeNode(1)
        val t2 = TreeNode(2)
        val t3 = TreeNode(3)
        val t4 = TreeNode(4)
        t1.left = t2
        t1.right = t3
        t2.left = t4
        val result = TreeUtils.treeToArray(t1)
        assertEquals(4, result.size)
        assertEquals(true,TreeUtils.sameArray(arrayOf(1,2,3,4),result))
    }


}