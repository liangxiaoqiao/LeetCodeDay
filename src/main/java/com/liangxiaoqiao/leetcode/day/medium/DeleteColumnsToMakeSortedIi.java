package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 955
 * title: Delete Columns to Make Sorted II
 * href: https://leetcode.com/problems/delete-columns-to-make-sorted-ii
 * desc: We are given an array A of N lowercase letter strings, all of the same length.\nNow, we may choose any set of deletion indices, and for each string, we delete all the characters in those indices.\nFor example, if we have an array A = [\"abcdef\",\"uvwxyz\"] and deletion indices {0, 2, 3}, then the final array after deletions is [\"bef\",\"vyz\"].\nSuppose we chose a set of deletion indices D such that after deletions, the final array has its elements in lexicographic order (A[0] <= A[1] <= A[2] ... <= A[A.length - 1]).\nReturn the minimum possible value of D.length.\n  Example 1:\nInput: [\"ca\",\"bb\",\"ac\"]\nOutput: 1\nExplanation: \nAfter deleting the first column, A = [\"a\", \"b\", \"c\"].\nNow A is in lexicographic order (ie. A[0] <= A[1] <= A[2]).\nWe require at least 1 deletion since initially A was not in lexicographic order, so the answer is 1.\nExample 2:\nInput: [\"xc\",\"yb\",\"za\"]\nOutput: 0\nExplanation: \nA is already in lexicographic order, so we don\'t need to delete anything.\nNote that the rows of A are not necessarily in lexicographic order:\nie. it is NOT necessarily true that (A[0][0] <= A[0][1] <= ...)\nExample 3:\nInput: [\"zyx\",\"wvu\",\"tsr\"]\nOutput: 3\nExplanation: \nWe have to delete every column.\n  Note:\n1 <= A.length <= 100\n1 <= A[i].length <= 100
 * <p>
 * 中文
 * 序号: 955
 * 标题： 删列造序 II
 * 链接： https://leetcode-cn.com/problems/delete-columns-to-make-sorted-ii
 * 描述： 给定由 N 个小写字母字符串组成的数组 A，其中每个字符串长度相等。\n选取一个删除索引序列，对于 A 中的每个字符串，删除对应每个索引处的字符。\n比如，有 A = [\"abcdef\", \"uvwxyz\"]，删除索引序列 {0, 2, 3}，删除后 A 为[\"bef\", \"vyz\"]。\n假设，我们选择了一组删除索引 D，那么在执行删除操作之后，最终得到的数组的元素是按 字典序（A[0] <= A[1] <= A[2] ... <= A[A.length - 1]）排列的，然后请你返回 D.length 的最小可能值。\n  示例 1：\n输入：[\"ca\",\"bb\",\"ac\"]\n输出：1\n解释： \n删除第一列后，A = [\"a\", \"b\", \"c\"]。\n现在 A 中元素是按字典排列的 (即，A[0] <= A[1] <= A[2])。\n我们至少需要进行 1 次删除，因为最初 A 不是按字典序排列的，所以答案是 1。\n示例 2：\n输入：[\"xc\",\"yb\",\"za\"]\n输出：0\n解释：\nA 的列已经是按字典序排列了，所以我们不需要删除任何东西。\n注意 A 的行不需要按字典序排列。\n也就是说，A[0][0] <= A[0][1] <= ... 不一定成立。\n示例 3：\n输入：[\"zyx\",\"wvu\",\"tsr\"]\n输出：3\n解释：\n我们必须删掉每一列。\n  提示：\n1 <= A.length <= 100\n1 <= A[i].length <= 100
 * <p>
 * acceptance: 32.6%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class DeleteColumnsToMakeSortedIi {
    public int minDeletionSize(String[] A) {
        return 0;
    }
}