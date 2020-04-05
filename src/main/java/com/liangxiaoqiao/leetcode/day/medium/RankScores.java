package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 178
 * title: Rank Scores
 * href: https://leetcode.com/problems/rank-scores
 * desc: None
 * <p>
 * 中文
 * 序号: 178
 * 标题： 分数排名
 * 链接： https://leetcode-cn.com/problems/rank-scores
 * 描述： SQL架构\n编写一个 SQL 查询来实现分数排名。如果两个分数相同，则两个分数排名（Rank）相同。请注意，平分后的下一个名次应该是下一个连续的整数值。换句话说，名次之间不应该有“间隔”。\n+----+-------+\n| Id | Score |\n+----+-------+\n| 1  | 3.50  |\n| 2  | 3.65  |\n| 3  | 4.00  |\n| 4  | 3.85  |\n| 5  | 4.00  |\n| 6  | 3.65  |\n+----+-------+\n例如，根据上述给定的 Scores 表，你的查询应该返回（按分数从高到低排列）：\n+-------+------+\n| Score | Rank |\n+-------+------+\n| 4.00  | 1    |\n| 4.00  | 1    |\n| 3.85  | 2    |\n| 3.65  | 3    |\n| 3.65  | 3    |\n| 3.50  | 4    |\n+-------+------+
 * <p>
 * acceptance: 41.0%
 * difficulty: Medium
 * private: False
 */


//TODO init
//