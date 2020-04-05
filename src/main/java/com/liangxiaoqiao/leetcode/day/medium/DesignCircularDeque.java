package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 641
 * title: Design Circular Deque
 * href: https://leetcode.com/problems/design-circular-deque
 * desc: Design your implementation of the circular double-ended queue (deque).\nYour implementation should support following operations:\nMyCircularDeque(k): Constructor, set the size of the deque to be k.\ninsertFront(): Adds an item at the front of Deque. Return true if the operation is successful.\ninsertLast(): Adds an item at the rear of Deque. Return true if the operation is successful.\ndeleteFront(): Deletes an item from the front of Deque. Return true if the operation is successful.\ndeleteLast(): Deletes an item from the rear of Deque. Return true if the operation is successful.\ngetFront(): Gets the front item from the Deque. If the deque is empty, return -1.\ngetRear(): Gets the last item from Deque. If the deque is empty, return -1.\nisEmpty(): Checks whether Deque is empty or not. \nisFull(): Checks whether Deque is full or not.\n  Example:\nMyCircularDeque circularDeque = new MycircularDeque(3); // set the size to be 3\ncircularDeque.insertLast(1);   // return true\ncircularDeque.insertLast(2);   // return true\ncircularDeque.insertFront(3);   // return true\ncircularDeque.insertFront(4);   // return false, the queue is full\ncircularDeque.getRear();     // return 2\ncircularDeque.isFull();    // return true\ncircularDeque.deleteLast();   // return true\ncircularDeque.insertFront(4);   // return true\ncircularDeque.getFront();   // return 4\n  Note:\nAll values will be in the range of [0, 1000].\nThe number of operations will be in the range of [1, 1000].\nPlease do not use the built-in Deque library.
 * <p>
 * 中文
 * 序号: 641
 * 标题： 设计循环双端队列
 * 链接： https://leetcode-cn.com/problems/design-circular-deque
 * 描述： 设计实现双端队列。\n你的实现需要支持以下操作：\nMyCircularDeque(k)：构造函数,双端队列的大小为k。\ninsertFront()：将一个元素添加到双端队列头部。 如果操作成功返回 true。\ninsertLast()：将一个元素添加到双端队列尾部。如果操作成功返回 true。\ndeleteFront()：从双端队列头部删除一个元素。 如果操作成功返回 true。\ndeleteLast()：从双端队列尾部删除一个元素。如果操作成功返回 true。\ngetFront()：从双端队列头部获得一个元素。如果双端队列为空，返回 -1。\ngetRear()：获得双端队列的最后一个元素。 如果双端队列为空，返回 -1。\nisEmpty()：检查双端队列是否为空。\nisFull()：检查双端队列是否满了。\n示例：\nMyCircularDeque circularDeque = new MycircularDeque(3); // 设置容量大小为3\ncircularDeque.insertLast(1);           // 返回 true\ncircularDeque.insertLast(2);           // 返回 true\ncircularDeque.insertFront(3);           // 返回 true\ncircularDeque.insertFront(4);           // 已经满了，返回 false\ncircularDeque.getRear();      // 返回 2\ncircularDeque.isFull();            // 返回 true\ncircularDeque.deleteLast();           // 返回 true\ncircularDeque.insertFront(4);           // 返回 true\ncircularDeque.getFront();    // 返回 4\n \n  提示：\n所有值的范围为 [1, 1000]\n操作次数的范围为 [1, 1000]\n请不要使用内置的双端队列库。
 * <p>
 * acceptance: 50.8%
 * difficulty: Medium
 * private: False
 */


//TODO init
class MyCircularDeque {
    /*
     * Initialize your data structure here. Set the size of the deque to be k.
     */
    public MyCircularDeque(int k) {

    }

    /*
     * Adds an item at the front of Deque. Return true if the operation is successful.
     */
    public boolean insertFront(int value) {
        return false;
    }

    /*
     * Adds an item at the rear of Deque. Return true if the operation is successful.
     */
    public boolean insertLast(int value) {
        return false;
    }

    /*
     * Deletes an item from the front of Deque. Return true if the operation is successful.
     */
    public boolean deleteFront() {
        return false;
    }

    /*
     * Deletes an item from the rear of Deque. Return true if the operation is successful.
     */
    public boolean deleteLast() {
        return false;
    }

    /*
     * Get the front item from the deque.
     */
    public int getFront() {
        return 0;
    }

    /*
     * Get the last item from the deque.
     */
    public int getRear() {
        return 0;
    }

    /*
     * Checks whether the circular deque is empty or not.
     */
    public boolean isEmpty() {
        return false;
    }

    /*
     * Checks whether the circular deque is full or not.
     */
    public boolean isFull() {
        return false;
    }

    /*
     * Your MyCircularDeque object will be instantiated and called as such:
     * MyCircularDeque obj = new MyCircularDeque(k);
     * boolean param_1 = obj.insertFront(value);
     * boolean param_2 = obj.insertLast(value);
     * boolean param_3 = obj.deleteFront();
     * boolean param_4 = obj.deleteLast();
     * int param_5 = obj.getFront();
     * int param_6 = obj.getRear();
     * boolean param_7 = obj.isEmpty();
     * boolean param_8 = obj.isFull();
     */
}