package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 601
 * title: Human Traffic of Stadium
 * href: https://leetcode.com/problems/human-traffic-of-stadium
 * desc: SQL Schema\nX city built a new stadium, each day many people visit it and the stats are saved as these columns: id, visit_date, people\nPlease write a query to display the records which have 3 or more consecutive rows and the amount of people more than 100(inclusive).\nFor example, the table stadium:\n+------+------------+-----------+\n| id   | visit_date | people    |\n+------+------------+-----------+\n| 1    | 2017-01-01 | 10        |\n| 2    | 2017-01-02 | 109       |\n| 3    | 2017-01-03 | 150       |\n| 4    | 2017-01-04 | 99        |\n| 5    | 2017-01-05 | 145       |\n| 6    | 2017-01-06 | 1455      |\n| 7    | 2017-01-07 | 199       |\n| 8    | 2017-01-08 | 188       |\n+------+------------+-----------+\nFor the sample data above, the output is:\n+------+------------+-----------+\n| id   | visit_date | people    |\n+------+------------+-----------+\n| 5    | 2017-01-05 | 145       |\n| 6    | 2017-01-06 | 1455      |\n| 7    | 2017-01-07 | 199       |\n| 8    | 2017-01-08 | 188       |\n+------+------------+-----------+\nNote:\nEach day only have one row record, and the dates are increasing with id increasing.
 * <p>
 * 中文
 * 序号: 601
 * 标题： 体育馆的人流量
 * 链接： https://leetcode-cn.com/problems/human-traffic-of-stadium
 * 描述： SQL架构\nX 市建了一个新的体育馆，每日人流量信息被记录在这三列信息中：序号 (id)、日期 (date)、 人流量 (people)。\n请编写一个查询语句，找出高峰期时段，要求连续三天及以上，并且每天人流量均不少于100。\n例如，表 stadium：\n+------+------------+-----------+\n| id   | date       | people    |\n+------+------------+-----------+\n| 1    | 2017-01-01 | 10        |\n| 2    | 2017-01-02 | 109       |\n| 3    | 2017-01-03 | 150       |\n| 4    | 2017-01-04 | 99        |\n| 5    | 2017-01-05 | 145       |\n| 6    | 2017-01-06 | 1455      |\n| 7    | 2017-01-07 | 199       |\n| 8    | 2017-01-08 | 188       |\n+------+------------+-----------+\n对于上面的示例数据，输出为：\n+------+------------+-----------+\n| id   | date       | people    |\n+------+------------+-----------+\n| 5    | 2017-01-05 | 145       |\n| 6    | 2017-01-06 | 1455      |\n| 7    | 2017-01-07 | 199       |\n| 8    | 2017-01-08 | 188       |\n+------+------------+-----------+\nNote:\n每天只有一行记录，日期随着 id 的增加而增加。
 * <p>
 * acceptance: 39.0%
 * difficulty: Hard
 * private: False
 */


//TODO init
//# Write your MySQL query statement below