package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 1035
 * title: Uncrossed Lines
 * href: https://leetcode.com/problems/uncrossed-lines
 * desc: We write the integers of A and B (in the order they are given) on two separate horizontal lines.
 * Now, we may draw connecting lines: a straight line connecting two numbers A[i] and B[j] such that:
 * A[i] == B[j];
 * The line we draw does not intersect any other connecting (non-horizontal) line.
 * Note that a connecting lines cannot intersect even at the endpoints: each number can only belong to one connecting line.
 * Return the maximum number of connecting lines we can draw in this way.
 * Example 1:
 * Input: A = [1,4,2], B = [1,2,4]
 * Output: 2
 * Explanation: We can draw 2 uncrossed lines as in the diagram.
 * We cannot draw 3 uncrossed lines, because the line from A[1]=4 to B[2]=4 will intersect the line from A[2]=2 to B[1]=2.
 * Example 2:
 * Input: A = [2,5,1,2,5], B = [10,5,2,1,5,2]
 * Output: 3
 * Example 3:
 * Input: A = [1,3,7,1,7,5], B = [1,9,2,5,1]
 * Output: 2
 * Note:
 * 1 <= A.length <= 500
 * 1 <= B.length <= 500
 * 1 <= A[i], B[i] <= 2000
 * <p>
 * 中文
 * 序号: 1035
 * 标题： 不相交的线
 * 链接： https://leetcode-cn.com/problems/uncrossed-lines
 * 描述： 我们在两条独立的水平线上按给定的顺序写下 A 和 B 中的整数。
 * 现在，我们可以绘制一些连接两个数字 A[i] 和 B[j] 的直线，只要 A[i] == B[j]，且我们绘制的直线不与任何其他连线（非水平线）相交。
 * 以这种方法绘制线条，并返回我们可以绘制的最大连线数。
 * 示例 1：
 * 输入：A = [1,4,2], B = [1,2,4]
 * 输出：2
 * 解释：
 * 我们可以画出两条不交叉的线，如上图所示。
 * 我们无法画出第三条不相交的直线，因为从 A[1]=4 到 B[2]=4 的直线将与从 A[2]=2 到 B[1]=2 的直线相交。
 * 示例 2：
 * 输入：A = [2,5,1,2,5], B = [10,5,2,1,5,2]
 * 输出：3
 * 示例 3：
 * 输入：A = [1,3,7,1,7,5], B = [1,9,2,5,1]
 * 输出：2
 * 提示：
 * 1 <= A.length <= 500
 * 1 <= B.length <= 500
 * 1 <= A[i], B[i] <= 2000
 * <p>
 * <p>
 * acceptance: 53.0%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class UncrossedLines {
    public int maxUncrossedLines(int[] A, int[] B) {
        return 0;
    }
}