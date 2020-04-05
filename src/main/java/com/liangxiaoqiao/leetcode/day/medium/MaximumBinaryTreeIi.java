package com.liangxiaoqiao.leetcode.day.medium;


import com.liangxiaoqiao.leetcode.day.pojo.TreeNode;
    

/*
 * English
 * id: 998
 * title: Maximum Binary Tree II
 * href: https://leetcode.com/problems/maximum-binary-tree-ii
 * desc: We are given the root node of a maximum tree: a tree where every node has a value greater than any other value in its subtree.\nJust as in the previous problem, the given tree was constructed from an list A (root = Construct(A)) recursively with the following Construct(A) routine:\nIf A is empty, return null.\nOtherwise, let A[i] be the largest element of A.  Create a root node with value A[i].\nThe left child of root will be Construct([A[0], A[1], ..., A[i-1]])\nThe right child of root will be Construct([A[i+1], A[i+2], ..., A[A.length - 1]])\nReturn root.\nNote that we were not given A directly, only a root node root = Construct(A).\nSuppose B is a copy of A with the value val appended to it.  It is guaranteed that B has unique values.\nReturn Construct(B).\n  Example 1:\nInput: root = [4,1,3,null,null,2], val = 5\nOutput: [5,4,null,1,3,null,null,2]\nExplanation: A = [1,4,2,3], B = [1,4,2,3,5]\nExample 2:\nInput: root = [5,2,4,null,1], val = 3\nOutput: [5,2,4,null,1,null,3]\nExplanation: A = [2,1,5,4], B = [2,1,5,4,3]\nExample 3:\nInput: root = [5,2,3,null,1], val = 4\nOutput: [5,2,4,null,1,3]\nExplanation: A = [2,1,5,3], B = [2,1,5,3,4]\n  Note:\n1 <= B.length <= 100
 * <p>
 * 中文
 * 序号: 998
 * 标题： 最大二叉树 II
 * 链接： https://leetcode-cn.com/problems/maximum-binary-tree-ii
 * 描述： None
 * <p>
 * acceptance: 61.7%
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
public class MaximumBinaryTreeIi {
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        return null;
    }


}

