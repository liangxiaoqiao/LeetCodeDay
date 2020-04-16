package com.liangxiaoqiao.leetcode.day.medium;


import com.liangxiaoqiao.leetcode.day.easy.ReverseLinkedList;
import com.liangxiaoqiao.leetcode.day.pojo.ListNode;

/*
 * English
 * id: 445
 * title: Add Two Numbers II
 * href: https://leetcode.com/problems/add-two-numbers-ii
 * desc: You are given two non-empty linked lists representing two non-negative integers. The most significant digit comes first and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.\nYou may assume the two numbers do not contain any leading zero, except the number 0 itself.\nFollow up:\nWhat if you cannot modify the input lists? In other words, reversing the lists is not allowed.\nExample:\nInput: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)\nOutput: 7 -> 8 -> 0 -> 7
 * <p>
 * 中文
 * 序号: 445
 * 标题： 两数相加 II
 * 链接： https://leetcode-cn.com/problems/add-two-numbers-ii
 * 描述： 给定两个非空链表来代表两个非负整数。数字最高位位于链表开始位置。它们的每个节点只存储单个数字。将这两数相加会返回一个新的链表。
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 * 进阶:
 * 如果输入链表不能修改该如何处理？换句话说，你不能对列表中的节点进行翻转。
 * 示例:
 * 输入: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出: 7 -> 8 -> 0 -> 7
 * <p>
 * acceptance: 52.3%
 * difficulty: Medium
 * private: False
 *
 *
 */


//TODO init

/*
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumbersIi {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first = reverse(l1);
        ListNode second = reverse(l2);
        ListNode added = add(first, second);
        return reverse(added);
    }

    private ListNode add(ListNode first, ListNode second) {
        return new AddTwoNumbers().addTwoNumbers(first, second);
    }

    public ListNode reverse(ListNode src) {
        return new ReverseLinkedList().reverseList(src);
    }


}

