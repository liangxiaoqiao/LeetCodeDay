package com.liangxiaoqiao.leetcode.day.util

import com.liangxiaoqiao.leetcode.day.pojo.ListNode
import com.liangxiaoqiao.leetcode.day.pojo.TreeNode
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

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
        assertEquals(true, TreeUtils.sameArray(arrayOf(1, 2, 3, 4), result))
    }


    @Test
    fun testTreeToArray2() {
        val t1 = ListNode(1)
        val t2 = ListNode(2)
        val t3 = ListNode(3)
        val t4 = ListNode(4)
        t1.next = t2
        t2.next = t4
        t4.next = t3
        val result = TreeUtils.treeToArray(t1)
        assertEquals(4, result.size)
        assertEquals(true, TreeUtils.sameArray(arrayOf(1, 2, 4, 3), result))
    }

    @Test
    fun testArrayToTree() {
        val result = TreeUtils.arrayToTree(arrayOf(1, 2, 4, 3))
        assertTrue(result.`val` == 1)
        assertTrue(result.left.`val` == 2)
        assertTrue(result.right.`val` == 4)
        assertTrue(result.left.left.`val` == 3)

        val re = TreeUtils.arrayToTree(arrayOf(6, 7, 8, 2, 7, 1, 3, 9, null, 1, 4, null, null, null, 5))
        assertEquals(6, re.`val`)
        assertEquals(7, re.left.`val`)
        assertEquals(8, re.right.`val`)
        assertEquals(2, re.left.left.`val`)
        assertEquals(7, re.left.right.`val`)
        assertEquals(1, re.right.left.`val`)
        assertEquals(3, re.right.right.`val`)

        assertEquals(9, re.left.left.left.`val`)
        assertNull(re.left.left.right)
        assertEquals(1, re.left.right.left.`val`)
        assertEquals(4, re.left.right.right.`val`)
        assertNull(re.right.left.left)
        assertNull(re.right.left.right)
        assertNull(re.right.right.left)
        assertEquals(5, re.right.right.right.`val`)
    }

}