package com.liangxiaoqiao.leetcode.day.medium

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class AccountsMergeTest {

    private val target = AccountsMerge()

    @Test
    fun testAccountsMerge() {
        val param = listOf(listOf("John", "johnsmith@mail.com", "john_newyork@mail.com"),
                listOf("John", "johnsmith@mail.com", "john00@mail.com"),
                listOf("Mary", "mary@mail.com"),
                listOf("John", "johnnybravo@mail.com"))
        val result = target.accountsMerge(param)
        assertEquals(3, result.size)
    }
}