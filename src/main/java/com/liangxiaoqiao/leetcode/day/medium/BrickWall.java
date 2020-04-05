package com.liangxiaoqiao.leetcode.day.medium;


import java.util.List;
    

/*
 * English
 * id: 554
 * title: Brick Wall
 * href: https://leetcode.com/problems/brick-wall
 * desc: There is a brick wall in front of you. The wall is rectangular and has several rows of bricks. The bricks have the same height but different width. You want to draw a vertical line from the top to the bottom and cross the least bricks.\nThe brick wall is represented by a list of rows. Each row is a list of integers representing the width of each brick in this row from left to right.\nIf your line go through the edge of a brick, then the brick is not considered as crossed. You need to find out how to draw the line to cross the least bricks and return the number of crossed bricks.\nYou cannot draw a line just along one of the two vertical edges of the wall, in which case the line will obviously cross no bricks.\n  Example:\nInput: [[1,2,2,1],\n        [3,1,2],\n        [1,3,2],\n        [2,4],\n        [3,1,2],\n        [1,3,1,1]]\n\nOutput: 2\n\nExplanation: \n  Note:\nThe width sum of bricks in different rows are the same and won\'t exceed INT_MAX.\nThe number of bricks in each row is in range [1,10,000]. The height of wall is in range [1,10,000]. Total number of bricks of the wall won\'t exceed 20,000.
 * <p>
 * 中文
 * 序号: 554
 * 标题： 砖墙
 * 链接： https://leetcode-cn.com/problems/brick-wall
 * 描述： 你的面前有一堵方形的、由多行砖块组成的砖墙。 这些砖块高度相同但是宽度不同。你现在要画一条自顶向下的、穿过最少砖块的垂线。\n砖墙由行的列表表示。 每一行都是一个代表从左至右每块砖的宽度的整数列表。\n如果你画的线只是从砖块的边缘经过，就不算穿过这块砖。你需要找出怎样画才能使这条线穿过的砖块数量最少，并且返回穿过的砖块数量。\n你不能沿着墙的两个垂直边缘之一画线，这样显然是没有穿过一块砖的。\n  示例：\n输入: [[1,2,2,1],\n      [3,1,2],\n      [1,3,2],\n      [2,4],\n      [3,1,2],\n      [1,3,1,1]]\n\n输出: 2\n\n解释: \n  提示：\n每一行砖块的宽度之和应该相等，并且不能超过 INT_MAX。\n每一行砖块的数量在 [1,10,000] 范围内， 墙的高度在 [1,10,000] 范围内， 总的砖块数量不超过 20,000。
 * <p>
 * acceptance: 48.7%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class BrickWall {
    public int leastBricks(List<List<Integer>> wall) {
        return 0;
    }
}