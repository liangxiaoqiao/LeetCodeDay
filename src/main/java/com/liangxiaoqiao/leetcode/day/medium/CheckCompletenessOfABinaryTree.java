package com.liangxiaoqiao.leetcode.day.medium;


import com.liangxiaoqiao.leetcode.day.pojo.TreeNode;
    

/*
 * English
 * id: 958
 * title: Check Completeness of a Binary Tree
 * href: https://leetcode.com/problems/check-completeness-of-a-binary-tree
 * desc: Given a binary tree, determine if it is a complete binary tree.
 * Definition of a complete binary tree from Wikipedia:
 * In a complete binary tree every level, except possibly the last, is completely filled, and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.
 * Example 1:
 * Input: [1,2,3,4,5,6]
 * Output: true
 * Explanation: Every level before the last is full (ie. levels with node-values {1} and {2, 3}), and all nodes in the last level ({4, 5, 6}) are as far left as possible.
 * Example 2:
 * Input: [1,2,3,4,5,null,7]
 * Output: false
 * Explanation: The node with value 7 isn't as far left as possible.
 * Note:
 * The tree will have between 1 and 100 nodes.
 * <p>
 * 中文
 * 序号: 958
 * 标题： 二叉树的完全性检验
 * 链接： https://leetcode-cn.com/problems/check-completeness-of-a-binary-tree
 * 描述： 给定一个二叉树，确定它是否是一个完全二叉树。\n百度百科中对完全二叉树的定义如下：\n若设二叉树的深度为 h，除第 h 层外，其它各层 (1～h-1) 的结点数都达到最大个数，第 h 层所有的结点都连续集中在最左边，这就是完全二叉树。（注：第 h 层可能包含 1~ 2h 个节点。）\n  示例 1：\n输入：[1,2,3,4,5,6]\n输出：true\n解释：最后一层前的每一层都是满的（即，结点值为 {1} 和 {2,3} 的两层），且最后一层中的所有结点（{4,5,6}）都尽可能地向左。\n示例 2：\n输入：[1,2,3,4,5,null,7]\n输出：false\n解释：值为 7 的结点没有尽可能靠向左侧。\n  提示：\n树中将会有 1 到 100 个结点。
 * <p>
 * acceptance: 50.8%
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
public class CheckCompletenessOfABinaryTree {
    public boolean isCompleteTree(TreeNode root) {
        return false;
    }
}