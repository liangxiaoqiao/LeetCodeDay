package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 116
 * title: Populating Next Right Pointers in Each Node
 * href: https://leetcode.com/problems/populating-next-right-pointers-in-each-node
 * desc: You are given a perfect binary tree where all leaves are on the same level, and every parent has two children. The binary tree has the following definition:\nstruct Node {\n  int val;\n  Node *left;\n  Node *right;\n  Node *next;\n}\nPopulate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.\nInitially, all next pointers are set to NULL.\n  Example:\nInput: {\"$id\":\"1\",\"left\":{\"$id\":\"2\",\"left\":{\"$id\":\"3\",\"left\":null,\"next\":null,\"right\":null,\"val\":4},\"next\":null,\"right\":{\"$id\":\"4\",\"left\":null,\"next\":null,\"right\":null,\"val\":5},\"val\":2},\"next\":null,\"right\":{\"$id\":\"5\",\"left\":{\"$id\":\"6\",\"left\":null,\"next\":null,\"right\":null,\"val\":6},\"next\":null,\"right\":{\"$id\":\"7\",\"left\":null,\"next\":null,\"right\":null,\"val\":7},\"val\":3},\"val\":1}\n\nOutput: {\"$id\":\"1\",\"left\":{\"$id\":\"2\",\"left\":{\"$id\":\"3\",\"left\":null,\"next\":{\"$id\":\"4\",\"left\":null,\"next\":{\"$id\":\"5\",\"left\":null,\"next\":{\"$id\":\"6\",\"left\":null,\"next\":null,\"right\":null,\"val\":7},\"right\":null,\"val\":6},\"right\":null,\"val\":5},\"right\":null,\"val\":4},\"next\":{\"$id\":\"7\",\"left\":{\"$ref\":\"5\"},\"next\":null,\"right\":{\"$ref\":\"6\"},\"val\":3},\"right\":{\"$ref\":\"4\"},\"val\":2},\"next\":null,\"right\":{\"$ref\":\"7\"},\"val\":1}\n\nExplanation: Given the above perfect binary tree (Figure A), your function should populate each next pointer to point to its next right node, just like in Figure B.\n  Note:\nYou may only use constant extra space.\nRecursive approach is fine, implicit stack space does not count as extra space for this problem.
 * <p>
 * 中文
 * 序号: 116
 * 标题： 填充每个节点的下一个右侧节点指针
 * 链接： https://leetcode-cn.com/problems/populating-next-right-pointers-in-each-node
 * 描述： 给定一个完美二叉树，其所有叶子节点都在同一层，每个父节点都有两个子节点。二叉树定义如下：
 * struct Node {
 * int val;
 * Node *left;
 * Node *right;
 * Node *next;
 * }
 * 填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。
 * 初始状态下，所有 next 指针都被设置为 NULL。
 * 示例：
 * 输入：{"$id":"1","left":{"$id":"2","left":{"$id":"3","left":null,"next":null,"right":null,"val":4},"next":null,"right":{"$id":"4","left":null,"next":null,"right":null,"val":5},"val":2},"next":null,"right":{"$id":"5","left":{"$id":"6","left":null,"next":null,"right":null,"val":6},"next":null,"right":{"$id":"7","left":null,"next":null,"right":null,"val":7},"val":3},"val":1}
 * <p>
 * 输出：{"$id":"1","left":{"$id":"2","left":{"$id":"3","left":null,"next":{"$id":"4","left":null,"next":{"$id":"5","left":null,"next":{"$id":"6","left":null,"next":null,"right":null,"val":7},"right":null,"val":6},"right":null,"val":5},"right":null,"val":4},"next":{"$id":"7","left":{"$ref":"5"},"next":null,"right":{"$ref":"6"},"val":3},"right":{"$ref":"4"},"val":2},"next":null,"right":{"$ref":"7"},"val":1}
 * <p>
 * 解释：给定二叉树如图 A 所示，你的函数应该填充它的每个 next 指针，以指向其下一个右侧节点，如图 B 所示。
 * 提示：
 * 你只能使用常量级额外空间。
 * 使用递归解题也符合要求，本题中递归程序占用的栈空间不算做额外的空间复杂度。
 * <p>
 * acceptance: 41.0%
 * difficulty: Medium
 * private: False
 */


//TODO init
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
public class PopulatingNextRightPointersInEachNode {
    public Node connect(Node root) {
        return null;
    }

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
}