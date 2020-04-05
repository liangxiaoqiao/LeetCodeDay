package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 779
 * title: K-th Symbol in Grammar
 * href: https://leetcode.com/problems/k-th-symbol-in-grammar
 * desc: On the first row, we write a 0. Now in every subsequent row, we look at the previous row and replace each occurrence of 0 with 01, and each occurrence of 1 with 10.
 * Given row N and index K, return the K-th indexed symbol in row N. (The values of K are 1-indexed.) (1 indexed).
 * Examples:
 * Input: N = 1, K = 1
 * Output: 0
 * <p>
 * Input: N = 2, K = 1
 * Output: 0
 * <p>
 * Input: N = 2, K = 2
 * Output: 1
 * <p>
 * Input: N = 4, K = 5
 * Output: 1
 * <p>
 * Explanation:
 * row 1: 0
 * row 2: 01
 * row 3: 0110
 * row 4: 01101001
 * Note:
 * N will be an integer in the range [1, 30].
 * K will be an integer in the range [1, 2^(N-1)].
 * <p>
 * 中文
 * 序号: 779
 * 标题： 第K个语法符号
 * 链接： https://leetcode-cn.com/problems/k-th-symbol-in-grammar
 * 描述： 在第一行我们写上一个 0。接下来的每一行，将前一行中的0替换为01，1替换为10。\n给定行数 N 和序数 K，返回第 N 行中第 K个字符。（K从1开始）\n\n例子:\n输入: N = 1, K = 1\n输出: 0\n\n输入: N = 2, K = 1\n输出: 0\n\n输入: N = 2, K = 2\n输出: 1\n\n输入: N = 4, K = 5\n输出: 1\n\n解释:\n第一行: 0\n第二行: 01\n第三行: 0110\n第四行: 01101001\n\n注意：\nN 的范围 [1, 30].\nK 的范围 [1, 2^(N-1)].
 * <p>
 * acceptance: 37.3%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class KThSymbolInGrammar {
    public int kthGrammar(int N, int K) {
        return 0;
    }
}