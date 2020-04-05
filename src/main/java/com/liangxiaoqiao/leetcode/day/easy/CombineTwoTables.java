package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 175
 * title: Combine Two Tables
 * href: https://leetcode.com/problems/combine-two-tables
 * desc: SQL Schema\nTable: Person\n+-------------+---------+\n| Column Name | Type    |\n+-------------+---------+\n| PersonId    | int     |\n| FirstName   | varchar |\n| LastName    | varchar |\n+-------------+---------+\nPersonId is the primary key column for this table.\nTable: Address\n+-------------+---------+\n| Column Name | Type    |\n+-------------+---------+\n| AddressId   | int     |\n| PersonId    | int     |\n| City        | varchar |\n| State       | varchar |\n+-------------+---------+\nAddressId is the primary key column for this table.\n  Write a SQL query for a report that provides the following information for each person in the Person table, regardless if there is an address for each of those people:\nFirstName, LastName, City, State
 * <p>
 * 中文
 * 序号: 175
 * 标题： 组合两个表
 * 链接： https://leetcode-cn.com/problems/combine-two-tables
 * 描述： SQL架构\n表1: Person\n+-------------+---------+\n| 列名         | 类型     |\n+-------------+---------+\n| PersonId    | int     |\n| FirstName   | varchar |\n| LastName    | varchar |\n+-------------+---------+\nPersonId 是上表主键\n表2: Address\n+-------------+---------+\n| 列名         | 类型    |\n+-------------+---------+\n| AddressId   | int     |\n| PersonId    | int     |\n| City        | varchar |\n| State       | varchar |\n+-------------+---------+\nAddressId 是上表主键\n  编写一个 SQL 查询，满足条件：无论 person 是否有地址信息，都需要基于上述两表提供 person 的以下信息：\n  FirstName, LastName, City, State
 * <p>
 * acceptance: 56.4%
 * difficulty: Easy
 * private: False
 */


//TODO init
//# Write your MySQL query statement below