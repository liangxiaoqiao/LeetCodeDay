package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 1036
 * title: Escape a Large Maze
 * href: https://leetcode.com/problems/escape-a-large-maze
 * desc: In a 1 million by 1 million grid, the coordinates of each grid square are (x, y) with 0 <= x, y < 10^6.
 * We start at the source square and want to reach the target square.  Each move, we can walk to a 4-directionally adjacent square in the grid that isn't in the given list of blocked squares.
 * Return true if and only if it is possible to reach the target square through a sequence of moves.
 * Example 1:
 * Input: blocked = [[0,1],[1,0]], source = [0,0], target = [0,2]
 * Output: false
 * Explanation:
 * The target square is inaccessible starting from the source square, because we can't walk outside the grid.
 * Example 2:
 * Input: blocked = [], source = [0,0], target = [999999,999999]
 * Output: true
 * Explanation:
 * Because there are no blocked cells, it's possible to reach the target square.
 * Note:
 * 0 <= blocked.length <= 200
 * blocked[i].length == 2
 * 0 <= blocked[i][j] < 10^6
 * source.length == target.length == 2
 * 0 <= source[i][j], target[i][j] < 10^6
 * source != target
 * <p>
 * 中文
 * 序号: 1036
 * 标题： 逃离大迷宫
 * 链接： https://leetcode-cn.com/problems/escape-a-large-maze
 * 描述： 在一个 10^6 x 10^6 的网格中，每个网格块的坐标为 (x, y)，其中 0 <= x, y < 10^6。
 * 我们从源方格 source 开始出发，意图赶往目标方格 target。每次移动，我们都可以走到网格中在四个方向上相邻的方格，只要该方格不在给出的封锁列表 blocked 上。
 * 只有在可以通过一系列的移动到达目标方格时才返回 true。否则，返回 false。
 * 示例 1：
 * 输入：blocked = [[0,1],[1,0]], source = [0,0], target = [0,2]
 * 输出：false
 * 解释：
 * 从源方格无法到达目标方格，因为我们无法在网格中移动。
 * 示例 2：
 * 输入：blocked = [], source = [0,0], target = [999999,999999]
 * 输出：true
 * 解释：
 * 因为没有方格被封锁，所以一定可以到达目标方格。
 * 提示：
 * 0 <= blocked.length <= 200
 * blocked[i].length == 2
 * 0 <= blocked[i][j] < 10^6
 * source.length == target.length == 2
 * 0 <= source[i][j], target[i][j] < 10^6
 * source != target
 * <p>
 * acceptance: 35.3%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class EscapeALargeMaze {
    public boolean isEscapePossible(int[][] blocked, int[] source, int[] target) {
        return false;
    }
}