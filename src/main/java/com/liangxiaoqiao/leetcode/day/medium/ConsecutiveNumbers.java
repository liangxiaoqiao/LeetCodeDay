package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 180
 * title: Consecutive Numbers
 * href: https://leetcode.com/problems/consecutive-numbers
 * desc: SQL Schema\nWrite a SQL query to find all numbers that appear at least three times consecutively.\n+----+-----+\n| Id | Num |\n+----+-----+\n| 1  |  1  |\n| 2  |  1  |\n| 3  |  1  |\n| 4  |  2  |\n| 5  |  1  |\n| 6  |  2  |\n| 7  |  2  |\n+----+-----+\nFor example, given the above Logs table, 1 is the only number that appears consecutively for at least three times.\n+-----------------+\n| ConsecutiveNums |\n+-----------------+\n| 1               |\n+-----------------+
 * <p>
 * 中文
 * 序号: 180
 * 标题： 连续出现的数字
 * 链接： https://leetcode-cn.com/problems/consecutive-numbers
 * 描述： SQL架构\n编写一个 SQL 查询，查找所有至少连续出现三次的数字。\n+----+-----+\n| Id | Num |\n+----+-----+\n| 1  |  1  |\n| 2  |  1  |\n| 3  |  1  |\n| 4  |  2  |\n| 5  |  1  |\n| 6  |  2  |\n| 7  |  2  |\n+----+-----+\n例如，给定上面的 Logs 表， 1 是唯一连续出现至少三次的数字。\n+-----------------+\n| ConsecutiveNums |\n+-----------------+\n| 1               |\n+-----------------+
 * <p>
 * acceptance: 36.5%
 * difficulty: Medium
 * private: False
 */


//TODO init
//# Write your MySQL query statement below