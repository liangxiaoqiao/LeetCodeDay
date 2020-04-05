package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 552
 * title: Student Attendance Record II
 * href: https://leetcode.com/problems/student-attendance-record-ii
 * desc: Given a positive integer n, return the number of all possible attendance records with length n, which will be regarded as rewardable. The answer may be very large, return it after mod 109 + 7.\nA student attendance record is a string that only contains the following three characters:\n\'A\' : Absent.\n\'L\' : Late.\n\'P\' : Present.\nA record is regarded as rewardable if it doesn\'t contain more than one \'A\' (absent) or more than two continuous \'L\' (late).\nExample 1:\nInput: n = 2\nOutput: 8 \nExplanation:\nThere are 8 records with length 2 will be regarded as rewardable:\n\"PP\" , \"AP\", \"PA\", \"LP\", \"PL\", \"AL\", \"LA\", \"LL\"\nOnly \"AA\" won\'t be regarded as rewardable owing to more than one absent times. \nNote: The value of n won\'t exceed 100,000.
 * <p>
 * 中文
 * 序号: 552
 * 标题： 学生出勤记录 II
 * 链接： https://leetcode-cn.com/problems/student-attendance-record-ii
 * 描述： 给定一个正整数 n，返回长度为 n 的所有可被视为可奖励的出勤记录的数量。 答案可能非常大，你只需返回结果mod 109 + 7的值。\n学生出勤记录是只包含以下三个字符的字符串：\n\'A\' : Absent，缺勤\n\'L\' : Late，迟到\n\'P\' : Present，到场\n如果记录不包含多于一个\'A\'（缺勤）或超过两个连续的\'L\'（迟到），则该记录被视为可奖励的。\n示例 1:\n输入: n = 2\n输出: 8 \n解释：\n有8个长度为2的记录将被视为可奖励：\n\"PP\" , \"AP\", \"PA\", \"LP\", \"PL\", \"AL\", \"LA\", \"LL\"\n只有\"AA\"不会被视为可奖励，因为缺勤次数超过一次。\n注意：n 的值不会超过100000。
 * <p>
 * acceptance: 34.9%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class StudentAttendanceRecordIi {
    public int checkRecord(int n) {
        return 0;
    }
}