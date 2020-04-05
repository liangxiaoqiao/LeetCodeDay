package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 794
 * title: Valid Tic-Tac-Toe State
 * href: https://leetcode.com/problems/valid-tic-tac-toe-state
 * desc: A Tic-Tac-Toe board is given as a string array board. Return True if and only if it is possible to reach this board position during the course of a valid tic-tac-toe game.
 * The board is a 3 x 3 array, and consists of characters " ", "X", and "O".  The " " character represents an empty square.
 * Here are the rules of Tic-Tac-Toe:
 * Players take turns placing characters into empty squares (" ").
 * The first player always places "X" characters, while the second player always places "O" characters.
 * "X" and "O" characters are always placed into empty squares, never filled ones.
 * The game ends when there are 3 of the same (non-empty) character filling any row, column, or diagonal.
 * The game also ends if all squares are non-empty.
 * No more moves can be played if the game is over.
 * Example 1:
 * Input: board = ["O  ", "   ", "   "]
 * Output: false
 * Explanation: The first player always plays "X".
 * <p>
 * Example 2:
 * Input: board = ["XOX", " X ", "   "]
 * Output: false
 * Explanation: Players take turns making moves.
 * <p>
 * Example 3:
 * Input: board = ["XXX", "   ", "OOO"]
 * Output: false
 * <p>
 * Example 4:
 * Input: board = ["XOX", "O O", "XOX"]
 * Output: true
 * Note:
 * board is a length-3 array of strings, where each string board[i] has length 3.
 * Each board[i][j] is a character in the set {" ", "X", "O"}.
 * <p>
 * 中文
 * 序号: 794
 * 标题： 有效的井字游戏
 * 链接： https://leetcode-cn.com/problems/valid-tic-tac-toe-state
 * 描述： 用字符串数组作为井字游戏的游戏板 board。当且仅当在井字游戏过程中，玩家有可能将字符放置成游戏板所显示的状态时，才返回 true。\n该游戏板是一个 3 x 3 数组，由字符 \" \"，\"X\" 和 \"O\" 组成。字符 \" \" 代表一个空位。\n以下是井字游戏的规则：\n玩家轮流将字符放入空位（\" \"）中。\n第一个玩家总是放字符 “X”，且第二个玩家总是放字符 “O”。\n“X” 和 “O” 只允许放置在空位中，不允许对已放有字符的位置进行填充。\n当有 3 个相同（且非空）的字符填充任何行、列或对角线时，游戏结束。\n当所有位置非空时，也算为游戏结束。\n如果游戏结束，玩家不允许再放置字符。\n示例 1:\n输入: board = [\"O  \", \"   \", \"   \"]\n输出: false\n解释: 第一个玩家总是放置“X”。\n\n示例 2:\n输入: board = [\"XOX\", \" X \", \"   \"]\n输出: false\n解释: 玩家应该是轮流放置的。\n\n示例 3:\n输入: board = [\"XXX\", \"   \", \"OOO\"]\n输出: false\n\n示例 4:\n输入: board = [\"XOX\", \"O O\", \"XOX\"]\n输出: true\n说明:\n游戏板 board 是长度为 3 的字符串数组，其中每个字符串 board[i] 的长度为 3。\n board[i][j] 是集合 {\" \", \"X\", \"O\"} 中的一个字符。
 * <p>
 * acceptance: 31.8%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class ValidTicTacToeState {

    public boolean validTicTacToe(String[] board) {
        return false;
    }
}