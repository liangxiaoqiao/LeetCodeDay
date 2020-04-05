package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 850
 * title: Rectangle Area II
 * href: https://leetcode.com/problems/rectangle-area-ii
 * desc: We are given a list of (axis-aligned) rectangles.  Each rectangle[i] = [x1, y1, x2, y2] , where (x1, y1) are the coordinates of the bottom-left corner, and (x2, y2) are the coordinates of the top-right corner of the ith rectangle.\nFind the total area covered by all rectangles in the plane.  Since the answer may be too large, return it modulo 10^9 + 7.\nExample 1:\nInput: [[0,0,2,2],[1,0,2,3],[1,0,3,1]]\nOutput: 6\nExplanation: As illustrated in the picture.\nExample 2:\nInput: [[0,0,1000000000,1000000000]]\nOutput: 49\nExplanation: The answer is 10^18 modulo (10^9 + 7), which is (10^9)^2 = (-7)^2 = 49.\nNote:\n1 <= rectangles.length <= 200\nrectanges[i].length = 4\n0 <= rectangles[i][j] <= 10^9\nThe total area covered by all rectangles will never exceed 2^63 - 1 and thus will fit in a 64-bit signed integer.
 * <p>
 * 中文
 * 序号: 850
 * 标题： 矩形面积 II
 * 链接： https://leetcode-cn.com/problems/rectangle-area-ii
 * 描述： 我们给出了一个（轴对齐的）矩形列表 rectangles 。 对于 rectangle[i] = [x1, y1, x2, y2]，其中（x1，y1）是矩形 i 左下角的坐标，（x2，y2）是该矩形右上角的坐标。\n找出平面中所有矩形叠加覆盖后的总面积。 由于答案可能太大，请返回它对 10 ^ 9 + 7 取模的结果。\n示例 1：\n输入：[[0,0,2,2],[1,0,2,3],[1,0,3,1]]\n输出：6\n解释：如图所示。\n示例 2：\n输入：[[0,0,1000000000,1000000000]]\n输出：49\n解释：答案是 10^18 对 (10^9 + 7) 取模的结果， 即 (10^9)^2 → (-7)^2 = 49 。\n提示：\n1 <= rectangles.length <= 200\nrectanges[i].length = 4\n0 <= rectangles[i][j] <= 10^9\n矩形叠加覆盖后的总面积不会超越 2^63 - 1 ，这意味着可以用一个 64 位有符号整数来保存面积结果。
 * <p>
 * acceptance: 46.2%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class RectangleAreaIi {
    public int rectangleArea(int[][] rectangles) {
        return 0;
    }
}