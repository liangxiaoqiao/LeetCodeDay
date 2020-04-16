package com.liangxiaoqiao.leetcode.day.medium

import com.liangxiaoqiao.leetcode.day.pojo.ListNode
import com.liangxiaoqiao.leetcode.day.util.TreeUtils
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class AddTwoNumbersIiTest {

    private val target = AddTwoNumbersIi()

    @Test
    fun testRevert() {
        val l1 = ListNode(2)
        val l2 = ListNode(4)
        val l3 = ListNode(3)

        val r1 = ListNode(5)
        val r2 = ListNode(6)
        val r3 = ListNode(4)

        l1.next = l2
        l2.next = l3
        l3.next = r1
        r1.next = r2
        r2.next = r3

        val result = target.revert(l1, l1.next)
        assertTrue(TreeUtils.sameArray(arrayOf(4, 6, 5, 3, 4, 2), TreeUtils.treeToArray(result)))

    }

    @Test
    fun testAddTwoNumbers() {
        val l1 = ListNode(7)
        val l2 = ListNode(2)
        val l3 = ListNode(4)
        val l4 = ListNode(3)

        val r1 = ListNode(5)
        val r2 = ListNode(6)
        val r3 = ListNode(4)

        l1.next = l2
        l2.next = l3
        l3.next = l4

        r1.next = r2
        r2.next = r3

        val result = target.addTwoNumbers(l1, r1)
        assertEquals(true, TreeUtils.sameArray(arrayOf(7, 8, 0, 7), TreeUtils.treeToArray(result)))
    }
}