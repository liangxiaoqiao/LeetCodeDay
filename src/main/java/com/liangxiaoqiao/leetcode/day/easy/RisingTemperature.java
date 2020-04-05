package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 197
 * title: Rising Temperature
 * href: https://leetcode.com/problems/rising-temperature
 * desc: SQL Schema\nGiven a Weather table, write a SQL query to find all dates\' Ids with higher temperature compared to its previous (yesterday\'s) dates.\n+---------+------------------+------------------+\n| Id(INT) | RecordDate(DATE) | Temperature(INT) |\n+---------+------------------+------------------+\n|       1 |       2015-01-01 |               10 |\n|       2 |       2015-01-02 |               25 |\n|       3 |       2015-01-03 |               20 |\n|       4 |       2015-01-04 |               30 |\n+---------+------------------+------------------+\nFor example, return the following Ids for the above Weather table:\n+----+\n| Id |\n+----+\n|  2 |\n|  4 |\n+----+
 * <p>
 * 中文
 * 序号: 197
 * 标题： 上升的温度
 * 链接： https://leetcode-cn.com/problems/rising-temperature
 * 描述： SQL架构\n给定一个 Weather 表，编写一个 SQL 查询，来查找与之前（昨天的）日期相比温度更高的所有日期的 Id。\n+---------+------------------+------------------+\n| Id(INT) | RecordDate(DATE) | Temperature(INT) |\n+---------+------------------+------------------+\n|       1 |       2015-01-01 |               10 |\n|       2 |       2015-01-02 |               25 |\n|       3 |       2015-01-03 |               20 |\n|       4 |       2015-01-04 |               30 |\n+---------+------------------+------------------+\n例如，根据上述给定的 Weather 表格，返回如下 Id:\n+----+\n| Id |\n+----+\n|  2 |\n|  4 |\n+----+
 * <p>
 * acceptance: 36.7%
 * difficulty: Easy
 * private: False
 */


//TODO init
//# Write your MySQL query statement below