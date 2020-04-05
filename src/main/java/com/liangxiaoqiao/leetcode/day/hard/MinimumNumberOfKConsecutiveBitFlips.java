package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 995
 * title: Minimum Number of K Consecutive Bit Flips
 * href: https://leetcode.com/problems/minimum-number-of-k-consecutive-bit-flips
 * desc: In an array A containing only 0s and 1s, a K-bit flip consists of choosing a (contiguous) subarray of length K and simultaneously changing every 0 in the subarray to 1, and every 1 in the subarray to 0.\nReturn the minimum number of K-bit flips required so that there is no 0 in the array.  If it is not possible, return -1.\n  Example 1:\nInput: A = [0,1,0], K = 1\nOutput: 2\nExplanation: Flip A[0], then flip A[2].\nExample 2:\nInput: A = [1,1,0], K = 2\nOutput: -1\nExplanation: No matter how we flip subarrays of size 2, we can\'t make the array become [1,1,1].\nExample 3:\nInput: A = [0,0,0,1,0,1,1,0], K = 3\nOutput: 3\nExplanation:\nFlip A[0],A[1],A[2]: A becomes [1,1,1,1,0,1,1,0]\nFlip A[4],A[5],A[6]: A becomes [1,1,1,1,1,0,0,0]\nFlip A[5],A[6],A[7]: A becomes [1,1,1,1,1,1,1,1]\n  Note:\n1 <= A.length <= 30000\n1 <= K <= A.length
 * <p>
 * 中文
 * 序号: 995
 * 标题： K 连续位的最小翻转次数
 * 链接： https://leetcode-cn.com/problems/minimum-number-of-k-consecutive-bit-flips
 * 描述： None
 * <p>
 * acceptance: 46.3%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class MinimumNumberOfKConsecutiveBitFlips {
    public int minKBitFlips(int[] A, int K) {
        return 0;
    }
}
        