package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 963
 * title: Minimum Area Rectangle II
 * href: https://leetcode.com/problems/minimum-area-rectangle-ii
 * desc: Given a set of points in the xy-plane, determine the minimum area of any rectangle formed from these points, with sides not necessarily parallel to the x and y axes.\nIf there isn\'t any rectangle, return 0.\n  Example 1:\nInput: [[1,2],[2,1],[1,0],[0,1]]\nOutput: 2.00000\nExplanation: The minimum area rectangle occurs at [1,2],[2,1],[1,0],[0,1], with an area of 2.\nExample 2:\nInput: [[0,1],[2,1],[1,1],[1,0],[2,0]]\nOutput: 1.00000\nExplanation: The minimum area rectangle occurs at [1,0],[1,1],[2,1],[2,0], with an area of 1.\nExample 3:\nInput: [[0,3],[1,2],[3,1],[1,3],[2,1]]\nOutput: 0\nExplanation: There is no possible rectangle to form from these points.\nExample 4:\nInput: [[3,1],[1,1],[0,1],[2,1],[3,3],[3,2],[0,2],[2,3]]\nOutput: 2.00000\nExplanation: The minimum area rectangle occurs at [2,1],[2,3],[3,3],[3,1], with an area of 2.\n  Note:\n1 <= points.length <= 50\n0 <= points[i][0] <= 40000\n0 <= points[i][1] <= 40000\nAll points are distinct.\nAnswers within 10^-5 of the actual value will be accepted as correct.
 * <p>
 * 中文
 * 序号: 963
 * 标题： 最小面积矩形 II
 * 链接： https://leetcode-cn.com/problems/minimum-area-rectangle-ii
 * 描述： 给定在 xy 平面上的一组点，确定由这些点组成的任何矩形的最小面积，其中矩形的边不一定平行于 x 轴和 y 轴。\n如果没有任何矩形，就返回 0。\n  示例 1：\n输入：[[1,2],[2,1],[1,0],[0,1]]\n输出：2.00000\n解释：最小面积的矩形出现在 [1,2],[2,1],[1,0],[0,1] 处，面积为 2。\n示例 2：\n输入：[[0,1],[2,1],[1,1],[1,0],[2,0]]\n输出：1.00000\n解释：最小面积的矩形出现在 [1,0],[1,1],[2,1],[2,0] 处，面积为 1。\n示例 3：\n输入：[[0,3],[1,2],[3,1],[1,3],[2,1]]\n输出：0\n解释：没法从这些点中组成任何矩形。\n示例 4：\n输入：[[3,1],[1,1],[0,1],[2,1],[3,3],[3,2],[0,2],[2,3]]\n输出：2.00000\n解释：最小面积的矩形出现在 [2,1],[2,3],[3,3],[3,1] 处，面积为 2。\n  提示：\n1 <= points.length <= 50\n0 <= points[i][0] <= 40000\n0 <= points[i][1] <= 40000\n所有的点都是不同的。\n与真实值误差不超过 10^-5 的答案将视为正确结果。
 * <p>
 * acceptance: 48.2%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class MinimumAreaRectangleIi {
    public double minAreaFreeRect(int[][] points) {
        return 0;
    }
}