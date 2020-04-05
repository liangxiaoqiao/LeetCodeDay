package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 572
 * title: Subtree of Another Tree
 * href: https://leetcode.com/problems/subtree-of-another-tree
 * desc: Given two non-empty binary trees s and t, check whether tree t has exactly the same structure and node values with a subtree of s. A subtree of s is a tree consists of a node in s and all of this node's descendants. The tree s could also be considered as a subtree of itself.
 * Example 1:
 * Given tree s:
 * 3
 * / \
 * 4   5
 * / \
 * 1   2
 * Given tree t:
 * 4
 * / \
 * 1   2
 * Return true, because t has the same structure and node values with a subtree of s.
 * Example 2:
 * Given tree s:
 * 3
 * / \
 * 4   5
 * / \
 * 1   2
 * /
 * 0
 * Given tree t:
 * 4
 * / \
 * 1   2
 * Return false.
 * <p>
 * 中文
 * 序号: 572
 * 标题： 另一个树的子树
 * 链接： https://leetcode-cn.com/problems/subtree-of-another-tree
 * 描述： 给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。s 的一个子树包括 s 的一个节点和这个节点的所有子孙。s 也可以看做它自身的一棵子树。\n示例 1:\n给定的树 s:\n     3\n    / \\\n   4   5\n  / \\\n 1   2\n给定的树 t：\n   4 \n  / \\\n 1   2\n返回 true，因为 t 与 s 的一个子树拥有相同的结构和节点值。\n示例 2:\n给定的树 s：\n     3\n    / \\\n   4   5\n  / \\\n 1   2\n    /\n   0\n给定的树 t：\n   4\n  / \\\n 1   2\n返回 false。
 * <p>
 * acceptance: 43.4%
 * difficulty: Easy
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
 * Definition for a binary tree node.
 * struct TreeNode {
 * int val;
 * struct TreeNode *left;
 * struct TreeNode *right;
 * };
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
public class SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        return false;
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