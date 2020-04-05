package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 595
 * title: Big Countries
 * href: https://leetcode.com/problems/big-countries
 * desc: SQL Schema\nThere is a table World\n+-----------------+------------+------------+--------------+---------------+\n| name            | continent  | area       | population   | gdp           |\n+-----------------+------------+------------+--------------+---------------+\n| Afghanistan     | Asia       | 652230     | 25500100     | 20343000      |\n| Albania         | Europe     | 28748      | 2831741      | 12960000      |\n| Algeria         | Africa     | 2381741    | 37100000     | 188681000     |\n| Andorra         | Europe     | 468        | 78115        | 3712000       |\n| Angola          | Africa     | 1246700    | 20609294     | 100990000     |\n+-----------------+------------+------------+--------------+---------------+\nA country is big if it has an area of bigger than 3 million square km or a population of more than 25 million.\nWrite a SQL solution to output big countries\' name, population and area.\nFor example, according to the above table, we should output:\n+--------------+-------------+--------------+\n| name         | population  | area         |\n+--------------+-------------+--------------+\n| Afghanistan  | 25500100    | 652230       |\n| Algeria      | 37100000    | 2381741      |\n+--------------+-------------+--------------+\n
 * <p>
 * 中文
 * 序号: 595
 * 标题： 大的国家
 * 链接： https://leetcode-cn.com/problems/big-countries
 * 描述： SQL架构\n这里有张 World 表\n+-----------------+------------+------------+--------------+---------------+\n| name            | continent  | area       | population   | gdp           |\n+-----------------+------------+------------+--------------+---------------+\n| Afghanistan     | Asia       | 652230     | 25500100     | 20343000      |\n| Albania         | Europe     | 28748      | 2831741      | 12960000      |\n| Algeria         | Africa     | 2381741    | 37100000     | 188681000     |\n| Andorra         | Europe     | 468        | 78115        | 3712000       |\n| Angola          | Africa     | 1246700    | 20609294     | 100990000     |\n+-----------------+------------+------------+--------------+---------------+\n如果一个国家的面积超过300万平方公里，或者人口超过2500万，那么这个国家就是大国家。\n编写一个SQL查询，输出表中所有大国家的名称、人口和面积。\n例如，根据上表，我们应该输出:\n+--------------+-------------+--------------+\n| name         | population  | area         |\n+--------------+-------------+--------------+\n| Afghanistan  | 25500100    | 652230       |\n| Algeria      | 37100000    | 2381741      |\n+--------------+-------------+--------------+
 * <p>
 * acceptance: 75.7%
 * difficulty: Easy
 * private: False
 */


//TODO init
//# Write your MySQL query statement below