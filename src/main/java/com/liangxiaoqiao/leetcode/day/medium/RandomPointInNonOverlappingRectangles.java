package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 497
 * title: Random Point in Non-overlapping Rectangles
 * href: https://leetcode.com/problems/random-point-in-non-overlapping-rectangles
 * desc: Given a list of non-overlapping axis-aligned rectangles rects, write a function pick which randomly and uniformily picks an integer point in the space covered by the rectangles.\nNote:\nAn integer point is a point that has integer coordinates. \nA point on the perimeter of a rectangle is included in the space covered by the rectangles. \nith rectangle = rects[i] = [x1,y1,x2,y2], where [x1, y1] are the integer coordinates of the bottom-left corner, and [x2, y2] are the integer coordinates of the top-right corner.\nlength and width of each rectangle does not exceed 2000.\n1 <= rects.length <= 100\npick return a point as an array of integer coordinates [p_x, p_y]\npick is called at most 10000 times.\nExample 1:\nInput: \n[\"Solution\",\"pick\",\"pick\",\"pick\"]\n[[[[1,1,5,5]]],[],[],[]]\nOutput: \n[null,[4,1],[4,1],[3,3]]\nExample 2:\nInput: \n[\"Solution\",\"pick\",\"pick\",\"pick\",\"pick\",\"pick\"]\n[[[[-2,-2,-1,-1],[1,0,3,0]]],[],[],[],[],[]]\nOutput: \n[null,[-1,-2],[2,0],[-2,-1],[3,0],[-2,-2]]\nExplanation of Input Syntax:\nThe input is two lists: the subroutines called and their arguments. Solution\'s constructor has one argument, the array of rectangles rects. pick has no arguments. Arguments are always wrapped with a list, even if there aren\'t any.\n
 * <p>
 * 中文
 * 序号: 497
 * 标题： 非重叠矩形中的随机点
 * 链接： https://leetcode-cn.com/problems/random-point-in-non-overlapping-rectangles
 * 描述： 给定一个非重叠轴对齐矩形的列表 rects，写一个函数 pick 随机均匀地选取矩形覆盖的空间中的整数点。\n提示：\n整数点是具有整数坐标的点。\n矩形周边上的点包含在矩形覆盖的空间中。\n第 i 个矩形 rects [i] = [x1，y1，x2，y2]，其中 [x1，y1] 是左下角的整数坐标，[x2，y2] 是右上角的整数坐标。\n每个矩形的长度和宽度不超过 2000。\n1 <= rects.length <= 100\npick 以整数坐标数组 [p_x, p_y] 的形式返回一个点。\npick 最多被调用10000次。\n  示例 1：\n输入: \n[\"Solution\",\"pick\",\"pick\",\"pick\"]\n[[[[1,1,5,5]]],[],[],[]]\n输出: \n[null,[4,1],[4,1],[3,3]]\n示例 2：\n输入: \n[\"Solution\",\"pick\",\"pick\",\"pick\",\"pick\",\"pick\"]\n[[[[-2,-2,-1,-1],[1,0,3,0]]],[],[],[],[],[]]\n输出: \n[null,[-1,-2],[2,0],[-2,-1],[3,0],[-2,-2]]\n  输入语法的说明：\n输入是两个列表：调用的子例程及其参数。Solution 的构造函数有一个参数，即矩形数组 rects。pick 没有参数。参数总是用列表包装的，即使没有也是如此。\n
 * <p>
 * acceptance: 37.1%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class RandomPointInNonOverlappingRectangles {
    public RandomPointInNonOverlappingRectangles(int[][] rects) {

    }

    public int[] pick() {
        return null;
    }
}

/*
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(rects);
 * int[] param_1 = obj.pick();
 */
