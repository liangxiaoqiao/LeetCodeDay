package com.liangxiaoqiao.leetcode.day.medium

import com.liangxiaoqiao.leetcode.day.pojo.ListNode
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class AddTwoNumbersTest {

    private val target = AddTwoNumbers()

    @Test
    fun testAddTwoNumbers() {
        val l1 = ListNode(2)
        val l2 = ListNode(4)
        val l3 = ListNode(3)

        val r1 = ListNode(5)
        val r2 = ListNode(6)
        val r3 = ListNode(4)

        l1.next = l2
        l2.next = l3

        r1.next = r2
        r2.next = r3

        val result = target.addTwoNumbers(l1, r1)
        assertEquals(7, result.`val`)
        assertEquals(0, result.next.`val`)
        assertEquals(8, result.next.next.`val`)
    }

    @Test
    fun testAddTwoNumbers2() {
        val l1 = ListNode(1)
        val r1 = ListNode(9)
        val r2 = ListNode(9)
        r1.next = r2
        val result = target.addTwoNumbers(l1, r1)
        assertEquals(0, result.`val`)
        assertEquals(0, result.next.`val`)
        assertEquals(1, result.next.next.`val`)
    }
}