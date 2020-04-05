package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 999
 * title: Available Captures for Rook
 * href: https://leetcode.com/problems/available-captures-for-rook
 * desc: On an 8 x 8 chessboard, there is one white rook.  There also may be empty squares, white bishops, and black pawns.  These are given as characters \'R\', \'.\', \'B\', and \'p\' respectively. Uppercase characters represent white pieces, and lowercase characters represent black pieces.\nThe rook moves as in the rules of Chess: it chooses one of four cardinal directions (north, east, west, and south), then moves in that direction until it chooses to stop, reaches the edge of the board, or captures an opposite colored pawn by moving to the same square it occupies.  Also, rooks cannot move into the same square as other friendly bishops.\nReturn the number of pawns the rook can capture in one move.\n  Example 1:\nInput: [[\".\",\".\",\".\",\".\",\".\",\".\",\".\",\".\"],[\".\",\".\",\".\",\"p\",\".\",\".\",\".\",\".\"],[\".\",\".\",\".\",\"R\",\".\",\".\",\".\",\"p\"],[\".\",\".\",\".\",\".\",\".\",\".\",\".\",\".\"],[\".\",\".\",\".\",\".\",\".\",\".\",\".\",\".\"],[\".\",\".\",\".\",\"p\",\".\",\".\",\".\",\".\"],[\".\",\".\",\".\",\".\",\".\",\".\",\".\",\".\"],[\".\",\".\",\".\",\".\",\".\",\".\",\".\",\".\"]]\nOutput: 3\nExplanation: \nIn this example the rook is able to capture all the pawns.\nExample 2:\nInput: [[\".\",\".\",\".\",\".\",\".\",\".\",\".\",\".\"],[\".\",\"p\",\"p\",\"p\",\"p\",\"p\",\".\",\".\"],[\".\",\"p\",\"p\",\"B\",\"p\",\"p\",\".\",\".\"],[\".\",\"p\",\"B\",\"R\",\"B\",\"p\",\".\",\".\"],[\".\",\"p\",\"p\",\"B\",\"p\",\"p\",\".\",\".\"],[\".\",\"p\",\"p\",\"p\",\"p\",\"p\",\".\",\".\"],[\".\",\".\",\".\",\".\",\".\",\".\",\".\",\".\"],[\".\",\".\",\".\",\".\",\".\",\".\",\".\",\".\"]]\nOutput: 0\nExplanation: \nBishops are blocking the rook to capture any pawn.\nExample 3:\nInput: [[\".\",\".\",\".\",\".\",\".\",\".\",\".\",\".\"],[\".\",\".\",\".\",\"p\",\".\",\".\",\".\",\".\"],[\".\",\".\",\".\",\"p\",\".\",\".\",\".\",\".\"],[\"p\",\"p\",\".\",\"R\",\".\",\"p\",\"B\",\".\"],[\".\",\".\",\".\",\".\",\".\",\".\",\".\",\".\"],[\".\",\".\",\".\",\"B\",\".\",\".\",\".\",\".\"],[\".\",\".\",\".\",\"p\",\".\",\".\",\".\",\".\"],[\".\",\".\",\".\",\".\",\".\",\".\",\".\",\".\"]]\nOutput: 3\nExplanation: \nThe rook can capture the pawns at positions b5, d6 and f5.\n  Note:\nboard.length == board[i].length == 8\nboard[i][j] is either \'R\', \'.\', \'B\', or \'p\'\nThere is exactly one cell with board[i][j] == \'R\'
 * <p>
 * 中文
 * 序号: 999
 * 标题： 车的可用捕获量
 * 链接： https://leetcode-cn.com/problems/available-captures-for-rook
 * 描述： None
 * <p>
 * acceptance: 65.8%
 * difficulty: Easy
 * private: False
 */


//TODO init
public class AvailableCapturesForRook {
    public int numRookCaptures(char[][] board) {
        return 0;
    }
}