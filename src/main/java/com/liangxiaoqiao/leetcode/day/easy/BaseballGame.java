package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 682
 * title: Baseball Game
 * href: https://leetcode.com/problems/baseball-game
 * desc: You\'re now a baseball game point recorder.\nGiven a list of strings, each string can be one of the 4 following types:\nInteger (one round\'s score): Directly represents the number of points you get in this round.\n\"+\" (one round\'s score): Represents that the points you get in this round are the sum of the last two valid round\'s points.\n\"D\" (one round\'s score): Represents that the points you get in this round are the doubled data of the last valid round\'s points.\n\"C\" (an operation, which isn\'t a round\'s score): Represents the last valid round\'s points you get were invalid and should be removed.\nEach round\'s operation is permanent and could have an impact on the round before and the round after.\nYou need to return the sum of the points you could get in all the rounds.\nExample 1:\nInput: [\"5\",\"2\",\"C\",\"D\",\"+\"]\nOutput: 30\nExplanation: \nRound 1: You could get 5 points. The sum is: 5.\nRound 2: You could get 2 points. The sum is: 7.\nOperation 1: The round 2\'s data was invalid. The sum is: 5.  \nRound 3: You could get 10 points (the round 2\'s data has been removed). The sum is: 15.\nRound 4: You could get 5 + 10 = 15 points. The sum is: 30.\nExample 2:\nInput: [\"5\",\"-2\",\"4\",\"C\",\"D\",\"9\",\"+\",\"+\"]\nOutput: 27\nExplanation: \nRound 1: You could get 5 points. The sum is: 5.\nRound 2: You could get -2 points. The sum is: 3.\nRound 3: You could get 4 points. The sum is: 7.\nOperation 1: The round 3\'s data is invalid. The sum is: 3.  \nRound 4: You could get -4 points (the round 3\'s data has been removed). The sum is: -1.\nRound 5: You could get 9 points. The sum is: 8.\nRound 6: You could get -4 + 9 = 5 points. The sum is 13.\nRound 7: You could get 9 + 5 = 14 points. The sum is 27.\nNote:\nThe size of the input list will be between 1 and 1000.\nEvery integer represented in the list will be between -30000 and 30000.
 * <p>
 * 中文
 * 序号: 682
 * 标题： 棒球比赛
 * 链接： https://leetcode-cn.com/problems/baseball-game
 * 描述： 你现在是棒球比赛记录员。\n给定一个字符串列表，每个字符串可以是以下四种类型之一：\n1.整数（一轮的得分）：直接表示您在本轮中获得的积分数。\n2. \"+\"（一轮的得分）：表示本轮获得的得分是前两轮有效 回合得分的总和。\n3. \"D\"（一轮的得分）：表示本轮获得的得分是前一轮有效 回合得分的两倍。\n4. \"C\"（一个操作，这不是一个回合的分数）：表示您获得的最后一个有效 回合的分数是无效的，应该被移除。\n\n每一轮的操作都是永久性的，可能会对前一轮和后一轮产生影响。\n你需要返回你在所有回合中得分的总和。\n示例 1:\n输入: [\"5\",\"2\",\"C\",\"D\",\"+\"]\n输出: 30\n解释: \n第1轮：你可以得到5分。总和是：5。\n第2轮：你可以得到2分。总和是：7。\n操作1：第2轮的数据无效。总和是：5。\n第3轮：你可以得到10分（第2轮的数据已被删除）。总数是：15。\n第4轮：你可以得到5 + 10 = 15分。总数是：30。\n示例 2:\n输入: [\"5\",\"-2\",\"4\",\"C\",\"D\",\"9\",\"+\",\"+\"]\n输出: 27\n解释: \n第1轮：你可以得到5分。总和是：5。\n第2轮：你可以得到-2分。总数是：3。\n第3轮：你可以得到4分。总和是：7。\n操作1：第3轮的数据无效。总数是：3。\n第4轮：你可以得到-4分（第三轮的数据已被删除）。总和是：-1。\n第5轮：你可以得到9分。总数是：8。\n第6轮：你可以得到-4 + 9 = 5分。总数是13。\n第7轮：你可以得到9 + 5 = 14分。总数是27。\n注意：\n输入列表的大小将介于1和1000之间。\n列表中的每个整数都将介于-30000和30000之间。
 * <p>
 * acceptance: 62.1%
 * difficulty: Easy
 * private: False
 */


import java.util.Arrays;

public class BaseballGame {
    public int calPoints(String[] ops) {
        for (int i = 1; i < ops.length; i++) {
            if (ops[i].equals("C")) {
                remove(ops, i);
            } else if (ops[i].equals("D")) {
                multiPartDouble(ops, i);
            } else if (ops[i].equals("+")) {
                plus(ops, i);
            }

        }
        return Arrays.stream(ops).mapToInt(t -> t.equals("") ? 0 : Integer.parseInt(t)).sum();
    }

    private void plus(String[] ops, int index) {
        String first = "";
        String second = "";
        for (int j = index - 1; j >= 0; j--) {
            if (!ops[j].equals("")) {
                if (first.equals("")) {
                    first = ops[j];
                } else {
                    second = ops[j];
                }
            }
            if (!first.equals("") && !second.equals("")) {
                ops[index] = String.valueOf(Integer.parseInt(first) + Integer.parseInt(second));
                return;
            }
        }
    }

    private void multiPartDouble(String[] ops, int index) {
        for (int j = index - 1; j >= 0; j--) {
            if (!ops[j].equals("")) {
                ops[index] = String.valueOf(Integer.parseInt(ops[j]) * 2);
                return;
            }
        }
    }

    private void remove(String[] ops, int index) {
        ops[index] = "";
        for (int j = index - 1; j >= 0; j--) {
            if (!ops[j].equals("")) {
                ops[j] = "";
                return;
            }
        }
    }
}