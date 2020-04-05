package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 184
 * title: Department Highest Salary
 * href: https://leetcode.com/problems/department-highest-salary
 * desc: SQL Schema\nThe Employee table holds all employees. Every employee has an Id, a salary, and there is also a column for the department Id.\n+----+-------+--------+--------------+\n| Id | Name  | Salary | DepartmentId |\n+----+-------+--------+--------------+\n| 1  | Joe   | 70000  | 1            |\n| 2  | Jim   | 90000  | 1            |\n| 3  | Henry | 80000  | 2            |\n| 4  | Sam   | 60000  | 2            |\n| 5  | Max   | 90000  | 1            |\n+----+-------+--------+--------------+\nThe Department table holds all departments of the company.\n+----+----------+\n| Id | Name     |\n+----+----------+\n| 1  | IT       |\n| 2  | Sales    |\n+----+----------+\nWrite a SQL query to find employees who have the highest salary in each of the departments. For the above tables, your SQL query should return the following rows (order of rows does not matter).\n+------------+----------+--------+\n| Department | Employee | Salary |\n+------------+----------+--------+\n| IT         | Max      | 90000  |\n| IT         | Jim      | 90000  |\n| Sales      | Henry    | 80000  |\n+------------+----------+--------+\nExplanation:\nMax and Jim both have the highest salary in the IT department and Henry has the highest salary in the Sales department.
 * <p>
 * 中文
 * 序号: 184
 * 标题： 部门工资最高的员工
 * 链接： https://leetcode-cn.com/problems/department-highest-salary
 * 描述： SQL架构\nEmployee 表包含所有员工信息，每个员工有其对应的 Id, salary 和 department Id。\n+----+-------+--------+--------------+\n| Id | Name  | Salary | DepartmentId |\n+----+-------+--------+--------------+\n| 1  | Joe   | 70000  | 1            |\n| 2  | Henry | 80000  | 2            |\n| 3  | Sam   | 60000  | 2            |\n| 4  | Max   | 90000  | 1            |\n+----+-------+--------+--------------+\nDepartment 表包含公司所有部门的信息。\n+----+----------+\n| Id | Name     |\n+----+----------+\n| 1  | IT       |\n| 2  | Sales    |\n+----+----------+\n编写一个 SQL 查询，找出每个部门工资最高的员工。例如，根据上述给定的表格，Max 在 IT 部门有最高工资，Henry 在 Sales 部门有最高工资。\n+------------+----------+--------+\n| Department | Employee | Salary |\n+------------+----------+--------+\n| IT         | Max      | 90000  |\n| Sales      | Henry    | 80000  |\n+------------+----------+--------+
 * <p>
 * acceptance: 32.7%
 * difficulty: Medium
 * private: False
 */


//TODO init
//# Write your MySQL query statement below