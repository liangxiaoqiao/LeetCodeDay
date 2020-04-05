package com.liangxiaoqiao.leetcode.day.medium;


import com.liangxiaoqiao.leetcode.day.pojo.TreeNode;
    

/*
 * English
 * id: 450
 * title: Delete Node in a BST
 * href: https://leetcode.com/problems/delete-node-in-a-bst
 * desc: Given a root node reference of a BST and a key, delete the node with the given key in the BST. Return the root node reference (possibly updated) of the BST.\nBasically, the deletion can be divided into two stages:\nSearch for a node to remove.\nIf the node is found, delete the node.\nNote: Time complexity should be O(height of tree).\nExample:\nroot = [5,3,6,2,4,null,7]\nkey = 3\n\n    5\n   / \\\n  3   6\n / \\   \\\n2   4   7\n\nGiven key to delete is 3. So we find the node with value 3 and delete it.\n\nOne valid answer is [5,4,6,2,null,null,7], shown in the following BST.\n\n    5\n   / \\\n  4   6\n /     \\\n2       7\n\nAnother valid answer is [5,2,6,null,4,null,7].\n\n    5\n   / \\\n  2   6\n   \\   \\\n    4   7
 * <p>
 * 中文
 * 序号: 450
 * 标题： 删除二叉搜索树中的节点
 * 链接： https://leetcode-cn.com/problems/delete-node-in-a-bst
 * 描述： 给定一个二叉搜索树的根节点 root 和一个值 key，删除二叉搜索树中的 key 对应的节点，并保证二叉搜索树的性质不变。返回二叉搜索树（有可能被更新）的根节点的引用。\n一般来说，删除节点可分为两个步骤：\n首先找到需要删除的节点；\n如果找到了，删除它。\n说明： 要求算法时间复杂度为 O(h)，h 为树的高度。\n示例:\nroot = [5,3,6,2,4,null,7]\nkey = 3\n\n    5\n   / \\\n  3   6\n / \\   \\\n2   4   7\n\n给定需要删除的节点值是 3，所以我们首先找到 3 这个节点，然后删除它。\n\n一个正确的答案是 [5,4,6,2,null,null,7], 如下图所示。\n\n    5\n   / \\\n  4   6\n /     \\\n2       7\n\n另一个正确答案是 [5,2,6,null,4,null,7]。\n\n    5\n   / \\\n  2   6\n   \\   \\\n    4   7
 * <p>
 * acceptance: 41.3%
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
public class DeleteNodeInABst {
    public TreeNode deleteNode(TreeNode root, int key) {
        return null;
    }
}

