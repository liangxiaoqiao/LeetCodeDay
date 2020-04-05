package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 855
 * title: Exam Room
 * href: https://leetcode.com/problems/exam-room
 * desc: In an exam room, there are N seats in a single row, numbered 0, 1, 2, ..., N-1.\nWhen a student enters the room, they must sit in the seat that maximizes the distance to the closest person.  If there are multiple such seats, they sit in the seat with the lowest number.  (Also, if no one is in the room, then the student sits at seat number 0.)\nReturn a class ExamRoom(int N) that exposes two functions: ExamRoom.seat() returning an int representing what seat the student sat in, and ExamRoom.leave(int p) representing that the student in seat number p now leaves the room.  It is guaranteed that any calls to ExamRoom.leave(p) have a student sitting in seat p.\n  Example 1:\nInput: [\"ExamRoom\",\"seat\",\"seat\",\"seat\",\"seat\",\"leave\",\"seat\"], [[10],[],[],[],[],[4],[]]\nOutput: [null,0,9,4,2,null,5]\nExplanation:\nExamRoom(10) -> null\nseat() -> 0, no one is in the room, then the student sits at seat number 0.\nseat() -> 9, the student sits at the last seat number 9.\nseat() -> 4, the student sits at the last seat number 4.\nseat() -> 2, the student sits at the last seat number 2.\nleave(4) -> null\nseat() -> 5, the student sits at the last seat number 5.\nNote:\n1 <= N <= 10^9\nExamRoom.seat() and ExamRoom.leave() will be called at most 10^4 times across all test cases.\nCalls to ExamRoom.leave(p) are guaranteed to have a student currently sitting in seat number p.
 * <p>
 * 中文
 * 序号: 855
 * 标题： 考场就座
 * 链接： https://leetcode-cn.com/problems/exam-room
 * 描述： 在考场里，一排有 N 个座位，分别编号为 0, 1, 2, ..., N-1 。\n当学生进入考场后，他必须坐在能够使他与离他最近的人之间的距离达到最大化的座位上。如果有多个这样的座位，他会坐在编号最小的座位上。(另外，如果考场里没有人，那么学生就坐在 0 号座位上。)\n返回 ExamRoom(int N) 类，它有两个公开的函数：其中，函数 ExamRoom.seat() 会返回一个 int （整型数据），代表学生坐的位置；函数 ExamRoom.leave(int p) 代表坐在座位 p 上的学生现在离开了考场。请确保每次调用 ExamRoom.leave(p) 时都有学生坐在座位 p 上。\n  示例：\n输入：[\"ExamRoom\",\"seat\",\"seat\",\"seat\",\"seat\",\"leave\",\"seat\"], [[10],[],[],[],[],[4],[]]\n输出：[null,0,9,4,2,null,5]\n解释：\nExamRoom(10) -> null\nseat() -> 0，没有人在考场里，那么学生坐在 0 号座位上。\nseat() -> 9，学生最后坐在 9 号座位上。\nseat() -> 4，学生最后坐在 4 号座位上。\nseat() -> 2，学生最后坐在 2 号座位上。\nleave(4) -> null\nseat() -> 5，学生最后坐在 5 号座位上。\n  提示：\n1 <= N <= 10^9\n在所有的测试样例中 ExamRoom.seat() 和 ExamRoom.leave() 最多被调用 10^4 次。\n调用 ExamRoom.leave(p) 时需要确保当前有学生坐在座位 p 上。
 * <p>
 * acceptance: 40.9%
 * difficulty: Medium
 * private: False
 */


//TODO init
class ExamRoom {
    public ExamRoom(int N) {
    }

    public int seat() {
        return 0;
    }

    public void leave(int p) {
    }
}
/*
 * Your ExamRoom object will be instantiated and called as such:
 * ExamRoom obj = new ExamRoom(N);
 * int param_1 = obj.seat();
 * obj.leave(p);
 */