package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 707
 * title: Design Linked List
 * href: https://leetcode.com/problems/design-linked-list
 * desc: Design your implementation of the linked list. You can choose to use the singly linked list or the doubly linked list. A node in a singly linked list should have two attributes: val and next. val is the value of the current node, and next is a pointer/reference to the next node. If you want to use the doubly linked list, you will need one more attribute prev to indicate the previous node in the linked list. Assume all nodes in the linked list are 0-indexed.\nImplement these functions in your linked list class:\nget(index) : Get the value of the index-th node in the linked list. If the index is invalid, return -1.\naddAtHead(val) : Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.\naddAtTail(val) : Append a node of value val to the last element of the linked list.\naddAtIndex(index, val) : Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.\ndeleteAtIndex(index) : Delete the index-th node in the linked list, if the index is valid.\nExample:\nMyLinkedList linkedList = new MyLinkedList();\nlinkedList.addAtHead(1);\nlinkedList.addAtTail(3);\nlinkedList.addAtIndex(1, 2);  // linked list becomes 1->2->3\nlinkedList.get(1);            // returns 2\nlinkedList.deleteAtIndex(1);  // now the linked list is 1->3\nlinkedList.get(1);            // returns 3\nNote:\nAll values will be in the range of [1, 1000].\nThe number of operations will be in the range of [1, 1000].\nPlease do not use the built-in LinkedList library.
 * <p>
 * 中文
 * 序号: 707
 * 标题： 设计链表
 * 链接： https://leetcode-cn.com/problems/design-linked-list
 * 描述： 设计链表的实现。您可以选择使用单链表或双链表。单链表中的节点应该具有两个属性：val 和 next。val 是当前节点的值，next 是指向下一个节点的指针/引用。如果要使用双向链表，则还需要一个属性 prev 以指示链表中的上一个节点。假设链表中的所有节点都是 0-index 的。\n在链表类中实现这些功能：\nget(index)：获取链表中第 index 个节点的值。如果索引无效，则返回-1。\naddAtHead(val)：在链表的第一个元素之前添加一个值为 val 的节点。插入后，新节点将成为链表的第一个节点。\naddAtTail(val)：将值为 val 的节点追加到链表的最后一个元素。\naddAtIndex(index,val)：在链表中的第 index 个节点之前添加值为 val  的节点。如果 index 等于链表的长度，则该节点将附加到链表的末尾。如果 index 大于链表长度，则不会插入节点。\ndeleteAtIndex(index)：如果索引 index 有效，则删除链表中的第 index 个节点。\n  示例：\nMyLinkedList linkedList = new MyLinkedList();\nlinkedList.addAtHead(1);\nlinkedList.addAtTail(3);\nlinkedList.addAtIndex(1,2);   //链表变为1-> 2-> 3\nlinkedList.get(1);            //返回2\nlinkedList.deleteAtIndex(1);  //现在链表是1-> 3\nlinkedList.get(1);            //返回3\n  提示：\n所有值都在 [1, 1000] 之内。\n操作次数将在  [1, 1000] 之内。\n请不要使用内置的 LinkedList 库。
 * <p>
 * acceptance: 21.5%
 * difficulty: Medium
 * private: False
 */


//TODO init
class DesignLinkedList {
    /*
     * Initialize your data structure here.
     */
    public DesignLinkedList() {

    }

    /*
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        return 0;
    }

    /*
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
    }

    /*
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
    }

    /*
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
    }

    /*
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
    }
}

/*
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
