package com.liangxiaoqiao.leetcode.day.medium;


import com.liangxiaoqiao.leetcode.day.pojo.TreeNode;
    

/*
 * English
 * id: 98
 * title: Validate Binary Search Tree
 * href: https://leetcode.com/problems/validate-binary-search-tree
 * desc: Given a binary tree, determine if it is a valid binary search tree (BST).\nAssume a BST is defined as follows:\nThe left subtree of a node contains only nodes with keys less than the node\'s key.\nThe right subtree of a node contains only nodes with keys greater than the node\'s key.\nBoth the left and right subtrees must also be binary search trees.\nExample 1:\nInput:\n    2\n   / \\\n  1   3\nOutput: true\nExample 2:\n    5\n   / \\\n  1   4\n     / \\\n    3   6\nOutput: false\nExplanation: The input is: [5,1,4,null,null,3,6]. The root node\'s value\n             is 5 but its right child\'s value is 4.
 * <p>
 * 中文
 * 序号: 98
 * 标题： 验证二叉搜索树
 * 链接： https://leetcode-cn.com/problems/validate-binary-search-tree
 * 描述： 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 * 假设一个二叉搜索树具有如下特征：
 * 节点的左子树只包含小于当前节点的数。
 * 节点的右子树只包含大于当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 * 示例 1:
 * 输入:
 * 2
 * / \
 * 1   3
 * 输出: true
 * 示例 2:
 * 输入:
 * 5
 * / \
 * 1   4
 * / \
 * 3   6
 * 输出: false
 * 解释: 输入为: [5,1,4,null,null,3,6]。
 * 根节点的值为 5 ，但是其右子节点值为 4 。
 * <p>
 * acceptance: 26.8%
 * difficulty: Medium
 * private: False
 */


//TODO init

/*
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return false;
    }
}