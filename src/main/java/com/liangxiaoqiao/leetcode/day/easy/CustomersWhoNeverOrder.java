package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 183
 * title: Customers Who Never Order
 * href: https://leetcode.com/problems/customers-who-never-order
 * desc: SQL Schema\nSuppose that a website contains two tables, the Customers table and the Orders table. Write a SQL query to find all customers who never order anything.\nTable: Customers.\n+----+-------+\n| Id | Name  |\n+----+-------+\n| 1  | Joe   |\n| 2  | Henry |\n| 3  | Sam   |\n| 4  | Max   |\n+----+-------+\nTable: Orders.\n+----+------------+\n| Id | CustomerId |\n+----+------------+\n| 1  | 3          |\n| 2  | 1          |\n+----+------------+\nUsing the above tables as example, return the following:\n+-----------+\n| Customers |\n+-----------+\n| Henry     |\n| Max       |\n+-----------+
 * <p>
 * 中文
 * 序号: 183
 * 标题： 从不订购的客户
 * 链接： https://leetcode-cn.com/problems/customers-who-never-order
 * 描述： SQL架构\n某网站包含两个表，Customers 表和 Orders 表。编写一个 SQL 查询，找出所有从不订购任何东西的客户。\nCustomers 表：\n+----+-------+\n| Id | Name  |\n+----+-------+\n| 1  | Joe   |\n| 2  | Henry |\n| 3  | Sam   |\n| 4  | Max   |\n+----+-------+\nOrders 表：\n+----+------------+\n| Id | CustomerId |\n+----+------------+\n| 1  | 3          |\n| 2  | 1          |\n+----+------------+\n例如给定上述表格，你的查询应返回：\n+-----------+\n| Customers |\n+-----------+\n| Henry     |\n| Max       |\n+-----------+
 * <p>
 * acceptance: 48.8%
 * difficulty: Easy
 * private: False
 */


//TODO init
//# Write your MySQL query statement below