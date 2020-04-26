package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 930
 * title: Binary Subarrays With Sum
 * href: https://leetcode.com/problems/binary-subarrays-with-sum
 * desc: In an array A of 0s and 1s, how many non-empty subarrays have sum S?\n  Example 1:\nInput: A = [1,0,1,0,1], S = 2\nOutput: 4\nExplanation: \nThe 4 subarrays are bolded below:\n[1,0,1,0,1]\n[1,0,1,0,1]\n[1,0,1,0,1]\n[1,0,1,0,1]\n  Note:\nA.length <= 30000\n0 <= S <= A.length\nA[i] is either 0 or 1.
 * <p>
 * 中文
 * 序号: 930
 * 标题： 和相同的二元子数组
 * 链接： https://leetcode-cn.com/problems/binary-subarrays-with-sum
 * 描述： 在由若干 0 和 1  组成的数组 A 中，有多少个和为 S 的非空子数组。

 

示例：

输入：A = [1,0,1,0,1], S = 2
输出：4
解释：
如下面黑体所示，有 4 个满足题目要求的子数组：
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]
 

提示：

A.length <= 30000
0 <= S <= A.length
A[i] 为 0 或 1

 * <p>
 * acceptance: 40.4%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class BinarySubarraysWithSum {

    public int numSubarraysWithSum(int[] A, int S) {
        int index1 = 0;
        int index2 = 0;
        int count = 0;
        while (index1 < A.length && index2 < A.length) {
            int sum = sum(A, index1, index2);
            if (sum == S) {
                int temp = index2 + 1;
                while (temp < A.length && A[temp] == 0) {
                    count++;
                    temp++;
                }
                index1++;
                count++;
            } else if (sum > S) {
                index1++;
            } else {
                index2++;
            }
        }
        return count;
    }

    private int sum(int[] arr, int start, int end) {
        if (start == end) {
            return arr[start];
        } else {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                sum += arr[i];
            }
            return sum;
        }
    }
}