package com.liangxiaoqiao.leetcode.day.easy;


import java.util.List;
    
/*
 * English
 * id: 559
 * title: Maximum Depth of N-ary Tree
 * href: https://leetcode.com/problems/maximum-depth-of-n-ary-tree
 * desc: Given a n-ary tree, find its maximum depth.\nThe maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.\nFor example, given a 3-ary tree:\n    We should return its max depth, which is 3.\n  Note:\nThe depth of the tree is at most 1000.\nThe total number of nodes is at most 5000.
 * <p>
 * 中文
 * 序号: 559
 * 标题： N叉树的最大深度
 * 链接： https://leetcode-cn.com/problems/maximum-depth-of-n-ary-tree
 * 描述： 给定一个 N 叉树，找到其最大深度。\n最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。\n例如，给定一个 3叉树 :\n    我们应返回其最大深度，3。\n说明:\n树的深度不会超过 1000。\n树的节点总不会超过 5000。
 * <p>
 * acceptance: 66.9%
 * difficulty: Easy
 * private: False
 */


//TODO init
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
public class MaximumDepthOfNAryTree {
    public int maxDepth(Node root) {
        return 0;
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
