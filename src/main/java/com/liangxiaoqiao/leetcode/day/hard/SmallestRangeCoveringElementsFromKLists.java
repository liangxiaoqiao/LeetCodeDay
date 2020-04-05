package com.liangxiaoqiao.leetcode.day.hard;


import java.util.List;
    

/*
 * English
 * id: 632
 * title: Smallest Range Covering Elements from K Lists
 * href: https://leetcode.com/problems/smallest-range-covering-elements-from-k-lists
 * desc: You have k lists of sorted integers in ascending order. Find the smallest range that includes at least one number from each of the k lists.\nWe define the range [a,b] is smaller than range [c,d] if b-a < d-c or a < c if b-a == d-c.\nExample 1:\nInput:[[4,10,15,24,26], [0,9,12,20], [5,18,22,30]]\nOutput: [20,24]\nExplanation: \nList 1: [4, 10, 15, 24,26], 24 is in range [20,24].\nList 2: [0, 9, 12, 20], 20 is in range [20,24].\nList 3: [5, 18, 22, 30], 22 is in range [20,24].\nNote:\nThe given list may contain duplicates, so ascending order means >= here.\n1 <= k <= 3500\n-105 <= value of elements <= 105.\nFor Java users, please note that the input type has been changed to List<List<Integer>>. And after you reset the code template, you\'ll see this point.
 * <p>
 * 中文
 * 序号: 632
 * 标题： 最小区间
 * 链接： https://leetcode-cn.com/problems/smallest-range-covering-elements-from-k-lists
 * 描述： 你有 k 个升序排列的整数数组。找到一个最小区间，使得 k 个列表中的每个列表至少有一个数包含在其中。\n我们定义如果 b-a < d-c 或者在 b-a == d-c 时 a < c，则区间 [a,b] 比 [c,d] 小。\n示例 1:\n输入:[[4,10,15,24,26], [0,9,12,20], [5,18,22,30]]\n输出: [20,24]\n解释: \n列表 1：[4, 10, 15, 24, 26]，24 在区间 [20,24] 中。\n列表 2：[0, 9, 12, 20]，20 在区间 [20,24] 中。\n列表 3：[5, 18, 22, 30]，22 在区间 [20,24] 中。\n注意:\n给定的列表可能包含重复元素，所以在这里升序表示 >= 。\n1 <= k <= 3500\n-105 <= 元素的值 <= 105\n对于使用Java的用户，请注意传入类型已修改为List<List<Integer>>。重置代码模板后可以看到这项改动。
 * <p>
 * acceptance: 50.2%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class SmallestRangeCoveringElementsFromKLists {
    public int[] smallestRange(List<List<Integer>> nums) {
        return null;
    }
}