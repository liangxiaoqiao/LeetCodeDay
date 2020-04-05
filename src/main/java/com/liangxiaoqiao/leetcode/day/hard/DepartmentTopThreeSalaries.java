package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 185
 * title: Department Top Three Salaries
 * href: https://leetcode.com/problems/department-top-three-salaries
 * desc: SQL Schema\nThe Employee table holds all employees. Every employee has an Id, and there is also a column for the department Id.\n+----+-------+--------+--------------+\n| Id | Name  | Salary | DepartmentId |\n+----+-------+--------+--------------+\n| 1  | Joe   | 85000  | 1            |\n| 2  | Henry | 80000  | 2            |\n| 3  | Sam   | 60000  | 2            |\n| 4  | Max   | 90000  | 1            |\n| 5  | Janet | 69000  | 1            |\n| 6  | Randy | 85000  | 1            |\n| 7  | Will  | 70000  | 1            |\n+----+-------+--------+--------------+\nThe Department table holds all departments of the company.\n+----+----------+\n| Id | Name     |\n+----+----------+\n| 1  | IT       |\n| 2  | Sales    |\n+----+----------+\nWrite a SQL query to find employees who earn the top three salaries in each of the department. For the above tables, your SQL query should return the following rows (order of rows does not matter).\n+------------+----------+--------+\n| Department | Employee | Salary |\n+------------+----------+--------+\n| IT         | Max      | 90000  |\n| IT         | Randy    | 85000  |\n| IT         | Joe      | 85000  |\n| IT         | Will     | 70000  |\n| Sales      | Henry    | 80000  |\n| Sales      | Sam      | 60000  |\n+------------+----------+--------+\nExplanation:\nIn IT department, Max earns the highest salary, both Randy and Joe earn the second highest salary, and Will earns the third highest salary. There are only two employees in the Sales department, Henry earns the highest salary while Sam earns the second highest salary.
 * <p>
 * 中文
 * 序号: 185
 * 标题： 部门工资前三高的所有员工
 * 链接： https://leetcode-cn.com/problems/department-top-three-salaries
 * 描述： SQL架构\nEmployee 表包含所有员工信息，每个员工有其对应的 Id, salary 和 department Id 。\n+----+-------+--------+--------------+\n| Id | Name  | Salary | DepartmentId |\n+----+-------+--------+--------------+\n| 1  | Joe   | 70000  | 1            |\n| 2  | Henry | 80000  | 2            |\n| 3  | Sam   | 60000  | 2            |\n| 4  | Max   | 90000  | 1            |\n| 5  | Janet | 69000  | 1            |\n| 6  | Randy | 85000  | 1            |\n+----+-------+--------+--------------+\nDepartment 表包含公司所有部门的信息。\n+----+----------+\n| Id | Name     |\n+----+----------+\n| 1  | IT       |\n| 2  | Sales    |\n+----+----------+\n编写一个 SQL 查询，找出每个部门工资前三高的员工。例如，根据上述给定的表格，查询结果应返回：\n+------------+----------+--------+\n| Department | Employee | Salary |\n+------------+----------+--------+\n| IT         | Max      | 90000  |\n| IT         | Randy    | 85000  |\n| IT         | Joe      | 70000  |\n| Sales      | Henry    | 80000  |\n| Sales      | Sam      | 60000  |\n+------------+----------+--------+
 * <p>
 * acceptance: 30.2%
 * difficulty: Hard
 * private: False
 */


//TODO init
//# Write your MySQL query statement below