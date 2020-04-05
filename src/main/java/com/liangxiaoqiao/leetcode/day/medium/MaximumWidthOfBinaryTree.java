package com.liangxiaoqiao.leetcode.day.medium;


import com.liangxiaoqiao.leetcode.day.pojo.TreeNode;
    

/*
 * English
 * id: 662
 * title: Maximum Width of Binary Tree
 * href: https://leetcode.com/problems/maximum-width-of-binary-tree
 * desc: Given a binary tree, write a function to get the maximum width of the given tree. The width of a tree is the maximum width among all levels. The binary tree has the same structure as a full binary tree, but some nodes are null.\nThe width of one level is defined as the length between the end-nodes (the leftmost and right most non-null nodes in the level, where the null nodes between the end-nodes are also counted into the length calculation.\nExample 1:\nInput: \n\n           1\n         /   \\\n        3     2\n       / \\     \\  \n      5   3     9 \n\nOutput: 4\nExplanation: The maximum width existing in the third level with the length 4 (5,3,null,9).\nExample 2:\nInput: \n\n          1\n         /  \n        3    \n       / \\       \n      5   3     \n\nOutput: 2\nExplanation: The maximum width existing in the third level with the length 2 (5,3).\nExample 3:\nInput: \n\n          1\n         / \\\n        3   2 \n       /        \n      5      \n\nOutput: 2\nExplanation: The maximum width existing in the second level with the length 2 (3,2).\nExample 4:\nInput: \n\n          1\n         / \\\n        3   2\n       /     \\  \n      5       9 \n     /         \\\n    6           7\nOutput: 8\nExplanation:The maximum width existing in the fourth level with the length 8 (6,null,null,null,null,null,null,7).\nNote: Answer will in the range of 32-bit signed integer.
 * <p>
 * 中文
 * 序号: 662
 * 标题： 二叉树最大宽度
 * 链接： https://leetcode-cn.com/problems/maximum-width-of-binary-tree
 * 描述： 给定一个二叉树，编写一个函数来获取这个树的最大宽度。树的宽度是所有层中的最大宽度。这个二叉树与满二叉树（full binary tree）结构相同，但一些节点为空。\n每一层的宽度被定义为两个端点（该层最左和最右的非空节点，两端点间的null节点也计入长度）之间的长度。\n示例 1:\n输入: \n\n           1\n         /   \\\n        3     2\n       / \\     \\  \n      5   3     9 \n\n输出: 4\n解释: 最大值出现在树的第 3 层，宽度为 4 (5,3,null,9)。\n示例 2:\n输入: \n\n          1\n         /  \n        3    \n       / \\       \n      5   3     \n\n输出: 2\n解释: 最大值出现在树的第 3 层，宽度为 2 (5,3)。\n示例 3:\n输入: \n\n          1\n         / \\\n        3   2 \n       /        \n      5      \n\n输出: 2\n解释: 最大值出现在树的第 2 层，宽度为 2 (3,2)。\n示例 4:\n输入: \n\n          1\n         / \\\n        3   2\n       /     \\  \n      5       9 \n     /         \\\n    6           7\n输出: 8\n解释: 最大值出现在树的第 4 层，宽度为 8 (6,null,null,null,null,null,null,7)。\n注意: 答案在32位有符号整数的表示范围内。
 * <p>
 * acceptance: 39.6%
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
public class MaximumWidthOfBinaryTree {
    public int widthOfBinaryTree(TreeNode root) {
        return 0;
    }


}