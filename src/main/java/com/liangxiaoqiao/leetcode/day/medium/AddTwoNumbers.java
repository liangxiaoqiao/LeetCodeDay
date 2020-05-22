package com.liangxiaoqiao.leetcode.day.medium;


import com.liangxiaoqiao.leetcode.day.pojo.ListNode;


/*
 * English
 * id: 2
 * title: Add Two Numbers
 * href: https://leetcode.com/problems/add-two-numbers
 * desc: You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.\nYou may assume the two numbers do not contain any leading zero, except the number 0 itself.\nExample:\nInput: (2 -> 4 -> 3) + (5 -> 6 -> 4)\nOutput: 7 -> 0 -> 8\nExplanation: 342 + 465 = 807.
 * <p>
 * 中文
 * 序号: 2
 * 标题： 两数相加
 * 链接： https://leetcode-cn.com/problems/add-two-numbers
 * 描述： 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * <p>
 * acceptance: 32.5%
 * difficulty: Medium
 * private: False
 */

/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumbers {
    private boolean bigThan10 = false;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first = l1;
        ListNode second = l2;
        ListNode result = null;
        while (first != null && second != null) {
            int temp = first.val + second.val + (bigThan10 ? 1 : 0);
            result = getListNode(result, temp);
            first = first.next;
            second = second.next;
        }

        while (first != null) {
            int temp = first.val + (bigThan10 ? 1 : 0);
            result = getListNode(result, temp);
            first = first.next;
        }

        while (second != null) {
            int temp = second.val + (bigThan10 ? 1 : 0);
            result = getListNode(result, temp);
            second = second.next;
        }

        if (bigThan10) {
            addChild(result, new ListNode(1));
        }

        return result;
    }

    private ListNode getListNode(ListNode result, int temp) {
        if (result == null) {
            if (temp >= 10) {
                bigThan10 = true;
                result = new ListNode(temp - 10);
            } else {
                bigThan10 = false;
                result = new ListNode(temp);
            }
        } else {
            if (temp >= 10) {
                bigThan10 = true;
                addChild(result, new ListNode(temp - 10));
            } else {
                bigThan10 = false;
                addChild(result, new ListNode(temp));
            }
        }
        return result;
    }

    private void addChild(ListNode root, ListNode child) {
        ListNode parent = root;
        while (parent.next != null) {
            parent = parent.next;
        }
        parent.next = child;
    }

}

