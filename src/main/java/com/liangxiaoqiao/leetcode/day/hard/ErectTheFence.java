package com.liangxiaoqiao.leetcode.day.hard;

import java.util.List;

/*
 * English
 * id: 587
 * title: Erect the Fence
 * href: https://leetcode.com/problems/erect-the-fence
 * desc: There are some trees, where each tree is represented by (x,y) coordinate in a two-dimensional garden. Your job is to fence the entire garden using the minimum length of rope as it is expensive. The garden is well fenced only if all the trees are enclosed. Your task is to help find the coordinates of trees which are exactly located on the fence perimeter.\n  Example 1:\nInput: [[1,1],[2,2],[2,0],[2,4],[3,3],[4,2]]\nOutput: [[1,1],[2,0],[4,2],[3,3],[2,4]]\nExplanation:\nExample 2:\nInput: [[1,2],[2,2],[4,2]]\nOutput: [[1,2],[2,2],[4,2]]\nExplanation:\n\nEven you only have trees in a line, you need to use rope to enclose them. \n  Note:\nAll trees should be enclosed together. You cannot cut the rope to enclose trees that will separate them in more than one group.\nAll input integers will range from 0 to 100.\nThe garden has at least one tree.\nAll coordinates are distinct.\nInput points have NO order. No order required for output.
 * <p>
 * 中文
 * 序号: 587
 * 标题： 安装栅栏
 * 链接： https://leetcode-cn.com/problems/erect-the-fence
 * 描述： 在一个二维的花园中，有一些用 (x, y) 坐标表示的树。由于安装费用十分昂贵，你的任务是先用最短的绳子围起所有的树。只有当所有的树都被绳子包围时，花园才能围好栅栏。你需要找到正好位于栅栏边界上的树的坐标。\n  示例 1:\n输入: [[1,1],[2,2],[2,0],[2,4],[3,3],[4,2]]\n输出: [[1,1],[2,0],[4,2],[3,3],[2,4]]\n解释:\n示例 2:\n输入: [[1,2],[2,2],[4,2]]\n输出: [[1,2],[2,2],[4,2]]\n解释:\n\n即使树都在一条直线上，你也需要先用绳子包围它们。\n  注意:\n所有的树应当被围在一起。你不能剪断绳子来包围树或者把树分成一组以上。\n输入的整数在 0 到 100 之间。\n花园至少有一棵树。\n所有树的坐标都是不同的。\n输入的点没有顺序。输出顺序也没有要求。
 * <p>
 * acceptance: 35.0%
 * difficulty: Hard
 * private: False
 */


//TODO init

/*
 * Definition for a point.
 * class Point {
 * int x;
 * int y;
 * Point() { x = 0; y = 0; }
 * Point(int a, int b) { x = a; y = b; }
 * }
 */
public class ErectTheFence {
    public List<Point> outerTrees(Point[] points) {
        return null;
    }


    public class Point {
        int x;
        int y;

        Point() {
            x = 0;
            y = 0;
        }

        Point(int a, int b) {
            x = a;
            y = b;
        }
    }
}

