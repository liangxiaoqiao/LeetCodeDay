package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 757
 * title: Set Intersection Size At Least Two
 * href: https://leetcode.com/problems/set-intersection-size-at-least-two
 * desc: An integer interval [a, b] (for integers a < b) is a set of all consecutive integers from a to b, including a and b.\nFind the minimum size of a set S such that for every integer interval A in intervals, the intersection of S with A has size at least 2.\nExample 1:\nInput: intervals = [[1, 3], [1, 4], [2, 5], [3, 5]]\nOutput: 3\nExplanation:\nConsider the set S = {2, 3, 4}.  For each interval, there are at least 2 elements from S in the interval.\nAlso, there isn\'t a smaller size set that fulfills the above condition.\nThus, we output the size of this set, which is 3.\nExample 2:\nInput: intervals = [[1, 2], [2, 3], [2, 4], [4, 5]]\nOutput: 5\nExplanation:\nAn example of a minimum sized set is {1, 2, 3, 4, 5}.\nNote:\nintervals will have length in range [1, 3000].\nintervals[i] will have length 2, representing some integer interval.\nintervals[i][j] will be an integer in [0, 10^8].
 * <p>
 * 中文
 * 序号: 757
 * 标题： 设置交集大小至少为2
 * 链接： https://leetcode-cn.com/problems/set-intersection-size-at-least-two
 * 描述： 一个整数区间 [a, b]  ( a < b ) 代表着从 a 到 b 的所有连续整数，包括 a 和 b。\n给你一组整数区间intervals，请找到一个最小的集合 S，使得 S 里的元素与区间intervals中的每一个整数区间都至少有2个元素相交。\n输出这个最小集合S的大小。\n示例 1:\n输入: intervals = [[1, 3], [1, 4], [2, 5], [3, 5]]\n输出: 3\n解释:\n考虑集合 S = {2, 3, 4}. S与intervals中的四个区间都有至少2个相交的元素。\n且这是S最小的情况，故我们输出3。\n示例 2:\n输入: intervals = [[1, 2], [2, 3], [2, 4], [4, 5]]\n输出: 5\n解释:\n最小的集合S = {1, 2, 3, 4, 5}.\n注意:\nintervals 的长度范围为[1, 3000]。\nintervals[i] 长度为 2，分别代表左、右边界。\nintervals[i][j] 的值是 [0, 10^8]范围内的整数。
 * <p>
 * acceptance: 37.7%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class SetIntersectionSizeAtLeastTwo{
    public int intersectionSizeTwo(int[][] intervals) {
        return 0;
    }
}