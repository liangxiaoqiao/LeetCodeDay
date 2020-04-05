package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 391
 * title: Perfect Rectangle
 * href: https://leetcode.com/problems/perfect-rectangle
 * desc: Given N axis-aligned rectangles where N > 0, determine if they all together form an exact cover of a rectangular region.
 * Each rectangle is represented as a bottom-left point and a top-right point. For example, a unit square is represented as [1,1,2,2]. (coordinate of bottom-left point is (1, 1) and top-right point is (2, 2)).
 * Example 1:
 * rectangles = [
 * [1,1,3,3],
 * [3,1,4,2],
 * [3,2,4,4],
 * [1,3,2,4],
 * [2,3,3,4]
 * ]
 * <p>
 * Return true. All 5 rectangles together form an exact cover of a rectangular region.
 * Example 2:
 * rectangles = [
 * [1,1,2,3],
 * [1,3,2,4],
 * [3,1,4,2],
 * [3,2,4,4]
 * ]
 * <p>
 * Return false. Because there is a gap between the two rectangular regions.
 * Example 3:
 * rectangles = [
 * [1,1,3,3],
 * [3,1,4,2],
 * [1,3,2,4],
 * [3,2,4,4]
 * ]
 * <p>
 * Return false. Because there is a gap in the top center.
 * Example 4:
 * rectangles = [
 * [1,1,3,3],
 * [3,1,4,2],
 * [1,3,2,4],
 * [2,2,4,4]
 * ]
 * <p>
 * Return false. Because two of the rectangles overlap with each other.
 * <p>
 * <p>
 * 中文
 * 序号: 391
 * 标题： 完美矩形
 * 链接： https://leetcode-cn.com/problems/perfect-rectangle
 * 描述： 我们有 N 个与坐标轴对齐的矩形, 其中 N > 0, 判断它们是否能精确地覆盖一个矩形区域。\n每个矩形用左下角的点和右上角的点的坐标来表示。例如， 一个单位正方形可以表示为 [1,1,2,2]。 ( 左下角的点的坐标为 (1, 1) 以及右上角的点的坐标为 (2, 2) )。\n示例 1:\nrectangles = [\n  [1,1,3,3],\n  [3,1,4,2],\n  [3,2,4,4],\n  [1,3,2,4],\n  [2,3,3,4]\n]\n\n返回 true。5个矩形一起可以精确地覆盖一个矩形区域。\n  示例 2:\nrectangles = [\n  [1,1,2,3],\n  [1,3,2,4],\n  [3,1,4,2],\n  [3,2,4,4]\n]\n\n返回 false。两个矩形之间有间隔，无法覆盖成一个矩形。\n  示例 3:\nrectangles = [\n  [1,1,3,3],\n  [3,1,4,2],\n  [1,3,2,4],\n  [3,2,4,4]\n]\n\n返回 false。图形顶端留有间隔，无法覆盖成一个矩形。\n  示例 4:\nrectangles = [\n  [1,1,3,3],\n  [3,1,4,2],\n  [1,3,2,4],\n  [2,2,4,4]\n]\n\n返回 false。因为中间有相交区域，虽然形成了矩形，但不是精确覆盖。
 * <p>
 * acceptance: 29.3%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class PerfectRectangle {
    public boolean isRectangleCover(int[][] rectangles) {
        return false;
    }
}