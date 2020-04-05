package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 731
 * title: My Calendar II
 * href: https://leetcode.com/problems/my-calendar-ii
 * desc: Implement a MyCalendarTwo class to store your events. A new event can be added if adding the event will not cause a triple booking.\nYour class will have one method, book(int start, int end). Formally, this represents a booking on the half open interval [start, end), the range of real numbers x such that start <= x < end.\nA triple booking happens when three events have some non-empty intersection (ie., there is some time that is common to all 3 events.)\nFor each call to the method MyCalendar.book, return true if the event can be added to the calendar successfully without causing a triple booking. Otherwise, return false and do not add the event to the calendar.\nYour class will be called like this: MyCalendar cal = new MyCalendar(); MyCalendar.book(start, end)\nExample 1:\nMyCalendar();\nMyCalendar.book(10, 20); // returns true\nMyCalendar.book(50, 60); // returns true\nMyCalendar.book(10, 40); // returns true\nMyCalendar.book(5, 15); // returns false\nMyCalendar.book(5, 10); // returns true\nMyCalendar.book(25, 55); // returns true\nExplanation: \nThe first two events can be booked.  The third event can be double booked.\nThe fourth event (5, 15) can\'t be booked, because it would result in a triple booking.\nThe fifth event (5, 10) can be booked, as it does not use time 10 which is already double booked.\nThe sixth event (25, 55) can be booked, as the time in [25, 40) will be double booked with the third event;\nthe time [40, 50) will be single booked, and the time [50, 55) will be double booked with the second event.\n  Note:\nThe number of calls to MyCalendar.book per test case will be at most 1000.\nIn calls to MyCalendar.book(start, end), start and end are integers in the range [0, 10^9].\n
 * <p>
 * 中文
 * 序号: 731
 * 标题： 我的日程安排表 II
 * 链接： https://leetcode-cn.com/problems/my-calendar-ii
 * 描述： 实现一个 MyCalendar 类来存放你的日程安排。如果要添加的时间内不会导致三重预订时，则可以存储这个新的日程安排。\nMyCalendar 有一个 book(int start, int end)方法。它意味着在start到end时间内增加一个日程安排，注意，这里的时间是半开区间，即 [start, end), 实数 x 的范围为，  start <= x < end。\n当三个日程安排有一些时间上的交叉时（例如三个日程安排都在同一时间内），就会产生三重预订。\n每次调用 MyCalendar.book方法时，如果可以将日程安排成功添加到日历中而不会导致三重预订，返回 true。否则，返回 false 并且不要将该日程安排添加到日历中。\n请按照以下步骤调用MyCalendar 类: MyCalendar cal = new MyCalendar(); MyCalendar.book(start, end)\n示例 1:\nMyCalendar();\nMyCalendar.book(10, 20); // returns true\nMyCalendar.book(50, 60); // returns true\nMyCalendar.book(10, 40); // returns true\nMyCalendar.book(5, 15); // returns false\nMyCalendar.book(5, 10); // returns true\nMyCalendar.book(25, 55); // returns true\n解释: \n前两个日程安排可以添加至日历中。 第三个日程安排会导致双重预订，但可以添加至日历中。\n第四个日程安排活动（5,15）不能添加至日历中，因为它会导致三重预订。\n第五个日程安排（5,10）可以添加至日历中，因为它未使用已经双重预订的时间10。\n第六个日程安排（25,55）可以添加至日历中，因为时间 [25,40] 将和第三个日程安排双重预订；\n时间 [40,50] 将单独预订，时间 [50,55）将和第二个日程安排双重预订。\n说明:\n每个测试用例，调用 MyCalendar.book 函数最多不超过 100次。\n调用函数 MyCalendar.book(start, end)时， start 和 end 的取值范围为 [0, 10^9]。
 * <p>
 * acceptance: 47.1%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class MyCalendarIi {
    public MyCalendarIi() {

    }

    public boolean book(int start, int end) {
        return false;
    }
}

/*
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */
