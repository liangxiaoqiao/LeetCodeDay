package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 117
 * title: Populating Next Right Pointers in Each Node II
 * href: https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii
 * desc: Given a binary tree
 * struct Node {
 * int val;
 * Node *left;
 * Node *right;
 * Node *next;
 * }
 * Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.
 * Initially, all next pointers are set to NULL.
 * Follow up:
 * You may only use constant extra space.
 * Recursive approach is fine, you may assume implicit stack space does not count as extra space for this problem.
 * Example 1:
 * Input: root = [1,2,3,4,5,null,7]
 * Output: [1,#,2,3,#,4,5,7,#]
 * Explanation: Given the above binary tree (Figure A), your function should populate each next pointer to point to its next right node, just like in Figure B. The serialized output is in level order as connected by the next pointers, with '#' signifying the end of each level.
 * Constraints:
 * The number of nodes in the given tree is less than 6000.
 * -100 <= node.val <= 100
 * <p>
 * 中文
 * 序号: 117
 * 标题： 填充每个节点的下一个右侧节点指针 II
 * 链接： https://leetcode-cn.com/problems/populating-next-right-pointers-in-each-node-ii
 * 描述： 给定一个二叉树\nstruct Node {\n  int val;\n  Node *left;\n  Node *right;\n  Node *next;\n}\n填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。\n初始状态下，所有 next 指针都被设置为 NULL。\n  示例：\n输入：{\"$id\":\"1\",\"left\":{\"$id\":\"2\",\"left\":{\"$id\":\"3\",\"left\":null,\"next\":null,\"right\":null,\"val\":4},\"next\":null,\"right\":{\"$id\":\"4\",\"left\":null,\"next\":null,\"right\":null,\"val\":5},\"val\":2},\"next\":null,\"right\":{\"$id\":\"5\",\"left\":null,\"next\":null,\"right\":{\"$id\":\"6\",\"left\":null,\"next\":null,\"right\":null,\"val\":7},\"val\":3},\"val\":1}\n\n输出：{\"$id\":\"1\",\"left\":{\"$id\":\"2\",\"left\":{\"$id\":\"3\",\"left\":null,\"next\":{\"$id\":\"4\",\"left\":null,\"next\":{\"$id\":\"5\",\"left\":null,\"next\":null,\"right\":null,\"val\":7},\"right\":null,\"val\":5},\"right\":null,\"val\":4},\"next\":{\"$id\":\"6\",\"left\":null,\"next\":null,\"right\":{\"$ref\":\"5\"},\"val\":3},\"right\":{\"$ref\":\"4\"},\"val\":2},\"next\":null,\"right\":{\"$ref\":\"6\"},\"val\":1}\n\n解释：给定二叉树如图 A 所示，你的函数应该填充它的每个 next 指针，以指向其下一个右侧节点，如图 B 所示。\n  提示：\n你只能使用常量级额外空间。\n使用递归解题也符合要求，本题中递归程序占用的栈空间不算做额外的空间复杂度。
 * <p>
 * acceptance: 36.6%
 * difficulty: Medium
 * private: False
 */


//TODO init
/*
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

public class PopulatingNextRightPointersInEachNodeIi {
    public Node connect(Node root) {
        return null;
    }

    private class Node {
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