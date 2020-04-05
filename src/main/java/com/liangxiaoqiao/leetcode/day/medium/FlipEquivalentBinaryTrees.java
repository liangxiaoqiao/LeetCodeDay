package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 951
 * title: Flip Equivalent Binary Trees
 * href: https://leetcode.com/problems/flip-equivalent-binary-trees
 * desc: For a binary tree T, we can define a flip operation as follows: choose any node, and swap the left and right child subtrees.
 * A binary tree X is flip equivalent to a binary tree Y if and only if we can make X equal to Y after some number of flip operations.
 * Write a function that determines whether two binary trees are flip equivalent.  The trees are given by root nodes root1 and root2.
 * Example 1:
 * Input: root1 = [1,2,3,4,5,6,null,null,null,7,8], root2 = [1,3,2,null,6,4,5,null,null,null,null,8,7]
 * Output: true
 * Explanation: We flipped at nodes with values 1, 3, and 5.
 * Note:
 * Each tree will have at most 100 nodes.
 * Each value in each tree will be a unique integer in the range [0, 99].
 * <p>
 * <p>
 * 中文
 * 序号: 951
 * 标题： 翻转等价二叉树
 * 链接： https://leetcode-cn.com/problems/flip-equivalent-binary-trees
 * 描述： 我们可以为二叉树 T 定义一个翻转操作，如下所示：选择任意节点，然后交换它的左子树和右子树。\n只要经过一定次数的翻转操作后，能使 X 等于 Y，我们就称二叉树 X 翻转等价于二叉树 Y。\n编写一个判断两个二叉树是否是翻转等价的函数。这些树由根节点 root1 和 root2 给出。\n  示例：\n输入：root1 = [1,2,3,4,5,6,null,null,null,7,8], root2 = [1,3,2,null,6,4,5,null,null,null,null,8,7]\n输出：true\n解释：We flipped at nodes with values 1, 3, and 5.\n  提示：\n每棵树最多有 100 个节点。\n每棵树中的每个值都是唯一的、在 [0, 99] 范围内的整数。\n
 * <p>
 * acceptance: 65.5%
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

public class FlipEquivalentBinaryTrees {
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
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