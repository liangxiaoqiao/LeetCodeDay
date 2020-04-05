package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 335
 * title: Self Crossing
 * href: https://leetcode.com/problems/self-crossing
 * desc: You are given an array x of n positive numbers. You start at point (0,0) and moves x[0] metres to the north, then x[1] metres to the west, x[2] metres to the south, x[3] metres to the east and so on. In other words, after each move your direction changes counter-clockwise.\nWrite a one-pass algorithm with O(1) extra space to determine, if your path crosses itself, or not.\n  Example 1:\n┌───┐\n│   │\n└───┼──>\n    │\n\nInput: [2,1,1,2]\nOutput: true\nExample 2:\n┌──────┐\n│      │\n│\n│\n└────────────>\n\nInput: [1,2,3,4]\nOutput: false \nExample 3:\n┌───┐\n│   │\n└───┼>\n\nInput: [1,1,1,1]\nOutput: true
 * <p>
 * 中文
 * 序号: 335
 * 标题： 路径交叉
 * 链接： https://leetcode-cn.com/problems/self-crossing
 * 描述： 给定一个含有 n 个正数的数组 x。从点 (0,0) 开始，先向北移动 x[0] 米，然后向西移动 x[1] 米，向南移动 x[2] 米，向东移动 x[3] 米，持续移动。也就是说，每次移动后你的方位会发生逆时针变化。\n编写一个 O(1) 空间复杂度的一趟扫描算法，判断你所经过的路径是否相交。\n  示例 1:\n┌───┐\n│   │\n└───┼──>\n    │\n\n输入: [2,1,1,2]\n输出: true \n示例 2:\n┌──────┐\n│      │\n│\n│\n└────────────>\n\n输入: [1,2,3,4]\n输出: false \n示例 3:\n┌───┐\n│   │\n└───┼>\n\n输入: [1,1,1,1]\n输出: true
 * <p>
 * acceptance: 27.4%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class SelfCrossing {
    public boolean isSelfCrossing(int[] x) {
        return false;
    }
}