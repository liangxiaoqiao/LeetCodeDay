package com.liangxiaoqiao.leetcode.day.easy;


import java.util.List;
    
/*
 * English
 * id: 590
 * title: N-ary Tree Postorder Traversal
 * href: https://leetcode.com/problems/n-ary-tree-postorder-traversal
 * desc: Given an n-ary tree, return the postorder traversal of its nodes' values.
 * Nary-Tree input serialization is represented in their level order traversal, each group of children is separated by the null value (See examples).
 * Follow up:
 * Recursive solution is trivial, could you do it iteratively?
 * Example 1:
 * Input: root = [1,null,3,2,4,null,5,6]
 * Output: [5,6,3,2,4,1]
 * Example 2:
 * Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
 * Output: [2,6,14,11,7,3,12,8,4,13,9,10,5,1]
 * Constraints:
 * The height of the n-ary tree is less than or equal to 1000
 * The total number of nodes is between [0, 10^4]
 * <p>
 * 中文
 * 序号: 590
 * 标题： N叉树的后序遍历
 * 链接： https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal
 * 描述： 给定一个 N 叉树，返回其节点值的后序遍历。\n例如，给定一个 3叉树 :\n    返回其后序遍历: [5,6,3,2,4,1].\n  说明: 递归法很简单，你可以使用迭代法完成此题吗?
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
public class NAryTreePostorderTraversal {
    public List<Integer> postorder(Node root) {
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

    ;
}

