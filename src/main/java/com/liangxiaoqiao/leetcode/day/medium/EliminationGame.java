package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 390
 * title: Elimination Game
 * href: https://leetcode.com/problems/elimination-game
 * desc: There is a list of sorted integers from 1 to n. Starting from left to right, remove the first number and every other number afterward until you reach the end of the list.\nRepeat the previous step again, but this time from right to left, remove the right most number and every other number from the remaining numbers.\nWe keep repeating the steps again, alternating left to right and right to left, until a single number remains.\nFind the last number that remains starting with a list of length n.\nExample:\nInput:\nn = 9,\n1 2 3 4 5 6 7 8 9\n2 4 6 8\n2 6\n6\n\nOutput:\n6
 * <p>
 * 中文
 * 序号: 390
 * 标题： 消除游戏
 * 链接： https://leetcode-cn.com/problems/elimination-game
 * 描述： 给定一个从1 到 n 排序的整数列表。\n首先，从左到右，从第一个数字开始，每隔一个数字进行删除，直到列表的末尾。\n第二步，在剩下的数字中，从右到左，从倒数第一个数字开始，每隔一个数字进行删除，直到列表开头。\n我们不断重复这两步，从左到右和从右到左交替进行，直到只剩下一个数字。\n返回长度为 n 的列表中，最后剩下的数字。\n示例：\n输入:\nn = 9,\n1 2 3 4 5 6 7 8 9\n2 4 6 8\n2 6\n6\n\n输出:\n6
 * <p>
 * acceptance: 44.2%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class EliminationGame {
    public int lastRemaining(int n) {
        return 0;
    }
}