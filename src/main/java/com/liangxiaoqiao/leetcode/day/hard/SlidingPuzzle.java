package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 773
 * title: Sliding Puzzle
 * href: https://leetcode.com/problems/sliding-puzzle
 * desc: On a 2x3 board, there are 5 tiles represented by the integers 1 through 5, and an empty square represented by 0.\nA move consists of choosing 0 and a 4-directionally adjacent number and swapping it.\nThe state of the board is solved if and only if the board is [[1,2,3],[4,5,0]].\nGiven a puzzle board, return the least number of moves required so that the state of the board is solved. If it is impossible for the state of the board to be solved, return -1.\nExamples:\nInput: board = [[1,2,3],[4,0,5]]\nOutput: 1\nExplanation: Swap the 0 and the 5 in one move.\nInput: board = [[1,2,3],[5,4,0]]\nOutput: -1\nExplanation: No number of moves will make the board solved.\nInput: board = [[4,1,2],[5,0,3]]\nOutput: 5\nExplanation: 5 is the smallest number of moves that solves the board.\nAn example path:\nAfter move 0: [[4,1,2],[5,0,3]]\nAfter move 1: [[4,1,2],[0,5,3]]\nAfter move 2: [[0,1,2],[4,5,3]]\nAfter move 3: [[1,0,2],[4,5,3]]\nAfter move 4: [[1,2,0],[4,5,3]]\nAfter move 5: [[1,2,3],[4,5,0]]\nInput: board = [[3,2,4],[1,5,0]]\nOutput: 14\nNote:\nboard will be a 2 x 3 array as described above.\nboard[i][j] will be a permutation of [0, 1, 2, 3, 4, 5].
 * <p>
 * 中文
 * 序号: 773
 * 标题： 滑动谜题
 * 链接： https://leetcode-cn.com/problems/sliding-puzzle
 * 描述： 在一个 2 x 3 的板上（board）有 5 块砖瓦，用数字 1~5 来表示, 以及一块空缺用 0 来表示.\n一次移动定义为选择 0 与一个相邻的数字（上下左右）进行交换.\n最终当板 board 的结果是 [[1,2,3],[4,5,0]] 谜板被解开。\n给出一个谜板的初始状态，返回最少可以通过多少次移动解开谜板，如果不能解开谜板，则返回 -1 。\n示例：\n输入：board = [[1,2,3],[4,0,5]]\n输出：1\n解释：交换 0 和 5 ，1 步完成\n输入：board = [[1,2,3],[5,4,0]]\n输出：-1\n解释：没有办法完成谜板\n输入：board = [[4,1,2],[5,0,3]]\n输出：5\n解释：\n最少完成谜板的最少移动次数是 5 ，\n一种移动路径:\n尚未移动: [[4,1,2],[5,0,3]]\n移动 1 次: [[4,1,2],[0,5,3]]\n移动 2 次: [[0,1,2],[4,5,3]]\n移动 3 次: [[1,0,2],[4,5,3]]\n移动 4 次: [[1,2,0],[4,5,3]]\n移动 5 次: [[1,2,3],[4,5,0]]\n输入：board = [[3,2,4],[1,5,0]]\n输出：14\n提示：\nboard 是一个如上所述的 2 x 3 的数组.\nboard[i][j] 是一个 [0, 1, 2, 3, 4, 5] 的排列.
 * <p>
 * acceptance: 56.0%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class SlidingPuzzle {
    public int slidingPuzzle(int[][] board) {
        return 0;
    }
}