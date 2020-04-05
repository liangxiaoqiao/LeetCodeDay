package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 626
 * title: Exchange Seats
 * href: https://leetcode.com/problems/exchange-seats
 * desc: SQL Schema\nMary is a teacher in a middle school and she has a table seat storing students\' names and their corresponding seat ids.\nThe column id is continuous increment.\n  Mary wants to change seats for the adjacent students.\n  Can you write a SQL query to output the result for Mary?\n  +---------+---------+\n|    id   | student |\n+---------+---------+\n|    1    | Abbot   |\n|    2    | Doris   |\n|    3    | Emerson |\n|    4    | Green   |\n|    5    | Jeames  |\n+---------+---------+\nFor the sample input, the output is:\n  +---------+---------+\n|    id   | student |\n+---------+---------+\n|    1    | Doris   |\n|    2    | Abbot   |\n|    3    | Green   |\n|    4    | Emerson |\n|    5    | Jeames  |\n+---------+---------+\nNote:\nIf the number of students is odd, there is no need to change the last one\'s seat.
 * <p>
 * 中文
 * 序号: 626
 * 标题： 换座位
 * 链接： https://leetcode-cn.com/problems/exchange-seats
 * 描述： SQL架构\n小美是一所中学的信息科技老师，她有一张 seat 座位表，平时用来储存学生名字和与他们相对应的座位 id。\n其中纵列的 id 是连续递增的\n小美想改变相邻俩学生的座位。\n你能不能帮她写一个 SQL query 来输出小美想要的结果呢？\n  示例：\n+---------+---------+\n|    id   | student |\n+---------+---------+\n|    1    | Abbot   |\n|    2    | Doris   |\n|    3    | Emerson |\n|    4    | Green   |\n|    5    | Jeames  |\n+---------+---------+\n假如数据输入的是上表，则输出结果如下：\n+---------+---------+\n|    id   | student |\n+---------+---------+\n|    1    | Doris   |\n|    2    | Abbot   |\n|    3    | Green   |\n|    4    | Emerson |\n|    5    | Jeames  |\n+---------+---------+\n注意：\n如果学生人数是奇数，则不需要改变最后一个同学的座位。
 * <p>
 * acceptance: 57.7%
 * difficulty: Medium
 * private: False
 */


//TODO init
//# Write your MySQL query statement below