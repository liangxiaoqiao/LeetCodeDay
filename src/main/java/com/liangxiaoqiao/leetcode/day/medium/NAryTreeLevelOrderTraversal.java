package com.liangxiaoqiao.leetcode.day.medium;


import java.util.List;
    
/*
 * English
 * id: 429
 * title: N-ary Tree Level Order Traversal
 * href: https://leetcode.com/problems/n-ary-tree-level-order-traversal
 * desc: Given an n-ary tree, return the level order traversal of its nodes\' values. (ie, from left to right, level by level).\nFor example, given a 3-ary tree:\n    We should return its level order traversal:\n[\n     [1],\n     [3,2,4],\n     [5,6]\n]\n  Note:\nThe depth of the tree is at most 1000.\nThe total number of nodes is at most 5000.
 * <p>
 * 中文
 * 序号: 429
 * 标题： N叉树的层序遍历
 * 链接： https://leetcode-cn.com/problems/n-ary-tree-level-order-traversal
 * 描述： 给定一个 N 叉树，返回其节点值的层序遍历。 (即从左到右，逐层遍历)。\n例如，给定一个 3叉树 :\n    返回其层序遍历:\n[\n     [1],\n     [3,2,4],\n     [5,6]\n]\n  说明:\n树的深度不会超过 1000。\n树的节点总数不会超过 5000。
 * <p>
 * acceptance: 61.7%
 * difficulty: Medium
 * private: False
 */


//TODO init
/*
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

public class NAryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(Node root) {
        return null;
    }

    private class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}

