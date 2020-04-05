package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 620
 * title: Not Boring Movies
 * href: https://leetcode.com/problems/not-boring-movies
 * desc: SQL Schema\nX city opened a new cinema, many people would like to go to this cinema. The cinema also gives out a poster indicating the movies’ ratings and descriptions.\nPlease write a SQL query to output movies with an odd numbered ID and a description that is not \'boring\'. Order the result by rating.\n  For example, table cinema:\n+---------+-----------+--------------+-----------+\n|   id    | movie     |  description |  rating   |\n+---------+-----------+--------------+-----------+\n|   1     | War       |   great 3D   |   8.9     |\n|   2     | Science   |   fiction    |   8.5     |\n|   3     | irish     |   boring     |   6.2     |\n|   4     | Ice song  |   Fantacy    |   8.6     |\n|   5     | House card|   Interesting|   9.1     |\n+---------+-----------+--------------+-----------+\nFor the example above, the output should be:\n+---------+-----------+--------------+-----------+\n|   id    | movie     |  description |  rating   |\n+---------+-----------+--------------+-----------+\n|   5     | House card|   Interesting|   9.1     |\n|   1     | War       |   great 3D   |   8.9     |\n+---------+-----------+--------------+-----------+\n
 * <p>
 * 中文
 * 序号: 620
 * 标题： 有趣的电影
 * 链接： https://leetcode-cn.com/problems/not-boring-movies
 * 描述： SQL架构\n某城市开了一家新的电影院，吸引了很多人过来看电影。该电影院特别注意用户体验，专门有个 LED显示板做电影推荐，上面公布着影评和相关电影描述。\n作为该电影院的信息部主管，您需要编写一个 SQL查询，找出所有影片描述为非 boring (不无聊) 的并且 id 为奇数 的影片，结果请按等级 rating 排列。\n  例如，下表 cinema:\n+---------+-----------+--------------+-----------+\n|   id    | movie     |  description |  rating   |\n+---------+-----------+--------------+-----------+\n|   1     | War       |   great 3D   |   8.9     |\n|   2     | Science   |   fiction    |   8.5     |\n|   3     | irish     |   boring     |   6.2     |\n|   4     | Ice song  |   Fantacy    |   8.6     |\n|   5     | House card|   Interesting|   9.1     |\n+---------+-----------+--------------+-----------+\n对于上面的例子，则正确的输出是为：\n+---------+-----------+--------------+-----------+\n|   id    | movie     |  description |  rating   |\n+---------+-----------+--------------+-----------+\n|   5     | House card|   Interesting|   9.1     |\n|   1     | War       |   great 3D   |   8.9     |\n+---------+-----------+--------------+-----------+\n
 * <p>
 * acceptance: 64.3%
 * difficulty: Easy
 * private: False
 */


//TODO init
//# Write your MySQL query statement below