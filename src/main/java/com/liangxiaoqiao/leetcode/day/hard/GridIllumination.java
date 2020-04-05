package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 1001
 * title: Grid Illumination
 * href: https://leetcode.com/problems/grid-illumination
 * desc: On a N x N grid of cells, each cell (x, y) with 0 <= x < N and 0 <= y < N has a lamp.\nInitially, some number of lamps are on.  lamps[i] tells us the location of the i-th lamp that is on.  Each lamp that is on illuminates every square on its x-axis, y-axis, and both diagonals (similar to a Queen in chess).\nFor the i-th query queries[i] = (x, y), the answer to the query is 1 if the cell (x, y) is illuminated, else 0.\nAfter each query (x, y) [in the order given by queries], we turn off any lamps that are at cell (x, y) or are adjacent 8-directionally (ie., share a corner or edge with cell (x, y).)\nReturn an array of answers.  Each value answer[i] should be equal to the answer of the i-th query queries[i].\n  Example 1:\nInput: N = 5, lamps = [[0,0],[4,4]], queries = [[1,1],[1,0]]\nOutput: [1,0]\nExplanation: \nBefore performing the first query we have both lamps [0,0] and [4,4] on.\nThe grid representing which cells are lit looks like this, where [0,0] is the top left corner, and [4,4] is the bottom right corner:\n1 1 1 1 1\n1 1 0 0 1\n1 0 1 0 1\n1 0 0 1 1\n1 1 1 1 1\nThen the query at [1, 1] returns 1 because the cell is lit.  After this query, the lamp at [0, 0] turns off, and the grid now looks like this:\n1 0 0 0 1\n0 1 0 0 1\n0 0 1 0 1\n0 0 0 1 1\n1 1 1 1 1\nBefore performing the second query we have only the lamp [4,4] on.  Now the query at [1,0] returns 0, because the cell is no longer lit.\n  Note:\n1 <= N <= 10^9\n0 <= lamps.length <= 20000\n0 <= queries.length <= 20000\nlamps[i].length == queries[i].length == 2
 * <p>
 * 中文
 * 序号: 1001
 * 标题： 网格照明
 * 链接： https://leetcode-cn.com/problems/grid-illumination
 * 描述： None
 * <p>
 * acceptance: 35.0%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class GridIllumination {
    public int[] gridIllumination(int N, int[][] lamps, int[][] queries) {
        return null;
    }
}