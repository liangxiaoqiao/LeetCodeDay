package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 985
 * title: Sum of Even Numbers After Queries
 * href: https://leetcode.com/problems/sum-of-even-numbers-after-queries
 * desc: We have an array A of integers, and an array queries of queries.\nFor the i-th query val = queries[i][0], index = queries[i][1], we add val to A[index].  Then, the answer to the i-th query is the sum of the even values of A.\n(Here, the given index = queries[i][1] is a 0-based index, and each query permanently modifies the array A.)\nReturn the answer to all queries.  Your answer array should have answer[i] as the answer to the i-th query.\n  Example 1:\nInput: A = [1,2,3,4], queries = [[1,0],[-3,1],[-4,0],[2,3]]\nOutput: [8,6,2,4]\nExplanation: \nAt the beginning, the array is [1,2,3,4].\nAfter adding 1 to A[0], the array is [2,2,3,4], and the sum of even values is 2 + 2 + 4 = 8.\nAfter adding -3 to A[1], the array is [2,-1,3,4], and the sum of even values is 2 + 4 = 6.\nAfter adding -4 to A[0], the array is [-2,-1,3,4], and the sum of even values is -2 + 4 = 2.\nAfter adding 2 to A[3], the array is [-2,-1,3,6], and the sum of even values is -2 + 6 = 4.\n  Note:\n1 <= A.length <= 10000\n-10000 <= A[i] <= 10000\n1 <= queries.length <= 10000\n-10000 <= queries[i][0] <= 10000\n0 <= queries[i][1] < A.length
 * <p>
 * 中文
 * 序号: 985
 * 标题： 查询后的偶数和
 * 链接： https://leetcode-cn.com/problems/sum-of-even-numbers-after-queries
 * 描述： 给出一个整数数组 A 和一个查询数组 queries。
 * 对于第 i 次查询，有 val = queries[i][0], index = queries[i][1]，我们会把 val 加到 A[index] 上。然后，第 i 次查询的答案是 A 中偶数值的和。
 * （此处给定的 index = queries[i][1] 是从 0 开始的索引，每次查询都会永久修改数组 A。）
 * 返回所有查询的答案。你的答案应当以数组 answer 给出，answer[i] 为第 i 次查询的答案。
 * 示例：
 * 输入：A = [1,2,3,4], queries = [[1,0],[-3,1],[-4,0],[2,3]]
 * 输出：[8,6,2,4]
 * 解释：
 * 开始时，数组为 [1,2,3,4]。
 * 将 1 加到 A[0] 上之后，数组为 [2,2,3,4]，偶数值之和为 2 + 2 + 4 = 8。
 * 将 -3 加到 A[1] 上之后，数组为 [2,-1,3,4]，偶数值之和为 2 + 4 = 6。
 * 将 -4 加到 A[0] 上之后，数组为 [-2,-1,3,4]，偶数值之和为 -2 + 4 = 2。
 * 将 2 加到 A[3] 上之后，数组为 [-2,-1,3,6]，偶数值之和为 -2 + 6 = 4。
 * 提示：
 * 1 <= A.length <= 10000
 * -10000 <= A[i] <= 10000
 * 1 <= queries.length <= 10000
 * -10000 <= queries[i][0] <= 10000
 * 0 <= queries[i][1] < A.length
 * <p>
 * acceptance: 62.4%
 * difficulty: Easy
 * private: False
 */


//TODO init
public class SumOfEvenNumbersAfterQueries {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        return null;
    }
}