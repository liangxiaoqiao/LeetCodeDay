package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 762
 * title: Prime Number of Set Bits in Binary Representation
 * href: https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation
 * desc: Given two integers L and R, find the count of numbers in the range [L, R] (inclusive) having a prime number of set bits in their binary representation.\n(Recall that the number of set bits an integer has is the number of 1s present when written in binary. For example, 21 written in binary is 10101 which has 3 set bits. Also, 1 is not a prime.)\nExample 1:\nInput: L = 6, R = 10\nOutput: 4\nExplanation:\n6 -> 110 (2 set bits, 2 is prime)\n7 -> 111 (3 set bits, 3 is prime)\n9 -> 1001 (2 set bits , 2 is prime)\n10->1010 (2 set bits , 2 is prime)\nExample 2:\nInput: L = 10, R = 15\nOutput: 5\nExplanation:\n10 -> 1010 (2 set bits, 2 is prime)\n11 -> 1011 (3 set bits, 3 is prime)\n12 -> 1100 (2 set bits, 2 is prime)\n13 -> 1101 (3 set bits, 3 is prime)\n14 -> 1110 (3 set bits, 3 is prime)\n15 -> 1111 (4 set bits, 4 is not prime)\nNote:\nL, R will be integers L <= R in the range [1, 10^6].\nR - L will be at most 10000.
 * <p>
 * 中文
 * 序号: 762
 * 标题： 二进制表示中质数个计算置位
 * 链接： https://leetcode-cn.com/problems/prime-number-of-set-bits-in-binary-representation
 * 描述： 给定两个整数 L 和 R ，找到闭区间 [L, R] 范围内，计算置位位数为质数的整数个数。\n（注意，计算置位代表二进制表示中1的个数。例如 21 的二进制表示 10101 有 3 个计算置位。还有，1 不是质数。）\n示例 1:\n输入: L = 6, R = 10\n输出: 4\n解释:\n6 -> 110 (2 个计算置位，2 是质数)\n7 -> 111 (3 个计算置位，3 是质数)\n9 -> 1001 (2 个计算置位，2 是质数)\n10-> 1010 (2 个计算置位，2 是质数)\n示例 2:\n输入: L = 10, R = 15\n输出: 5\n解释:\n10 -> 1010 (2 个计算置位, 2 是质数)\n11 -> 1011 (3 个计算置位, 3 是质数)\n12 -> 1100 (2 个计算置位, 2 是质数)\n13 -> 1101 (3 个计算置位, 3 是质数)\n14 -> 1110 (3 个计算置位, 3 是质数)\n15 -> 1111 (4 个计算置位, 4 不是质数)\n注意:\nL, R 是 L <= R 且在 [1, 10^6] 中的整数。\nR - L 的最大值为 10000。
 * <p>
 * acceptance: 61.2%
 * difficulty: Easy
 * private: False
 */


//TODO init
public class PrimeNumberOfSetBitsInBinaryRepresentation {
    public int countPrimeSetBits(int L, int R) {
        return 0;
    }
}