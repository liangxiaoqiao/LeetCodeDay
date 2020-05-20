package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 526
 * title: Beautiful Arrangement
 * href: https://leetcode.com/problems/beautiful-arrangement
 * desc: Suppose you have N integers from 1 to N. We define a beautiful arrangement as an array that is constructed by these N numbers successfully if one of the following is true for the ith position (1 <= i <= N) in this array:\nThe number at the ith position is divisible by i.\ni is divisible by the number at the ith position.\n  Now given N, how many beautiful arrangements can you construct?\nExample 1:\nInput: 2\nOutput: 2\nExplanation: \n\nThe first beautiful arrangement is [1, 2]:\n\nNumber at the 1st position (i=1) is 1, and 1 is divisible by i (i=1).\n\nNumber at the 2nd position (i=2) is 2, and 2 is divisible by i (i=2).\n\nThe second beautiful arrangement is [2, 1]:\n\nNumber at the 1st position (i=1) is 2, and 2 is divisible by i (i=1).\n\nNumber at the 2nd position (i=2) is 1, and i (i=2) is divisible by 1.\n  Note:\nN is a positive integer and will not exceed 15.\n
 * <p>
 * 中文
 * 序号: 526
 * 标题： 优美的排列
 * 链接： https://leetcode-cn.com/problems/beautiful-arrangement
 * 描述： 假设有从 1 到 N 的 N 个整数，如果从这 N 个数字中成功构造出一个数组，使得数组的第 i 位 (1 <= i <= N) 满足如下两个条件中的一个，我们就称这个数组为一个优美的排列。条件：\n第 i 位的数字能被 i 整除\ni 能被第 i 位上的数字整除\n现在给定一个整数 N，请问可以构造多少个优美的排列？\n示例1:\n输入: 2\n输出: 2\n解释: \n\n第 1 个优美的排列是 [1, 2]:\n  第 1 个位置（i=1）上的数字是1，1能被 i（i=1）整除\n  第 2 个位置（i=2）上的数字是2，2能被 i（i=2）整除\n\n第 2 个优美的排列是 [2, 1]:\n  第 1 个位置（i=1）上的数字是2，2能被 i（i=1）整除\n  第 2 个位置（i=2）上的数字是1，i（i=2）能被 1 整除\n说明:\nN 是一个正整数，并且不会超过15。
 * <p>
 * acceptance: 56.3%
 * difficulty: Medium
 * private: False
 */


public class BeautifulArrangement {
    private int total = 0;

    public int countArrangement(int N) {
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        putValue(arr, 0, 1);
        return total;
    }

    public void putValue(int[] arr, int index, int value) {
        if (value > arr.length) {
            total++;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == -1 && check(arr, index, value)) {
                    arr[index] = value;
                    putValue(arr, index + 1, value + 1);
                    arr[index] = -1;
                }

            }
        }
    }

    private boolean check(int[] arr, int index, int value) {
        if ((value % (index + 1) != 0 && (index + 1) % value != 0)) {
            return false;
        }
        for (int i = 0; i < index; i++) {
            int tempIndex = i + 1;
            if ((arr[index] % tempIndex != 0 && tempIndex % arr[index] != 0)) {
                return false;
            }
        }
        return true;
    }
}