package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 957
 * title: Prison Cells After N Days
 * href: https://leetcode.com/problems/prison-cells-after-n-days
 * desc: There are 8 prison cells in a row, and each cell is either occupied or vacant.\nEach day, whether the cell is occupied or vacant changes according to the following rules:\nIf a cell has two adjacent neighbors that are both occupied or both vacant, then the cell becomes occupied.\nOtherwise, it becomes vacant.\n(Note that because the prison is a row, the first and the last cells in the row can\'t have two adjacent neighbors.)\nWe describe the current state of the prison in the following way: cells[i] == 1 if the i-th cell is occupied, else cells[i] == 0.\nGiven the initial state of the prison, return the state of the prison after N days (and N such changes described above.)\n  Example 1:\nInput: cells = [0,1,0,1,1,0,0,1], N = 7\nOutput: [0,0,1,1,0,0,0,0]\nExplanation: \nThe following table summarizes the state of the prison on each day:\nDay 0: [0, 1, 0, 1, 1, 0, 0, 1]\nDay 1: [0, 1, 1, 0, 0, 0, 0, 0]\nDay 2: [0, 0, 0, 0, 1, 1, 1, 0]\nDay 3: [0, 1, 1, 0, 0, 1, 0, 0]\nDay 4: [0, 0, 0, 0, 0, 1, 0, 0]\nDay 5: [0, 1, 1, 1, 0, 1, 0, 0]\nDay 6: [0, 0, 1, 0, 1, 1, 0, 0]\nDay 7: [0, 0, 1, 1, 0, 0, 0, 0]\nExample 2:\nInput: cells = [1,0,0,1,0,0,1,0], N = 1000000000\nOutput: [0,0,1,1,1,1,1,0]\n  Note:\ncells.length == 8\ncells[i] is in {0, 1}\n1 <= N <= 10^9
 * <p>
 * 中文
 * 序号: 957
 * 标题： N 天后的牢房
 * 链接： https://leetcode-cn.com/problems/prison-cells-after-n-days
 * 描述： 8 间牢房排成一排，每间牢房不是有人住就是空着。\n每天，无论牢房是被占用或空置，都会根据以下规则进行更改：\n如果一间牢房的两个相邻的房间都被占用或都是空的，那么该牢房就会被占用。\n否则，它就会被空置。\n（请注意，由于监狱中的牢房排成一行，所以行中的第一个和最后一个房间无法有两个相邻的房间。）\n我们用以下方式描述监狱的当前状态：如果第 i 间牢房被占用，则 cell[i]==1，否则 cell[i]==0。\n根据监狱的初始状态，在 N 天后返回监狱的状况（和上述 N 种变化）。\n  示例 1：\n输入：cells = [0,1,0,1,1,0,0,1], N = 7\n输出：[0,0,1,1,0,0,0,0]\n解释：\n下表概述了监狱每天的状况：\nDay 0: [0, 1, 0, 1, 1, 0, 0, 1]\nDay 1: [0, 1, 1, 0, 0, 0, 0, 0]\nDay 2: [0, 0, 0, 0, 1, 1, 1, 0]\nDay 3: [0, 1, 1, 0, 0, 1, 0, 0]\nDay 4: [0, 0, 0, 0, 0, 1, 0, 0]\nDay 5: [0, 1, 1, 1, 0, 1, 0, 0]\nDay 6: [0, 0, 1, 0, 1, 1, 0, 0]\nDay 7: [0, 0, 1, 1, 0, 0, 0, 0]\n示例 2：\n输入：cells = [1,0,0,1,0,0,1,0], N = 1000000000\n输出：[0,0,1,1,1,1,1,0]\n  提示：\ncells.length == 8\ncells[i] 的值为 0 或 1 \n1 <= N <= 10^9
 * <p>
 * acceptance: 38.8%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class PrisonCellsAfterNDays {
    public int[] prisonAfterNDays(int[] cells, int N) {
        return null;
    }
}