package com.liangxiaoqiao.leetcode.day.medium

import com.liangxiaoqiao.leetcode.day.pojo.TreeNode
import com.liangxiaoqiao.leetcode.day.util.TreeUtils
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class AddOneRowToTreeTest {

    private var target: AddOneRowToTree = AddOneRowToTree();

    @Test
    fun testAddOneRow() {
        val t1 = TreeNode(1)
        val t2 = TreeNode(2)
        val t3 = TreeNode(3)
        val t4 = TreeNode(4)
        t1.left = t2
        t1.right = t3
        t2.left = t4
        val result = target.addOneRow(t1, 5, 4)
        assertEquals(true, TreeUtils.sameArray(arrayOf(1, 2, 3, 4, null, null, null, 5, 5), TreeUtils.treeToArray(result)))
    }


    @Test
    fun testAddOneRow1() {
        val t1 = TreeNode(1)
        val result = target.addOneRow(t1, 2, 1)
        assertEquals(true, TreeUtils.sameArray(arrayOf(2, 1), TreeUtils.treeToArray(result)))
    }
}