package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 703
 * title: Kth Largest Element in a Stream
 * href: https://leetcode.com/problems/kth-largest-element-in-a-stream
 * desc: Design a class to find the kth largest element in a stream. Note that it is the kth largest element in the sorted order, not the kth distinct element.\nYour KthLargest class will have a constructor which accepts an integer k and an integer array nums, which contains initial elements from the stream. For each call to the method KthLargest.add, return the element representing the kth largest element in the stream.\nExample:\nint k = 3;\nint[] arr = [4,5,8,2];\nKthLargest kthLargest = new KthLargest(3, arr);\nkthLargest.add(3);   // returns 4\nkthLargest.add(5);   // returns 5\nkthLargest.add(10);  // returns 5\nkthLargest.add(9);   // returns 8\nkthLargest.add(4);   // returns 8\nNote:\nYou may assume that nums\' length ≥ k-1 and k ≥ 1.
 * <p>
 * 中文
 * 序号: 703
 * 标题： 数据流中的第K大元素
 * 链接： https://leetcode-cn.com/problems/kth-largest-element-in-a-stream
 * 描述： 设计一个找到数据流中第K大元素的类（class）。注意是排序后的第K大元素，不是第K个不同的元素。\n你的 KthLargest 类需要一个同时接收整数 k 和整数数组nums 的构造器，它包含数据流中的初始元素。每次调用 KthLargest.add，返回当前数据流中第K大的元素。\n示例:\nint k = 3;\nint[] arr = [4,5,8,2];\nKthLargest kthLargest = new KthLargest(3, arr);\nkthLargest.add(3);   // returns 4\nkthLargest.add(5);   // returns 5\nkthLargest.add(10);  // returns 5\nkthLargest.add(9);   // returns 8\nkthLargest.add(4);   // returns 8\n说明:\n你可以假设 nums 的长度≥ k-1 且k ≥ 1。
 * <p>
 * acceptance: 47.8%
 * difficulty: Easy
 * private: False
 */


//TODO init
class KthLargestElementInAStream {
    public KthLargestElementInAStream(int k, int[] nums) {
    }

    public int add(int val) {
        return 0;
    }
}

/*
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
