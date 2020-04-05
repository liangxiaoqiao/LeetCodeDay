package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 735
 * title: Asteroid Collision
 * href: https://leetcode.com/problems/asteroid-collision
 * desc: We are given an array asteroids of integers representing asteroids in a row.\nFor each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.\nFind out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.\nExample 1:\nInput: \nasteroids = [5, 10, -5]\nOutput: [5, 10]\nExplanation: \nThe 10 and -5 collide resulting in 10.  The 5 and 10 never collide.\nExample 2:\nInput: \nasteroids = [8, -8]\nOutput: []\nExplanation: \nThe 8 and -8 collide exploding each other.\nExample 3:\nInput: \nasteroids = [10, 2, -5]\nOutput: [10]\nExplanation: \nThe 2 and -5 collide resulting in -5.  The 10 and -5 collide resulting in 10.\nExample 4:\nInput: \nasteroids = [-2, -1, 1, 2]\nOutput: [-2, -1, 1, 2]\nExplanation: \nThe -2 and -1 are moving left, while the 1 and 2 are moving right.\nAsteroids moving the same direction never meet, so no asteroids will meet each other.\nNote:\nThe length of asteroids will be at most 10000.\nEach asteroid will be a non-zero integer in the range [-1000, 1000]..
 * <p>
 * 中文
 * 序号: 735
 * 标题： 行星碰撞
 * 链接： https://leetcode-cn.com/problems/asteroid-collision
 * 描述： 给定一个整数数组 asteroids，表示在同一行的行星。\n对于数组中的每一个元素，其绝对值表示行星的大小，正负表示行星的移动方向（正表示向右移动，负表示向左移动）。每一颗行星以相同的速度移动。\n找出碰撞后剩下的所有行星。碰撞规则：两个行星相互碰撞，较小的行星会爆炸。如果两颗行星大小相同，则两颗行星都会爆炸。两颗移动方向相同的行星，永远不会发生碰撞。\n示例 1:\n输入: \nasteroids = [5, 10, -5]\n输出: [5, 10]\n解释: \n10 和 -5 碰撞后只剩下 10。 5 和 10 永远不会发生碰撞。\n示例 2:\n输入: \nasteroids = [8, -8]\n输出: []\n解释: \n8 和 -8 碰撞后，两者都发生爆炸。\n示例 3:\n输入: \nasteroids = [10, 2, -5]\n输出: [10]\n解释: \n2 和 -5 发生碰撞后剩下 -5。10 和 -5 发生碰撞后剩下 10。\n示例 4:\n输入: \nasteroids = [-2, -1, 1, 2]\n输出: [-2, -1, 1, 2]\n解释: \n-2 和 -1 向左移动，而 1 和 2 向右移动。\n由于移动方向相同的行星不会发生碰撞，所以最终没有行星发生碰撞。\n说明:\n数组 asteroids 的长度不超过 10000。\n每一颗行星的大小都是非零整数，范围是 [-1000, 1000] 。
 * <p>
 * acceptance: 39.7%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        return null;
    }
}