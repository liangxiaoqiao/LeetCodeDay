package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 752
 * title: Open the Lock
 * href: https://leetcode.com/problems/open-the-lock
 * desc: You have a lock in front of you with 4 circular wheels. Each wheel has 10 slots: \'0\', \'1\', \'2\', \'3\', \'4\', \'5\', \'6\', \'7\', \'8\', \'9\'. The wheels can rotate freely and wrap around: for example we can turn \'9\' to be \'0\', or \'0\' to be \'9\'. Each move consists of turning one wheel one slot.\nThe lock initially starts at \'0000\', a string representing the state of the 4 wheels.\nYou are given a list of deadends dead ends, meaning if the lock displays any of these codes, the wheels of the lock will stop turning and you will be unable to open it.\nGiven a target representing the value of the wheels that will unlock the lock, return the minimum total number of turns required to open the lock, or -1 if it is impossible.\nExample 1:\nInput: deadends = [\"0201\",\"0101\",\"0102\",\"1212\",\"2002\"], target = \"0202\"\nOutput: 6\nExplanation:\nA sequence of valid moves would be \"0000\" -> \"1000\" -> \"1100\" -> \"1200\" -> \"1201\" -> \"1202\" -> \"0202\".\nNote that a sequence like \"0000\" -> \"0001\" -> \"0002\" -> \"0102\" -> \"0202\" would be invalid,\nbecause the wheels of the lock become stuck after the display becomes the dead end \"0102\".\nExample 2:\nInput: deadends = [\"8888\"], target = \"0009\"\nOutput: 1\nExplanation:\nWe can turn the last wheel in reverse to move from \"0000\" -> \"0009\".\nExample 3:\nInput: deadends = [\"8887\",\"8889\",\"8878\",\"8898\",\"8788\",\"8988\",\"7888\",\"9888\"], target = \"8888\"\nOutput: -1\nExplanation:\nWe can\'t reach the target without getting stuck.\nExample 4:\nInput: deadends = [\"0000\"], target = \"8888\"\nOutput: -1\nNote:\nThe length of deadends will be in the range [1, 500].\ntarget will not be in the list deadends.\nEvery string in deadends and the string target will be a string of 4 digits from the 10,000 possibilities \'0000\' to \'9999\'.
 * <p>
 * 中文
 * 序号: 752
 * 标题： 打开转盘锁
 * 链接： https://leetcode-cn.com/problems/open-the-lock
 * 描述： 你有一个带有四个圆形拨轮的转盘锁。每个拨轮都有10个数字： \'0\', \'1\', \'2\', \'3\', \'4\', \'5\', \'6\', \'7\', \'8\', \'9\' 。每个拨轮可以自由旋转：例如把 \'9\' 变为  \'0\'，\'0\' 变为 \'9\' 。每次旋转都只能旋转一个拨轮的一位数字。\n锁的初始数字为 \'0000\' ，一个代表四个拨轮的数字的字符串。\n列表 deadends 包含了一组死亡数字，一旦拨轮的数字和列表里的任何一个元素相同，这个锁将会被永久锁定，无法再被旋转。\n字符串 target 代表可以解锁的数字，你需要给出最小的旋转次数，如果无论如何不能解锁，返回 -1。\n  示例 1:\n输入：deadends = [\"0201\",\"0101\",\"0102\",\"1212\",\"2002\"], target = \"0202\"\n输出：6\n解释：\n可能的移动序列为 \"0000\" -> \"1000\" -> \"1100\" -> \"1200\" -> \"1201\" -> \"1202\" -> \"0202\"。\n注意 \"0000\" -> \"0001\" -> \"0002\" -> \"0102\" -> \"0202\" 这样的序列是不能解锁的，\n因为当拨动到 \"0102\" 时这个锁就会被锁定。\n示例 2:\n输入: deadends = [\"8888\"], target = \"0009\"\n输出：1\n解释：\n把最后一位反向旋转一次即可 \"0000\" -> \"0009\"。\n示例 3:\n输入: deadends = [\"8887\",\"8889\",\"8878\",\"8898\",\"8788\",\"8988\",\"7888\",\"9888\"], target = \"8888\"\n输出：-1\n解释：\n无法旋转到目标数字且不被锁定。\n示例 4:\n输入: deadends = [\"0000\"], target = \"8888\"\n输出：-1\n  提示：\n死亡列表 deadends 的长度范围为 [1, 500]。\n目标数字 target 不会在 deadends 之中。\n每个 deadends 和 target 中的字符串的数字会在 10,000 个可能的情况 \'0000\' 到 \'9999\' 中产生。
 * <p>
 * acceptance: 48.5%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class OpenTheLock {
    public int openLock(String[] deadends, String target) {
        return 0;
    }
}