package com.liangxiaoqiao.leetcode.day.medium;


import com.liangxiaoqiao.leetcode.day.pojo.TreeNode;
    

/*
 * English
 * id: 129
 * title: Sum Root to Leaf Numbers
 * href: https://leetcode.com/problems/sum-root-to-leaf-numbers
 * desc: Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.\nAn example is the root-to-leaf path 1->2->3 which represents the number 123.\nFind the total sum of all root-to-leaf numbers.\nNote: A leaf is a node with no children.\nExample:\nInput: [1,2,3]\n    1\n   / \\\n  2   3\nOutput: 25\nExplanation:\nThe root-to-leaf path 1->2 represents the number 12.\nThe root-to-leaf path 1->3 represents the number 13.\nTherefore, sum = 12 + 13 = 25.\nExample 2:\nInput: [4,9,0,5,1]\n    4\n   / \\\n  9   0\n / \\\n5   1\nOutput: 1026\nExplanation:\nThe root-to-leaf path 4->9->5 represents the number 495.\nThe root-to-leaf path 4->9->1 represents the number 491.\nThe root-to-leaf path 4->0 represents the number 40.\nTherefore, sum = 495 + 491 + 40 = 1026.
 * <p>
 * 中文
 * 序号: 129
 * 标题： 求根到叶子节点数字之和
 * 链接： https://leetcode-cn.com/problems/sum-root-to-leaf-numbers
 * 描述： 给定一个二叉树，它的每个结点都存放一个 0-9 的数字，每条从根到叶子节点的路径都代表一个数字。
 * 例如，从根到叶子节点路径 1->2->3 代表数字 123。
 * 计算从根到叶子节点生成的所有数字之和。
 * 说明: 叶子节点是指没有子节点的节点。
 * 示例 1:
 * 输入: [1,2,3]
 * 1
 * / \
 * 2   3
 * 输出: 25
 * 解释:
 * 从根到叶子节点路径 1->2 代表数字 12.
 * 从根到叶子节点路径 1->3 代表数字 13.
 * 因此，数字总和 = 12 + 13 = 25.
 * 示例 2:
 * 输入: [4,9,0,5,1]
 * 4
 * / \
 * 9   0
 * / \
 * 5   1
 * 输出: 1026
 * 解释:
 * 从根到叶子节点路径 4->9->5 代表数字 495.
 * 从根到叶子节点路径 4->9->1 代表数字 491.
 * 从根到叶子节点路径 4->0 代表数字 40.
 * 因此，数字总和 = 495 + 491 + 40 = 1026.
 * <p>
 * acceptance: 44.9%
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
public class SumRootToLeafNumbers {
    public int sumNumbers(TreeNode root) {
        return 0;
    }


}