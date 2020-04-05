package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 807
 * title: Max Increase to Keep City Skyline
 * href: https://leetcode.com/problems/max-increase-to-keep-city-skyline
 * desc: In a 2 dimensional array grid, each value grid[i][j] represents the height of a building located there. We are allowed to increase the height of any number of buildings, by any amount (the amounts can be different for different buildings). Height 0 is considered to be a building as well. \nAt the end, the \"skyline\" when viewed from all four directions of the grid, i.e. top, bottom, left, and right, must be the same as the skyline of the original grid. A city\'s skyline is the outer contour of the rectangles formed by all the buildings when viewed from a distance. See the following example.\nWhat is the maximum total sum that the height of the buildings can be increased?\nExample:\nInput: grid = [[3,0,8,4],[2,4,5,7],[9,2,6,3],[0,3,1,0]]\nOutput: 35\nExplanation: \nThe grid is:\n[ [3, 0, 8, 4], \n  [2, 4, 5, 7],\n  [9, 2, 6, 3],\n  [0, 3, 1, 0] ]\n\nThe skyline viewed from top or bottom is: [9, 4, 8, 7]\nThe skyline viewed from left or right is: [8, 7, 9, 3]\n\nThe grid after increasing the height of buildings without affecting skylines is:\n\ngridNew = [ [8, 4, 8, 7],\n            [7, 4, 7, 7],\n            [9, 4, 8, 7],\n            [3, 3, 3, 3] ]\nNotes:\n1 < grid.length = grid[0].length <= 50.\nAll heights grid[i][j] are in the range [0, 100].\nAll buildings in grid[i][j] occupy the entire grid cell: that is, they are a 1 x 1 x grid[i][j] rectangular prism.
 * <p>
 * 中文
 * 序号: 807
 * 标题： 保持城市天际线
 * 链接： https://leetcode-cn.com/problems/max-increase-to-keep-city-skyline
 * 描述： 在二维数组grid中，grid[i][j]代表位于某处的建筑物的高度。 我们被允许增加任何数量（不同建筑物的数量可能不同）的建筑物的高度。 高度 0 也被认为是建筑物。\n最后，从新数组的所有四个方向（即顶部，底部，左侧和右侧）观看的“天际线”必须与原始数组的天际线相同。 城市的天际线是从远处观看时，由所有建筑物形成的矩形的外部轮廓。 请看下面的例子。\n建筑物高度可以增加的最大总和是多少？\n例子：\n输入： grid = [[3,0,8,4],[2,4,5,7],[9,2,6,3],[0,3,1,0]]\n输出： 35\n解释： \nThe grid is:\n[ [3, 0, 8, 4], \n  [2, 4, 5, 7],\n  [9, 2, 6, 3],\n  [0, 3, 1, 0] ]\n\n从数组竖直方向（即顶部，底部）看“天际线”是：[9, 4, 8, 7]\n从水平水平方向（即左侧，右侧）看“天际线”是：[8, 7, 9, 3]\n\n在不影响天际线的情况下对建筑物进行增高后，新数组如下：\n\ngridNew = [ [8, 4, 8, 7],\n            [7, 4, 7, 7],\n            [9, 4, 8, 7],\n            [3, 3, 3, 3] ]\n说明:\n1 < grid.length = grid[0].length <= 50。\n grid[i][j] 的高度范围是： [0, 100]。\n一座建筑物占据一个grid[i][j]：换言之，它们是 1 x 1 x grid[i][j] 的长方体。
 * <p>
 * acceptance: 82.6%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class MaxIncreaseToKeepCitySkyline {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        return 0;
    }
}