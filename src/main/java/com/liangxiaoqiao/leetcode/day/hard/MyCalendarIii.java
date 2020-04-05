package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 732
 * title: My Calendar III
 * href: https://leetcode.com/problems/my-calendar-iii
 * desc: Implement a MyCalendarThree class to store your events. A new event can always be added.\nYour class will have one method, book(int start, int end). Formally, this represents a booking on the half open interval [start, end), the range of real numbers x such that start <= x < end.\nA K-booking happens when K events have some non-empty intersection (ie., there is some time that is common to all K events.)\nFor each call to the method MyCalendar.book, return an integer K representing the largest integer such that there exists a K-booking in the calendar.\nYour class will be called like this: MyCalendarThree cal = new MyCalendarThree(); MyCalendarThree.book(start, end)\nExample 1:\nMyCalendarThree();\nMyCalendarThree.book(10, 20); // returns 1\nMyCalendarThree.book(50, 60); // returns 1\nMyCalendarThree.book(10, 40); // returns 2\nMyCalendarThree.book(5, 15); // returns 3\nMyCalendarThree.book(5, 10); // returns 3\nMyCalendarThree.book(25, 55); // returns 3\nExplanation: \nThe first two events can be booked and are disjoint, so the maximum K-booking is a 1-booking.\nThe third event [10, 40) intersects the first event, and the maximum K-booking is a 2-booking.\nThe remaining events cause the maximum K-booking to be only a 3-booking.\nNote that the last event locally causes a 2-booking, but the answer is still 3 because\neg. [10, 20), [10, 40), and [5, 15) are still triple booked.\n  Note:\nThe number of calls to MyCalendarThree.book per test case will be at most 400.\nIn calls to MyCalendarThree.book(start, end), start and end are integers in the range [0, 10^9].\n
 * <p>
 * 中文
 * 序号: 732
 * 标题： 我的日程安排表 III
 * 链接： https://leetcode-cn.com/problems/my-calendar-iii
 * 描述： 实现一个 MyCalendar 类来存放你的日程安排，你可以一直添加新的日程安排。\nMyCalendar 有一个 book(int start, int end)方法。它意味着在start到end时间内增加一个日程安排，注意，这里的时间是半开区间，即 [start, end), 实数 x 的范围为，  start <= x < end。\n当 K 个日程安排有一些时间上的交叉时（例如K个日程安排都在同一时间内），就会产生 K 次预订。\n每次调用 MyCalendar.book方法时，返回一个整数 K ，表示最大的 K 次预订。\n请按照以下步骤调用MyCalendar 类: MyCalendar cal = new MyCalendar(); MyCalendar.book(start, end)\n示例 1:\nMyCalendarThree();\nMyCalendarThree.book(10, 20); // returns 1\nMyCalendarThree.book(50, 60); // returns 1\nMyCalendarThree.book(10, 40); // returns 2\nMyCalendarThree.book(5, 15); // returns 3\nMyCalendarThree.book(5, 10); // returns 3\nMyCalendarThree.book(25, 55); // returns 3\n解释: \n前两个日程安排可以预订并且不相交，所以最大的K次预订是1。\n第三个日程安排[10,40]与第一个日程安排相交，最高的K次预订为2。\n其余的日程安排的最高K次预订仅为3。\n请注意，最后一次日程安排可能会导致局部最高K次预订为2，但答案仍然是3，原因是从开始到最后，时间[10,20]，[10,40]和[5,15]仍然会导致3次预订。\n说明:\n每个测试用例，调用 MyCalendar.book 函数最多不超过 400次。\n调用函数 MyCalendar.book(start, end)时， start 和 end 的取值范围为 [0, 10^9]。
 * <p>
 * acceptance: 57.7%
 * difficulty: Hard
 * private: False
 */


//TODO init
class MyCalendarThree {
    public MyCalendarThree() {

    }

    public int book(int start, int end) {
        return 0;
    }
}

/*
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree obj = new MyCalendarThree();
 * int param_1 = obj.book(start,end);
 */
