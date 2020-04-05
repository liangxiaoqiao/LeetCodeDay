package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 1157
 * title: Online Majority Element In Subarray
 * href: https://leetcode.com/problems/online-majority-element-in-subarray
 * desc: Implementing the class MajorityChecker, which has the following API:
 * MajorityChecker(int[] arr) constructs an instance of MajorityChecker with the given array arr;
 * int query(int left, int right, int threshold) has arguments such that:
 * 0 <= left <= right < arr.length representing a subarray of arr;
 * 2 * threshold > right - left + 1, ie. the threshold is always a strict majority of the length of the subarray
 * Each query(...) returns the element in arr[left], arr[left+1], ..., arr[right] that occurs at least threshold times, or -1 if no such element exists.
 * Example:
 * MajorityChecker majorityChecker = new MajorityChecker([1,1,2,2,1,1]);
 * majorityChecker.query(0,5,4); // returns 1
 * majorityChecker.query(0,3,3); // returns -1
 * majorityChecker.query(2,3,2); // returns 2
 * Constraints:
 * 1 <= arr.length <= 20000
 * 1 <= arr[i] <= 20000
 * For each query, 0 <= left <= right < len(arr)
 * For each query, 2 * threshold > right - left + 1
 * The number of queries is at most 10000
 * <p>
 * 中文
 * 序号: 1157
 * 标题： 子数组中占绝大多数的元素
 * 链接： https://leetcode-cn.com/problems/online-majority-element-in-subarray
 * 描述： 实现一个 MajorityChecker 的类，它应该具有下述几个 API：
 * MajorityChecker(int[] arr) 会用给定的数组 arr 来构造一个 MajorityChecker 的实例。
 * int query(int left, int right, int threshold) 有这么几个参数：
 * 0 <= left <= right < arr.length 表示数组 arr 的子数组的长度。
 * 2 * threshold > right - left + 1，也就是说阈值 threshold 始终比子序列长度的一半还要大。
 * 每次查询 query(...) 会返回在 arr[left], arr[left+1], ..., arr[right] 中至少出现阈值次数 threshold 的元素，如果不存在这样的元素，就返回 -1。
 * 示例：
 * MajorityChecker majorityChecker = new MajorityChecker([1,1,2,2,1,1]);
 * majorityChecker.query(0,5,4); // 返回 1
 * majorityChecker.query(0,3,3); // 返回 -1
 * majorityChecker.query(2,3,2); // 返回 2
 * 提示：
 * 1 <= arr.length <= 20000
 * 1 <= arr[i] <= 20000
 * 对于每次查询，0 <= left <= right < len(arr)
 * 对于每次查询，2 * threshold > right - left + 1
 * 查询次数最多为 10000
 * <p>
 * acceptance: 34.9%
 * difficulty: Hard
 * private: False
 */


//TODO init
class MajorityChecker {
    public MajorityChecker(int[] arr) {
    }

    public int query(int left, int right, int threshold) {
        return 0;
    }
}

/*
 * Your MajorityChecker object will be instantiated and called as such:
 * MajorityChecker obj = new MajorityChecker(arr);
 * int param_1 = obj.query(left,right,threshold);
 */
