package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 1138
 * title: Alphabet Board Path
 * href: https://leetcode.com/problems/alphabet-board-path
 * desc: On an alphabet board, we start at position (0, 0), corresponding to character board[0][0].
 * Here, board = ["abcde", "fghij", "klmno", "pqrst", "uvwxy", "z"], as shown in the diagram below.
 * We may make the following moves:
 * 'U' moves our position up one row, if the position exists on the board;
 * 'D' moves our position down one row, if the position exists on the board;
 * 'L' moves our position left one column, if the position exists on the board;
 * 'R' moves our position right one column, if the position exists on the board;
 * '!' adds the character board[r][c] at our current position (r, c) to the answer.
 * (Here, the only positions that exist on the board are positions with letters on them.)
 * Return a sequence of moves that makes our answer equal to target in the minimum number of moves.  You may return any path that does so.
 * Example 1:
 * Input: target = "leet"
 * Output: "DDR!UURRR!!DDD!"
 * Example 2:
 * Input: target = "code"
 * Output: "RR!DDRR!UUL!R!"
 * Constraints:
 * 1 <= target.length <= 100
 * target consists only of English lowercase letters.
 * <p>
 * 中文
 * 序号: 1138
 * 标题： 字母板上的路径
 * 链接： https://leetcode-cn.com/problems/alphabet-board-path
 * 描述： 我们从一块字母板上的位置 (0, 0) 出发，该坐标对应的字符为 board[0][0]。
 * 在本题里，字母板为board = ["abcde", "fghij", "klmno", "pqrst", "uvwxy", "z"].
 * 我们可以按下面的指令规则行动：
 * 如果方格存在，'U' 意味着将我们的位置上移一行；
 * 如果方格存在，'D' 意味着将我们的位置下移一行；
 * 如果方格存在，'L' 意味着将我们的位置左移一列；
 * 如果方格存在，'R' 意味着将我们的位置右移一列；
 * '!' 会把在我们当前位置 (r, c) 的字符 board[r][c] 添加到答案中。
 * 返回指令序列，用最小的行动次数让答案和目标 target 相同。你可以返回任何达成目标的路径。
 * 示例 1：
 * 输入：target = "leet"
 * 输出："DDR!UURRR!!DDD!"
 * 示例 2：
 * 输入：target = "code"
 * 输出："RR!DDRR!UUL!R!"
 * 提示：
 * 1 <= target.length <= 100
 * target 仅含有小写英文字母。
 * <p>
 * acceptance: 45.5%
 * difficulty: Medium
 * private: False
 */


public class AlphabetBoardPath {

    public String alphabetBoardPath(String target) {
        StringBuilder sb = new StringBuilder();
        int[] from = new int[]{0, 0};
        for (int i = 0; i < target.length(); i++) {
            char current = target.charAt(i);
            int[] to = getPosition(current);
            String temp = getPath(from, to);
            sb.append(temp);
            String print = "!";
            sb.append(print);
            from = to;
        }
        return sb.toString();
    }

    private String getPath(int[] from, int[] to) {
        StringBuilder sb = new StringBuilder();
        int fromRow = from[0];
        int toRow = to[0];
        int fromCol = from[1];
        int toCol = to[1];

        String left = "L";
        String right = "R";
        String down = "D";
        String up = "U";
        if (fromRow == 5) {
            pendingLine(sb, fromRow, toRow, down, up);
            pendingLine(sb, fromCol, toCol, right, left);
        } else if (toRow == 5) {
            pendingLine(sb, fromCol, toCol, right, left);
            pendingLine(sb, fromRow, toRow, down, up);
        } else {
            pendingLine(sb, fromRow, toRow, down, up);
            pendingLine(sb, fromCol, toCol, right, left);
        }

        return sb.toString();
    }

    private void pendingLine(StringBuilder sb, int from, int to, String plus, String minus) {
        int rowDiff = to - from;
        String rowTemp = getLinePath(rowDiff >= 0 ? plus : minus, rowDiff > 0 ? rowDiff : -rowDiff);
        sb.append(rowTemp);
    }

    private String getLinePath(String str, int count) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < count) {
            sb.append(str);
            i++;
        }
        return sb.toString();
    }

    private int[] getPosition(char current) {
        int start = 97;
        int row = (current - start) / 5;
        int col = (current - start) % 5;
        return new int[]{row, col};
    }
}