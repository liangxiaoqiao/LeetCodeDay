package com.liangxiaoqiao.leetcode.day.easy;


import java.util.List;
    

/*
 * English
 * id: 589
 * title: N-ary Tree Preorder Traversal
 * href: https://leetcode.com/problems/n-ary-tree-preorder-traversal
 * desc: Given an n-ary tree, return the preorder traversal of its nodes\' values.\nFor example, given a 3-ary tree:\n    Return its preorder traversal as: [1,3,5,6,2,4].\n  Note:\nRecursive solution is trivial, could you do it iteratively?
 * <p>
 * 中文
 * 序号: 589
 * 标题： N叉树的前序遍历
 * 链接： https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal
 * 描述： 给定一个 N 叉树，返回其节点值的前序遍历。\n例如，给定一个 3叉树 :\n    返回其前序遍历: [1,3,5,6,2,4]。\n  说明: 递归法很简单，你可以使用迭代法完成此题吗?
 * <p>
 * acceptance: 69.7%
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

public class NAryTreePreorderTraversal {
    public List<Integer> preorder(Node root) {
        return null;
    }

    public class Node {
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