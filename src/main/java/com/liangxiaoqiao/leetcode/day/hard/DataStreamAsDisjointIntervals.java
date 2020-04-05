package com.liangxiaoqiao.leetcode.day.hard;
import java.util.List;

/*
 * English
 * id: 352
 * title: Data Stream as Disjoint Intervals
 * href: https://leetcode.com/problems/data-stream-as-disjoint-intervals
 * desc: Given a data stream input of non-negative integers a1, a2, ..., an, ..., summarize the numbers seen so far as a list of disjoint intervals.\nFor example, suppose the integers from the data stream are 1, 3, 7, 2, 6, ..., then the summary will be:\n[1, 1]\n[1, 1], [3, 3]\n[1, 1], [3, 3], [7, 7]\n[1, 3], [7, 7]\n[1, 3], [6, 7]\nFollow up:\nWhat if there are lots of merges and the number of disjoint intervals are small compared to the data stream\'s size?
 * <p>
 * 中文
 * 序号: 352
 * 标题： 将数据流变为多个不相交区间
 * 链接： https://leetcode-cn.com/problems/data-stream-as-disjoint-intervals
 * 描述： 给定一个非负整数的数据流输入 a1，a2，…，an，…，将到目前为止看到的数字总结为不相交的区间列表。\n例如，假设数据流中的整数为 1，3，7，2，6，…，每次的总结为：\n[1, 1]\n[1, 1], [3, 3]\n[1, 1], [3, 3], [7, 7]\n[1, 3], [7, 7]\n[1, 3], [6, 7]\n  进阶：\n如果有很多合并，并且与数据流的大小相比，不相交区间的数量很小，该怎么办?\n提示：\n特别感谢 @yunhong 提供了本问题和其测试用例。
 * <p>
 * acceptance: 44.7%
 * difficulty: Hard
 * private: False
 */


//TODO init


/*
 * Definition for an interval.
 * public class Interval {
 * int start;
 * int end;
 * Interval() { start = 0; end = 0; }
 * Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class DataStreamAsDisjointIntervals {
    /*
     * Initialize your data structure here.
     */
    public DataStreamAsDisjointIntervals() {
    }

    public void addNum(int val) {
    }

    public List<Interval> getIntervals() {
        return null;
    }

    public class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }
}

/*
 * Your SummaryRanges object will be instantiated and called as such:
 * SummaryRanges obj = new SummaryRanges();
 * obj.addNum(val);
 * List<Interval> param_2 = obj.getIntervals();
 */
