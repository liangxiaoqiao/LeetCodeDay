package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 933
 * title: Number of Recent Calls
 * href: https://leetcode.com/problems/number-of-recent-calls
 * desc: Write a class RecentCounter to count recent requests.\nIt has only one method: ping(int t), where t represents some time in milliseconds.\nReturn the number of pings that have been made from 3000 milliseconds ago until now.\nAny ping with time in [t - 3000, t] will count, including the current ping.\nIt is guaranteed that every call to ping uses a strictly larger value of t than before.\n  Example 1:\nInput: inputs = [\"RecentCounter\",\"ping\",\"ping\",\"ping\",\"ping\"], inputs = [[],[1],[100],[3001],[3002]]\nOutput: [null,1,2,3,3]\n  Note:\nEach test case will have at most 10000 calls to ping.\nEach test case will call ping with strictly increasing values of t.\nEach call to ping will have 1 <= t <= 10^9.\n
 * <p>
 * 中文
 * 序号: 933
 * 标题： 最近的请求次数
 * 链接： https://leetcode-cn.com/problems/number-of-recent-calls
 * 描述： 写一个 RecentCounter 类来计算最近的请求。\n它只有一个方法：ping(int t)，其中 t 代表以毫秒为单位的某个时间。\n返回从 3000 毫秒前到现在的 ping 数。\n任何处于 [t - 3000, t] 时间范围之内的 ping 都将会被计算在内，包括当前（指 t 时刻）的 ping。\n保证每次对 ping 的调用都使用比之前更大的 t 值。\n  示例：\n输入：inputs = [\"RecentCounter\",\"ping\",\"ping\",\"ping\",\"ping\"], inputs = [[],[1],[100],[3001],[3002]]\n输出：[null,1,2,3,3]\n  提示：\n每个测试用例最多调用 10000 次 ping。\n每个测试用例会使用严格递增的 t 值来调用 ping。\n每次调用 ping 都有 1 <= t <= 10^9。\n
 * <p>
 * acceptance: 69.9%
 * difficulty: Easy
 * private: False
 */


//TODO init
class RecentCounter {
    public RecentCounter() {

    }

    public int ping(int t) {
        return 0;
    }
}

/*
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
