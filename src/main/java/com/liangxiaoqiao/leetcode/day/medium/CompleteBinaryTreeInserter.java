package com.liangxiaoqiao.leetcode.day.medium;

    
import com.liangxiaoqiao.leetcode.day.pojo.TreeNode;
        

/*
 * English
 * id: 919
 * title: Complete Binary Tree Inserter
 * href: https://leetcode.com/problems/complete-binary-tree-inserter
 * desc: A complete binary tree is a binary tree in which every level, except possibly the last, is completely filled, and all nodes are as far left as possible.\nWrite a data structure CBTInserter that is initialized with a complete binary tree and supports the following operations:\nCBTInserter(TreeNode root) initializes the data structure on a given tree with head node root;\nCBTInserter.insert(int v) will insert a TreeNode into the tree with value node.val = v so that the tree remains complete, and returns the value of the parent of the inserted TreeNode;\nCBTInserter.get_root() will return the head node of the tree.\n  Example 1:\nInput: inputs = [\"CBTInserter\",\"insert\",\"get_root\"], inputs = [[[1]],[2],[]]\nOutput: [null,1,[1,2]]\nExample 2:\nInput: inputs = [\"CBTInserter\",\"insert\",\"insert\",\"get_root\"], inputs = [[[1,2,3,4,5,6]],[7],[8],[]]\nOutput: [null,3,4,[1,2,3,4,5,6,7,8]]\n  Note:\nThe initial given tree is complete and contains between 1 and 1000 nodes.\nCBTInserter.insert is called at most 10000 times per test case.\nEvery value of a given or inserted node is between 0 and 5000.\n
 * <p>
 * 中文
 * 序号: 919
 * 标题： 完全二叉树插入器
 * 链接： https://leetcode-cn.com/problems/complete-binary-tree-inserter
 * 描述： 完全二叉树是每一层（除最后一层外）都是完全填充（即，结点数达到最大）的，并且所有的结点都尽可能地集中在左侧。\n设计一个用完全二叉树初始化的数据结构 CBTInserter，它支持以下几种操作：\nCBTInserter(TreeNode root) 使用头结点为 root 的给定树初始化该数据结构；\nCBTInserter.insert(int v) 将 TreeNode 插入到存在值为 node.val = v  的树中以使其保持完全二叉树的状态，并返回插入的 TreeNode 的父结点的值；\nCBTInserter.get_root() 将返回树的头结点。\n  示例 1：\n输入：inputs = [\"CBTInserter\",\"insert\",\"get_root\"], inputs = [[[1]],[2],[]]\n输出：[null,1,[1,2]]\n示例 2：\n输入：inputs = [\"CBTInserter\",\"insert\",\"insert\",\"get_root\"], inputs = [[[1,2,3,4,5,6]],[7],[8],[]]\n输出：[null,3,4,[1,2,3,4,5,6,7,8]]\n  提示：\n最初给定的树是完全二叉树，且包含 1 到 1000 个结点。\n每个测试用例最多调用 CBTInserter.insert  操作 10000 次。\n给定结点或插入结点的每个值都在 0 到 5000 之间。
 * <p>
 * acceptance: 56.0%
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
class CompleteBinaryTreeInserter {
    public CompleteBinaryTreeInserter(TreeNode root) {
    }

    public int insert(int v) {
        return 0;
    }

    public TreeNode get_root() {
        return null;
    }
}

/*
 * Your CBTInserter object will be instantiated and called as such:
 * CBTInserter obj = new CBTInserter(root);
 * int param_1 = obj.insert(v);
 * TreeNode param_2 = obj.get_root();
 */
