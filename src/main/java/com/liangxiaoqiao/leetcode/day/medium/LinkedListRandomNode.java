package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 382
 * title: Linked List Random Node
 * href: https://leetcode.com/problems/linked-list-random-node
 * desc: Given a singly linked list, return a random node's value from the linked list. Each node must have the same probability of being chosen.
 * Follow up:
 * What if the linked list is extremely large and its length is unknown to you? Could you solve this efficiently without using extra space?
 * Example:
 * // Init a singly linked list [1,2,3].
 * ListNode head = new ListNode(1);
 * head.next = new ListNode(2);
 * head.next.next = new ListNode(3);
 * Solution solution = new Solution(head);
 * <p>
 * // getRandom() should return either 1, 2, or 3 randomly. Each element should have equal probability of returning.
 * solution.getRandom();
 * <p>
 * 中文
 * 序号: 382
 * 标题： 链表随机节点
 * 链接： https://leetcode-cn.com/problems/linked-list-random-node
 * 描述： 给定一个单链表，随机选择链表的一个节点，并返回相应的节点值。保证每个节点被选的概率一样。\n进阶:\n如果链表十分大且长度未知，如何解决这个问题？你能否使用常数级空间复杂度实现？\n示例:\n// 初始化一个单链表 [1,2,3].\nListNode head = new ListNode(1);\nhead.next = new ListNode(2);\nhead.next.next = new ListNode(3);\nSolution solution = new Solution(head);\n\n// getRandom()方法应随机返回1,2,3中的一个，保证每个元素被返回的概率相等。\nsolution.getRandom();
 * <p>
 * acceptance: 50.7%
 * difficulty: Medium
 * private: False
 */


//TODO init

import com.liangxiaoqiao.leetcode.day.pojo.ListNode;

/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class LinkedListRandomNode {
    /* @param head The linked list's head.
    Note that the head is guaranteed to be not null, so it contains at least one node. */
    public LinkedListRandomNode(ListNode head) {
    }

    /* Returns a random node's value. */
    public int getRandom() {
        return 0;
    }

}

/*
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
