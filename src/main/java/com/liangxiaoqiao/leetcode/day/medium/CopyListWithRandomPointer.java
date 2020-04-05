package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 138
 * title: Copy List with Random Pointer
 * href: https://leetcode.com/problems/copy-list-with-random-pointer
 * desc: A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.
 * Return a deep copy of the list.
 * The Linked List is represented in the input/output as a list of n nodes. Each node is represented as a pair of [val, random_index] where:
 * val: an integer representing Node.val
 * random_index: the index of the node (range from 0 to n-1) where random pointer points to, or null if it does not point to any node.
 * Example 1:
 * Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
 * Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]
 * Example 2:
 * Input: head = [[1,1],[2,1]]
 * Output: [[1,1],[2,1]]
 * Example 3:
 * Input: head = [[3,null],[3,0],[3,null]]
 * Output: [[3,null],[3,0],[3,null]]
 * Example 4:
 * Input: head = []
 * Output: []
 * Explanation: Given linked list is empty (null pointer), so return null.
 * Constraints:
 * -10000 <= Node.val <= 10000
 * Node.random is null or pointing to a node in the linked list.
 * Number of Nodes will not exceed 1000.
 * <p>
 * 中文
 * 序号: 138
 * 标题： 复制带随机指针的链表
 * 链接： https://leetcode-cn.com/problems/copy-list-with-random-pointer
 * 描述： 给定一个链表，每个节点包含一个额外增加的随机指针，该指针可以指向链表中的任何节点或空节点。\n要求返回这个链表的深拷贝。 \n  示例：\n输入：\n{\"$id\":\"1\",\"next\":{\"$id\":\"2\",\"next\":null,\"random\":{\"$ref\":\"2\"},\"val\":2},\"random\":{\"$ref\":\"2\"},\"val\":1}\n\n解释：\n节点 1 的值是 1，它的下一个指针和随机指针都指向节点 2 。\n节点 2 的值是 2，它的下一个指针指向 null，随机指针指向它自己。\n  提示：\n你必须返回给定头的拷贝作为对克隆列表的引用。
 * <p>
 * acceptance: 31.4%
 * difficulty: Medium
 * private: False
 */


//TODO init
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
public class CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        return null;
    }

    private class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}

