package com.liangxiaoqiao.leetcode.day.medium;


import com.liangxiaoqiao.leetcode.day.pojo.TreeNode;

import java.util.List;
/*
 * English
 * id: 652
 * title: Find Duplicate Subtrees
 * href: https://leetcode.com/problems/find-duplicate-subtrees
 * desc: Given a binary tree, return all duplicate subtrees. For each kind of duplicate subtrees, you only need to return the root node of any one of them.
 * Two trees are duplicate if they have the same structure with same node values.
 * Example 1:
 * 1
 * / \
 * 2   3
 * /   / \
 * 4   2   4
 * /
 * 4
 * The following are two duplicate subtrees:
 * 2
 * /
 * 4
 * and
 * 4
 * Therefore, you need to return above trees' root in the form of a list.
 * <p>
 * 中文
 * 序号: 652
 * 标题： 寻找重复的子树
 * 链接： https://leetcode-cn.com/problems/find-duplicate-subtrees
 * 描述： 给定一棵二叉树，返回所有重复的子树。对于同一类的重复子树，你只需要返回其中任意一棵的根结点即可。\n两棵树重复是指它们具有相同的结构以及相同的结点值。\n示例 1：\n        1\n       / \\\n      2   3\n     /   / \\\n    4   2   4\n       /\n      4\n下面是两个重复的子树：\n      2\n     /\n    4\n和\n    4\n因此，你需要以列表的形式返回上述重复子树的根结点。
 * <p>
 * acceptance: 48.1%
 * difficulty: Medium
 * private: False
 * <p>
 * <p>
 * Definition for a binary tree node.
 * struct TreeNode {
 * int val;
 * struct TreeNode *left;
 * struct TreeNode *right;
 * };
 * <p>
 * Note: The returned array must be malloced, assume caller calls free().
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
public class FindDuplicateSubtrees {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        return null;
    }



}