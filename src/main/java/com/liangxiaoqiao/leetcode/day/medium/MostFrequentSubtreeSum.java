package com.liangxiaoqiao.leetcode.day.medium;


import com.liangxiaoqiao.leetcode.day.pojo.TreeNode;
    

/*
 * English
 * id: 508
 * title: Most Frequent Subtree Sum
 * href: https://leetcode.com/problems/most-frequent-subtree-sum
 * desc: Given the root of a tree, you are asked to find the most frequent subtree sum. The subtree sum of a node is defined as the sum of all the node values formed by the subtree rooted at that node (including the node itself). So what is the most frequent subtree sum value? If there is a tie, return all the values with the highest frequency in any order.\nExamples 1\nInput:\n  5\n /  \\\n2   -3\nreturn [2, -3, 4], since all the values happen only once, return all of them in any order.\nExamples 2\nInput:\n  5\n /  \\\n2   -5\nreturn [2], since 2 happens twice, however -5 only occur once.\nNote: You may assume the sum of values in any subtree is in the range of 32-bit signed integer.
 * <p>
 * 中文
 * 序号: 508
 * 标题： 出现次数最多的子树元素和
 * 链接： https://leetcode-cn.com/problems/most-frequent-subtree-sum
 * 描述： 给出二叉树的根，找出出现次数最多的子树元素和。一个结点的子树元素和定义为以该结点为根的二叉树上所有结点的元素之和（包括结点本身）。然后求出出现次数最多的子树元素和。如果有多个元素出现的次数相同，返回所有出现次数最多的元素（不限顺序）。\n  示例 1\n输入:\n  5\n /  \\\n2   -3\n返回 [2, -3, 4]，所有的值均只出现一次，以任意顺序返回所有值。\n示例 2\n输入:\n  5\n /  \\\n2   -5\n返回 [2]，只有 2 出现两次，-5 只出现 1 次。\n  提示： 假设任意子树元素和均可以用 32 位有符号整数表示。
 * <p>
 * acceptance: 56.3%
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
public class MostFrequentSubtreeSum {
    public int[] findFrequentTreeSum(TreeNode root) {
        return null;
    }
}