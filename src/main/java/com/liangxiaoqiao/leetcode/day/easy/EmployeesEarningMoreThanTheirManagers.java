package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 181
 * title: Employees Earning More Than Their Managers
 * href: https://leetcode.com/problems/employees-earning-more-than-their-managers
 * desc: SQL Schema\nThe Employee table holds all employees including their managers. Every employee has an Id, and there is also a column for the manager Id.\n+----+-------+--------+-----------+\n| Id | Name  | Salary | ManagerId |\n+----+-------+--------+-----------+\n| 1  | Joe   | 70000  | 3         |\n| 2  | Henry | 80000  | 4         |\n| 3  | Sam   | 60000  | NULL      |\n| 4  | Max   | 90000  | NULL      |\n+----+-------+--------+-----------+\nGiven the Employee table, write a SQL query that finds out employees who earn more than their managers. For the above table, Joe is the only employee who earns more than his manager.\n+----------+\n| Employee |\n+----------+\n| Joe      |\n+----------+
 * <p>
 * 中文
 * 序号: 181
 * 标题： 超过经理收入的员工
 * 链接： https://leetcode-cn.com/problems/employees-earning-more-than-their-managers
 * 描述： SQL架构\nEmployee 表包含所有员工，他们的经理也属于员工。每个员工都有一个 Id，此外还有一列对应员工的经理的 Id。\n+----+-------+--------+-----------+\n| Id | Name  | Salary | ManagerId |\n+----+-------+--------+-----------+\n| 1  | Joe   | 70000  | 3         |\n| 2  | Henry | 80000  | 4         |\n| 3  | Sam   | 60000  | NULL      |\n| 4  | Max   | 90000  | NULL      |\n+----+-------+--------+-----------+\n给定 Employee 表，编写一个 SQL 查询，该查询可以获取收入超过他们经理的员工的姓名。在上面的表格中，Joe 是唯一一个收入超过他的经理的员工。\n+----------+\n| Employee |\n+----------+\n| Joe      |\n+----------+
 * <p>
 * acceptance: 52.4%
 * difficulty: Easy
 * private: False
 */


//TODO init
//# Write your MySQL query statement below