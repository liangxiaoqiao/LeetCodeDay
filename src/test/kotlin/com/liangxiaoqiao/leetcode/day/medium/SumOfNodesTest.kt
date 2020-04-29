package com.liangxiaoqiao.leetcode.day.medium

import com.liangxiaoqiao.leetcode.day.util.TreeUtils
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SumOfNodesTest {
    private val target = SumOfNodes()

    @Test
    fun testSum() {
        val treeNode = TreeUtils.arrayToTree(arrayOf(6, 7, 8, 2, 7, 1, 3, 9, null, 1, 4, null, null, null, 5))
        assertEquals(18, target.sumEvenGrandparent(treeNode))
    }
//    @Test
//    fun testSum2() {
//        val treeNode = TreeUtils.arrayToTree(arrayOf(61,13,46,null,null,null,56,72))
//        assertEquals(72, target.sumEvenGrandparent2(treeNode))
//    }
}