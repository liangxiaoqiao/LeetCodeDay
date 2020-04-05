package com.liangxiaoqiao.leetcode.day.medium;

    
    import com.liangxiaoqiao.leetcode.day.pojo.TreeNode;
        

/*
 * English
 * id: 1080
 * title: Insufficient Nodes in Root to Leaf Paths
 * href: https://leetcode.com/problems/insufficient-nodes-in-root-to-leaf-paths
 * desc: Given the root of a binary tree, consider all root to leaf paths: paths from the root to any leaf.  (A leaf is a node with no children.)
 * A node is insufficient if every such root to leaf path intersecting this node has sum strictly less than limit.
 * Delete all insufficient nodes simultaneously, and return the root of the resulting binary tree.
 * Example 1:
 * Input: root = [1,2,3,4,-99,-99,7,8,9,-99,-99,12,13,-99,14], limit = 1
 * <p>
 * Output: [1,2,3,4,null,null,7,8,9,null,14]
 * Example 2:
 * Input: root = [5,4,8,11,null,17,4,7,1,null,null,5,3], limit = 22
 * <p>
 * Output: [5,4,8,11,null,17,4,7,null,null,null,5]
 * Example 3:
 * Input: root = [1,2,-3,-5,null,4,null], limit = -1
 * <p>
 * Output: [1,null,-3,4]
 * Note:
 * The given tree will have between 1 and 5000 nodes.
 * -10^5 <= node.val <= 10^5
 * -10^9 <= limit <= 10^9
 * <p>
 * <p>
 * 中文
 * 序号: 1080
 * 标题： 根到叶路径上的不足节点
 * 链接： https://leetcode-cn.com/problems/insufficient-nodes-in-root-to-leaf-paths
 * 描述： 给定一棵二叉树的根 root，请你考虑它所有 从根到叶的路径：从根到任何叶的路径。（所谓一个叶子节点，就是一个没有子节点的节点）
 * 假如通过节点 node 的每种可能的 “根-叶” 路径上值的总和全都小于给定的 limit，则该节点被称之为「不足节点」，需要被删除。
 * 请你删除所有不足节点，并返回生成的二叉树的根。
 * 示例 1：
 * 输入：root = [1,2,3,4,-99,-99,7,8,9,-99,-99,12,13,-99,14], limit = 1
 * <p>
 * 输出：[1,2,3,4,null,null,7,8,9,null,14]
 * 示例 2：
 * 输入：root = [5,4,8,11,null,17,4,7,1,null,null,5,3], limit = 22
 * <p>
 * 输出：[5,4,8,11,null,17,4,7,null,null,null,5]
 * 示例 3：
 * 输入：root = [5,-6,-6], limit = 0
 * 输出：[]
 * 提示：
 * 给定的树有 1 到 5000 个节点
 * -10^5 <= node.val <= 10^5
 * -10^9 <= limit <= 10^9
 * <p>
 * <p>
 * acceptance: 46.0%
 * difficulty: Medium
 * private: False
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
public class InsufficientNodesInRootToLeafPaths {
    public TreeNode sufficientSubset(TreeNode root, int limit) {
        return null;
    }


}

