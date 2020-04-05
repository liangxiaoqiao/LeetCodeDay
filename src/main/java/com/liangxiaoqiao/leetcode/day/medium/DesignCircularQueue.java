package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 622
 * title: Design Circular Queue
 * href: https://leetcode.com/problems/design-circular-queue
 * desc: Design your implementation of the circular queue. The circular queue is a linear data structure in which the operations are performed based on FIFO (First In First Out) principle and the last position is connected back to the first position to make a circle. It is also called \"Ring Buffer\".\nOne of the benefits of the circular queue is that we can make use of the spaces in front of the queue. In a normal queue, once the queue becomes full, we cannot insert the next element even if there is a space in front of the queue. But using the circular queue, we can use the space to store new values.\nYour implementation should support following operations:\nMyCircularQueue(k): Constructor, set the size of the queue to be k.\nFront: Get the front item from the queue. If the queue is empty, return -1.\nRear: Get the last item from the queue. If the queue is empty, return -1.\nenQueue(value): Insert an element into the circular queue. Return true if the operation is successful.\ndeQueue(): Delete an element from the circular queue. Return true if the operation is successful.\nisEmpty(): Checks whether the circular queue is empty or not.\nisFull(): Checks whether the circular queue is full or not.\n  Example:\nMyCircularQueue circularQueue = new MyCircularQueue(3); // set the size to be 3\ncircularQueue.enQueue(1);  // return true\ncircularQueue.enQueue(2);  // return true\ncircularQueue.enQueue(3);  // return true\ncircularQueue.enQueue(4);  // return false, the queue is full\ncircularQueue.Rear();  // return 3\ncircularQueue.isFull();  // return true\ncircularQueue.deQueue();  // return true\ncircularQueue.enQueue(4);  // return true\ncircularQueue.Rear();  // return 4\n  Note:\nAll values will be in the range of [0, 1000].\nThe number of operations will be in the range of [1, 1000].\nPlease do not use the built-in Queue library.
 * <p>
 * 中文
 * 序号: 622
 * 标题： 设计循环队列
 * 链接： https://leetcode-cn.com/problems/design-circular-queue
 * 描述： 设计你的循环队列实现。 循环队列是一种线性数据结构，其操作表现基于 FIFO（先进先出）原则并且队尾被连接在队首之后以形成一个循环。它也被称为“环形缓冲器”。\n循环队列的一个好处是我们可以利用这个队列之前用过的空间。在一个普通队列里，一旦一个队列满了，我们就不能插入下一个元素，即使在队列前面仍有空间。但是使用循环队列，我们能使用这些空间去存储新的值。\n你的实现应该支持如下操作：\nMyCircularQueue(k): 构造器，设置队列长度为 k 。\nFront: 从队首获取元素。如果队列为空，返回 -1 。\nRear: 获取队尾元素。如果队列为空，返回 -1 。\nenQueue(value): 向循环队列插入一个元素。如果成功插入则返回真。\ndeQueue(): 从循环队列中删除一个元素。如果成功删除则返回真。\nisEmpty(): 检查循环队列是否为空。\nisFull(): 检查循环队列是否已满。\n  示例：\nMyCircularQueue circularQueue = new MycircularQueue(3); // 设置长度为 3\n\ncircularQueue.enQueue(1);  // 返回 true\n\ncircularQueue.enQueue(2);  // 返回 true\n\ncircularQueue.enQueue(3);  // 返回 true\n\ncircularQueue.enQueue(4);  // 返回 false，队列已满\n\ncircularQueue.Rear();  // 返回 3\n\ncircularQueue.isFull();  // 返回 true\n\ncircularQueue.deQueue();  // 返回 true\n\ncircularQueue.enQueue(4);  // 返回 true\n\ncircularQueue.Rear();  // 返回 4\n \n  提示：\n所有的值都在 0 至 1000 的范围内；\n操作数将在 1 至 1000 的范围内；\n请不要使用内置的队列库。
 * <p>
 * acceptance: 41.7%
 * difficulty: Medium
 * private: False
 */


//TODO init
class DesignCircularQueue {
    /*
     * Initialize your data structure here. Set the size of the queue to be k.
     */
    public DesignCircularQueue(int k) {
    }

    /*
     * Insert an element into the circular queue. Return true if the operation is successful.
     */
    public boolean enQueue(int value) {
        return false;
    }

    /*
     * Delete an element from the circular queue. Return true if the operation is successful.
     */
    public boolean deQueue() {
        return false;
    }

    /*
     * Get the front item from the queue.
     */
    public int Front() {
        return 0;
    }

    /*
     * Get the last item from the queue.
     */
    public int Rear() {
        return 0;
    }

    /*
     * Checks whether the circular queue is empty or not.
     */
    public boolean isEmpty() {
        return false;
    }

    /*
     * Checks whether the circular queue is full or not.
     */
    public boolean isFull() {
        return false;
    }
}

/*
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * class MyCircularQueue(int {
 }
 */