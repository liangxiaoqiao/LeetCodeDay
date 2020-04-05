package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 430
 * title: Flatten a Multilevel Doubly Linked List
 * href: https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list
 * desc: You are given a doubly linked list which in addition to the next and previous pointers, it could have a child pointer, which may or may not point to a separate doubly linked list. These child lists may have one or more children of their own, and so on, to produce a multilevel data structure, as shown in the example below.\nFlatten the list so that all the nodes appear in a single-level, doubly linked list. You are given the head of the first level of the list.\n  Example:\nInput:\n 1---2---3---4---5---6--NULL\n         |\n         7---8---9---10--NULL\n             |\n             11--12--NULL\n\nOutput:\n1-2-3-7-8-11-12-9-10-4-5-6-NULL\n  Explanation for the above example:\nGiven the following multilevel doubly linked list:\n  We should return the following flattened doubly linked list:
 * <p>
 * 中文
 * 序号: 430
 * 标题： 扁平化多级双向链表
 * 链接： https://leetcode-cn.com/problems/flatten-a-multilevel-doubly-linked-list
 * 描述： 多级双向链表中，除了指向下一个节点和前一个节点指针之外，它还有一个子链表指针，可能指向单独的双向链表。这些子列表也可能会有一个或多个自己的子项，依此类推，生成多级数据结构，如下面的示例所示。
 *
 * 给你位于列表第一级的头节点，请你扁平化列表，使所有结点出现在单级双链表中。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：head = [1,2,3,4,5,6,null,null,null,7,8,9,10,null,null,11,12]
 * 输出：[1,2,3,7,8,11,12,9,10,4,5,6]
 * 解释：
 *
 * 输入的多级列表如下图所示：
 *
 *
 *
 * 扁平化后的链表如下图：
 *
 *
 * 示例 2：
 *
 * 输入：head = [1,2,null,3]
 * 输出：[1,3,2]
 * 解释：
 *
 * 输入的多级列表如下图所示：
 *
 *   1---2---NULL
 *   |
 *   3---NULL
 * 示例 3：
 *
 * 输入：head = []
 * 输出：[]
 *  
 *
 * 如何表示测试用例中的多级链表？
 *
 * 以 示例 1 为例：
 *
 *  1---2---3---4---5---6--NULL
 *          |
 *          7---8---9---10--NULL
 *              |
 *              11--12--NULL
 * 序列化其中的每一级之后：
 *
 * [1,2,3,4,5,6,null]
 * [7,8,9,10,null]
 * [11,12,null]
 * 为了将每一级都序列化到一起，我们需要每一级中添加值为 null 的元素，以表示没有节点连接到上一级的上级节点。
 *
 * [1,2,3,4,5,6,null]
 * [null,null,7,8,9,10,null]
 * [null,11,12,null]
 * 合并所有序列化结果，并去除末尾的 null 。
 *
 * [1,2,3,4,5,6,null,null,null,7,8,9,10,null,null,11,12]
 *  
 *
 * 提示：
 *
 * 节点数目不超过 1000
 * 1 <= Node.val <= 10^5
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/flatten-a-multilevel-doubly-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * acceptance: 47.3%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class FlattenAMultilevelDoublyLinkedList {
    public Node flatten(Node head) {
        return null;
    }

    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    }
}
        