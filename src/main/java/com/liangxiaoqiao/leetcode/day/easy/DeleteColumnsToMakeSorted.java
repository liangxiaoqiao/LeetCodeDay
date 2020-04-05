package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 944
 * title: Delete Columns to Make Sorted
 * href: https://leetcode.com/problems/delete-columns-to-make-sorted
 * desc: We are given an array A of N lowercase letter strings, all of the same length.\nNow, we may choose any set of deletion indices, and for each string, we delete all the characters in those indices.\nFor example, if we have an array A = [\"abcdef\",\"uvwxyz\"] and deletion indices {0, 2, 3}, then the final array after deletions is [\"bef\", \"vyz\"], and the remaining columns of A are [\"b\",\"v\"], [\"e\",\"y\"], and [\"f\",\"z\"].  (Formally, the c-th column is [A[0][c], A[1][c], ..., A[A.length-1][c]].)\nSuppose we chose a set of deletion indices D such that after deletions, each remaining column in A is in non-decreasing sorted order.\nReturn the minimum possible value of D.length.\n  Example 1:\nInput: [\"cba\",\"daf\",\"ghi\"]\nOutput: 1\nExplanation: \nAfter choosing D = {1}, each column [\"c\",\"d\",\"g\"] and [\"a\",\"f\",\"i\"] are in non-decreasing sorted order.\nIf we chose D = {}, then a column [\"b\",\"a\",\"h\"] would not be in non-decreasing sorted order.\nExample 2:\nInput: [\"a\",\"b\"]\nOutput: 0\nExplanation: D = {}\nExample 3:\nInput: [\"zyx\",\"wvu\",\"tsr\"]\nOutput: 3\nExplanation: D = {0, 1, 2}\n  Note:\n1 <= A.length <= 100\n1 <= A[i].length <= 1000
 * <p>
 * 中文
 * 序号: 944
 * 标题： 删列造序
 * 链接： https://leetcode-cn.com/problems/delete-columns-to-make-sorted
 * 描述： 给定由 N 个小写字母字符串组成的数组 A，其中每个字符串长度相等。\n选取一个删除索引序列，对于 A 中的每个字符串，删除对应每个索引处的字符。 所余下的字符串行从上往下读形成列。\n比如，有 A = [\"abcdef\", \"uvwxyz\"]，删除索引序列 {0, 2, 3}，删除后 A 为[\"bef\", \"vyz\"]， A 的列分别为[\"b\",\"v\"], [\"e\",\"y\"], [\"f\",\"z\"]。（形式上，第 n 列为 [A[0][n], A[1][n], ..., A[A.length-1][n]]）。\n假设，我们选择了一组删除索引 D，那么在执行删除操作之后，A 中所剩余的每一列都必须是 非降序 排列的，然后请你返回 D.length 的最小可能值。\n示例 1：\n输入：[\"cba\", \"daf\", \"ghi\"]\n输出：1\n解释：\n当选择 D = {1}，删除后 A 的列为：[\"c\",\"d\",\"g\"] 和 [\"a\",\"f\",\"i\"]，均为非降序排列。\n若选择 D = {}，那么 A 的列 [\"b\",\"a\",\"h\"] 就不是非降序排列了。\n示例 2：\n输入：[\"a\", \"b\"]\n输出：0\n解释：D = {}\n示例 3：\n输入：[\"zyx\", \"wvu\", \"tsr\"]\n输出：3\n解释：D = {0, 1, 2}\n提示：\n1 <= A.length <= 100\n1 <= A[i].length <= 1000
 * <p>
 * acceptance: 69.8%
 * difficulty: Easy
 * private: False
 */


//TODO init
public class DeleteColumnsToMakeSorted {
    public int minDeletionSize(String[] A) {
        return 0;
    }
}