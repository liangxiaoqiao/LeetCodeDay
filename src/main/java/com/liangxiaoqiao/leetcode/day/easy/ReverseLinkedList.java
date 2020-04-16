package com.liangxiaoqiao.leetcode.day.easy;


import com.liangxiaoqiao.leetcode.day.pojo.ListNode;


/*
 * English
 * id: 206
 * title: Reverse Linked List
 * href: https://leetcode.com/problems/reverse-linked-list
 * desc: Reverse a singly linked list.
 * Example:
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 * Follow up:
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 * <p>
 * 中文
 * 序号: 206
 * 标题： 反转链表
 * 链接： https://leetcode-cn.com/problems/reverse-linked-list
 * 描述： 反转一个单链表。
 * 示例:
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 * <p>
 * acceptance: 58.7%
 * difficulty: Easy
 * private: False
 * <p>
 */


//TODO init

/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        return reverse(head, head.next);
    }

    public ListNode reverse(ListNode src, ListNode next) {
        if (src != null && next != null) {
            if (src.next.equals(next)) {
                src.next = null;
            }
            ListNode nNext = next.next;
            next.next = src;
            if (nNext == null) {
                return next;
            } else {
                return reverse(next, nNext);
            }
        } else {
            return src;
        }
    }

    public ListNode reverse2(ListNode head) {
        ListNode pre = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        return pre;
    }

}