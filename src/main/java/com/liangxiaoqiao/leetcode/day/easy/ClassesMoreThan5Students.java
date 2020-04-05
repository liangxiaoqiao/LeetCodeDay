package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 596
 * title: Classes More Than 5 Students
 * href: https://leetcode.com/problems/classes-more-than-5-students
 * desc: SQL Schema\nThere is a table courses with columns: student and class\nPlease list out all classes which have more than or equal to 5 students.\nFor example, the table:\n+---------+------------+\n| student | class      |\n+---------+------------+\n| A       | Math       |\n| B       | English    |\n| C       | Math       |\n| D       | Biology    |\n| E       | Math       |\n| F       | Computer   |\n| G       | Math       |\n| H       | Math       |\n| I       | Math       |\n+---------+------------+\nShould output:\n+---------+\n| class   |\n+---------+\n| Math    |\n+---------+\n  Note:\nThe students should not be counted duplicate in each course.
 * <p>
 * 中文
 * 序号: 596
 * 标题： 超过5名学生的课
 * 链接： https://leetcode-cn.com/problems/classes-more-than-5-students
 * 描述： SQL架构\n有一个courses 表 ，有: student (学生) 和 class (课程)。\n请列出所有超过或等于5名学生的课。\n例如,表:\n+---------+------------+\n| student | class      |\n+---------+------------+\n| A       | Math       |\n| B       | English    |\n| C       | Math       |\n| D       | Biology    |\n| E       | Math       |\n| F       | Computer   |\n| G       | Math       |\n| H       | Math       |\n| I       | Math       |\n+---------+------------+\n应该输出:\n+---------+\n| class   |\n+---------+\n| Math    |\n+---------+\nNote:\n学生在每个课中不应被重复计算。
 * <p>
 * acceptance: 37.0%
 * difficulty: Easy
 * private: False
 */


//TODO init
//# Write your MySQL query statement below