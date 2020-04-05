package com.liangxiaoqiao.leetcode.day.medium;


import com.liangxiaoqiao.leetcode.day.pojo.TreeNode;
    

/*
 * English
 * id: 865
 * title: Smallest Subtree with all the Deepest Nodes
 * href: https://leetcode.com/problems/smallest-subtree-with-all-the-deepest-nodes
 * desc: Given a binary tree rooted at root, the depth of each node is the shortest distance to the root.
 * A node is deepest if it has the largest depth possible among any node in the entire tree.
 * The subtree of a node is that node, plus the set of all descendants of that node.
 * Return the node with the largest depth such that it contains all the deepest nodes in its subtree.
 * Example 1:
 * Input: [3,5,1,6,2,0,8,null,null,7,4]
 * Output: [2,7,4]
 * Explanation:
 * <p>
 * <p>
 * <p>
 * We return the node with value 2, colored in yellow in the diagram.
 * The nodes colored in blue are the deepest nodes of the tree.
 * The input "[3, 5, 1, 6, 2, 0, 8, null, null, 7, 4]" is a serialization of the given tree.
 * The output "[2, 7, 4]" is a serialization of the subtree rooted at the node with value 2.
 * Both the input and output have TreeNode type.
 * Note:
 * The number of nodes in the tree will be between 1 and 500.
 * The values of each node are unique.
 * <p>
 * 中文
 * 序号: 865
 * 标题： 具有所有最深结点的最小子树
 * 链接： https://leetcode-cn.com/problems/smallest-subtree-with-all-the-deepest-nodes
 * 描述： 给定一个根为 root 的二叉树，每个结点的深度是它到根的最短距离。\n如果一个结点在整个树的任意结点之间具有最大的深度，则该结点是最深的。\n一个结点的子树是该结点加上它的所有后代的集合。\n返回能满足“以该结点为根的子树中包含所有最深的结点”这一条件的具有最大深度的结点。\n  示例：\n输入：[3,5,1,6,2,0,8,null,null,7,4]\n输出：[2,7,4]\n解释：\n\n我们返回值为 2 的结点，在图中用黄色标记。\n在图中用蓝色标记的是树的最深的结点。\n输入 \"[3, 5, 1, 6, 2, 0, 8, null, null, 7, 4]\" 是对给定的树的序列化表述。\n输出 \"[2, 7, 4]\" 是对根结点的值为 2 的子树的序列化表述。\n输入和输出都具有 TreeNode 类型。\n  提示：\n树中结点的数量介于 1 和 500 之间。\n每个结点的值都是独一无二的。
 * <p>
 * acceptance: 58.8%
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
public class SmallestSubtreeWithAllTheDeepestNodes {
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return null;
    }
}

