package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 627
 * title: Swap Salary
 * href: https://leetcode.com/problems/swap-salary
 * desc: SQL Schema\nGiven a table salary, such as the one below, that has m=male and f=female values. Swap all f and m values (i.e., change all f values to m and vice versa) with a single update statement and no intermediate temp table.\nNote that you must write a single update statement, DO NOT write any select statement for this problem.\n  Example:\n| id | name | sex | salary |\n|----|------|-----|--------|\n| 1  | A    | m   | 2500   |\n| 2  | B    | f   | 1500   |\n| 3  | C    | m   | 5500   |\n| 4  | D    | f   | 500    |\nAfter running your update statement, the above salary table should have the following rows:\n| id | name | sex | salary |\n|----|------|-----|--------|\n| 1  | A    | f   | 2500   |\n| 2  | B    | m   | 1500   |\n| 3  | C    | f   | 5500   |\n| 4  | D    | m   | 500    |
 * <p>
 * 中文
 * 序号: 627
 * 标题： 交换工资
 * 链接： https://leetcode-cn.com/problems/swap-salary
 * 描述： SQL架构\n给定一个 salary 表，如下所示，有 m=男性 和 f=女性 的值 。交换所有的 f 和 m 值（例如，将所有 f 值更改为 m，反之亦然）。要求使用一个更新（Update）语句，并且没有中间临时表。\n请注意，你必须编写一个 Update 语句，不要编写任何 Select 语句。\n  例如:\n| id | name | sex | salary |\n|----|------|-----|--------|\n| 1  | A    | m   | 2500   |\n| 2  | B    | f   | 1500   |\n| 3  | C    | m   | 5500   |\n| 4  | D    | f   | 500    |\n运行你所编写的更新语句之后，将会得到以下表:\n| id | name | sex | salary |\n|----|------|-----|--------|\n| 1  | A    | f   | 2500   |\n| 2  | B    | m   | 1500   |\n| 3  | C    | f   | 5500   |\n| 4  | D    | m   | 500    |
 * <p>
 * acceptance: 72.2%
 * difficulty: Easy
 * private: False
 */


//TODO init
//# Write your MySQL query statement below