package com.liangxiaoqiao.leetcode.day.medium;


import java.util.List;
    
/*
 * English
 * id: 102
 * title: Binary Tree Level Order Traversal
 * href: https://leetcode.com/problems/binary-tree-level-order-traversal
 * desc: Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * return its level order traversal as:
 * [
 * [3],
 * [9,20],
 * [15,7]
 * ]
 * <p>
 * 中文
 * 序号: 102
 * 标题： 二叉树的层次遍历
 * 链接： https://leetcode-cn.com/problems/binary-tree-level-order-traversal
 * 描述： 给定一个二叉树，返回其按层次遍历的节点值。 （即逐层地，从左到右访问所有节点）。\n例如:\n给定二叉树: [3,9,20,null,null,15,7],\n    3\n   / \\\n  9  20\n    /  \\\n   15   7\n返回其层次遍历结果：\n[\n  [3],\n  [9,20],\n  [15,7]\n]
 * <p>
 * acceptance: 51.5%
 * difficulty: Medium
 * private: False
 */


//TODO init

/*
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        return null;
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}

