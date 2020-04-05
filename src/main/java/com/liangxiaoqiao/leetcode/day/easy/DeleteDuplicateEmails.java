package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 196
 * title: Delete Duplicate Emails
 * href: https://leetcode.com/problems/delete-duplicate-emails
 * desc: Write a SQL query to delete all duplicate email entries in a table named Person, keeping only unique emails based on its smallest Id.\n+----+------------------+\n| Id | Email            |\n+----+------------------+\n| 1  | john@example.com |\n| 2  | bob@example.com  |\n| 3  | john@example.com |\n+----+------------------+\nId is the primary key column for this table.\nFor example, after running your query, the above Person table should have the following rows:\n+----+------------------+\n| Id | Email            |\n+----+------------------+\n| 1  | john@example.com |\n| 2  | bob@example.com  |\n+----+------------------+\nNote:\nYour output is the whole Person table after executing your sql. Use delete statement.
 * <p>
 * 中文
 * 序号: 196
 * 标题： 删除重复的电子邮箱
 * 链接： https://leetcode-cn.com/problems/delete-duplicate-emails
 * 描述： 编写一个 SQL 查询，来删除 Person 表中所有重复的电子邮箱，重复的邮箱里只保留 Id 最小 的那个。\n+----+------------------+\n| Id | Email            |\n+----+------------------+\n| 1  | john@example.com |\n| 2  | bob@example.com  |\n| 3  | john@example.com |\n+----+------------------+\nId 是这个表的主键。\n例如，在运行你的查询语句之后，上面的 Person 表应返回以下几行:\n+----+------------------+\n| Id | Email            |\n+----+------------------+\n| 1  | john@example.com |\n| 2  | bob@example.com  |\n+----+------------------+
 * <p>
 * acceptance: 36.8%
 * difficulty: Easy
 * private: False
 */


//TODO init
//# Write your MySQL query statement below