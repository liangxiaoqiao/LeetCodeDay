package com.liangxiaoqiao.leetcode.day.easy

import com.liangxiaoqiao.leetcode.day.pojo.ListNode
import com.liangxiaoqiao.leetcode.day.util.TreeUtils
import org.junit.Test
import kotlin.test.assertTrue

class ReverseLinkedListTest {

    private val target = ReverseLinkedList()

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

        val result = target.reverseList(l1)
        assertTrue(TreeUtils.sameArray(arrayOf(4, 6, 5, 3, 4, 2), TreeUtils.treeToArray(result)))

    }
}