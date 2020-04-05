package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 801
 * title: Minimum Swaps To Make Sequences Increasing
 * href: https://leetcode.com/problems/minimum-swaps-to-make-sequences-increasing
 * desc: We have two integer sequences A and B of the same non-zero length.\nWe are allowed to swap elements A[i] and B[i].  Note that both elements are in the same index position in their respective sequences.\nAt the end of some number of swaps, A and B are both strictly increasing.  (A sequence is strictly increasing if and only if A[0] < A[1] < A[2] < ... < A[A.length - 1].)\nGiven A and B, return the minimum number of swaps to make both sequences strictly increasing.  It is guaranteed that the given input always makes it possible.\nExample:\nInput: A = [1,3,5,4], B = [1,2,3,7]\nOutput: 1\nExplanation: \nSwap A[3] and B[3].  Then the sequences are:\nA = [1, 3, 5, 7] and B = [1, 2, 3, 4]\nwhich are both strictly increasing.\nNote:\nA, B are arrays with the same length, and that length will be in the range [1, 1000].\nA[i], B[i] are integer values in the range [0, 2000].
 * <p>
 * 中文
 * 序号: 801
 * 标题： 使序列递增的最小交换次数
 * 链接： https://leetcode-cn.com/problems/minimum-swaps-to-make-sequences-increasing
 * 描述： 我们有两个长度相等且不为空的整型数组 A 和 B 。\n我们可以交换 A[i] 和 B[i] 的元素。注意这两个元素在各自的序列中应该处于相同的位置。\n在交换过一些元素之后，数组 A 和 B 都应该是严格递增的（数组严格递增的条件仅为A[0] < A[1] < A[2] < ... < A[A.length - 1]）。\n给定数组 A 和 B ，请返回使得两个数组均保持严格递增状态的最小交换次数。假设给定的输入总是有效的。\n示例:\n输入: A = [1,3,5,4], B = [1,2,3,7]\n输出: 1\n解释: \n交换 A[3] 和 B[3] 后，两个数组如下:\nA = [1, 3, 5, 7] ， B = [1, 2, 3, 4]\n两个数组均为严格递增的。\n注意:\nA, B 两个数组的长度总是相等的，且长度的范围为 [1, 1000]。\nA[i], B[i] 均为 [0, 2000]区间内的整数。
 * <p>
 * acceptance: 37.4%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class MinimumSwapsToMakeSequencesIncreasing {
    public int minSwap(int[] A, int[] B) {
        return 0;
    }
}