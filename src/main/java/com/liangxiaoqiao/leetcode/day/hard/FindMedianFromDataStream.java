package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 295
 * title: Find Median from Data Stream
 * href: https://leetcode.com/problems/find-median-from-data-stream
 * desc: Median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value. So the median is the mean of the two middle value.
 * For example,
 * [2,3,4], the median is 3
 * [2,3], the median is (2 + 3) / 2 = 2.5
 * Design a data structure that supports the following two operations:
 * void addNum(int num) - Add a integer number from the data stream to the data structure.
 * double findMedian() - Return the median of all elements so far.
 * Example:
 * addNum(1)
 * addNum(2)
 * findMedian() -> 1.5
 * addNum(3)
 * findMedian() -> 2
 * Follow up:
 * If all integer numbers from the stream are between 0 and 100, how would you optimize it?
 * If 99% of all integer numbers from the stream are between 0 and 100, how would you optimize it?
 * <p>
 * 中文
 * 序号: 295
 * 标题： 数据流的中位数
 * 链接： https://leetcode-cn.com/problems/find-median-from-data-stream
 * 描述： 中位数是有序列表中间的数。如果列表长度是偶数，中位数则是中间两个数的平均值。\n例如，\n[2,3,4] 的中位数是 3\n[2,3] 的中位数是 (2 + 3) / 2 = 2.5\n设计一个支持以下两种操作的数据结构：\nvoid addNum(int num) - 从数据流中添加一个整数到数据结构中。\ndouble findMedian() - 返回目前所有元素的中位数。\n示例：\naddNum(1)\naddNum(2)\nfindMedian() -> 1.5\naddNum(3) \nfindMedian() -> 2\n进阶:\n如果数据流中所有整数都在 0 到 100 范围内，你将如何优化你的算法？\n如果数据流中 99% 的整数都在 0 到 100 范围内，你将如何优化你的算法？
 * <p>
 * acceptance: 40.4%
 * difficulty: Hard
 * private: False
 */


//TODO init
class FindMedianFromDataStream {
    /*
     * initialize your data structure here.
     */
    public FindMedianFromDataStream() {
    }

    public void addNum(int num) {
    }

    public double findMedian() {
        return 0;
    }
}

/*
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
