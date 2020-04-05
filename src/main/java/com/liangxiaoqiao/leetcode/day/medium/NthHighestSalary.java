package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 177
 * title: Nth Highest Salary
 * href: https://leetcode.com/problems/nth-highest-salary
 * desc: Write a SQL query to get the nth highest salary from the Employee table.\n+----+--------+\n| Id | Salary |\n+----+--------+\n| 1  | 100    |\n| 2  | 200    |\n| 3  | 300    |\n+----+--------+\nFor example, given the above Employee table, the nth highest salary where n = 2 is 200. If there is no nth highest salary, then the query should return null.\n+------------------------+\n| getNthHighestSalary(2) |\n+------------------------+\n| 200                    |\n+------------------------+
 * <p>
 * 中文
 * 序号: 177
 * 标题： 第N高的薪水
 * 链接： https://leetcode-cn.com/problems/nth-highest-salary
 * 描述： 编写一个 SQL 查询，获取 Employee 表中第 n 高的薪水（Salary）。\n+----+--------+\n| Id | Salary |\n+----+--------+\n| 1  | 100    |\n| 2  | 200    |\n| 3  | 300    |\n+----+--------+\n例如上述 Employee 表，n = 2 时，应返回第二高的薪水 200。如果不存在第 n 高的薪水，那么查询应返回 null。\n+------------------------+\n| getNthHighestSalary(2) |\n+------------------------+\n| 200                    |\n+------------------------+
 * <p>
 * acceptance: 29.0%
 * difficulty: Medium
 * private: False
 */


//TODO init
//CREATE FUNCTION getNthHighestSalary(N INT)RETURNS INT
//        BEGIN
//        RETURN(
//        # Write your MySQL query statement below.
//        );
//        END