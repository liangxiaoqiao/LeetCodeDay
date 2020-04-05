package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 937
 * title: Reorder Data in Log Files
 * href: https://leetcode.com/problems/reorder-data-in-log-files
 * desc: You have an array of logs.  Each log is a space delimited string of words.\nFor each log, the first word in each log is an alphanumeric identifier.  Then, either:\nEach word after the identifier will consist only of lowercase letters, or;\nEach word after the identifier will consist only of digits.\nWe will call these two varieties of logs letter-logs and digit-logs.  It is guaranteed that each log has at least one word after its identifier.\nReorder the logs so that all of the letter-logs come before any digit-log.  The letter-logs are ordered lexicographically ignoring identifier, with the identifier used in case of ties.  The digit-logs should be put in their original order.\nReturn the final order of the logs.\n  Example 1:\nInput: [\"a1 9 2 3 1\",\"g1 act car\",\"zo4 4 7\",\"ab1 off key dog\",\"a8 act zoo\"]\nOutput: [\"g1 act car\",\"a8 act zoo\",\"ab1 off key dog\",\"a1 9 2 3 1\",\"zo4 4 7\"]\n  Note:\n0 <= logs.length <= 100\n3 <= logs[i].length <= 100\nlogs[i] is guaranteed to have an identifier, and a word after the identifier.
 * <p>
 * 中文
 * 序号: 937
 * 标题： 重新排列日志文件
 * 链接： https://leetcode-cn.com/problems/reorder-data-in-log-files
 * 描述： 你有一个日志数组 logs。每条日志都是以空格分隔的字串。\n对于每条日志，其第一个字为字母数字标识符。然后，要么：\n标识符后面的每个字将仅由小写字母组成，或；\n标识符后面的每个字将仅由数字组成。\n我们将这两种日志分别称为字母日志和数字日志。保证每个日志在其标识符后面至少有一个字。\n将日志重新排序，使得所有字母日志都排在数字日志之前。字母日志按字母顺序排序，忽略标识符，标识符仅用于表示关系。数字日志应该按原来的顺序排列。\n返回日志的最终顺序。\n  示例 ：\n输入：[\"a1 9 2 3 1\",\"g1 act car\",\"zo4 4 7\",\"ab1 off key dog\",\"a8 act zoo\"]\n输出：[\"g1 act car\",\"a8 act zoo\",\"ab1 off key dog\",\"a1 9 2 3 1\",\"zo4 4 7\"]\n  提示：\n0 <= logs.length <= 100\n3 <= logs[i].length <= 100\nlogs[i] 保证有一个标识符，并且标识符后面有一个字。
 * <p>
 * acceptance: 53.7%
 * difficulty: Easy
 * private: False
 */


//TODO init
public class ReorderDataInLogFiles {
    public String[] reorderLogFiles(String[] logs) {
        return null;
    }
}

