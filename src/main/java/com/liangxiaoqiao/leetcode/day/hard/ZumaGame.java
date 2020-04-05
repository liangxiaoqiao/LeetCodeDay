package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 488
 * title: Zuma Game
 * href: https://leetcode.com/problems/zuma-game
 * desc: Think about Zuma Game. You have a row of balls on the table, colored red(R), yellow(Y), blue(B), green(G), and white(W). You also have several balls in your hand.\nEach time, you may choose a ball in your hand, and insert it into the row (including the leftmost place and rightmost place). Then, if there is a group of 3 or more balls in the same color touching, remove these balls. Keep doing this until no more balls can be removed.\nFind the minimal balls you have to insert to remove all the balls on the table. If you cannot remove all the balls, output -1.\nExamples:\nInput: \"WRRBBW\", \"RB\"\nOutput: -1\nExplanation: WRRBBW -> WRR[R]BBW -> WBBW -> WBB[B]W -> WW\n\nInput: \"WWRRBBWW\", \"WRBRW\"\nOutput: 2\nExplanation: WWRRBBWW -> WWRR[R]BBWW -> WWBBWW -> WWBB[B]WW -> WWWW -> empty\n\nInput:\"G\", \"GGGGG\"\nOutput: 2\nExplanation: G -> G[G] -> GG[G] -> empty \n\nInput: \"RBYYBBRRB\", \"YRBGB\"\nOutput: 3\nExplanation: RBYYBBRRB -> RBYY[Y]BBRRB -> RBBBRRB -> RRRB -> B -> B[B] -> BB[B] -> empty \nNote:\nYou may assume that the initial row of balls on the table won’t have any 3 or more consecutive balls with the same color.\nThe number of balls on the table won\'t exceed 20, and the string represents these balls is called \"board\" in the input.\nThe number of balls in your hand won\'t exceed 5, and the string represents these balls is called \"hand\" in the input.\nBoth input strings will be non-empty and only contain characters \'R\',\'Y\',\'B\',\'G\',\'W\'.
 * <p>
 * 中文
 * 序号: 488
 * 标题： 祖玛游戏
 * 链接： https://leetcode-cn.com/problems/zuma-game
 * 描述： 回忆一下祖玛游戏。现在桌上有一串球，颜色有红色(R)，黄色(Y)，蓝色(B)，绿色(G)，还有白色(W)。 现在你手里也有几个球。\n每一次，你可以从手里的球选一个，然后把这个球插入到一串球中的某个位置上（包括最左端，最右端）。接着，如果有出现三个或者三个以上颜色相同的球相连的话，就把它们移除掉。重复这一步骤直到桌上所有的球都被移除。\n找到插入并可以移除掉桌上所有球所需的最少的球数。如果不能移除桌上所有的球，输出 -1 。\n示例:\n输入: \"WRRBBW\", \"RB\" \n输出: -1 \n解释: WRRBBW -> WRR[R]BBW -> WBBW -> WBB[B]W -> WW （翻译者标注：手上球已经用完，桌上还剩两个球无法消除，返回-1）\n\n输入: \"WWRRBBWW\", \"WRBRW\" \n输出: 2 \n解释: WWRRBBWW -> WWRR[R]BBWW -> WWBBWW -> WWBB[B]WW -> WWWW -> empty\n\n输入:\"G\", \"GGGGG\" \n输出: 2 \n解释: G -> G[G] -> GG[G] -> empty \n\n输入: \"RBYYBBRRB\", \"YRBGB\" \n输出: 3 \n解释: RBYYBBRRB -> RBYY[Y]BBRRB -> RBBBRRB -> RRRB -> B -> B[B] -> BB[B] -> empty \n标注:\n你可以假设桌上一开始的球中，不会有三个及三个以上颜色相同且连着的球。\n桌上的球不会超过20个，输入的数据中代表这些球的字符串的名字是 \"board\" 。\n你手中的球不会超过5个，输入的数据中代表这些球的字符串的名字是 \"hand\"。\n输入的两个字符串均为非空字符串，且只包含字符 \'R\',\'Y\',\'B\',\'G\',\'W\'。
 * <p>
 * acceptance: 40.4%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class ZumaGame {
    public int findMinStep(String board, String hand) {
        return 0;
    }
}